package controle;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

import dao.TipoDaoHib;
import entidade.Orcamento;
import entidade.Tipo;

@ManagedBean(name="tipoMB")
@SessionScoped
public class TipoMB {
	
	private Tipo tipo;
	
	@Getter @Setter
	private List<Tipo> listTipo;
	
	public String listar(){
		return "ListTipo.xhtml?faces-redirect=true";
	}
	
	public String insertOrUpdate() throws SQLException {
		TipoDaoHib tipoDao = new TipoDaoHib();
		tipoDao.insertOrUpdate(tipo);
		return "ListTipo.xhtml";
	} 
	public String novo() {
		tipo = new Tipo();
		return "ManTipo.xhtml";
	} 	

	public String delete(Tipo c) throws SQLException {
		TipoDaoHib tipoDao = new TipoDaoHib();
		tipoDao.delete(c);
		return "ListTipo.xhtml";
	} 	
	
	public List<Tipo> consultar() throws SQLException {
		TipoDaoHib tipoDao = new TipoDaoHib();
		
		return tipoDao.query(Tipo.class);
	}	

	public Tipo getTipo() {
		return tipo;
	}

	public String setTipo(Tipo tipo) {
		this.tipo = tipo;
		return "ManTipo.xhtml";
	}	
}
