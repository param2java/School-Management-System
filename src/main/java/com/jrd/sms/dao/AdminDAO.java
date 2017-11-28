package com.jrd.sms.dao;

import com.jrd.sms.entity.AdminDO;


public interface AdminDAO {

	public AdminDO login(AdminDO adminDO);

	public void createLogin(AdminDO adminDO);
}
