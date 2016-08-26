package entidade;
import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Comercializavel implements Serializable{
	@Id	
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;

	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="idTipo", referencedColumnName="id")
	private Tipo idTipo = new Tipo();
	
	@ManyToOne
	@JoinColumn(name="idUnidade", referencedColumnName="id")
	private Unidade idUnidade = new Unidade();
	
}
