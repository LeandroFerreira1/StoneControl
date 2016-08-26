package entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class Usuario {
	@Id	
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String login;
	private String senha;
	private String email;
	
	
}
