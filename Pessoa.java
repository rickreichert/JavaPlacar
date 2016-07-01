package classes.UTIL;

public class Pessoa {
	
	private String nome, curso;
	
	
	public Pessoa(String nome){
		this.nome = nome;
	}

	public Pessoa(String nome, String curso) {
		this.nome = nome;
		this.curso = curso;
	}

	/**
	 * @return Retorna nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param Insere nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return Returna String curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param Insere um curso
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
	

}
