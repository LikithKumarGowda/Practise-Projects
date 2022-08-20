package com.project.service;

import com.project.dao.PersonDao;
import com.project.dto.Person;
import com.project.dto.PersonPan;

public class PersonService {
	
	PersonDao dao=new PersonDao();
	
	public  void save(String address,String panNumber) {
		
		
		
		PersonPan p1=new PersonPan();
		p1.setPanNumber(panNumber);
		p1.setAddress(address);
		
		//dao.savePersonPan(p1);
	}
}
