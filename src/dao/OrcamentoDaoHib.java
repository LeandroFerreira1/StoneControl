package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import util.GenericDao;
import util.HibernateConexao;
import entidade.Orcamento;

public class OrcamentoDaoHib  extends GenericDao<Orcamento>{
	
	public List<Orcamento> query(Class clazz, String nome) {
		Session s = HibernateConexao.getSession();		
		Criteria c = s.createCriteria(clazz);
		c.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
		
		return c.list();
	}

	public Orcamento buscarPorCodigo(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}
	
}