package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuFuncionarios extends JFrame {
	
	
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	ImageIcon icoHome = new ImageIcon("icons/home.png");
	ImageIcon nissan = new ImageIcon("imagens/nissanfuncionarios.jpg");
	ImageIcon user= new ImageIcon("icons/pessoa.png");
	ImageIcon usuario= new ImageIcon("icons/user.png");
	ImageIcon icovendas= new ImageIcon("icons/cash-machine.png");
	
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	
	JButton btnGvendas = new JButton("Gestão Vendas");
	JButton btnGclientes = new JButton ("Gestão Clientes");
	JLabel lbl = new JLabel("MENU FUNCIONARIOS");
	JLabel fundo = new JLabel(nissan);
	JButton btnvoltar = new JButton("Voltar a tela inicial");
	
	
	 JLabel lblUser = new JLabel(usuario);
	 public static JLabel lblUsuario = new JLabel();
	
	public MenuFuncionarios menu;
	
	public MenuFuncionarios ()
	{
		
		menu=this;
		setSize(940,480);
		setResizable(false);
		//setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		setTitle("MENU FUNCIONARIOS");
		setLayout(null);
		setIconImage(simbolo.getImage());
		add(jp1);
		add(jp2);
		int altura =getHeight();
		
		
		
		
		
        lblUsuario.setBounds(60,50,150,18);
		lblUsuario.setForeground(Color.white);
		lblUsuario.setFont(new Font ("Times new Roman", Font.BOLD,16));
		
		//Configuracao e gestao do Painel 1
		jp1.setBackground(Color.gray);
		jp1.setLayout(null);
		jp1.setBounds(0, 0, 300, altura);
		jp1.add(lbl);
		jp1.add(lblUsuario);
		jp1.add(lblUser);
		jp1.add(btnGvendas);
		jp1.add(btnGclientes);
		jp1.add(btnvoltar);
		
		//Configuracao dos componentes que pertecem ao Painel 1
		lbl.setBounds(20, 10, 250, 18);
		lbl.setFont(new Font ("Segoe Script", Font.ITALIC,18));
		lbl.setForeground(Color.white);
		
		lblUser.setBounds(10, 40,50 ,32);
		
		
		btnGclientes.setBounds(20,150, 250, 30);
		btnGclientes.setFont(new Font ("Georgia", Font.ITALIC,16));
		btnGclientes.setForeground(Color.blue);
        btnGclientes.setToolTipText("Manipulações dos dados dos clientes");
        btnGclientes.setIcon(user);
        btnGclientes.setBackground(new Color(153,217,234));
		
 
        
		btnGvendas.setBounds(20, 110, 250, 30);
		btnGvendas.setFont(new Font ("Georgia", Font.ITALIC,16));
		btnGvendas.setForeground(Color.blue);
		btnGvendas.setToolTipText("Operções das vendas");
		btnGvendas.setIcon(icovendas);
	    btnGvendas.setBackground(new Color(153,217,234));
		
			
		
		btnvoltar.setForeground(Color.black);
		btnvoltar.setFont(new Font ("Georgia", Font.ITALIC,16));
		btnvoltar.setBounds(20, 360, 250, 30);
	    btnvoltar.setToolTipText("Voltar para a Tela inicial");
	    btnvoltar.setBackground(Color.white);
		btnvoltar.setIcon(icoHome);
		 
		
		
		
		//Configuracao e gestao do Painel 2
		jp2.setBounds(300,0, 640, altura);
		jp2.setLayout(new BorderLayout());
		jp2.add(fundo);
		
		
		//Eventos dos botoes pertecentes ao painel 1
			btnvoltar.addActionListener(
				
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						 TelaInicial ti = new TelaInicial();
						 ti.setVisible(true);
						 dispose();
						
					}
				}
				
				);
			
			
			btnGclientes.addActionListener(
					  new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							MenuGestaoClientes mgc = new MenuGestaoClientes();
							mgc.setVisible(true);
							dispose();
							
						}
					}
					
					);
			
			btnGvendas.addActionListener(
					  new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							MenuGestaoVendas mgc = new MenuGestaoVendas();
							mgc.setVisible(true);
							dispose();
							
						}
					}
					
					);
		
	}

}
