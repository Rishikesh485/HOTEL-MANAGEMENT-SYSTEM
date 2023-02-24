package com.jsp.controller;

import java.util.ArrayList;
import com.jsp.dto.Admin;
import com.jsp.dto.LandLord;
import com.jsp.service.AdminService;
import com.jsp.service.LandlordService;

public class AdminController {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("MR NAUSHAD");
		admin.setEmail_id("NAUSHAD@GMAIL.COM");

		LandLord landLord = new LandLord();
		landLord.setName("MR MADHU");
		landLord.setAddress("KANDIVALI");
		landLord.setAdmin(admin);
		LandLord landLord1 = new LandLord();
		landLord1.setName("MR RADHE");
		landLord1.setAddress("BORIVALI");
		landLord1.setAdmin(admin);
		LandLord landLord2 = new LandLord();
		landLord2.setName("MR SINGHAM");
		landLord2.setAddress("NAVI MUMBAI");
		landLord2.setAdmin(admin);

		ArrayList<LandLord> landLords = new ArrayList<LandLord>();
		landLords.add(landLord);
		landLords.add(landLord1);
		landLords.add(landLord2);

		admin.setLandLords(landLords);

		AdminService adminService = new AdminService();
		adminService.create(admin);

		LandlordService landlordService = new LandlordService();
		landlordService.create(landLord);
		landlordService.create(landLord1);
		landlordService.create(landLord2);
		System.out.println("");

	}
}
