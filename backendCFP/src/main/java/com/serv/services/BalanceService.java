//package com.serv.services;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.serv.dao.ExpenseRepository;
//import com.serv.entities.Expense;
//import com.serv.entities.Receipt;
///** 
// * @author moore bruno
// *
// */
//@Service
//public class BalanceService {
//
//	@Autowired
//	ExpenseRepository expenseRepository;
//	
//	@Autowired
//	ReceiptService receiptService;
//	
//	@Autowired
//	UserService userService;
//	
//	public Expense getBalance() {
//		List<Receipt> receipts = receiptService.findAll();
//		return expenseRepository.findOne(id);
//	}
//
//}
