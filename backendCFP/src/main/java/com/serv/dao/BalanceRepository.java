package com.serv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serv.entities.Balance;


@Repository
public interface BalanceRepository extends JpaRepository<Balance, Long> {

}
