package com.pluralsight.conferencedemo.repositories;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pluralsight.conferencedemo.models.Session;

public class SessionCustomJpaRepositoryImpl implements SessionCustomJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Session> customGetSessions() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("select s from Session s").getResultList();
	}

}
