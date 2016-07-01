package classes.UTIL;

public class Robo {

	private String nome;
	private Categoria CatRobo;
	
	
	public Robo(String nome, Categoria catRobo) {
		this.nome = nome;
		CatRobo = catRobo;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categoria getCatRobo() {
		return CatRobo;
	}
	public void setCatRobo(Categoria catRobo) {
		CatRobo = catRobo;
	}
	
	
}
