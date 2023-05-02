package com.spring.connection.dao;

import org.springframework.stereotype.Repository;

import com.spring.connection.model.Person;

@Repository
public class PersonDaoImpl extends AbstractGenericDao<Person, Long> implements PersonDao{


	/*
	 * private SessionFactory sessionFactory;
	 * 
	 * public void setSessionFactory(SessionFactory sessionFactory) {
	 * this.sessionFactory = sessionFactory; }
	 * 
	 * @Override public void save(Person p) {
	 * 
	 * Session session = this.sessionFactory.openSession(); Transaction tx =
	 * session.beginTransaction(); session.persist(p); tx.commit(); session.close();
	 * }
	 * 
	 * @SuppressWarnings("unchecked")
	 * 
	 * @Override public List<Person> getAll() { Session session =
	 * this.sessionFactory.openSession(); List<Person> personLst =
	 * session.createQuery("from Person").list(); return personLst; }
	 */
	
	
}
