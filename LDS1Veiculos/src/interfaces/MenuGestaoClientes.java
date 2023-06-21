package interfaces;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import interfaces.MenuGestaoFuncionario.Panel;


public class MenuGestaoClientes extends JFrame {
	
	//As imagens 
		ImageIcon bmw = new ImageIcon("imagens/menugestaC.png");
		ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
		ImageIcon pes = new ImageIcon("icons/new-user.png");
        ImageIcon back = new ImageIcon("icons/back.png");
        ImageIcon icoCadastrar = new ImageIcon("icons/new-user.png");
    	ImageIcon icoAlterar = new ImageIcon("icons/update.png");
    	ImageIcon icoRemover = new ImageIcon("icons/remove-user.png");
    	ImageIcon icoList = new ImageIcon("icons/customer.png");
    	ImageIcon icoProcurar = new ImageIcon("icons/magnifying-glass.png");
        
		//Botao para voltar a tela
		 JButton btnvoltar = new JButton("Menu Funcionarios");
		 
		//Criacao dos objectos menus
			 JMenu criar = new JMenu("Cadastrar (Cliente)");
			 JMenu alterar = new JMenu("Alterar dados do (Cliente)");
			 JMenu remover = new JMenu("Remover (Cliente)");
			 JMenu listar = new JMenu("Listar (Cliente)");
			 JMenu procurar = new JMenu("Procurar (Cliente)");
			 
			//JMenu  cricao Item
			 JMenuItem nome = new JMenuItem("Pelo nome");
			 JMenuItem numunico = new JMenuItem("Pelo numero unico");
			 JMenuItem nome1 = new JMenuItem("Pelo nome");
			 JMenuItem numunico1 = new JMenuItem("Remover Cliente");
			 JMenuItem nome2 = new JMenuItem("Pelo nome");
			 JMenuItem numunico2 = new JMenuItem("Alterar dados do Cliente");
			 JMenuItem todos = new JMenuItem("Listar Clientes");
			 JMenuItem ult24h = new JMenuItem("ultimas 24 horas");
			 JMenuItem cadastrar = new JMenuItem("* Efectuar cadastro");
			 
			 //Os arrays estaticos abaixos servem para  colocar os itens de menu nos respectivos menus
			 JMenuItem list [] = {todos};
			 JMenuItem[] intens = {nome,numunico};
			 JMenuItem[] intens2 = {numunico1};
			 JMenuItem[] intens3 = {numunico2};
			 
			 //Array estatico que contem os menus
				JMenu menus [] = {criar ,alterar,remover,listar,procurar};
				 
			//Barra de menu
			JMenuBar barra  = new  JMenuBar();
	
	public MenuGestaoClientes()
	{
		super("Menu Gestao Clientes");
		setSize(900,530);
		setResizable(false);
		setVisible(true);
		setIconImage(simbolo.getImage());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		Panel painel = new Panel();
		painel.setLayout(null);
		add(painel);
		
		 criar.setIcon(icoCadastrar);
	     alterar.setIcon(icoAlterar);
	     remover.setIcon(icoRemover);
	     listar.setIcon(icoList);
	     procurar.setIcon(icoProcurar);
		
		criar.add(cadastrar);
		
		//Manipulacao do botao voltar
		btnvoltar.setFont(new Font ("Georgia", Font.BOLD,13));
		btnvoltar.setForeground(Color.black);
		btnvoltar.setBounds(10, 450, 240, 30);
		btnvoltar.setIcon(back);
		
		
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
		
		//Este for coloca todos os intens que estao no array estatico intens3
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
	  
	  barra.setBounds(0, 0, 890, 40);
	  barra.setBackground(Color.lightGray);

	  
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
		 
		//Eventos com o item de menu registrar
		 cadastrar.addActionListener(
				  new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					 CadastroCliente cc = new CadastroCliente();
					 cc.setVisible(true);
						 
						
					}
				}
				 
				 );
		 
		 
		 
		
		 numunico1.addActionListener(
				  new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
					  new RemoverClient();
						
					}
				}
				 
				 );
		 
		 
		 numunico2.addActionListener(
				  new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
					  new  AlterarClient();
						
					}
				}
				 
				 );
		 
		 todos.addActionListener(
				  new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
					  new  ListaClient();
						
					}
				}
				 
				 );
		 
		 
		 
		 nome.addActionListener(
				  new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
					  new  ProcurarClient_Nome();
						
					}
				}
				 
				 );
		 
		 numunico.addActionListener(
				  new ActionListener() {
						
					@Override
					public void actionPerformed(ActionEvent e) {
					  new  ProcurarClient_NumUnic();
						
					}
				}
				 
				 );
		 
		  
		 
		  btnvoltar.setBackground(Color.white);
	      btnvoltar.setForeground(Color.decode("#221A87"));
	      btnvoltar.setIcon(back);
		 
		 
		 
		
	}
	
	
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
