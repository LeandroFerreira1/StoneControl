package controle;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import dao.UsuarioDaoHib;
import entidade.Usuario;

import lombok.Getter;
import lombok.Setter;

@ManagedBean(name = "usuarioMB")
@SessionScoped
public class UsuarioMB implements Serializable {

	private static final long serialVersionUID = 1L;
	@Getter
	@Setter
	private Usuario usuario;
	@Getter
	@Setter
	private Usuario login = new Usuario();

	public String listar(){
		return "ListUsuario.xhtml?faces-redirect=true";
	}
	
	public String insertOrUpdate() throws SQLException {
		UsuarioDaoHib usuarioDao = new UsuarioDaoHib();
		// System.out.println("TESTECryp1: " + usuario.getSenha() + " ID: "
		// + usuario.getId());
	//	if (usuario.getId() == null) {
			usuario.setSenha(Criptografia.criptografar(usuario.getSenha()));
	//	}
		usuarioDao.insertOrUpdate(usuario);
		return "ListUsuario.xhtml?faces-redirect=true";
	}

	public String novo() {
		usuario = new Usuario();
		return "ManUsuario.xhtml?faces-redirect=true";
	}

	/*public String senha() throws SQLException {
			
		UsuarioDaoHib usuarioDao = new UsuarioDaoHib();
		
		}*/

	public String alterar(Usuario usuario) {
		this.usuario = usuario;
		return "ManAlterarSenha.xhtml";
	}

	public String setUsuario(Usuario usuario) throws SQLException {
		this.usuario = usuario;
		return "ManUsuario.xhtml";
	}

	public String delete(Usuario u) throws SQLException {
		UsuarioDaoHib usuarioDao = new UsuarioDaoHib();
		usuarioDao.delete(u);
		return "ListUsuario.xhtml?faces-redirect=true";
	}

	public List<Usuario> consultar() throws SQLException {
		UsuarioDaoHib usuarioDao = new UsuarioDaoHib();

		return usuarioDao.query(Usuario.class);
	}

	public String logar() {
		UsuarioDaoHib usuarioDao = new UsuarioDaoHib();
		FacesContext fc = FacesContext.getCurrentInstance();

		if (!usuarioDao
				.query(Usuario.class, login.getLogin(), login.getSenha())
				.isEmpty()) {

			HttpSession session = (HttpSession) fc.getExternalContext()
					.getSession(true);
			session.setAttribute("sessao", login);

			return "Index.xhtml?faces-redirect=true";

		} else {
			FacesMessage mensagem = new FacesMessage(
					"Usuário ou senha inválido!");
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);

			fc.addMessage(null, mensagem);
		}

		return "Login.xhtml";
	}

	public String deslogar() {
		FacesContext.getCurrentInstance().getExternalContext()
				.invalidateSession();
		return "Login.xhtml?faces-redirect=true";
	}

}
