package com.jrd.sms.dao;

import org.springframework.stereotype.Repository;

import com.jrd.sms.entity.AdminDO;


@Repository
public class AdminDAOImpl extends GenericDAO implements AdminDAO{

	@Override
	public AdminDO login(AdminDO adminDO) {
		
		return getEntityManager().find(AdminDO.class, adminDO.getId());
		
	}

	@Override
	public void createLogin(AdminDO adminDO) {
		 getEntityManager().persist(adminDO);
		
	}

}
