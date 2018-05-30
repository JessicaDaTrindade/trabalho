package parte2;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import parte1.AcaoArray;

public class FormularioCadastro {
	
	//Construtor
	public FormularioCadastro() {
		
		AcaoArray a = new AcaoArray();
		
		//Cadastrar livros
		JFrame frm = new JFrame("Cadastrar Livros");
		
		frm.setSize(500, 300); 	
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frm.setLocationRelativeTo(null); 
		frm.setLayout(null); 
		frm.getContentPane().setBackground(Color.DARK_GRAY);
		
		//JLabel nome livro
		JLabel lblNomeLivro = new JLabel("Nome do Livro");
		lblNomeLivro.setBounds(20, 20, 150, 20); 
		lblNomeLivro.setForeground(Color.WHITE);
		
		//JLabel Valor
		JLabel lblAutorLivro = new JLabel("Autor do Livro");
		lblAutorLivro.setBounds(20, 50, 150, 20); 
		lblAutorLivro.setForeground(Color.WHITE);
		
		//JLabel Quantidade
		JLabel lblGenero = new JLabel("Gênero do Livro");
		lblGenero.setBounds(20, 80, 150, 20);
		lblGenero.setForeground(Color.WHITE);
		
		//JTextField 
		JTextField txtLivro = new JTextField();
		txtLivro.setBounds(130, 20, 270, 20);
		
		JTextField txtAutor = new JTextField();
		txtAutor.setBounds(130, 50, 270, 20);
		
		JTextField txtGenero = new JTextField();
		txtGenero.setBounds(130, 80, 270, 20);
		
		//Botão para cadastrar
		JButton btn = new JButton("Cadastrar Livro");
		btn.setBounds(40, 130, 200, 40);
		btn.setBackground(Color.white);
		
		//Botão para voltar
		JButton btnVoltar = new JButton("Finalizar");
		btnVoltar.setBounds(255, 130, 200, 40);
		btnVoltar.setBackground(Color.white);
		
		//Ação ao botão voltar
		btnVoltar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				frm.dispose();
				
				//Voltar ao menu principal
				FormularioPrincipal fp = new FormularioPrincipal();
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//Instanciar
		AcaoArray ac = new AcaoArray();
		
		//Ação ao botão
		btn.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				String livro = txtLivro.getText();
				String autor = txtAutor.getText();
				String genero = txtGenero.getText();
				
				//Cadastrar
				a.cadastrar(livro, autor, genero);
				
				//Limpar campos
				txtLivro.setText("");
				txtAutor.setText("");
				txtGenero.setText("");
				
				 
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		//Exibir formulario
		frm.add(lblNomeLivro);
		frm.add(lblAutorLivro);
		frm.add(lblGenero);
		
		frm.add(txtLivro);
		frm.add(txtAutor);
		frm.add(txtGenero);
		
		frm.add(btn);
		frm.add(btnVoltar);
		
		//Exibir o formulário e seus componentes
		frm.setVisible(true);
	}

}
