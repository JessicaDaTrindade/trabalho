package parte1;

import javax.swing.table.DefaultTableModel;


public class AcaoArray {
	
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
			
	DefaultTableModel tab = new DefaultTableModel();
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

}
