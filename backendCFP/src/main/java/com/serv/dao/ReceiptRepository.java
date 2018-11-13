package com.serv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serv.entities.Receipt;


@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {

}
