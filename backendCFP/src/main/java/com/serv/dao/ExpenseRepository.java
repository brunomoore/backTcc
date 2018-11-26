package com.serv.dao;

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
			"where user_id = :id\r\n")
	List<Expense> findByUserParams(@Param("id") Long id);
	@Query("select e from\r\n"+
			"Expense e\r\n" +
			"where user_id = :id\r\n" +
			"and  EXTRACT(MONTH FROM expense_expire_date) = :mes")
	List<Expense> findByMes(@Param("id") Long id, @Param("mes") int mes);

}
