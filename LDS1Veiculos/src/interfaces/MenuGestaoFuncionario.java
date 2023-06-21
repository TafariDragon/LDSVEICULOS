package interfaces;

import javax.swing.*;

import interfaces.MenuGestaoAdministradores.Panel;

import java.awt.*;
import java.awt.event.*;


public class MenuGestaoFuncionario extends JFrame {
	
	//As imagens 
	ImageIcon bmw = new ImageIcon("imagens/menugestaF.png");
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	ImageIcon back = new ImageIcon("icons/back.png");
	ImageIcon icoCadastrar = new ImageIcon("icons/new-user.png");
	ImageIcon icoAlterar = new ImageIcon("icons/update.png");
	ImageIcon icoRemover = new ImageIcon("icons/remove-user.png");
	ImageIcon icoList = new ImageIcon("icons/customer.png");
	ImageIcon icoProcurar = new ImageIcon("icons/magnifying-glass.png");
	
	//Botao para voltar a tela
	 JButton btnvoltar = new JButton("Menu Adminsitradores");
	 
	//Criacao dos objectos menus
		 JMenu criar = new JMenu("Cadastrar (FUN)");
		 JMenu alterar = new JMenu("Alterar dados do (FUN)");
		 JMenu remover = new JMenu("Remover (FUN)");
		 JMenu listar = new JMenu("Listar (FUN)");
		 JMenu efectuarSalario = new JMenu("Pagar Salario $");
		 JMenu procurar = new JMenu("Procurar (FUN)");
		 

		 //JMenu  cricao Item
		 JMenuItem nome = new JMenuItem("Procurar");
		 JMenuItem numunico = new JMenuItem("Pelo numero unico");
		 JMenuItem nome1 = new JMenuItem("Remover");
		 JMenuItem numunico1 = new JMenuItem("Pelo numero unico");
		 JMenuItem nome2 = new JMenuItem("Alterar");
		 JMenuItem numunico2 = new JMenuItem("Pelo numero unico");
		 JMenuItem todos = new JMenuItem("Listar");
		 JMenuItem ult24h = new JMenuItem("ultimas 24 horas");
		 JMenuItem cadastrar = new JMenuItem("* Efectuar cadastro");
		 JMenuItem pagars = new JMenuItem("* Efectuar o pagamento $");
		 
		 JMenuItem list [] = {todos};
		 JMenuItem[] intens = {nome};
		 JMenuItem[] intens2 = {nome1};
		 JMenuItem[] intens3 = {nome2}; 
		 //Array estatico que contem os menus
		JMenu menus [] = {criar ,alterar,remover,listar,procurar};
		 
	//Barra de menu
	JMenuBar barra  = new  JMenuBar();
	
	public MenuGestaoFuncionario()
	{
		setTitle("Menu Gestao Funcionario");
		setSize(773,450);
		setResizable(false);
		setVisible(true);
	    setLocationRelativeTo(null);
	    setIconImage(simbolo.getImage());
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
		efectuarSalario.add(pagars);
		 
		  //Manipulacao do botao voltar
			btnvoltar.setFont(new Font ("Georgia", Font.BOLD,13));
			btnvoltar.setBounds(10, 370, 240, 30);
			btnvoltar.setBackground(Color.white);
			btnvoltar.setIcon(back);
			btnvoltar.setForeground(Color.decode("#221A87"));
			
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
						for(int i=0; i<intens2.length;i++)
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
						  menus[i].setFont(new Font ("Georgia", Font.PLAIN,14));
						  barra.add(menus[i]);
					  }
					  
					 barra.setBounds(0, 0, 760, 30);
			
			
			
		//Gestao dos elementos que estarao no objecto painel
		 painel.add(barra);
		 painel.add(btnvoltar);
		 
		 
		 
		 
		//Eventos com o botao voltar
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
						 CadastroFun cd = new CadastroFun();
						 cd.setVisible(true);
						
					}
				}
				 
				 );
		 
		 nome.addActionListener(
				 
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						 ProcurarFun_NOME cd = new ProcurarFun_NOME();
						 cd.setVisible(true);
						
					}
				}
				 
				 );
		 
		 
		 nome1.addActionListener(
				 
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						 RemoverFun_Nome cd = new RemoverFun_Nome();
						 cd.setVisible(true);
						
					}
				}
				 
				 );
		 
		 
		 
		 	nome2.addActionListener(
				 
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
				 
						  new AlterarFun();
						
					}
				}
				 
				 );
		 	
		 	todos.addActionListener(
					 
					 new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
					 
							  new ListaFun();
							
						}
					}
					 
					 );
		 	
		 	 
		 
		 
		 
		 
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
