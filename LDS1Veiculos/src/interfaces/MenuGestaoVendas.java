package interfaces;

import javax.swing.*;
import interfaces.MenuGestaoAdministradores.Panel;
import java.awt.*;
import java.awt.event.*;

public class MenuGestaoVendas extends JFrame {
	
	//Imagens usadas nas janelas
	ImageIcon vendas = new ImageIcon("imagens/menugestaVendas.jpg");
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	ImageIcon back = new ImageIcon("icons/back.png");
	
	//Atribuicao dos icons aos menus
	ImageIcon icovendas= new ImageIcon("icons/cash-machine.png");
	ImageIcon icoAlterar = new ImageIcon("iconsVenda/shopping.png");
	ImageIcon icoRemover = new ImageIcon("iconsVenda/shopping-cart (1).png");
	ImageIcon icoList = new ImageIcon("iconsVenda/feature.png");
	ImageIcon icoProcurar = new ImageIcon("iconsVenda/shopping-online.png");
	
	
	
	//Botao para voltar a tela
	 JButton btnvoltar = new JButton(" Menu Funcionarios");
	 
	 //Criacao dos objectos menus
		 JMenu criar = new JMenu("Efectuar Venda $");
		 JMenu alterar = new JMenu("Alterar dados da venda");
		 JMenu remover = new JMenu("Remover dados venda");
		 JMenu listar = new JMenu("Listar vendas");
		 JMenu procurar = new JMenu("Procurar venda");
		 
		//JMenu  cricao Item
		 
		 JMenuItem numunico = new JMenuItem("Procurar Venda");
		 JMenuItem numunico1 = new JMenuItem("Remover Venda");
		 JMenuItem numunico2 = new JMenuItem("Alterar Venda");
		 JMenuItem todos = new JMenuItem("Listar Vendas");
		 JMenuItem ult24h = new JMenuItem("ultimas 24 horas");
		 JMenuItem cadastrar = new JMenuItem("* Efectuar Venda");
		 

		 //Os arrays estaticos abaixos servem para  colocar os itens de menu nos respectivos menus
		 JMenuItem list [] = {todos};
		 JMenuItem[] intens = {numunico};
		 JMenuItem[] intens2 = {numunico1};
		 JMenuItem[] intens3 = {numunico2};
		 
		 //Array estatico que contem os menus
			JMenu menus [] = {criar ,alterar,remover,listar,procurar};
			 
		//Barra de menu
		JMenuBar barra  = new  JMenuBar();
		
		 
	
    public MenuGestaoVendas()
	{
    	setTitle("MENU GESTAO VENDAS");
		setVisible(true);
		setResizable(false);
		setSize(990,550);
		setLocationRelativeTo(null);
		setIconImage(simbolo.getImage());
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		Panel painel = new Panel();
		painel.setLayout(null);
		add(painel);
		 
		criar.setIcon(icovendas);
		alterar.setIcon(icoAlterar);
		remover.setIcon(icoRemover);
		listar.setIcon(icoList);
		procurar.setIcon(icoProcurar);
		
		
		criar.add(cadastrar);
		
		//Manipulacao do botao voltar
				btnvoltar.setFont(new Font ("Georgia", Font.BOLD,13));
				btnvoltar.setForeground(Color.black);
				btnvoltar.setBounds(10, 470, 240, 30);
				
				
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
				
				
				//Este for coloca todos os intens que estao no vector itens no menu listar
				for(int i=0; i<list.length;i++)
				{
					 
					listar.add(list[i]);
				}
			  
				for(int i=0; i<intens2.length;i++)
				{
					 
					alterar.add(intens3[i]);
				}
			  
			  
			  //Colacar os os menus na barra do menu 
			  for(int i=0; i<menus.length;i++)
			  {
				  menus[i].setFont(new Font ("Georgia", Font.PLAIN,18));
				  barra.add(menus[i]);
			  }
			  barra.setBounds(0, 0, 980, 30);

		
		 
		
		
		//Gestao dos elementos que estarao no objecto painel
		 painel.add(barra);
		 painel.add(btnvoltar);
		 
		 
		//Eventos com o botao voltar
		 btnvoltar.addActionListener(
				  new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						MenuFuncionarios menuadm = new MenuFuncionarios();
						menuadm.setVisible(true);
						dispose();
						
					}
				}
				 
				 );
		 
		//Eventos com do intem efectuar venda
		 cadastrar.addActionListener(
				  new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					     EfectuarVenda eft = new EfectuarVenda();
					     eft.efectuar.txtNumClient.setText("");
					     eft.efectuar.txtNumVeic.setText("");
					     eft.efectuar.txtNomeClient.setText("");
					     eft.efectuar.txtemail.setText("");
					     eft.efectuar.lblNumClient.setForeground(Color.black);
					     eft.efectuar.lblNumVeic.setForeground(Color.black);
					     eft.efectuar.lblemail.setForeground(Color.black);
					     eft.efectuar.lblNomeClient.setForeground(Color.black);
					     eft.setVisible(true);
						
					}
				}
				 
				 );
		 
		 numunico.addActionListener(
				  new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
					     ProcurarVenda pv = new ProcurarVenda();
					     pv.setVisible(true);
						
					}
				}
				 
				 );
		 
		 
		 numunico1.addActionListener(
				  new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
					    new RemoverVenda_01();
						
					}
				}
				 
				 );
		 
		 
		 numunico2.addActionListener(
				  new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
					    new AlterarVenda();
						
					}
				}
				 
				 );
		 
		 todos.addActionListener(
				  new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
					    new ListaVendas();
						
					}
				}
				 
				 );
		  btnvoltar.setBackground(Color.white);
	      btnvoltar.setForeground(Color.decode("#221A87"));
	      btnvoltar.setIcon(back);
		 
	}
	 

  //Classe Interna
  		public class Panel extends JPanel
  	    {

  	       @Override
  	       protected void paintComponent(Graphics g)
  	       {
  	           super.paintComponent(g); 
  	           Image img = vendas.getImage();
  	           g.drawImage(img,0,0, this);
  	       }
  	    }
}
