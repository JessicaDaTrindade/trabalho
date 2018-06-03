package parte1;

import javax.swing.table.DefaultTableModel;
import parte2.FormularioPrincipal;

public class AcaoArray {
	
	//Método criar Usuarios
	public void cadastrarUsuario(String Senha, String Login, String Nome, int Nivel) {
		Usuario u = new Usuario();
		u.setLogin(Login);
		u.setSenha(Senha);
		u.setNivel(Nivel);	
		u.setNome(Nome);
		
		Usuario.loginUsuario.add(u);
	}
	
	//Metodo criar ADM
	public void criarAdm() {
		Usuario u = new Usuario();
		u.setLogin("079.203.889-45");
		u.setSenha("admin");
		u.setNivel(1);
		u.setNome("Admin");
		
		Usuario.loginUsuario.add(u);		
	}
		
	//Metodo criar Aluno	
	public void criarAluno() {
		Usuario u = new Usuario();
		u.setLogin("094.869.349-59");
		u.setSenha("aluno");
		u.setNivel(2);
		u.setNome("Aluno");
		
		Usuario.loginUsuario.add(u);
	}
	
	
	//Método para cadastrar livros
	public void cadastrar(String livro, String autor, String genero) {
		
		//Criando objeto
		Livros l = new Livros();
		l.setLivro(livro);
		l.setAutor(autor);
		l.setGenero(genero);
		
		//Adicionando ao ArrayList
		Livros.dados.add(l);
	}
	
	//Método para retornar os dados
	public DefaultTableModel listarProdutos() {
	
	//DefaultTableModel 	
	DefaultTableModel tab = new DefaultTableModel() {
		
		//bloqueando alteração na tabela	
			
		public boolean isCellEditable(int rowIndex, int mCOLindex) {
				return false;
		}
		
	};
	
	tab.addColumn("Livro");
	tab.addColumn("Autor");
	tab.addColumn("Genero");
			
		for(int indice=0; indice <Livros.dados.size(); indice++) {
			tab.addRow(new Object[] {
					
					Livros.dados.get(indice).getLivro(),
					Livros.dados.get(indice).getAutor(),
					Livros.dados.get(indice).getGenero()
											
					});
		}
		
		
			
			return tab;
		}

	//Método Ação login
	public boolean AcaoLogin(String Login, String Senha) {
		
		boolean valida = false;
		
		for(int i = 0; i <Usuario.loginUsuario.size(); i++) {
			
			if((Login.equals(Usuario.loginUsuario.get(i).getLogin())) && (Senha.equals(Usuario.loginUsuario.get(i).getSenha()))) {
				
				valida = true;
				 int nivel = Usuario.loginUsuario.get(i).getNivel();
				
				FormularioPrincipal fp = new FormularioPrincipal(nivel);
			}
		}
		return valida;
	}
	
	//Método para retornar os dados
	public DefaultTableModel listarUsuarios() {
				
		//DefaultTableModel 	
		DefaultTableModel tabUser = new DefaultTableModel() {
				
		//bloqueando alteração na tabela	
			public boolean isCellEditable(int rowIndex, int mCOLindex) {
					return false;
			}
		};
			tabUser.addColumn("Nome");
			tabUser.addColumn("Login");
			tabUser.addColumn("Senha");
			tabUser.addColumn("Nivel");
				
				for(int indice=0; indice <Usuario.loginUsuario.size(); indice++) {
					tabUser.addRow(new Object[] {
							
							Usuario.loginUsuario.get(indice).getNome(),
							Usuario.loginUsuario.get(indice).getLogin(),
							Usuario.loginUsuario.get(indice).getSenha(),
							Usuario.loginUsuario.get(indice).getNivel()
							
								
					});
							
				}
					
				return tabUser;
	}
	//Método para alterar usuário
	public void alterar(String Senha, String Login, String Nome, int Nivel, int linha) {
			
	// Criar objeto
	Usuario u = new Usuario();
			u.setNome(Nome);
			u.setLogin(Login);
			u.setSenha(Senha);
			u.setNivel(Nivel);
			
	// Realizar a alteração
	Usuario.loginUsuario.set(linha, u);
	
	}
	
	// Método para excluir
		public void excluir(int linha) {
			Usuario.loginUsuario.remove(linha);
		}
	
}




