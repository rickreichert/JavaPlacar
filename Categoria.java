package classes.UTIL;

public abstract class Categoria {

	private String tipo;
	private Integer lados, altura;
	private Integer peso;
	
	
	public Categoria(String tipo, Integer lados, Integer altura, Integer peso) {
		this.tipo = tipo;
		this.lados = lados;
		this.altura = altura;
		this.peso = peso;
	}
	
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getLados() {
		return lados;
	}
	public void setLados(Integer lados) {
		this.lados = lados;
	}
	public Integer getAltura() {
		return altura;
	}
	public void setAltura(Integer altura) {
		this.altura = altura;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
}
