package com.serv.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serv.dao.ReceiptTypeRepository;
import com.serv.entities.ReceiptType;
/** 
 * @author moore bruno
 *
 */
@Service
public class ReceiptTypeService {

	@Autowired
	ReceiptTypeRepository receiptTypeRepository;

	@Autowired
	UserService userService;

	public ReceiptType save(ReceiptType receiptType, Long id) {
		receiptType.setUser(userService.find(id));
		receiptType.setAtivo(true);
		return receiptTypeRepository.saveAndFlush(receiptType);
	}

	public ReceiptType update(ReceiptType receiptType) {
		return receiptTypeRepository.save(receiptType);
	}

	public List<ReceiptType> findAll() {
		return receiptTypeRepository.findAll();
	}


	public ReceiptType findById(Long id) {
		return receiptTypeRepository.findOne(id);
	}
	
	public void delete(Long id) {
		ReceiptType receiptType = receiptTypeRepository.findOne(id);
		receiptType.setAtivo(false);
		receiptTypeRepository.save(receiptType);
	}

}
