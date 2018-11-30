package com.serv.services;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serv.dao.ExpenseRepository;
import com.serv.entities.Expense;
/** 
 * @author moore bruno
 *
 */
@Service
public class ExpenseService {

	@Autowired
	ExpenseRepository expenseRepository;
	
	@Autowired
	UserService userService;


	public Expense save(Expense expense, Long id) {
		expense.setUser(userService.find(id));
		expense.setValorTotal(expense.getValue());
		expense.setAtivo(true);
		GregorianCalendar gc = new GregorianCalendar();
		if(expense.getParcela() != null) {
			Float valor = expense.getValue()/expense.getParcela();
			for(int i= 0; i < expense.getParcela(); i++) {
				Expense expenseSave = new Expense();
//				gc.setTime(Date.from(expense.getExpireDate().atStartOfDay(ZoneId.systemDefault()).toInstant()));
//				gc.roll(GregorianCalendar.MONTH, i);
//				expense.setValue(valor);
//				expense.setExpireDate(Instant.ofEpochMilli(gc.getTime().getTime()).atZone(ZoneId.systemDefault()).toLocalDate());
				gc.setTime(expense.getExpireDate());
				gc.add(GregorianCalendar.MONTH, i);
				expenseSave.setName(expense.getName());
				expenseSave.setNumeroParcela(i+ 1);
				expenseSave.setValorTotal(expense.getValue());
				expenseSave.setParcela(expense.getParcela());
				expenseSave.setPay(expense.getPay());
				expenseSave.setExpenseDate(expense.getExpenseDate());
				expenseSave.setUser(expense.getUser());
				expenseSave.setValue(valor);
				expenseSave.setExpireDate(gc.getTime());
				expenseSave.setAtivo(true);
				 expenseRepository.save(expenseSave);
			}
			
		}
		else {
		return expenseRepository.save(expense);
	}
		return null;
}

	public Expense update(Expense expense) {
		return expenseRepository.save(expense);
	}

	public List<Expense> findAll(Long id) {
		return expenseRepository.findByUserParams(id);
	}
	public List<Expense> findToProfile(Long id, int mes) {
		return expenseRepository.findByMes(id, mes);
	}

	public Expense findById(Long id) {
		return expenseRepository.findOne(id);
	}
	
	public void delete(Long id) {
		Expense expense = expenseRepository.findOne(id);
		expense.setAtivo(false);
		expenseRepository.save(expense);
	}
	

}
