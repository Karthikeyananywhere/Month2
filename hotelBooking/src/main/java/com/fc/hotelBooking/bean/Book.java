package com.fc.hotelBooking.bean;

import java.io.Serializable;
import java.time.LocalDate;

public class Book  implements Serializable{

	private Long bookingId;
	
	private String bookedBy;
	
	private Integer roomNumber;
	
	private Long headCount;
	
	private LocalDate bookingFrom;
	
	private LocalDate bookingtill;

	public Book(Long bookingId, String bookedBy, Integer roomNumber, Long headCount, LocalDate bookingFrom,
			LocalDate bookingtill) {
		super();
		this.bookingId = bookingId;
		this.bookedBy = bookedBy;
		this.roomNumber = roomNumber;
		this.headCount = headCount;
		this.bookingFrom = bookingFrom;
		this.bookingtill = bookingtill;
	}

	
	
	public Book() {
		super();
	}



	public Long getBookingId() {
		return bookingId;
	}

	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookedBy() {
		return bookedBy;
	}

	public void setBookedBy(String bookedBy) {
		this.bookedBy = bookedBy;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Long getHeadCount() {
		return headCount;
	}

	public void setHeadCount(Long headCount) {
		this.headCount = headCount;
	}

	public LocalDate getBookingFrom() {
		return bookingFrom;
	}

	public void setBookingFrom(LocalDate bookingFrom1) {
		this.bookingFrom = (bookingFrom1);
	}

	public LocalDate getBookingtill() {
		return bookingtill;
	}

	public void setBookingtill(LocalDate bookingtill1) {
		this.bookingtill = bookingtill1;
	}

	@Override
	public String toString() {
		return "Book [bookingId=" + bookingId + ", bookedBy=" + bookedBy + ", roomNumber=" + roomNumber + ", headCount="
				+ headCount + ", bookingFrom=" + bookingFrom + ", bookingtill=" + bookingtill + "]";
	}
	
	


	
}
