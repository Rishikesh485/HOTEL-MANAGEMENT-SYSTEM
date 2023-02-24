package com.jsp.controller;

import java.util.ArrayList;
import com.jsp.dto.Property;
import com.jsp.dto.LandLord;
import com.jsp.dto.Room;
import com.jsp.service.PropertyService;
import com.jsp.service.LandlordService;
import com.jsp.service.RoomService;

public class LandlordController {
	public static void main(String[] args) {

		LandLord landLord1 = new LandLord();
		LandLord landLord2 = new LandLord();
		LandLord landLord3 = new LandLord();
		landLord1.setId(1);
		landLord2.setId(2);
		landLord3.setId(3);

		Property property = new Property();
		property.setProperty_name("TAJ HOTEL");
		property.setProperty_location("MUMBAI");
		property.setNum_of_rooms(3);
		property.setRating(4);
		property.setLandLord(landLord1);

		Property property2 = new Property();
		property2.setProperty_name("THE LALIT");
		property2.setProperty_location("MUMBAI");
		property2.setNum_of_rooms(3);
		property2.setRating(4);
		property2.setLandLord(landLord2);

		Property property3 = new Property();
		property3.setProperty_name("IBIS");
		property3.setProperty_location("VASHI");
		property3.setNum_of_rooms(3);
		property3.setRating(5);
		property3.setLandLord(landLord3);

		Room room1 = new Room();
		room1.setRoom_price(2000.00);
		room1.setRoom_status("AVAILABLE");
		room1.setProperty(property);

		Room room2 = new Room();
		room2.setRoom_price(1000.00);
		room2.setRoom_status("AVAILABLE");
		room2.setProperty(property);

		Room room3 = new Room();
		room3.setRoom_price(3000.00);
		room3.setRoom_status("AVAILABLE");
		room3.setProperty(property);

		Room room4 = new Room();
		room4.setRoom_price(2000.00);
		room4.setRoom_status("AVAILABLE");
		room4.setProperty(property2);

		Room room5 = new Room();
		room5.setRoom_price(1000.00);
		room5.setRoom_status("AVAILABLE");
		room5.setProperty(property2);

		Room room6 = new Room();
		room6.setRoom_price(3000.00);
		room6.setRoom_status("AVAILABLE");
		room6.setProperty(property2);

		Room room7 = new Room();
		room7.setRoom_price(2000.00);
		room7.setRoom_status("AVAILABLE");
		room7.setProperty(property3);

		Room room8 = new Room();
		room8.setRoom_price(1000.00);
		room8.setRoom_status("AVAILABLE");
		room8.setProperty(property3);

		Room room9 = new Room();
		room9.setRoom_price(3000.00);
		room9.setRoom_status("AVAILABLE");
		room9.setProperty(property3);

		ArrayList<Room> roomAl = new ArrayList<Room>();
		roomAl.add(room1);
		roomAl.add(room2);
		roomAl.add(room3);

		ArrayList<Room> roomAl2 = new ArrayList<Room>();
		roomAl2.add(room4);
		roomAl2.add(room5);
		roomAl2.add(room6);

		ArrayList<Room> roomAl3 = new ArrayList<Room>();
		roomAl3.add(room7);
		roomAl3.add(room8);
		roomAl3.add(room9);

//		SETTING ROOMS FOR EVERY HOTELS
		property.setRoom(roomAl);
		property2.setRoom(roomAl2);
		property3.setRoom(roomAl3);

		ArrayList<Property> propertyAl = new ArrayList<Property>();
		propertyAl.add(property);
		ArrayList<Property> propertyAl1 = new ArrayList<Property>();
		propertyAl1.add(property2);
		ArrayList<Property> propertyAl2 = new ArrayList<Property>();
		propertyAl2.add(property3);

//		SETTING HOTEL ARRAYLIST TO LANDLORDS

		landLord1.setPropertys(propertyAl);
		landLord2.setPropertys(propertyAl1);
		landLord3.setPropertys(propertyAl2);

		LandlordService landlordService = new LandlordService();
		landlordService.update(landLord1);
		landlordService.update(landLord2);
		landlordService.update(landLord3);

		PropertyService propertyService = new PropertyService();
		propertyService.create(property);
		propertyService.create(property2);
		propertyService.create(property3);

		RoomService roomService = new RoomService();
		roomService.create(room1);
		roomService.create(room2);
		roomService.create(room3);
		roomService.create(room4);
		roomService.create(room5);
		roomService.create(room6);
		roomService.create(room7);
		roomService.create(room8);
		roomService.create(room9);

	}
}
