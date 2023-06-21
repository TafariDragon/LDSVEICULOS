package interfaces;

import javax.swing.*;

import loginTelas.LDSVeic.TelaLoginADM;
import loginTelas.LDSVeic.TelaLoginFun;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuAdminstrador extends JFrame {

	
	//Esses sao os paineis que sao usados no menuAdminstrador
	JPanel  jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	
	//Abaixo segue os elementos que irao fazer parte do menu Adminstrador
	JButton btnGAdministrador = new JButton("Gestão Administradores");
	JButton btnGFuncionarios = new JButton("Gestão Funcionarios");
	JButton btnGVeiculos = new JButton("Gestão Veiculos");
	JButton btnSitucao = new JButton("Situacão das vendas");
	
	JButton btnvoltar = new JButton("Voltar a tela inicial");
	
	JLabel lbl = new JLabel("MENU ADMINISTRADOR");
	public static JLabel lblUsuario = new JLabel();
	 
	 
	//Abaixo segue as imagens usadas neste mesmo menu
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
    ImageIcon admimag= new ImageIcon("imagens/mercedesadm.jpg");
    ImageIcon icoHome = new ImageIcon("icons/home.png");
    ImageIcon user= new ImageIcon("icons/user.png");
    ImageIcon adm = new ImageIcon("icons/adm.png");
    ImageIcon car  = new ImageIcon("icons/car.png");
    ImageIcon fun = new ImageIcon("icons/man-in-suit-and-tie.png");
    ImageIcon imgTotal = new ImageIcon("icons/sales.png");
    
    private JLabel lblUser = new JLabel(user);
    JLabel fundo = new JLabel(admimag);
     
 
    
    public MenuAdminstrador menu;
    
	public MenuAdminstrador ()
	{
		//Configuracao da tela
		setSize(1000,600);
	   // setVisible(true);
		setResizable(false);
		setTitle("MENU ADMINISTRADOR");
		setLocationRelativeTo(null);
		setLayout(null);
		setIconImage(simbolo.getImage());
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	     
		menu =this;
	   
		//Configuracao do painel 1
		jp1.setBackground(Color.decode("#221A87"));
		jp1.setBounds(0,0, 300, 600);
		jp1.setLayout(null);
		lbl.setFont(new Font ("Segoe Script", Font.ITALIC,18));
		lbl.setBounds(10, 10, 250, 18);
		lbl.setForeground(Color.white);
		jp1.add(lbl);
		
		btnGAdministrador.setForeground(Color.blue);
		btnGAdministrador.setFont(new Font ("Georgia", Font.ITALIC,16));
		btnGAdministrador.setBounds(25, 130, 250, 30);
		btnGAdministrador.setToolTipText("Manipulações dos dados dos administradores press[alt+a]");
		btnGAdministrador.setForeground(Color.BLACK);
		btnGAdministrador.setBackground(Color.white);
		btnGAdministrador.setIcon(adm);
		btnGAdministrador.setMnemonic('a');
		btnGAdministrador.setFocusPainted(false);
		
		btnGFuncionarios.setForeground(Color.blue);
		btnGFuncionarios.setFont(new Font ("Georgia", Font.ITALIC,16));
		btnGFuncionarios.setBounds(25, 170, 250, 30);
		btnGFuncionarios.setForeground(Color.BLACK);
		btnGFuncionarios.setBackground(Color.white);
		btnGFuncionarios.setIcon(fun);
		btnGFuncionarios.setToolTipText("Manipulações dos dados dos funcionarios press[alt+f]");
		btnGFuncionarios.setMnemonic('f');
		
		btnGVeiculos.setForeground(Color.blue);
		btnGVeiculos.setFont(new Font ("Georgia", Font.ITALIC,16));
		btnGVeiculos.setBounds(25, 210, 250, 30);
		btnGVeiculos.setForeground(Color.black);
		btnGVeiculos.setBackground(Color.white);
		btnGVeiculos.setToolTipText("Manipulações dos dados dos veiculos press[alt+v]");
		btnGVeiculos.setMnemonic('v');
		btnGVeiculos.setIcon(car);
		
		
		
		btnSitucao.setForeground(Color.blue);
		btnSitucao.setFont(new Font ("Georgia", Font.ITALIC,16));
		btnSitucao.setBounds(25, 250, 250, 30);
		btnSitucao.setForeground(Color.BLACK);
		btnSitucao.setBackground(Color.white);
		btnSitucao.setToolTipText("Manipulações dos dados dos veiculos press[alt+v]");
		btnSitucao.setMnemonic('S');
		btnSitucao.setIcon(imgTotal);
		
		btnvoltar.setForeground(Color.BLACK);
		btnvoltar.setFont(new Font ("Georgia", Font.ITALIC,16));
		btnvoltar.setBounds(25, 520, 250, 30);
		btnvoltar.setToolTipText("Voltar para a Tela inicial");
		btnvoltar.setBackground(Color.white);
		btnvoltar.setIcon(icoHome);
		
		
		 
	 
		lblUser.setBounds(10,40,50,32);
		
		lblUsuario.setBounds(60,50,150,18);
		
		lblUsuario.setForeground(Color.white);
		lblUsuario.setFont(new Font ("Times new Roman", Font.BOLD,16));
		
	     
		
		jp1.add(lblUser);
		jp1.add(lblUsuario);
		jp1.add(btnGFuncionarios);
		jp1.add(btnGVeiculos);
		jp1.add(btnGAdministrador);
		jp1.add(btnSitucao);
		jp1.add(btnvoltar);
		add(jp1);
		
		//Configuracao do painel 2
		jp2.setBounds(300,0, 700, 600);
		jp2.setLayout(new BorderLayout());
	    jp2.add(fundo);
		add(jp2);
		
		//Abaixo segue os eventos nos buttoes
		
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
		
		
		btnGAdministrador.addActionListener(
				
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						MenuGestaoAdministradores mga = new MenuGestaoAdministradores();
						mga.setVisible(true);
						dispose();
						
					}
				}
				
				);
		
		
			btnGFuncionarios.addActionListener(
				
				new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						MenuGestaoFuncionario mga = new MenuGestaoFuncionario();
						mga.setVisible(true);
						dispose();
						
					}
				}
				
		
				);
			
			btnGVeiculos.addActionListener(
					
					new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							MenuGestaoVeiculos mga = new MenuGestaoVeiculos();
							mga.setVisible(true);
							dispose();
							
						}
					}
					
			
					);
			
			btnSitucao.addActionListener(
					
					new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							 new SituacaoVendas();
							
						}
					}
					
			
					);
			
			
			
	}
	
	
}
