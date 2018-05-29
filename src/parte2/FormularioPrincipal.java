package parte2;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FormularioPrincipal {
	
	//Construtor
	public FormularioPrincipal() {
	
	//Jframe
	JFrame frm = new JFrame("Biblioteca ProJava");
	
	frm.setSize(850, 500); 	
	frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	frm.setLocationRelativeTo(null); 
	frm.getContentPane().setLayout(null); 
	frm.getContentPane().setBackground(Color.DARK_GRAY);
	
	//JFrameSetIcon
	 URL caminhoImagem = FormularioPrincipal.class.getResource("/imagens/logo.png");
	    ImageIcon iconeTitulo = new ImageIcon(caminhoImagem);
	    frm.setIconImage(iconeTitulo.getImage());
	
	//Imagem
	URL caminhoDaImagem = FormularioPrincipal.class.getResource("/imagens/biblioteca capa.jpg");
	
	// Objeto para obter a imagem
	ImageIcon imagem = new ImageIcon(caminhoDaImagem);	

	// JLabel
	JLabel exibirImagem = new JLabel();
	exibirImagem.setIcon(imagem);
	exibirImagem.setBounds(0, 0, 1200, 100);
	
	//Exibir Imagem 
	frm.getContentPane().add(exibirImagem);
	
	//Ação aos botões do Menu
	
	JMenuBar menuBar = new JMenuBar();
	frm.setJMenuBar(menuBar);
	
	JMenu mnIncio = new JMenu("In\u00EDcio");
	menuBar.add(mnIncio);
	
	//Menu Login
	JMenuItem mntmLogin = new JMenuItem("Login");
	mnIncio.add(mntmLogin);
	mntmLogin.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			FormularioLogin f = new FormularioLogin();
			
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
	
	//Menu Sair
	JMenuItem mntmSair = new JMenuItem("Sair");
	mnIncio.add(mntmSair);
	
	JMenu mnNewMenu = new JMenu("");
	menuBar.add(mnNewMenu);
	
	JMenu mnNewMenu_1 = new JMenu("Buscar");
	menuBar.add(mnNewMenu_1);
	
	JMenuItem mntmNome = new JMenuItem("Nome");
	mnNewMenu_1.add(mntmNome);
	
	JMenuItem mntmAutor = new JMenuItem("Autor");
	mnNewMenu_1.add(mntmAutor);
	mntmSair.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			frm.dispose();
			
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
