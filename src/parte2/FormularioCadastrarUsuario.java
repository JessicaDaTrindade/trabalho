package parte2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import parte1.AcaoArray;
import parte1.Usuario;


public class FormularioCadastrarUsuario {
	private JTextField txtNome;
	private JTextField txtNivel;
	private JTextField txtSenha;
	private JTextField txtCpf;
	
	//Construtor 
	public FormularioCadastrarUsuario() {
		
		// JFrame
		JFrame formulario = new JFrame("Cadastrar Usuário");
		formulario.setSize(400, 250);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.getContentPane().setLayout(null);
		
		//JFrameSetIcon mudar ícone título
		URL caminhoImagem = FormularioCadastrarUsuario.class.getResource("/imagens/logo.png");
		ImageIcon iconeTitulo = new ImageIcon(caminhoImagem);
		formulario.setIconImage(iconeTitulo.getImage());
		
		JLabel lblNomeUsurio = new JLabel("Nome Usuário:");
		lblNomeUsurio.setBounds(10, 32, 112, 14);
		formulario.getContentPane().add(lblNomeUsurio);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 55, 78, 14);
		formulario.getContentPane().add(lblCpf);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 78, 46, 14);
		formulario.getContentPane().add(lblSenha);
		
		JLabel lblNvel = new JLabel("Nível:");
		lblNvel.setBounds(10, 101, 46, 14);
		formulario.getContentPane().add(lblNvel);
		
		txtNome = new JTextField();
		txtNome.setBounds(130, 29, 213, 20);
		formulario.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtNivel = new JTextField();
		txtNivel.setBounds(130, 98, 213, 20);
		formulario.getContentPane().add(txtNivel);
		txtNivel.setColumns(10);
		
		txtSenha = new JTextField();
		txtSenha.setColumns(10);
		txtSenha.setBounds(130, 75, 213, 20);
		formulario.getContentPane().add(txtSenha);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(130, 52, 213, 20);
		formulario.getContentPane().add(txtCpf);
		txtCpf.setColumns(10);
		
		AcaoArray ar = new AcaoArray();
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(243, 129, 100, 48);
		formulario.getContentPane().add(btnCadastrar);
		btnCadastrar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {


				String Senha = txtSenha.getText();
				String Login = txtCpf.getText();
				String Nome = txtNome.getText();
				int Nivel = Integer.parseInt(txtNivel.getText());
						
			//Cadastrar
			ar.cadastrarUsuario(Senha, Login, Nome, Nivel);
			
				//Limpar campos
				txtNome.setText("");
				txtSenha.setText("");
				txtCpf.setText("");
				txtNivel.setText("");	
				txtNome.setText("");
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
		
		//JButton Voltar
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(130, 129, 100, 48);
		formulario.getContentPane().add(btnVoltar);
		btnVoltar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				formulario.dispose();
				
				//Voltar ao menu principal
				FormularioPrincipal fp = new FormularioPrincipal(1);
				
				
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
		
		AcaoArray a = new AcaoArray();
		a.listarUsuarios();
		
		//Listar usuários
		JButton btnUsuarios = new JButton("Usu\u00E1rios");
		btnUsuarios.setBounds(10, 129, 100, 48);
		formulario.getContentPane().add(btnUsuarios);
		btnUsuarios.addMouseListener(new MouseListener() {
			
			
			
			@Override
			public void mouseReleased(MouseEvent e) {
				formulario.dispose();
				
				//Chamar formulario
				FormularioExibirUsuario fr = new FormularioExibirUsuario();
			
				
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
		
	// Exibir formulário
	formulario.setVisible(true);
	
	}
}
	
