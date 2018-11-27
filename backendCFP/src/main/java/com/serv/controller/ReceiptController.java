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

import com.serv.entities.Receipt;
import com.serv.services.ReceiptService;

@RestController
@RequestMapping("receipt")
public class ReceiptController {

	public static final Logger logger = LoggerFactory.getLogger(ReceiptController.class);

	@Autowired
	private ReceiptService receiptService;


	@RequestMapping(value="/{idReceipt}", method = RequestMethod.GET)
	public ResponseEntity<Receipt> get(@PathVariable Long idReceipt) {
		return new ResponseEntity<>(receiptService.findById(idReceipt), HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<List<Receipt>> findAll(@RequestParam Long id){
		return new ResponseEntity<>(receiptService.findAll(id),HttpStatus.OK);
	}
	@RequestMapping(value="/profile", method = RequestMethod.GET)
	public ResponseEntity<List<Receipt>> findAllByMes(@RequestParam Long id, @RequestParam int mes){
		return new ResponseEntity<>(receiptService.findToProfile(id, mes),HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<Receipt> saveReceipt(@RequestBody Receipt receipt, @RequestParam Long id){
		return new ResponseEntity<>(receiptService.save(receipt, id), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{receiptId}", method = RequestMethod.PUT)
	public ResponseEntity<Receipt> updateReceipt(@PathVariable Long receiptId, @RequestBody Receipt receipt) {
		return new ResponseEntity<>(receiptService.update(receipt), HttpStatus.OK);
	}

	@RequestMapping(value="/{receiptId}", method=RequestMethod.DELETE)
	public ResponseEntity<Receipt> delete(@PathVariable Long receiptId) {
		receiptService.delete(receiptId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	
}
