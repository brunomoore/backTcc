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

	public ExpenseType save(ExpenseType expenseType) {
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

}
