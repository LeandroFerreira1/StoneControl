package entidade;
import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Orcamento implements Serializable{
	
	@Id	
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private Date dataEmissao = new Date();

	private Float valorTotal;

	private Date validade;
	
	/*@ManyToOne
	@JoinColumn(name = "idUsuario", referencedColumnName = "id")
	private Usuario idUsuario = new Usuario();*/
	
	@ManyToOne
	@JoinColumn(name = "idCliente", referencedColumnName = "id")
	private Cliente idCliente = new Cliente();

}
