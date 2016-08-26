package controle;

import java.sql.SQLException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import lombok.Getter;
import lombok.Setter;

import dao.ClienteDaoHib;
import entidade.Cliente;

@ManagedBean(name="clienteMB")
@SessionScoped
public class ClienteMB {
	
	private Cliente cliente;
	
	@Getter @Setter
	private List<Cliente> listCliente;
	
	public String listar(){
		return "ListCliente.xhtml?faces-redirect=true";
	}
	
	public String insertOrUpdate() throws SQLException {
		ClienteDaoHib clienteDao = new ClienteDaoHib();
		clienteDao.insertOrUpdate(cliente);
		return "ListCliente.xhtml";
	} 
	public String novo() {
		cliente = new Cliente();
		return "ManCliente.xhtml";
	} 
	

	public String delete(Cliente c) throws SQLException {
		ClienteDaoHib clienteDao = new ClienteDaoHib();
		clienteDao.delete(c);
		return "ListCliente.xhtml";
	} 	
	
	public List<Cliente> consultar() throws SQLException {
		ClienteDaoHib clienteDao = new ClienteDaoHib();
		
		return clienteDao.query(Cliente.class);
	}	

	public Cliente getCliente() {
		return cliente;
	}

	public String setCliente(Cliente cliente) {
		this.cliente = cliente;
		return "ManCliente.xhtml";
	}	
}
