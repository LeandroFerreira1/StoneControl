package entidade;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Cidade {
	
	@Id	
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer id;

	private String nome;

	@ManyToOne
	@JoinColumn(name = "sigla", referencedColumnName = "sigla")
	private Uf uf = new Uf();
}
