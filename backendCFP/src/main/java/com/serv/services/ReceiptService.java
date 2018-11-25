package com.serv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serv.dao.ReceiptRepository;
import com.serv.entities.Receipt;
/** 
 * @author moore bruno
 *
 */
@Service
public class ReceiptService {

	@Autowired
	ReceiptRepository receiptRepository;
	
	@Autowired
	UserService userService;

	public Receipt save(Receipt receipt) {
		return receiptRepository.saveAndFlush(receipt);
	}

	public Receipt update(Receipt receipt) {
		return receiptRepository.save(receipt);
	}

	public List<Receipt> findAll(Long id) {
		return receiptRepository.findByUserParams(id);
	}

	public Receipt findById(Long id) {
		return receiptRepository.findOne(id);
	}
	
	public void delete(Long id) {
		receiptRepository.delete(id);
	}

}
