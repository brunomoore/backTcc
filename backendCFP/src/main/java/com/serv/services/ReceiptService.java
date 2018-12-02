package com.serv.services;

import java.util.Date;
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

	public Receipt save(Receipt receipt, Long id) {
		receipt.setUser(userService.find(id));
		receipt.setAtivo(true);
		return receiptRepository.saveAndFlush(receipt);
	}

	public Receipt update(Receipt receipt) {
		return receiptRepository.save(receipt);
	}

	public List<Receipt> findAll(Long id) {
		return receiptRepository.findByUserParams(id);
	}
	public List<Receipt> findToProfile(Long id, Date inicio, Date fim) {
		return receiptRepository.findByMes(id, inicio, fim);
	}

	public Receipt findById(Long id) {
		return receiptRepository.findOne(id);
	}
	
	public void delete(Long id) {
		Receipt receipt = receiptRepository.findOne(id);
		receipt.setAtivo(false);
		receiptRepository.save(receipt);
	}
	
}
