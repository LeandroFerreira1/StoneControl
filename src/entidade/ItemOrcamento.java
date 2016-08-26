package entidade;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Entity
public class ItemOrcamento implements Serializable{
	@Id 
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int codigo;
	
	@ManyToOne
	@JoinColumn(referencedColumnName="id")
	private Orcamento idOrcamento;
	
	@ManyToOne
	@JoinColumn(name="idComercializavel", referencedColumnName="id")
	private Comercializavel idComercializavel = new Comercializavel();
	
	
	private Integer quantidade;

	private Float comprimentoBruto;

	private Float alturaBruta;

	private Float comprimentoLiquido;

	private Float alturaLiquida;

	private Float metragem;

	private Float valorDesconto;

	private Float valorUnitario;
	
	private Float valorItem;
	
	
	private Double espessura;
	
	
	@ManyToOne
	@JoinColumn(name="idTipo", referencedColumnName="id")
	private Tipo idTipo = new Tipo();
	
	@ManyToOne
	@JoinColumn(name="idUnidade", referencedColumnName="id")
	private Unidade idUnidade = new Unidade();

	

}
