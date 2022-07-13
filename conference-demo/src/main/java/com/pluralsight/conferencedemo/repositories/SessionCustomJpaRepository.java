package com.pluralsight.conferencedemo.repositories;

import java.util.List;

import com.pluralsight.conferencedemo.models.Session;

public interface SessionCustomJpaRepository {
	List<Session> customGetSessions();

}
