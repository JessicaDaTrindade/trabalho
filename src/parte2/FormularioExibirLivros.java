package parte2;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import parte1.AcaoArray;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.awt.event.ActionEvent;

public class FormularioExibirLivros {
	
	//Construtor
	public FormularioExibirLivros() {
		
		JFrame frm = new JFrame("Biblioteca ProJava");
		
		frm.setSize(850, 500); 	
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frm.setLocationRelativeTo(null); 
		frm.getContentPane().setLayout(null); 
		frm.getContentPane().setBackground(new Color(255, 250, 250));
		
		//JFrameSetIcon mudar ícone título
		 URL caminhoImagem = FormularioPrincipal.class.getResource("/imagens/logo.png");
		 ImageIcon iconeTitulo = new ImageIcon(caminhoImagem);
		 frm.setIconImage(iconeTitulo.getImage());
		
		AcaoArray ar = new AcaoArray();
		
		JTable tabela = new JTable(ar.listarProdutos());
		
		//JScrollPane barra de rolagem
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(40, 20, 750, 290);
		
		JButton btnreservar = new JButton("Reservar livro");
		btnreservar.setBounds(40, 366, 129, 64);
		frm.getContentPane().add(btnreservar);
		btnreservar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
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
		
		//Botão Voltar
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(661, 366, 129, 64);
		frm.getContentPane().add(btnVoltar);
		btnVoltar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				//Fechar 
				frm.dispose();
				
				//Voltar para Menu Principal
				FormularioPrincipal fp = new FormularioPrincipal(2);
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
		
		//Exibir JPane		
		frm.getContentPane().add(barra);
		
		
		
		
		//Exibir o formulário e seus componentes
		frm.setVisible(true);
		
		
	}
}
