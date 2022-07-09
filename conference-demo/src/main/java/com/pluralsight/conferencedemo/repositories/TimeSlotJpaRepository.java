package com.pluralsight.conferencedemo.repositories;


import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.TimeSlot;

public interface TimeSlotJpaRepository extends JpaRepository<TimeSlot,Long>{
	List<TimeSlot> findByTimeSlotDateBefore(LocalDate startDate);
	List<TimeSlot> findByTimeSlotDateAfter(LocalDate startDate);
	List<TimeSlot> findByTimeSlotDateBetween(LocalDate startDate, LocalDate endDate);
	
	List<TimeSlot> findByTimeSlotDate(LocalDate timeSlotDate);
}
