package com.serv.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.serv.entities.ExpenseType;
import com.serv.services.ExpenseTypeService;

@RestController
@RequestMapping("expenseType")
public class ExpenseTypeController {

	public static final Logger logger = LoggerFactory.getLogger(ExpenseController.class);

	@Autowired
	private ExpenseTypeService expenseTypeService;


	@RequestMapping(value="/{idExpense}", method = RequestMethod.GET)
	public ResponseEntity<ExpenseType> get(@PathVariable Long idExpense) {
		return new ResponseEntity<>(expenseTypeService.findById(idExpense), HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<List<ExpenseType>> findAll(){
		return new ResponseEntity<>(expenseTypeService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<ExpenseType> saveExpense(@RequestBody ExpenseType expenseType, @RequestParam Long id){
		return new ResponseEntity<>(expenseTypeService.save(expenseType, id), HttpStatus.CREATED);
	}

	@CrossOrigin
	@RequestMapping(value = "/{expenseTypeId}", method = RequestMethod.PUT)
	public ResponseEntity<ExpenseType> updateExpense(@PathVariable Long expenseTypeId, @RequestBody ExpenseType expenseType) {
		return new ResponseEntity<>(expenseTypeService.update(expenseType), HttpStatus.OK);
	}

	@CrossOrigin
	@RequestMapping(value="/{expenseTypeId}", method=RequestMethod.DELETE)
	public ResponseEntity<ExpenseType> delete(@PathVariable Long expenseTypeId) {
		expenseTypeService.delete(expenseTypeId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	
}
