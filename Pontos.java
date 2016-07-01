package classes.UTIL;

public class Pontos {

	public static final int WAZA_ARI = 10;
	public static final int YOCO = 6;
	public static final int KOKA = 4;
	public static final int YUSEI_GASHI = 2;
    
	private Integer totalPontos;
	
	public Pontos(){
		this.totalPontos = 0;
	}
	
	public void setPontos(int p){
		this.totalPontos += p;
	}
	
	
}
