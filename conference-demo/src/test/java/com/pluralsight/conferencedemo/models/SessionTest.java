package com.pluralsight.conferencedemo.models;

import com.pluralsight.conferencedemo.repositories.SessionJpaRepository;
import com.pluralsight.conferencedemo.repositories.SessionRepository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class SessionTest {
    @Autowired
    private SessionRepository sessionRepository;
    
    @Autowired
    private SessionJpaRepository sessionJpaRepository;

    @Test
    public void test() throws Exception {
        List<Session> sessions = sessionRepository.getSessionsThatHaveName("Java");
        assertTrue(sessions.size() > 0);
        for(Session s : sessions) System.out.println(s.getSessionName());
    }
    
    @Test
    public void testJpaNot() throws Exception {
        List<Session> sessions = sessionRepository.findBySessionLengthNot(30);
        assertTrue(sessions.size() > 0);
    }
    
    @Test
    public void testJpaNotLike() throws Exception {
        List<Session> sessions = sessionJpaRepository.findBySessionNameNotLike("Java%");
        assertTrue(sessions.size() > 0);
    }
    
    @Test
    public void testJpaEndingWith() throws Exception {
        List<Session> sessions = sessionJpaRepository.findBySessionNameEndingWith("va");
        assertTrue(sessions.size() > 0);
        //for(Session s : sessions)System.out.println(s.getSessionName());
    }
    @Test
    public void testJpaStartingWith() throws Exception {
        List<Session> sessions = sessionJpaRepository.findBySessionNameStartingWith("Sprin");
        assertTrue(sessions.size() > 0);
        //for(Session s : sessions)System.out.println(s.getSessionName());
    }

    @Test
    public void testJpaSessionLengthLessThan() throws Exception {
        List<Session> sessions = sessionJpaRepository.findBySessionLengthLessThan(45);
        assertTrue(sessions.size() > 0);
        //for(Session s : sessions)System.out.println(s.getSessionName());
    }
    
    @Test
    public void testPagingSorting() throws Exception {
        Page<Session> page = sessionJpaRepository.getSessionsWithName(
        		"s", PageRequest.of(1, 5,Sort.by(Sort.Direction.DESC,"sessionLength")));
        
        //for(Session s : page.toList())System.out.println(s.getSessionName());
        assertTrue(page.getTotalElements() > 0);
    }
    
    @Test
    public void testCustomImpl() throws Exception {
    	List<Session> sessions = sessionJpaRepository.customGetSessions();
        
        //for(Session s : page.toList())System.out.println(s.getSessionName());
        assertTrue(sessions.size() > 0);
    }



}
