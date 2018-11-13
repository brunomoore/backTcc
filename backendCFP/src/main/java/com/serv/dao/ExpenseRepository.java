package com.serv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serv.entities.Expense;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
