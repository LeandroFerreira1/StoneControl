package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import util.GenericDao;
import util.HibernateConexao;
import entidade.Cidade;

public class CidadeDaoHib extends GenericDao<Cidade> {

	public List<Cidade> query(Class clazz, String nome) {
		Session s = HibernateConexao.getSession();
		Criteria c = s.createCriteria(clazz);
		// c.add(Restrictions.ilike("sigla", sigla, MatchMode.ANYWHERE));
		c.addOrder(Order.asc("sigla")).list();

		return c.list();
	}

	public List<Cidade> buscaNome(Class clazz, String nome) {

		Session s = HibernateConexao.getSession();
		Criteria c = s.createCriteria(clazz);
		
		c.add(Restrictions.ilike("nome", nome, MatchMode.START));
		
		return c.list();
	}
}