package Entities;

public class Personagem {

	private String nome;
	private String genero;
	private int dificuldade;
	
	public Personagem() {
	}
	
	public Personagem(String nome, String genero, int dificuldade) {
		this.nome = nome;
		this.dificuldade = dificuldade;
		this.genero = genero;
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
	
}
