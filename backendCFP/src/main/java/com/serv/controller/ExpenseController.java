package com.serv.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.serv.entities.Expense;
import com.serv.services.ExpenseService;

@RestController
@RequestMapping("expense")
public class ExpenseController {

	public static final Logger logger = LoggerFactory.getLogger(ExpenseController.class);

	@Autowired
	private ExpenseService expenseService;


	@RequestMapping(value="/{idExpense}", method = RequestMethod.GET)
	public ResponseEntity<Expense> get(@PathVariable Long idExpense) {
		return new ResponseEntity<>(expenseService.findById(idExpense), HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<List<Expense>> findAll(@RequestParam Long id){
		return new ResponseEntity<>(expenseService.findAll(id),HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<Expense> saveExpense(@RequestBody Expense expense){
		return new ResponseEntity<>(expenseService.save(expense), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{expenseId}", method = RequestMethod.PUT)
	public ResponseEntity<Expense> updateExpense(@PathVariable Long expenseId, @RequestBody Expense expense) {
		return new ResponseEntity<>(expenseService.update(expense), HttpStatus.OK);
	}


	
}
