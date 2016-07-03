package classes.UTIL;

import java.util.ArrayList;

public class Equipe{

	private ArrayList<Pessoa> integrantes;
	private Pessoa capitaoEquip;
	private Robo roboEquip;
	private Pontos pontuacao = new Pontos();
	
	public Equipe(Pessoa pCap, Robo robo, ArrayList<Pessoa> integ){
		this.capitaoEquip = pCap;
		this.roboEquip = robo;
		this.integrantes = integ;
	}
	
	
	public String[] retornaList(){
		return (String[]) integrantes.toArray();
	}
	
	
	

	public ArrayList<Pessoa> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<Pessoa> integrantes) {
		this.integrantes = integrantes;
	}

	public Pessoa getCapitaoEquip() {
		return capitaoEquip;
	}

	public void setCapitaoEquip(Pessoa capitaoEquip) {
		this.capitaoEquip = capitaoEquip;
	}

	public Robo getRoboEquip() {
		return roboEquip;
	}

	public void setRoboEquip(Robo roboEquip) {
		this.roboEquip = roboEquip;
	}

	public Pontos getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Pontos pontuacao) {
		this.pontuacao = pontuacao;
	}
		
}
