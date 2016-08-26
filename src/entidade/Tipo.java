package entidade;
import java.io.Serializable;
import java.util.Date;


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
public class Tipo implements Serializable{
	
	@Id	
	private String id;

	private String descricao;

}
