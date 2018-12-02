package com.serv.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.serv.entities.Receipt;


@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long>{
	
	
	@Query("select e from\r\n" + 
			"Receipt e\r\n" + 
			"where user_id = :id\r\n" +
			"and ativo = true")
	List<Receipt> findByUserParams(@Param("id") Long id);
	@Query("select e from\r\n"+
			"Receipt e\r\n" +
			"where user_id = :id\r\n" +
			"and   receipt_expire_date between :inicio\r\n "+
			"and :fim\r\n"+
			"and ativo = true"
)
	List<Receipt> findByMes(@Param("id") Long id, @Param("inicio") Date inicio, @Param("fim") Date fim);
	
}
