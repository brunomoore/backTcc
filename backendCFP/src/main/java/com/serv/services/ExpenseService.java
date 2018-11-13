package com.serv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serv.dao.ExpenseRepository;
import com.serv.entities.Expense;
import com.serv.entities.User;
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


	public Expense save(Expense expense) {
		return expenseRepository.saveAndFlush(expense);
	}

	public Expense update(Expense expense) {
		return expenseRepository.save(expense);
	}

	public List<Expense> findAll(Long id) {
		return expenseRepository.findByUserParams(id);
	}

	public Expense findById(Long id) {
		return expenseRepository.findOne(id);
	}

}
