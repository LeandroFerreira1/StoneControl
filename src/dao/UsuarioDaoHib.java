package dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import controle.Criptografia;
import dao.model.UsuarioDao;

import util.GenericDao;
import util.HibernateConexao;

import entidade.Cliente;
import entidade.Usuario;


public class UsuarioDaoHib  extends GenericDao<Usuario> implements UsuarioDao{
	
	public List<Usuario> query(Class clazz, String login, String senha) {
		Session s = HibernateConexao.getSession();	
		
		Criteria c = s.createCriteria(clazz);
		c.add(Restrictions.eq("login", login));
		c.add(Restrictions.eq("senha",Criptografia.criptografar(senha)));
		return c.list();
	}

	@Override
	public List<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}