package controle;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

import dao.ComercializavelDaoHib;
import entidade.Cliente;
import entidade.Comercializavel;

@ManagedBean(name="comercializavelMB")
@SessionScoped
public class ComercializavelMB {
	
	@Getter @Setter
	private List<Comercializavel> listComercializavel;
	
	private Comercializavel comercializavel;
	
	public String listar(){
		return "ListComercializavel.xhtml?faces-redirect=true";
	}
	
	public String insertOrUpdate() throws SQLException {
		ComercializavelDaoHib comercializavelDao = new ComercializavelDaoHib();
		comercializavelDao.insertOrUpdate(comercializavel);
		return "ListComercializavel.xhtml";
	} 
	public String novo() {
		comercializavel = new Comercializavel();
		return "ManComercializavel.xhtml";
	} 	

	public String delete(Comercializavel c) throws SQLException {
		ComercializavelDaoHib comercializavelDao = new ComercializavelDaoHib();
		comercializavelDao.delete(c);
		return "ListComercializavel.xhtml";
	} 	
	
	public List<Comercializavel> consultar() throws SQLException {
		ComercializavelDaoHib comercializavelDao = new ComercializavelDaoHib();
		
		return comercializavelDao.query(Comercializavel.class);
	}	

	public Comercializavel getComercializavel() {
		return comercializavel;
	}

	public String setComercializavel(Comercializavel comercializavel) {
		this.comercializavel = comercializavel;
		return "ManComercializavel.xhtml";
	}	
}
