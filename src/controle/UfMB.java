package controle;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.UfDaoHib;
import entidade.Uf;

@ManagedBean(name="ufMB")
@SessionScoped
public class UfMB {
	
	private Uf uf;
	
	public String insertOrUpdate() throws SQLException {
		UfDaoHib ufDao = new UfDaoHib();
		ufDao.insertOrUpdate(uf);
		return "ListUf.xhtml";
	} 
	public String novo() {
		uf = new Uf();
		return "ManUf.xhtml";
	} 	

	public String delete(Uf c) throws SQLException {
		UfDaoHib ufDao = new UfDaoHib();
		ufDao.delete(c);
		return "ListUf.xhtml";
	} 	
	
	public List<Uf> consultar() throws SQLException {
		UfDaoHib ufDao = new UfDaoHib();
		
		return ufDao.query(Uf.class);
	}	

	public Uf getUf() {
		return uf;
	}

	public String setUf(Uf uf) {
		this.uf = uf;
		return "ManUf.xhtml";
	}	
}

