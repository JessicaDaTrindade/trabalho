package parte2;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		JFrame formulario = new JFrame("Login Aluno");
		formulario.setSize(280, 160);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
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
				btn.setBounds(80, 80, 120, 30);
				
				//Ação ao Botão
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
				
				//Ação no botão com o ENTER
				btn.addKeyListener(new KeyListener() {
					
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void keyReleased(KeyEvent e) {	
						if(e.getKeyCode() == 10){
							formulario.dispose();
						}
					}
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
						
					
					}
				});
		
		
		// Adicionar elementos no JFrame
		formulario.add(login);
		formulario.add(senha);
		formulario.add(cpf);
		formulario.add(senha1);
		
		//Exibir JButton
		formulario.add(btn);
	
		// Exibir formulário
		formulario.setVisible(true);
		
	}

}
