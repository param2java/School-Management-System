package com.jrd.sms.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class GenericDAO {
	
	
	@PersistenceContext
	public EntityManager entityManager;

	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	
	
	


}
