package com.serv.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.serv.entities.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
	
	@Query("select name,sum(value) as despesas from\r\n" + 
			"Expense\r\n" + 
			"where user_id = :id\r\n" + 
			"GROUP BY name")
	List<Expense> findByUserParams(@Param("id") Long id);

}
