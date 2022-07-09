package com.pluralsight.conferencedemo.models;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pluralsight.conferencedemo.repositories.TimeSlotJpaRepository;

@SpringBootTest
public class TimeSlotTest {
	
	@Autowired
    private TimeSlotJpaRepository timeSlotJpaRepository;
	
	

    
    @Test
    public void testFindAll() throws Exception {
    	
    	List<TimeSlot> timeSlot = timeSlotJpaRepository.findAll();   
        assertTrue(timeSlot.size() > 0);
        for(TimeSlot s: timeSlot) System.out.println(s.getTimeSlotId());

    }
    
    @Test
    public void testFindByTimeSlotDate() throws Exception {
    	LocalDate date =  LocalDate.of(2020, Month.APRIL, 9);
    	List<TimeSlot> timeSlots = timeSlotJpaRepository.findByTimeSlotDate(date);  
    	assertTrue(timeSlots.size() > 0);
    	for(TimeSlot s: timeSlots) System.out.println(s.toString());
       

    }
    @Test
    public void testTimeSlotDateAfter() throws Exception {
    	LocalDate date =  LocalDate.of(2020, Month.APRIL, 9);
        List<TimeSlot> timeSlots = timeSlotJpaRepository.findByTimeSlotDateAfter(date);   
        assertTrue(timeSlots.size() > 0);
        for(TimeSlot s: timeSlots) System.out.println(s.toString());
    }
    
    @Test
    public void testTimeSlotDateBefore() throws Exception {
    	LocalDate date =  LocalDate.of(2020, Month.APRIL, 10);
        List<TimeSlot> timeSlots = timeSlotJpaRepository.findByTimeSlotDateBefore(date);   
        assertTrue(timeSlots.size() > 0);
        for(TimeSlot s: timeSlots) System.out.println(s.toString());
    }
    
    @Test
    public void testTimeSlotDateBetween() throws Exception {
    	LocalDate start =  LocalDate.of(2020, Month.APRIL, 5);
    	LocalDate end =  LocalDate.of(2020, Month.APRIL, 9);
        List<TimeSlot> timeSlots = timeSlotJpaRepository.findByTimeSlotDateBetween(start,end);   
        assertTrue(timeSlots.size() > 0);
        for(TimeSlot s: timeSlots) System.out.println(s.toString());
    }
    
}
