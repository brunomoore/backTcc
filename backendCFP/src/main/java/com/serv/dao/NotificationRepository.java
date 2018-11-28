package com.serv.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.serv.entities.Notification;


@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
	@Query("select e from\r\n" + 
			"Notification e\r\n" + 
			"where user_id = :id\r\n")
	List<Notification> findByUserParams(@Param("id") Long id);


}
