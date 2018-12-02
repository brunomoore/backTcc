package com.serv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serv.dao.ExpenseTypeRepository;
import com.serv.entities.ExpenseType;
/** 
 * @author moore bruno
 *
 */
@Service
public class ExpenseTypeService {

	@Autowired
	ExpenseTypeRepository expenseTypeRepository;

	@Autowired
	UserService userService;

	public ExpenseType save(ExpenseType expenseType, Long id) {
		expenseType.setUser(userService.find(id));
		expenseType.setAtivo(true);
		return expenseTypeRepository.saveAndFlush(expenseType);
	}

	public ExpenseType update(ExpenseType expenseType) {
		return expenseTypeRepository.save(expenseType);
	}

	public List<ExpenseType> findAll() {
		return expenseTypeRepository.findAll();
	}


	public ExpenseType findById(Long id) {
		return expenseTypeRepository.findOne(id);
	}
	
	public void delete(Long id) {
		ExpenseType expenseType = expenseTypeRepository.findOne(id);
		expenseType.setAtivo(false);
		expenseTypeRepository.save(expenseType);
	}

}
