package com.struts2.action;

import com.domain.Person;
import com.opensymphony.xwork2.ActionSupport;
import com.service.PersonService;

public class PersonAction extends ActionSupport{
	private PersonService personService;

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	public String savePerson(){
		Person person = new Person();
		person.setPname("ÍõÈý¶ù");
		this.personService.savePerson(person);
		
		return null;
		
	}
}
