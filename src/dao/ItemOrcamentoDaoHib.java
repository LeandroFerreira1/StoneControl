package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import util.GenericDao;
import util.HibernateConexao;
import entidade.ItemOrcamento;
import entidade.Orcamento;

public class ItemOrcamentoDaoHib  extends GenericDao<ItemOrcamento>{
	
	public List<ItemOrcamento> query(Class clazz, Orcamento o) {
		Session s = HibernateConexao.getSession();		
		Criteria c = s.createCriteria(clazz, "e");
		c.createAlias("e.idOrcamento", "o");
		c.add(Restrictions.eq("o.id", o.getId()));
		
		return c.list();
	}
	
}