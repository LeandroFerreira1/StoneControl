package controle;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import dao.CidadeDaoHib;
import entidade.Cidade;

@ManagedBean(name = "cidadeMB")
@SessionScoped
public class CidadeMB {

	private Cidade cidade;
	private String nome;

	public String insertOrUpdate() throws SQLException {
		CidadeDaoHib cidadeDao = new CidadeDaoHib();
		cidadeDao.insertOrUpdate(cidade);
		return "ListCidade.xhtml";
	}

	public String novo() {
		cidade = new Cidade();
		return "ManCidade.xhtml";
	}

	public String delete(Cidade c) throws SQLException {
		CidadeDaoHib cidadeDao = new CidadeDaoHib();
		cidadeDao.delete(c);
		return "ListCidade.xhtml";
	}

	public List<Cidade> consultar() throws SQLException {
		CidadeDaoHib cidadeDao = new CidadeDaoHib();

		return cidadeDao.query(Cidade.class);
	}
	

	public List<Cidade> completeText(String nome) {
		CidadeDaoHib cidadeDao = new CidadeDaoHib();
		return cidadeDao.buscaNome(Cidade.class, nome);
	}
	
	public Cidade getCidade() {
		return cidade;
	}

	public String setCidade(Cidade cidade) {
		this.cidade = cidade;
		return "ManCidade.xhtml";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
