package com.pluralsight.conferencedemo.models;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="time_slot")
public class timeSlot {
    @Id
    @Column(name = "time_slot_id")
    private Integer timeSlotId;
    
    @Column(name = "time_slot_date")
    private Date timeSlotDate;
    
    @Column(name = "start_time")
    private Time startTime;
    
    @Column(name = "end_time")
    private Time endTime;
    
    @Column(name = "is_keynote_time_slot")
    private Boolean isKeynoteTimeSlot;
    
	public timeSlot() {
		// TODO Auto-generated constructor stub
	}

	public Integer getTimeSlotId() {
		return timeSlotId;
	}

	public void setTimeSlotId(Integer timeSlotId) {
		this.timeSlotId = timeSlotId;
	}

	public Date getTimeSlotDate() {
		return timeSlotDate;
	}

	public void setTimeSlotDate(Date timeSlotDate) {
		this.timeSlotDate = timeSlotDate;
	}

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

	public Boolean getIsKeynoteTimeSlot() {
		return isKeynoteTimeSlot;
	}

	public void setIsKeynoteTimeSlot(Boolean isKeynoteTimeSlot) {
		this.isKeynoteTimeSlot = isKeynoteTimeSlot;
	}
	
}
