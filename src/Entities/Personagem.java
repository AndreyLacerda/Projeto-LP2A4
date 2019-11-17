package Entities;

public class Personagem {

	private String nome;
	private String genero;
	private int fase;
	private int tipoCrianca;
	private boolean maguila;
	private boolean vampeta;
	private int dificuldade;
	
	
	public Personagem(String nome, String genero, int dificuldade) {
		this.nome = nome;
		this.dificuldade = dificuldade;
		this.genero = genero;
		this.fase = 0; // fase 0 é escolha de dificuldade
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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
