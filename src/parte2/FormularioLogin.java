package parte2;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.text.MaskFormatter;

import parte1.AcaoArray;

public class FormularioLogin {
	
	//Construtor
	public FormularioLogin() {
		
	// JFrame
	JFrame formulario = new JFrame("Login");
	formulario.setSize(280, 160);
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	formulario.setLocationRelativeTo(null);
	formulario.getContentPane().setLayout(null);
		
		//JFrameSetIcon mudar ícone título
		 URL caminhoImagem = FormularioLogin.class.getResource("/imagens/logo.png");
		 ImageIcon iconeTitulo = new ImageIcon(caminhoImagem);
		 formulario.setIconImage(iconeTitulo.getImage());
		 
		
		AcaoArray ar = new AcaoArray();
		ar.criarAdm();
		ar.criarAluno();
		
		
		// JLabel login e senha
		JLabel login = new JLabel("CPF:");
		login.setBounds(10, 10, 50, 20);
		JLabel senha = new JLabel("Senha");
		senha.setBounds(10, 50, 50, 20);
		
		//Login		
		MaskFormatter mascaraCpf = null;
			try {
				mascaraCpf = new MaskFormatter("###.###.###-##");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Inválido.");
			}
			
		// JFormattedTextField
		JFormattedTextField cpf = new JFormattedTextField(mascaraCpf);
		cpf.setBounds(50, 10, 200, 20);
		
		
		// JFormattedTextField
		JPasswordField senha1 = new JPasswordField();
		senha1.setBounds(50, 50, 200, 20);
		
		//JButton
		JButton btn = new JButton("Entrar");
		btn.setBounds(50, 81, 75, 30);
		
		//Ação ao Botão com mouse
		btn.addMouseListener(new MouseListener() {
					
			@Override
			public void mouseReleased(MouseEvent e) {
						
				String Login = cpf.getText();
				String Senha = String.valueOf(senha1.getPassword());
							
						 
				if(ar.AcaoLogin(Login, Senha) == true) {
					formulario.dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "CPF ou senha inválida");
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
										
		// Adicionar elementos no JFrame
		formulario.getContentPane().add(login);
		formulario.getContentPane().add(senha);
		formulario.getContentPane().add(cpf);
		formulario.getContentPane().add(senha1);
		
		//Exibir JButton
		formulario.getContentPane().add(btn);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(175, 81, 75, 30);
		formulario.getContentPane().add(btnSair);
		btnSair.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				formulario.dispose();
				
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
