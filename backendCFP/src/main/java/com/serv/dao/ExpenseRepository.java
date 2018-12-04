package com.serv.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.serv.entities.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	
	@Query("select e from\r\n" + 
			"Expense e\r\n" + 
			"where user_id = :id\r\n"+
			"and ativo = true")
	List<Expense> findByUserParams(@Param("id") Long id);
	@Query("select e from\r\n"+
			"Expense e\r\n" +
			"where user_id = :id\r\n" +
			"and   expense_date between :inicio\r\n "+
			"and :fim\r\n"+
			"and ativo = true\r\n"+
			"and pay = false"
)
	List<Expense> findByMes(@Param("id") Long id, @Param("inicio") Date inicio, @Param("fim") Date fim);
	
	@Query("select e from\r\n"+
			"Expense e\r\n" +
			"where user_id = :id\r\n" +
			"and EXTRACT(YEAR FROM  expense_date) = :ano\r\n "+
			"and EXTRACT(MONTH FROM expense_date) = :mes\r\n "+
			"and ativo = true\r\n"+
			"and pay = false"
)
	List<Expense> findByMeseAno(@Param("id") Long id, @Param("mes") int mes, @Param("ano") int ano);
	
	
}
