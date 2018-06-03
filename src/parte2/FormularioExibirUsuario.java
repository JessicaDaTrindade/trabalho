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
import parte1.Usuario;
import javax.swing.JButton;

public class FormularioExibirUsuario {

	//Construtor
	public FormularioExibirUsuario() {
		
		JFrame frm = new JFrame("Biblioteca ProJava");
		
		frm.setSize(850, 500); 	
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frm.setLocationRelativeTo(null); 
		frm.getContentPane().setLayout(null); 
		frm.getContentPane().setBackground(new Color(255, 250, 250));
		
		//JFrameSetIcon mudar ícone título
		 URL caminhoImagem = FormularioExibirUsuario.class.getResource("/imagens/logo.png");
		 ImageIcon iconeTitulo = new ImageIcon(caminhoImagem);
		 frm.setIconImage(iconeTitulo.getImage());
		
		//Instanciar
		AcaoArray a = new AcaoArray();
		Usuario u = new Usuario();
		
		JTable tabela = new JTable(a.listarUsuarios());
		//JScrollPane barra de rolagem
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(40, 20, 750, 290);
		
		AcaoArray al = new AcaoArray();
		
		
		//Exibir JTable		
		frm.getContentPane().add(barra);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(40, 343, 90, 40);
		frm.getContentPane().add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(150, 343, 90, 40);
		frm.getContentPane().add(btnExcluir);
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.setBounds(690, 343, 90, 40);
		frm.getContentPane().add(btnVoltar);
		btnVoltar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				frm.dispose();
				
				//voltar para o formulario anterior
				FormularioCadastrarUsuario fc = new FormularioCadastrarUsuario();
				
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
