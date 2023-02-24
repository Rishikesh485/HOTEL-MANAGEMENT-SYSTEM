package com.jsp.controller;

import com.jsp.dto.Admin;
import com.jsp.service.AdminService;

public class TestSaveAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setAdmin_name("MR RISHIKESH");
		admin.setEmail_id("RISIKESH877@GMAIL.COM");

		AdminService adminService = new AdminService();
		adminService.create(admin);

	}
}
