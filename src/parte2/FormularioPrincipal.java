package parte2;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;



public class FormularioPrincipal {
	
	//Construtor
	public FormularioPrincipal(int nivel) {
	
	//Jframe
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
	
	//Imagem fundo
	URL caminhoDaImagem = FormularioPrincipal.class.getResource("/imagens/biblioteca capa.jpg");
	
	// Objeto para obter a imagem
	ImageIcon imagem = new ImageIcon(caminhoDaImagem);	

	//JLabel imagem do findo
	JLabel exibirImagem = new JLabel();
	exibirImagem.setIcon(imagem);
	exibirImagem.setBounds(0, 0, 1200, 100);
	
	//Exibir Imagem do fundo
	frm.getContentPane().add(exibirImagem);
	
	
	
	
	
	
	//Exibir Livros
	JButton livros = new JButton("");
	livros.setToolTipText("Livros");
	livros.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/imagens/Livro.png")));
	livros.setBounds(45, 130, 160, 110);
	frm.getContentPane().add(livros);
	livros.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			FormularioExibirLivros fe = new FormularioExibirLivros();
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
	
	//Cadastrar Livros
	JButton cadastrar = new JButton("");
	cadastrar.setToolTipText("Cadastrar Livros");
	cadastrar.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/imagens/cadastrar livros.png")));
	cadastrar.setBounds(267, 130, 160, 110);
	frm.getContentPane().add(cadastrar);
	cadastrar.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			//Não exibir o botão cadastrar para o aluno	
			if(nivel == 2) {
				cadastrar.setEnabled(false);
				JOptionPane.showMessageDialog(null,"Sem Permissão!");
			}else {
			FormularioCadastro f = new FormularioCadastro(1);
			frm.dispose();
			}
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
	
	//Exibir quantidade de livros que a biblioteca possui
	JLabel exibirQntd = new JLabel("A Biblioteca possui:");
	exibirQntd.setFont(new Font("Tahoma", Font.BOLD, 12));
	exibirQntd.setBounds(609, 297, 131, 14);
	frm.getContentPane().add(exibirQntd);
	
	JButton btnCadastrarUsuario = new JButton("");
	btnCadastrarUsuario.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/imagens/login (2).png")));
	btnCadastrarUsuario.setToolTipText("Cadastrar Usu\u00E1rios");
	btnCadastrarUsuario.setBounds(45, 294, 160, 110);
	frm.getContentPane().add(btnCadastrarUsuario);
	
	JButton btnEmprestimo = new JButton("");
	btnEmprestimo.setToolTipText("Emprestimo de Livros");
	btnEmprestimo.setBounds(267, 294, 160, 110);
	frm.getContentPane().add(btnEmprestimo);
	
	
	
	//Exibir o formulário e seus componentes
	frm.setVisible(true);
	
	}
}
