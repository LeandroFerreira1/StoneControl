package dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import entidade.Uf;
import util.GenericDao;
import util.HibernateConexao;


public class UfDaoHib  extends GenericDao<Uf> {
	
	public List<Uf> query(Class clazz, String sigla) {
		Session s = HibernateConexao.getSession();		
		Criteria c = s.createCriteria(clazz);
		c.add(Restrictions.ilike("sigla", sigla, MatchMode.ANYWHERE));
		
		return c.list();
	}
	
}