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

import parte1.AcaoArray;
import parte1.Livros;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;




public class FormularioPrincipal {
	
	
	
	//Construtor
	public FormularioPrincipal(int nivel) {
	
		
		
	//Jframe
	JFrame frm = new JFrame("Biblioteca ProJava");
	frm.getContentPane().setForeground(Color.BLACK);
	
	frm.setSize(750, 500); 	
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

	//JLabel imagem do fundo
	JLabel exibirImagem = new JLabel();
	exibirImagem.setIcon(imagem);
	exibirImagem.setBounds(0, 0, 1200, 100);
	
	//Exibir Imagem do fundo
	frm.getContentPane().add(exibirImagem);
	
	//Imagem fundo
	URL caminhoDaImagem1 = FormularioPrincipal.class.getResource("/imagens/fundoLogo.png");
		
	// Objeto para obter a imagem
	ImageIcon imagem1 = new ImageIcon(caminhoDaImagem1);	

	//JLabel imagem do fundo
	JLabel exibirImagem1 = new JLabel();
	exibirImagem1.setIcon(imagem1);
	exibirImagem1.setBounds(390, 120, 480, 300);
		
	//Exibir Imagem do fundo
	frm.getContentPane().add(exibirImagem1);
	
	//Exibir Livros
	JButton livros = new JButton("");
	livros.setBackground(new Color(240, 240, 240));
	livros.setToolTipText("Livros");
	livros.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/imagens/exibirlivros.png")));
	livros.setBounds(45, 130, 120, 90);
	frm.getContentPane().add(livros);
	livros.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			//Não exibir o botão para o ADM	
			if(nivel == 1) {
				livros.setEnabled(false);
				JOptionPane.showMessageDialog(null,"Somente Alunos!");
			}else {
				frm.dispose();
				FormularioExibirLivros fe = new FormularioExibirLivros();
				
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
	
	//Cadastrar Livros
	JButton cadastrar = new JButton("");
	cadastrar.setBackground(new Color(255, 250, 240));
	cadastrar.setToolTipText("Cadastrar Livros");
	cadastrar.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/imagens/add livro.png")));
	cadastrar.setBounds(267, 130, 120, 90);
	frm.getContentPane().add(cadastrar);
	cadastrar.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			//Não exibir o botão cadastrar para o aluno	
			if(nivel == 2) {
				cadastrar.setEnabled(false);
				JOptionPane.showMessageDialog(null,"Sem Permissão!");
			}else {
				frm.dispose();
				FormularioCadastro f = new FormularioCadastro(1);
			
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
	
	
	
	//Método para cadastrar usuário
	JButton btnCadastrarUsuario = new JButton("");
	btnCadastrarUsuario.setBackground(new Color(255, 250, 240));
	btnCadastrarUsuario.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/imagens/user.png")));
	btnCadastrarUsuario.setToolTipText("Cadastrar Usu\u00E1rios");
	btnCadastrarUsuario.setBounds(45, 294, 120, 90);
	frm.getContentPane().add(btnCadastrarUsuario);
	btnCadastrarUsuario.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent arg0) {
			//Não exibir o botão para o aluno	
			if(nivel == 2) {
				cadastrar.setEnabled(false);
				JOptionPane.showMessageDialog(null,"Sem Permissão!");
			}else {
				frm.dispose();
				
				FormularioCadastrarUsuario f = new FormularioCadastrarUsuario();
				
			
			}
			
			
		}
		
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});
	
	//Método para sair e voltar ao login
	JButton btnSair = new JButton("");
	btnSair.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/imagens/sair.png")));
	btnSair.setToolTipText("Sair");
	btnSair.setBounds(666, 384, 58, 66);
	frm.getContentPane().add(btnSair);
	btnSair.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent arg0) {
			
			frm.dispose();			
		}
		
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	});
	
	
	//Emprestar Livro para o usuario
	JButton btnEmprestimo = new JButton("");
	btnEmprestimo.setBackground(new Color(255, 250, 240));
	btnEmprestimo.setIcon(new ImageIcon(FormularioPrincipal.class.getResource("/imagens/emprestimo de livro.png")));
	btnEmprestimo.setToolTipText("Efetuar Empr\u00E9stimo");
	btnEmprestimo.setBounds(267, 294, 120, 90);
	frm.getContentPane().add(btnEmprestimo);
	btnEmprestimo.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			//Não exibir o botão para o aluno	
			if(nivel == 2) {
				cadastrar.setEnabled(false);
				JOptionPane.showMessageDialog(null,"Sem Permissão!");
			}else {
				frm.dispose();
				FormularioEmprestimo fe = new FormularioEmprestimo();				
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
	
	
	
	
	//Exibir o formulário e seus componentes
	frm.setVisible(true);
	
	}
}
