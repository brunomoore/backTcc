package com.serv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serv.entities.ReceiptType;


@Repository
public interface ReceiptTypeRepository extends JpaRepository<ReceiptType, Long> {

}
