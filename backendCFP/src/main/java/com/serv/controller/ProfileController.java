//package com.serv.controller;
//
//import java.util.List;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.serv.entities.Profile;
//import com.serv.services.ProfileService;
//
//@RestController
//@RequestMapping("account")
//public class ProfileController {
//
//	public static final Logger logger = LoggerFactory.getLogger(ProfileController.class);
//
//	@Autowired
//	private ProfileService profileService;
//
//
//	@RequestMapping(value="/{idProfile}", method = RequestMethod.GET)
//	public ResponseEntity<Profile> get(@PathVariable Long idProfile) {
//		return new ResponseEntity<>(profileService.findById(idProfile), HttpStatus.OK);
//	}
//	
//	@RequestMapping( method = RequestMethod.GET)
//	public ResponseEntity<List<Profile>> findAll(){
//		return new ResponseEntity<>(profileService.findAll(),HttpStatus.OK);
//	}
//	
//	@RequestMapping( method = RequestMethod.POST)
//	public ResponseEntity<Profile> saveProfile(@RequestBody Profile profile){
//		return new ResponseEntity<>(profileService.save(profile), HttpStatus.CREATED);
//	}
//
//	@RequestMapping(value = "/{profileId}", method = RequestMethod.PUT)
//	public ResponseEntity<Profile> updateProfile(@PathVariable Long profileId, @RequestBody Profile profile) {
//		return new ResponseEntity<>(profileService.update(profile), HttpStatus.OK);
//	}
//
//
//	
//}
