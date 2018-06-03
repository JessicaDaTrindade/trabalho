package parte2;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import parte1.AcaoArray;
import javax.swing.JButton;

public class FormularioEmprestimo  {

	//Construtor
	public FormularioEmprestimo() {
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
		
	//Instanciar
	AcaoArray ar = new AcaoArray();
	JTable tabela = new JTable(ar.listarProdutos());
	//JScrollPane barra de rolagem
	JScrollPane barra = new JScrollPane(tabela);
	barra.setBounds(40, 20, 750, 290);
		
	
	//Exibir JTable		
	frm.getContentPane().add(barra);
	
	JButton btnEmprestarLivro = new JButton("Emprestar livro");
	btnEmprestarLivro.setBounds(40, 360, 127, 66);
	frm.getContentPane().add(btnEmprestarLivro);
	
	JButton btnRenovarLivro = new JButton("Renovar livro");
	btnRenovarLivro.setBounds(351, 360, 127, 66);
	frm.getContentPane().add(btnRenovarLivro);
	
	JButton btnVoltar = new JButton("Voltar");
	btnVoltar.setBounds(663, 360, 127, 66);
	frm.getContentPane().add(btnVoltar);
	btnVoltar.addMouseListener(new MouseListener() {
		
		
		@Override
		public void mouseReleased(MouseEvent e) {
			frm.dispose();
			
			//Voltar
			FormularioPrincipal fp = new FormularioPrincipal(1);
			
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
	
	
	//Exibir o formulário e seus componentes
		frm.setVisible(true);
	}
}
