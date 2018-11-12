package com.serv.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serv.entities.Profile;


@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

}
