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
import org.springframework.web.bind.annotation.RestController;

import com.serv.entities.ReceiptType;
import com.serv.services.ReceiptTypeService;

@RestController
@RequestMapping("receiptType")
public class ReceiptTypeController {

	public static final Logger logger = LoggerFactory.getLogger(ReceiptTypeController.class);

	@Autowired
	private ReceiptTypeService receiptTypeService;


	@RequestMapping(value="/{idReceiptType}", method = RequestMethod.GET)
	public ResponseEntity<ReceiptType> get(@PathVariable Long idReceiptType) {
		return new ResponseEntity<>(receiptTypeService.findById(idReceiptType), HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<List<ReceiptType>> findAll(){
		return new ResponseEntity<>(receiptTypeService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<ReceiptType> saveReceiptType(@RequestBody ReceiptType receiptType){
		return new ResponseEntity<>(receiptTypeService.save(receiptType), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{receiptTypeId}", method = RequestMethod.PUT)
	public ResponseEntity<ReceiptType> updateReceiptType(@PathVariable Long receiptTypeId, @RequestBody ReceiptType receiptType) {
		return new ResponseEntity<>(receiptTypeService.update(receiptType), HttpStatus.OK);
	}


	
}
