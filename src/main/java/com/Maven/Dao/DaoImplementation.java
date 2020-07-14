package com.Maven.Dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

//@Resource(name = "daoimplement")
@Transactional
@Service("daoimplement")
public class DaoImplementation implements DaoInterface {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Override
	public void insertMethod(Object obj) {
		hibernateTemplate.save(obj);
	}
}
