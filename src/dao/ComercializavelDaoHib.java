package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import util.GenericDao;
import util.HibernateConexao;
import entidade.Comercializavel;

public class ComercializavelDaoHib  extends GenericDao<Comercializavel>{
	
	public List<Comercializavel> query(Class clazz, String nome) {
		Session s = HibernateConexao.getSession();		
		Criteria c = s.createCriteria(clazz);
		c.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
		
		return c.list();
	}
	
}