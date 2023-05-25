package com.fc.hotelBooking.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fc.hotelBooking.bean.Admin;
import com.fc.hotelBooking.bean.Book;
import com.fc.hotelBooking.bean.Hotel;

public class DataBase {

private static List<Hotel> hotelList =new ArrayList();

private static  List<Book> bookList =new ArrayList();


private static Admin adminDetails;

public static Admin getAdminDetails() {
	return adminDetails;
}

public static void setAdminDetails(Admin adminDetails) {
	DataBase.adminDetails = adminDetails;
}

public static  List<Hotel> getHotelList() {
	return hotelList;
}

public static void setHotelList(List<Hotel> hotelList1) {
	hotelList = hotelList1;
}

public static List<Book> getBookList() {
	return bookList;
}

public static void setBookList(List<Book> bookList1) {
	bookList = bookList1;
}


	
}
