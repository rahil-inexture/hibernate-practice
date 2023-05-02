package com.spring.connection;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.connection.dao.PersonDao;
import com.spring.connection.model.Person;

public class MainApp {
	
	public static void main(String... args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate-config.xml");
		
		PersonDao personDao = (PersonDao) context.getBean(PersonDao.class);
		
		Person person = new Person();
		person.setName("Rahil");
		person.setCountry("india");
		
		personDao.add(person);
		
		System.out.println("Person::"+person);
		
		List<Person> list = personDao.getAll();
		
		for(Person p : list){
			System.out.println("Person List::"+p);
		}
		context.close();
	}
}
