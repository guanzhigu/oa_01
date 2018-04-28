package com.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.PersonDao;
import com.domain.Person;

public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao {

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(person);
	}

}
