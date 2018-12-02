package com.serv.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.serv.entities.Expense;
import com.serv.entities.ExpenseType;


@Repository
public interface ExpenseTypeRepository extends JpaRepository<ExpenseType, Long> {

	@Query("select e from\r\n" + 
			"ExpenseType e\r\n" + 
			"where user_id = :id\r\n"+
			"and ativo = true")
	List<Expense> findByUserParams(@Param("id") Long id);
}
