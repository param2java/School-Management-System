package com.jrd.sms.service;

import com.jrd.sms.model.Admin;


public interface AdminService {
	

	public String login(Admin admin);

	public void createAdmin(Admin admin);

}
