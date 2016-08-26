package entidade;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data @AllArgsConstructor
@NoArgsConstructor

public class ChaveComposta implements Serializable {
	
	private int codigo;
	private int idOrcamento;
	private int idComercializavel;

}
