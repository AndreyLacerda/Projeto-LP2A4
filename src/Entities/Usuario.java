package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	private String email;
	private String senha;
	private Personagem personagem;
	
	public Usuario() {
	}
	
	public Usuario(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void getPersonagem() {
		//aqui vai ter que dar um jeito de salvar o personagem do cara no this.personagem
	}


}
