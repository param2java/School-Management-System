package com.jrd.sms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jrd.sms.dao.AdminDAO;
import com.jrd.sms.entity.AdminDO;
import com.jrd.sms.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO adminDAO;

	@Override
	@Transactional
	public String login(Admin admin) {
		String status="Login Failed";
		
		AdminDO adminDO = new AdminDO();
		adminDO.setId(adminDO.getId());
		adminDO =adminDAO.login(adminDO);
		if(null != adminDO && null != adminDO.getPassword() && 
				adminDO.getPassword().equals(admin.getPassword()))
			status= "Login Success";
		return status;
	}

	@Override
	@Transactional
	public void createAdmin(Admin admin) {
		
		AdminDO adminDO = new AdminDO();
		adminDO.setId(admin.getId());
		adminDO.setPassword(admin.getPassword());
		adminDAO.createLogin(adminDO);
		
		
	}

}
