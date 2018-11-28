package com.serv.services;

import java.util.GregorianCalendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serv.dao.NotificationRepository;
import com.serv.entities.Notification;
/** 
 * @author moore bruno
 *
 */
@Service
public class NotificationService {

	@Autowired
	NotificationRepository notificationRepository;
	
	@Autowired
	UserService userService;


	public Notification save(Notification notification, Long id) {		
		notification.setUser(userService.find(id));
		return notificationRepository.save(notification);
}

	public Notification update(Notification notification) {
		return notificationRepository.save(notification);
	}

	public List<Notification> findAll(Long id) {
		return notificationRepository.findByUserParams(id);
	}
	public Notification findById(Long id) {
		return notificationRepository.findOne(id);
	}
	
	public void delete(Long id) {
		notificationRepository.delete(id);
	}
	

}
