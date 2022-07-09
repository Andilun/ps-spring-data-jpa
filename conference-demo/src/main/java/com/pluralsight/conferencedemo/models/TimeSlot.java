package com.pluralsight.conferencedemo.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="time_slots")
public class TimeSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "time_slot_id")
    private Long timeSlotId;
    
    @Column(name = "time_slot_date")
    private LocalDate timeSlotDate;
    
    @Column(name = "start_time")
    private LocalDateTime startTime;
    
    @Column(name = "end_time")
    private LocalDateTime endTime;
    
    @Column(name = "is_keynote_time_slot")
    private boolean isKeynoteTimeSlot;
    
	public TimeSlot() {
		// TODO Auto-generated constructor stub
	}

	public Long getTimeSlotId() {
		return timeSlotId;
	}

	public void setTimeSlotId(Long timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

	public LocalDate getTimeSlotDate() {
		return timeSlotDate;
	}

	public void setTimeSlotDate(LocalDate timeSlotDate) {
		this.timeSlotDate = timeSlotDate;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public Boolean getIsKeynoteTimeSlot() {
		return isKeynoteTimeSlot;
	}

	public void setIsKeynoteTimeSlot(Boolean isKeynoteTimeSlot) {
		this.isKeynoteTimeSlot = isKeynoteTimeSlot;
	}

	@Override
	public String toString() {
		return "TimeSlot [timeSlotId=" + timeSlotId + ", timeSlotDate=" + timeSlotDate + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", isKeynoteTimeSlot=" + isKeynoteTimeSlot + "]";
	}
	
}
