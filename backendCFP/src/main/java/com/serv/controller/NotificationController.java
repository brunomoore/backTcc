package com.serv.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.serv.entities.Notification;
import com.serv.services.NotificationService;

@RestController
@RequestMapping("notification")
public class NotificationController {

	public static final Logger logger = LoggerFactory.getLogger(NotificationController.class);

	@Autowired
	private NotificationService notificationService;


	@RequestMapping(value="/{idNotification}", method = RequestMethod.GET)
	public ResponseEntity<Notification> get(@PathVariable Long idNotification) {
		return new ResponseEntity<>(notificationService.findById(idNotification), HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.GET)
	public ResponseEntity<List<Notification>> findAll(@RequestParam Long id){
		return new ResponseEntity<>(notificationService.findAll(id),HttpStatus.OK);
	}
	
	@RequestMapping( method = RequestMethod.POST)
	public ResponseEntity<Notification> saveNotification(@RequestBody Notification notification, @RequestParam Long id){
		return new ResponseEntity<>(notificationService.save(notification, id), HttpStatus.CREATED);
	}

	@RequestMapping(value = "/{notificationId}", method = RequestMethod.PUT)
	public ResponseEntity<Notification> updateNotification(@PathVariable Long notificationId, @RequestBody Notification notification) {
		return new ResponseEntity<>(notificationService.update(notification), HttpStatus.OK);
	}

	@RequestMapping(value="/{notificationId}", method=RequestMethod.DELETE)
	public ResponseEntity<Notification> delete(@PathVariable Long notificationId) {
		notificationService.delete(notificationId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
