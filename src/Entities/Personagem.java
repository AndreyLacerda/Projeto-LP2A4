package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personagem {
	
	@Id
	private String userEmail;
	private int fase;
	private int tipoCrianca;
	private boolean maguila;
	private boolean vampeta;
	private int dificuldade;
	private int dificuldadeOriginal;
	
	public Personagem() {
	}
	
	public Personagem(String userEmail, int dificuldade, int tipoCrianca, boolean maguila, boolean vampeta, int fase) {
		this.userEmail = userEmail;
		this.dificuldade = dificuldade;
		this.fase = fase;
		this.tipoCrianca = tipoCrianca;
		this.maguila = maguila;
		this.vampeta = vampeta;
		this.dificuldadeOriginal = dificuldade;
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

	public boolean isVampeta() {
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

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public int getDificuldadeOriginal() {
		return dificuldadeOriginal;
	}
	
}
