package com.serv.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.serv.entities.Receipt;


@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long>{
	
	
	@Query("select name,sum(value) as receitas from\r\n" + 
			"Receipt\r\n" + 
			"where user_id = :id\r\n" + 
			"GROUP BY name")
	List<Receipt> findByUserParams(@Param("id") Long id);

	
}
