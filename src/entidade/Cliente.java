package entidade;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Cliente {
	@Id	
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer id;
	
	private String nome;
	
	private String cep;

	private String logradouro;
	
	private String tel;
	
	private String email;

	private String bairro;
	
	private String cpf;

	private String rg;
	
	private String nomeFantasia;

	private String cnpj;

	private String inscricao;

	private String complemento;
	
	@ManyToOne
	@JoinColumn(name="idcidade", referencedColumnName="id")
	private Cidade idcidade = new Cidade();

}
