package com.pluralsight.conferencedemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.conferencedemo.models.TimeSlot;

public interface TimeSlotJpaRepository extends JpaRepository<TimeSlot,Long>{

}
