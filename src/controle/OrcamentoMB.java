package controle;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

import dao.OrcamentoDaoHib;
import entidade.Cliente;
import entidade.ItemOrcamento;
import entidade.Orcamento;

@ManagedBean(name="orcamentoMB")
@SessionScoped
public class OrcamentoMB {
	
	@Getter @Setter
	private List<Orcamento> listOrcamento;
	
	@ManagedProperty(value="#{itemOrcamentoMB}")
	@Getter @Setter
	private ItemOrcamentoMB io;
	
	private Orcamento orcamento;

	public String listar(){
		return "ListOrcamento.xhtml?faces-redirect=true";
	}
	
	public String insertOrUpdate() throws SQLException {
		OrcamentoDaoHib orcamentoDao = new OrcamentoDaoHib();
		orcamentoDao.insertOrUpdate(orcamento);
		return "ListOrcamento.xhtml";
		
		
	} 
	
	public String novo() {
		orcamento = new Orcamento();
		io.novo(orcamento);
		return "ManOrcamento.xhtml";
	} 	

	public String delete(Orcamento c) throws SQLException {
		OrcamentoDaoHib orcamentoDao = new OrcamentoDaoHib();
		orcamentoDao.delete(c);
		return "ListOrcamento.xhtml";
	} 	
	
	public List<Orcamento> consultar() throws SQLException {
		OrcamentoDaoHib orcamentoDao = new OrcamentoDaoHib();
		
		return orcamentoDao.query(Orcamento.class);
	}	

	public Orcamento getOrcamento() {
		return orcamento;
	}

	public String setOrcamento(Orcamento orcamento) {
		this.orcamento = orcamento;
		io.novo(orcamento);
		return "ManOrcamento.xhtml";
	}	
}

