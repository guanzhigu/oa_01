package com.service.impl;

import com.dao.PersonDao;
import com.domain.Person;
import com.service.PersonService;

public class PersonServiceImpl implements PersonService {

	@Override
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDao.savePerson(person);
	}
	
	private PersonDao personDao;

	public PersonDao getPersonDao() {
		return personDao;
	}

	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}
	

}
