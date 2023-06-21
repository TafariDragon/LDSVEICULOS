package interfaces;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MenuGestaoAdministradores extends JFrame {
	
	//As imagens 
	ImageIcon bmw = new ImageIcon("imagens/bmw.jpg");
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	ImageIcon back = new ImageIcon("icons/back.png");
	//icons
	ImageIcon icoCadastrar = new ImageIcon("icons/new-user.png");
	ImageIcon icoAlterar = new ImageIcon("icons/update.png");
	ImageIcon icoRemover = new ImageIcon("icons/remove-user.png");
	ImageIcon icoList = new ImageIcon("icons/customer.png");
	ImageIcon icoProcurar = new ImageIcon("icons/magnifying-glass.png");
	 
	
	
	//Barra de menu
	JMenuBar barra  = new  JMenuBar();
	
	 
	
	//Criacao dos objectos menus
	 JMenu criar = new JMenu("Cadastrar (ADM)");
	 JMenu alterar = new JMenu("Alterar dados do (ADM)");
	 JMenu remover = new JMenu("Remover (ADM)");
	 JMenu listar = new JMenu("Listar (ADM)");
	 JMenu procurar = new JMenu("Procurar (ADM)");
	  
	 //Botao para voltar a tela
	 JButton btnvoltar = new JButton("Menu Adminsitradores");
	 
	 //JMenu  cricao Item
	 JMenuItem nome = new JMenuItem("Procurar");
	 JMenuItem numunico = new JMenuItem("Pelo nu");
	 JMenuItem nome1 = new JMenuItem("Remover");
	 JMenuItem numunico1 = new JMenuItem("Pelo numero unico");
	 JMenuItem nome2 = new JMenuItem("Alterar");
	 JMenuItem numunico2 = new JMenuItem("Pelo numero unico");
	 JMenuItem todos = new JMenuItem("Listar");
	 JMenuItem ult24h = new JMenuItem("ultimas 24 horas");
	 JMenuItem cadastrar = new JMenuItem("* Efectuar cadastro");
	 
	 JMenuItem list [] = {todos};
	 JMenuItem[] intens = {nome};
	 JMenuItem[] intens2 = {nome1};
	 JMenuItem[] intens3 = {nome2};
	 
	 //Array estatico que contem os menus
	JMenu menus [] = {criar ,alterar,remover,listar,procurar};
	
	public MenuGestaoAdministradores()
	{
		//Configuracao da tela 
		super("GESTÃO ADMINISTRADORES");
		setSize(728,410);
		setLocationRelativeTo(null);
		setIconImage(simbolo.getImage());
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	
		 
		Panel painel = new Panel();
		painel.setLayout(null);
		add(painel);
		
		  //Manipulacao do botao voltar
		btnvoltar.setFont(new Font ("Georgia", Font.BOLD,13));
		btnvoltar.setBounds(10, 335, 240, 30);
	    btnvoltar.setBackground(Color.white);
        btnvoltar.setForeground(Color.decode("#221A87"));
        btnvoltar.setIcon(back);
		
		criar.setIcon(icoCadastrar);
	     alterar.setIcon(icoAlterar);
	     remover.setIcon(icoRemover);
	     listar.setIcon(icoList);
	     procurar.setIcon(icoProcurar);
		
		    criar.add(cadastrar);
		
		   //Este for coloca todos os intens que estaao no vector itens no menu procurar
			for(int i=0; i<intens.length;i++)
			{
				procurar.add(intens[i]);
				
				 
			}
			
			//Este for coloca todos os intens que estaao no vector itens no menu procurar
			for(int i=0; i<intens2.length;i++)
			{
				 
				remover.add(intens2[i]);
			}
			
			for(int i=0; i<intens2.length;i++)
			{
				 
				listar.add(list[i]);
			}
			
			for(int i=0; i<intens3.length;i++)
			{
				 
				alterar.add(intens3[i]);
			}
		  
		  
		  //Colacar os os menus na barra do menu 
		  for(int i=0; i<menus.length;i++)
		  {
			  menus[i].setFont(new Font ("Georgia", Font.PLAIN,12));
			  barra.add(menus[i]);
		  }
		  
		  
		 barra.setBounds(0, 0, 728, 30);
		 procurar.setIcon(icoProcurar);
	 
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
		 
		cadastrar .addActionListener(
				 
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						  CadastroADM cadas = new CadastroADM();
						  cadas.setVisible(true);
						  //dispose();
						
					}
				}
				 
				 );
		
		nome .addActionListener(
				 
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						 ProcurarADM alt = new ProcurarADM();
						 alt.setVisible(true);
						  //dispose();
						
					}
				}
				 
				 );
		 
		
		nome1.addActionListener(
				 
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						  new RemoverADM();
						  //dispose();
						
					}
				}
				 
				 );
		
		 
		
		nome2.addActionListener(
				 
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						  new AlterarADM();
						  //dispose();
						
					}
				}
				 
				 );
		
		 
		
		todos.addActionListener(
				 
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						  ListarADM listAdm = new ListarADM();
						  listAdm.setVisible(true);
						  //dispose();
						
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
