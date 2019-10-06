package Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	private String usuarioId;
	private String email;
	private String login;
	private String senha;
	
	public Usuario() {
	}
	
	public Usuario(String email, String login, String senha) {
		this.usuarioId = email+login;
		this.email = email;
		this.login = login;
		this.senha = senha;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getSenha() {
		return senha;
	}

}
