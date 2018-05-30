package parte2;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import parte1.AcaoArray;

public class FormularioExibirLivros {
	
	//Construtor
	public FormularioExibirLivros() {
		
		JFrame frm = new JFrame("Biblioteca ProJava");
		
		frm.setSize(850, 500); 	
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frm.setLocationRelativeTo(null); 
		frm.getContentPane().setLayout(null); 
		frm.getContentPane().setBackground(new Color(255, 250, 250));
		
		AcaoArray ar = new AcaoArray();
		
		JTable tabela = new JTable(ar.listarProdutos());
		
		//JScrollPane barra de rolagem
		JScrollPane barra = new JScrollPane(tabela);
		barra.setBounds(40, 180, 410, 270);
		
		frm.add(barra);
		
		
		
	}

}
