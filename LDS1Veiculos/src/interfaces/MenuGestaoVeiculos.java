package interfaces;

import javax.swing.*;

import interfaces.MenuGestaoFuncionario.Panel;

import java.awt.*;
import java.awt.event.*;


public class MenuGestaoVeiculos extends JFrame {
	
	    //As imagens 
		ImageIcon bmw = new ImageIcon("imagens/bmw.jpg");
		ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
		ImageIcon back = new ImageIcon("icons/back.png");
		
		
		ImageIcon icoCriar = new ImageIcon("icons/addCar.png");
		ImageIcon icoRemover = new ImageIcon("icons/minus.png");
		ImageIcon icoList= new ImageIcon("icons/cars.png");
		ImageIcon icoSearch = new ImageIcon("icons/searching.png");
		ImageIcon icoAlterar = new ImageIcon("icons/software-development.png");
		
		
		
		
		//Botao para voltar a tela
		 JButton btnvoltar = new JButton(" Menu Adminsitradores");
		 
		//Criacao dos objectos menus
			 JMenu criar = new JMenu("Registrar (Veic)");
			 JMenu alterar = new JMenu("Alterar dados do (Veic)");
			 JMenu remover = new JMenu("Remover (Veic)");
			 JMenu listar = new JMenu("Listar (Veic)");
			 JMenu procurar = new JMenu("Procurar (Veic)");
			 
			 //JMenu  cricao Item
			 JMenuItem nome = new JMenuItem("Pela matricula");
			 JMenuItem numunico = new JMenuItem("Procurar Veiculo");
			 JMenuItem nome1 = new JMenuItem("Pela matricula");
			 JMenuItem numunico1 = new JMenuItem("Remover Veiculo");
			 JMenuItem nome2 = new JMenuItem("Pelo nome");
			 JMenuItem numunico2 = new JMenuItem("Alterar dados do Veiculo");
			 JMenuItem todos = new JMenuItem("Listar Veiculos");
			 JMenuItem ult24h = new JMenuItem("ultimas 24 horas");
			 JMenuItem cadastrar = new JMenuItem("* Registrar Veiculo ");
			 
			 //Serve para armazenar os itens
			 JMenuItem list [] = {todos};
			 JMenuItem[] intens = {numunico};
			 JMenuItem[] intens2 = {numunico1};
			 JMenuItem[] intens3 = {numunico2};
			 
			//Array estatico que contem os menus
				JMenu menus [] = {criar ,alterar,remover,listar,procurar};
				
				//Barra de menu
				JMenuBar barra  = new  JMenuBar();
				
				
		//Abaixo segue o metodo construtor da classe		
		public MenuGestaoVeiculos()
		{
			setTitle("Menu Gestao Veiculos");
			setSize(740,400);
			setVisible(true);
			setResizable(false);
		    setLocationRelativeTo(null);
		    setIconImage(simbolo.getImage());
		    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		    
		    Panel painel = new Panel();
			painel.setLayout(null);
			add(painel);
			
			criar.setIcon(icoCriar);
			remover.setIcon(icoRemover);
			
			criar.add(cadastrar);
			alterar.setIcon(icoAlterar);
			remover.setIcon(icoRemover);
			listar.setIcon(icoList);
			procurar.setIcon(icoSearch);
			
			//Manipulacao do botao voltar
			btnvoltar.setFont(new Font ("Georgia", Font.BOLD,13));
			btnvoltar.setForeground(Color.black);
			btnvoltar.setBounds(5, 320, 240, 30);
			
			 //Este for coloca todos os intens que estaao no vector itens no menu procurar
			for(int i=0; i<intens.length;i++)
			{
				procurar.add(intens[i]);
				
				 
			}
			
			//Este for coloca todos os intens que estao no vector itens no menu procurar
			for(int i=0; i<intens2.length;i++)
			{
				 
				remover.add(intens2[i]);
			}
			
			for(int i=0; i<intens2.length;i++)
			{
				 
				alterar.add(intens3[i]);
			}
		  
			
			
			//Este for coloca todos os intens que estao no vector itens no menu listar
			for(int i=0; i<intens2.length;i++)
			{
				 
				listar.add(list[i]);
			}
		  
		  
		  //Colacar os os menus na barra do menu 
		  for(int i=0; i<menus.length;i++)
		  {
			  menus[i].setFont(new Font ("Georgia", Font.PLAIN,14));
			  barra.add(menus[i]);
		  }
		 barra.setBounds(0, 0, 750, 30);

			
			
			
			
			//Tratamento evento usando classe interna anonima de com o botao voltar
			 btnvoltar.addActionListener(
					  new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							MenuAdminstrador menuadm = new MenuAdminstrador();
							menuadm.setVisible(true);
							dispose();
							
						}
					}
					 
					 );
			 
			 
			 cadastrar.addActionListener(
					 
					 new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
							 CadastroVeiculo cv = new CadastroVeiculo();
							 cv.setVisible(true);
								
							}
						}
					 
					 
					 );
			 
			 
			 
			 numunico.addActionListener(
					 
					 new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
							  ProcurarVeic_NumUnic pv = new ProcurarVeic_NumUnic();
							  pv.setVisible(true);
								
							}
						}
					 
					 
					 );
        numunico1.addActionListener(
					 
					 new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
							   new RemoverVeic();
								
							}
						}
					 
					 
					 );
        
        numunico2.addActionListener(
				 
				 new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
						   new AlterarVeic();
							
						}
					}
				 
				 
				 );
        
        todos.addActionListener(
				 
				 new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
						   new ListaVeiculos();
							
						}
					}
				 
				 
				 );
        
          btnvoltar.setBackground(Color.white);
	      btnvoltar.setForeground(Color.decode("#221A87"));
	      btnvoltar.setIcon(back);
			 
			 
			
			//Gestao dos elementos que estarao no objecto painel
			 painel.add(barra);
			 painel.add(btnvoltar);
			
		}
		
		//Classe Interna
		public class Panel extends JPanel
	    {

	       @Override
	       protected void paintComponent(Graphics g)
	       {
	           super.paintComponent(g); 
	           Image img = bmw.getImage();
	           g.drawImage(img,0,0, this);
	       }
	    }
}
		
