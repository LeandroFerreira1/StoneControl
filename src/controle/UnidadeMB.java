package controle;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

import dao.UnidadeDaoHib;
import entidade.Tipo;
import entidade.Unidade;

@ManagedBean(name="unidadeMB")
@SessionScoped
public class UnidadeMB {
	
	@Getter @Setter
	private List<Unidade> listUnidade;
	
	private Unidade unidade;
	
	public String insertOrUpdate() throws SQLException {
		UnidadeDaoHib unidadeDao = new UnidadeDaoHib();
		unidadeDao.insertOrUpdate(unidade);
		return "ListUnidade.xhtml";
	} 
	public String novo() {
		unidade = new Unidade();
		return "ManUnidade.xhtml";
	} 	

	public String delete(Unidade c) throws SQLException {
		UnidadeDaoHib unidadeDao = new UnidadeDaoHib();
		unidadeDao.delete(c);
		return "ListUnidade.xhtml";
	} 	
	
	public List<Unidade> consultar() throws SQLException {
		UnidadeDaoHib unidadeDao = new UnidadeDaoHib();
		
		return unidadeDao.query(Unidade.class);
	}	

	public Unidade getUnidade() {
		return unidade;
	}

	public String setUnidade(Unidade unidade) {
		this.unidade = unidade;
		return "ManUnidade.xhtml";
	}	
}

