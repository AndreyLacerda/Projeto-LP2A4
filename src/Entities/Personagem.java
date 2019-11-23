package Entities;

public class Personagem {

	private int fase;
	private int tipoCrianca;
	private boolean maguila;
	private boolean vampeta;
	private int dificuldade;
	
	public Personagem(int dificuldade, int fase) {
		this.dificuldade = dificuldade;
		this.fase = fase;
	}

	public int getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(int dificuldade) {
		this.dificuldade = dificuldade;
		
	}
	
	public int getFase() {
		return fase;
	}
	
	public void setFase(int fase) {
		this.fase = fase;
	}
	
	public boolean getMag() {
		return maguila;
	}
	
	public void setMag(boolean mag) {
		this.maguila = mag;
	}

	public boolean getVampeta() {
		return vampeta;
	}

	public void setVampeta(boolean vampeta) {
		this.vampeta = vampeta;
	}

	public int getTipoCrianca() {
		return tipoCrianca;
	}

	public void setTipoCrianca(int tipoCrianca) {
		this.tipoCrianca = tipoCrianca;
	}
	
}
