package com.pluralsight.conferencedemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.Speaker;

public interface SpeakerJpaRepository extends JpaRepository<Speaker,Long>{

	List<Speaker> findByFirstNameAndLastName(String firstName,String lastName);
	List<Speaker> findByFirstNameOrLastName(String firstName,String lastName);
	List<Speaker> findBySpeakerPhotoNull();
	List<Speaker> findByCompanyIn(List<String> companies);
}
