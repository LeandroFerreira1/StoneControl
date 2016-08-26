package controle;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;
import dao.ItemOrcamentoDaoHib;
import entidade.Comercializavel;
import entidade.Espessura;
import entidade.ItemOrcamento;
import entidade.Orcamento;

@ManagedBean(name="itemOrcamentoMB")
@SessionScoped
public class ItemOrcamentoMB {
	
	private ItemOrcamento itemOrcamento;
	
	@Getter @Setter 
	List<ItemOrcamento> listItemOrcamento;
	
	public String insertOrUpdate(Orcamento c) throws SQLException {
		ItemOrcamentoDaoHib itemOrcamentoDao = new ItemOrcamentoDaoHib();

		itemOrcamento.setIdOrcamento(c);
		//System.out.println("INSERTORUPDATE: "+itemOrcamento.getIdOrcamento());
		
		itemOrcamentoDao.insertOrUpdate(itemOrcamento);
		return "ListItemOrcamento.xhtml";
	} 
	public String novo(Orcamento c) {
		itemOrcamento = new ItemOrcamento();
		itemOrcamento.setIdComercializavel(new Comercializavel());
		itemOrcamento.getIdComercializavel().setId(1);
		itemOrcamento.setIdOrcamento(c);
		return "ManItemOrcamento.xhtml";
	} 	

	public String delete(ItemOrcamento c) throws SQLException {
		ItemOrcamentoDaoHib itemOrcamentoDao = new ItemOrcamentoDaoHib();
		itemOrcamentoDao.delete(c);
		return "ListItemOrcamento.xhtml";
	} 	
	
	public List<ItemOrcamento> consultar(Orcamento c) throws SQLException {
		ItemOrcamentoDaoHib itemOrcamentoDao = new ItemOrcamentoDaoHib();
		return itemOrcamentoDao.query(ItemOrcamento.class, c);
	}	

	public ItemOrcamento getItemOrcamento() {
		return itemOrcamento;
	}

	public String setItemOrcamento(ItemOrcamento itemOrcamento) {
		this.itemOrcamento = itemOrcamento;
		return "ManItemOrcamento.xhtml";
	}	
	
	
	
	public List<Espessura> espessuras() {
		return Arrays.asList(Espessura.values());
	}
	
}
