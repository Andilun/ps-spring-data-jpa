package com.pluralsight.conferencedemo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.Session;

public interface SessionJpaRepository extends JpaRepository<Session,Long>{

	List<Session> findBySessionNameContains(String name);
	List<Session> findBySessionLengthNot(Integer sessionLength);
	List<Session> findBySessionNameNotLike(String name);
	List<Session> findBySessionNameStartingWith(String name);
	List<Session> findBySessionNameEndingWith(String name);
	List<Session> findBySessionLengthLessThan(Integer sessionLength);
	
}
