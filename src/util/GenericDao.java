package util;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateConexao;

public class GenericDao<T> {
	
	public void insert(T c) throws SQLException {
		Session s = HibernateConexao.getSession();
		Transaction t = s.beginTransaction();
		s.save(c);
		t.commit();
	}
	
	public void update(T c) throws SQLException {
		Session s = HibernateConexao.getSession();
		Transaction t = s.beginTransaction();
		s.update(c);
		t.commit();
	}
	
	public void insertOrUpdate(T c) throws SQLException {
		Session s = HibernateConexao.getSession();
		Transaction t = s.beginTransaction();
		s.saveOrUpdate(c);
		t.commit();
	} 

	public void delete(T c)  throws SQLException {
		Session s = HibernateConexao.getSession();
		Transaction t = s.beginTransaction();
		s.delete(c);
		t.commit();
	}
	public T get(Class clazz, int i)  throws SQLException {
		Session s = HibernateConexao.getSession();
		Transaction t = s.beginTransaction();
		return (T) s.get(clazz, i);
	}
	public List<T> query(Class clazz) throws SQLException {
		Session s = HibernateConexao.getSession();		
		return s.createCriteria(clazz).list();
	}	

}
