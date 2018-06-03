package parte1;

import java.util.ArrayList;

public class Usuario {
	
	//Atributos
	private String Login, Senha, Nome;
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	private int Nivel;
	
	//ArrayList
	public static ArrayList<Usuario> loginUsuario = new ArrayList<>();

	public String getLogin() {
		return Login;
	}

	public void setLogin(String Login) {
		this.Login = Login;
	}

	public String getSenha() {
		return Senha;
	}

	public void setSenha(String Senha) {
		this.Senha = Senha;
	}

	public int getNivel() {
		return Nivel;
	}

	public void setNivel(int Nivel) {
		this.Nivel = Nivel;
	}
	
	

}
