package entidade;
import lombok.Data;

 public enum Espessura {

	 ESP15("ESP15", 0.015),
	 ESP20("ESP20", 0.020),
	 ESP30("ESP30", 0.030),
	 ESP40("ESP40", 0.040);
	
	 private String texto;
	 private Double valor;
	
	private Espessura(String texto, Double valor) {
		this.texto = texto;
		this.valor = valor;
	}


	public Espessura get(String texto) {
		
		for (Espessura e : values()) {
			if (e.getTexto().equals(texto)) {
				return e;
			}
		}
		
		return null;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public Double getValor() {
		return valor;
	}


	public void setValor(Double valor) {
		this.valor = valor;
	}


}
