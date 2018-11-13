package com.serv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serv.entities.ExpenseType;


@Repository
public interface ExpenseTypeRepository extends JpaRepository<ExpenseType, Long> {

}
