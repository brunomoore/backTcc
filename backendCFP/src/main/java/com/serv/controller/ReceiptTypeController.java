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

import com.serv.entities.ReceiptType;
import com.serv.services.ReceiptTypeService;

@RestController
@RequestMapping("receiptType")
public class ReceiptTypeController {

	public static final Logger logger = LoggerFactory.getLogger(ReceiptController.class);

	@Autowired
	private ReceiptTypeService receiptTypeService;


	@RequestMapping(value="/{idReceipt}", method = RequestMethod.GET)
	public ResponseEntity<ReceiptType> get(@PathVariable Long idReceipt) {
		return new ResponseEntity<>(receiptTypeService.findById(idReceipt), HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<List<ReceiptType>> findAll(){
		return new ResponseEntity<>(receiptTypeService.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<ReceiptType> saveReceipt(@RequestBody ReceiptType receiptType, @RequestParam Long id){
		return new ResponseEntity<>(receiptTypeService.save(receiptType, id), HttpStatus.CREATED);
	}

	@CrossOrigin
	@RequestMapping(value = "/{receiptTypeId}", method = RequestMethod.PUT)
	public ResponseEntity<ReceiptType> updateReceipt(@PathVariable Long receiptTypeId, @RequestBody ReceiptType receiptType) {
		return new ResponseEntity<>(receiptTypeService.update(receiptType), HttpStatus.OK);
	}

	@CrossOrigin
	@RequestMapping(value="/{receiptTypeId}", method=RequestMethod.DELETE)
	public ResponseEntity<ReceiptType> delete(@PathVariable Long receiptTypeId) {
		receiptTypeService.delete(receiptTypeId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	
}
