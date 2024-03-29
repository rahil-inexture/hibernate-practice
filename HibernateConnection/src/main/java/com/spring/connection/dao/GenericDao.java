package com.spring.connection.dao;

import java.util.List;

public interface GenericDao<E, PK>  {
	public int add(E entity) ;
	public void saveOrUpdate(E entity) ;
	public void update(E entity) ;
	public void remove(E entity);
	public E find(PK key);
	public List<E> getAll() ;
	
}
