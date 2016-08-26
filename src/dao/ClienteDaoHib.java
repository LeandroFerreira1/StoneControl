package dao;

import java.util.List;

import dao.model.ClienteDao;
import entidade.Cliente;
import util.GenericDao;
import util.HibernateConexao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

public class ClienteDaoHib  extends GenericDao<Cliente> implements ClienteDao {
	
	public List<Cliente> query(Class clazz, String nome) {
		Session s = HibernateConexao.getSession();		
		Criteria c = s.createCriteria(clazz);
		c.add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE));
		
		return c.list();
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}