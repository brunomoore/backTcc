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

	public ReceiptType save(ReceiptType receiptType) {
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

}
