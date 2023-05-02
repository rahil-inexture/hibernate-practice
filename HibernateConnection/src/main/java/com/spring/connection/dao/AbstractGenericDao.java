package com.spring.connection.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractGenericDao<E, PK extends Serializable> implements GenericDao<E, PK>{

	@Autowired
	private SessionFactory sessionFactory;
	private Class<? extends E> entityClass;
	
	
	public AbstractGenericDao() {
		Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        entityClass = (Class) pt.getActualTypeArguments()[0];
    }
	
	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public int add(E entity) {
		return (int) currentSession().save(entity);
	}

	@Override
	public void saveOrUpdate(E entity) {
		currentSession().saveOrUpdate(entity);
	}

	@Override
	public void update(E entity) {
		currentSession().saveOrUpdate(entity);
	}

	@Override
	public void remove(E entity) {
		currentSession().delete(entity);
	}

	@Override
	public E find(PK key) {
		 return (E) currentSession().get(entityClass, key);
}

	@Override
	public List<E> getAll() {
		return currentSession().createCriteria(entityClass).list();
	}
}
