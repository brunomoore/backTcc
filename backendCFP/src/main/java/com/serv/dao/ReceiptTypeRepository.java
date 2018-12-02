package com.serv.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.serv.entities.ExpenseType;
import com.serv.entities.ReceiptType;


@Repository
public interface ReceiptTypeRepository extends JpaRepository<ReceiptType, Long> {
	
//	@Query("select e from\r\n" + 
//			"ReceiptType e\r\n" + 
//			"where user_id = :id\r\n" +
//			"and ativo = true")
//	List<ReceiptType> findByUserParams(@Param("id") Long id);
	
	@Query("select e from\r\n" + 
			"ReceiptType e\r\n" + 
			"where ativo = true")
	List<ReceiptType> findAll();

}
