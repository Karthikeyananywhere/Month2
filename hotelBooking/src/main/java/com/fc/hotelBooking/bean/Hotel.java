package com.fc.hotelBooking.bean;

import java.io.Serializable;
import java.time.LocalDate;

public class Hotel  implements Serializable{
	
	private String hotelName;
	
	private String location;
	
	private String roomType;
	
	private Double price;
	
	private LocalDate bookedFrom;
	
	private LocalDate bookedTill;
	
	private Long capacity;
	
	private  Integer roomNumber;
	
	private String availabilityStatus;

	public Hotel(String hotelName, String location, String roomType, Double price, Long capacity, Integer roomNumber, String availabilityStatus) {
		super();
		this.hotelName = hotelName;
		this.location = location;
		this.roomType = roomType;
		this.price = price;
		this.capacity = capacity;
		this.roomNumber = roomNumber;
		this.availabilityStatus = availabilityStatus;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDate getBookedFrom() {
		return bookedFrom;
	}

	public void setBookedFrom(LocalDate bookedFrom) {
		this.bookedFrom = bookedFrom;
	}

	public LocalDate getBookedTill() {
		return bookedTill;
	}

	public void setBookedTill(LocalDate bookedTill) {
		this.bookedTill = bookedTill;
	}

	public Long getCapacity() {
		return capacity;
	}

	public void setCapacity(Long capacity) {
		this.capacity = capacity;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getAvailabilityStatus() {
		return availabilityStatus;
	}

	public void setAvailabilityStatus(String availabilityStatus) {
		this.availabilityStatus = availabilityStatus;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", location=" + location + ", roomType=" + roomType + ", price="
				+ price + ", bookedFrom=" + bookedFrom + ", bookedTill=" + bookedTill + ", capacity=" + capacity
				+ ", roomNumber=" + roomNumber + ", availabilityStatus=" + availabilityStatus + "]";
	}
	
	

	
	
	
	

}
