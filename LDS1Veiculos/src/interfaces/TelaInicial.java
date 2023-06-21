package interfaces;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import classesdeEdicaoComponentes.LDSVeic.JButtonArredondado;
import loginTelas.LDSVeic.DensevolvidoresTela;
import loginTelas.LDSVeic.SobreSistema;
import loginTelas.LDSVeic.TelaLoginADM;
import loginTelas.LDSVeic.TelaLoginFun;
import loginTelas.LDSVeic.TelaProgressBar;
/**
 *
 * @author Tafari Fransisco Vilanculos
 */
public class TelaInicial extends JFrame {

    /**
     * @param args the command line arguments
     */
    
         ImageIcon icoAbout = new ImageIcon("icons/web-development.png");
         ImageIcon icovers = new ImageIcon("icons/software.png");
         ImageIcon icoDev = new ImageIcon("icons/programmer.png");
         ImageIcon icoSoft = new ImageIcon("icons/java.png");
         
	     ImageIcon carro = new ImageIcon("imagens/carro.png");
         ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
         ImageIcon adm = new ImageIcon("icons/adm.png");
         ImageIcon fun = new ImageIcon("icons/man-in-suit-and-tie.png");
         ImageIcon fechar = new ImageIcon("icons/close.png");
         ImageIcon funcionario = new ImageIcon("icons/funcionario.png");
         JButtonArredondado  btnfuncionario,btnAdministrador,btnfechar;
         JLabel usuario = new JLabel();
         
         JMenuBar barra = new JMenuBar();
         JMenu menu = new JMenu("Sobre o software");
         JMenuItem sobreSoft = new JMenuItem("Para que serve?");
         JMenuItem versao = new JMenuItem("Versao do Sistema");
         JMenuItem developer = new JMenuItem("Desenvolvedor");
      
         
    
         
        public static void main (String[]args)
        {
    	   TelaProgressBar tb=  new TelaProgressBar();
    	   tb.setVisible(true);
    	   
        }
    
        JPanel painelButoes = new JPanel();
     
         public TelaInicial()
         {
        	 
        	 int raio=40;
        	 //Configuracao da tela Jframe
              
             setSize(1240,700);
             setResizable(false);
             setDefaultCloseOperation(EXIT_ON_CLOSE);
             setTitle("LDSVEICULOS");
             setLocationRelativeTo(null);
             setIconImage(simbolo.getImage());
             
             //Configuracao para o painel com butoes
             painelButoes.setBounds(450, 280, 350, 300);
             painelButoes.setBackground(Color.white);
             painelButoes.setOpaque(false);
           
             //Configuracao do Conteudo da tela
             Panel painel = new Panel();
             painel.setLayout(null);
             btnfuncionario = new JButtonArredondado("FUNCIONARIO GERENTE",raio);
             
            // int x = 400;
            // int y = 350;
            // int largura = 200;
             //int altura = 30;
             
              btnfuncionario.setPreferredSize(new Dimension(280, 50));
              btnfuncionario.setToolTipText("SOMENTE OS FUNCIONARIOS");
              btnfuncionario.setFont(new Font ("Georgia", Font.BOLD,13));
            // btnfuncionario.setForeground(Color.white);
             btnfuncionario.setIcon(fun);
             
              
             
            
             btnfuncionario.setBackground(Color.green);
             
        
           
            
             
             btnAdministrador = new JButtonArredondado("   ADMINISTRADOR   ",raio);
             btnAdministrador.setPreferredSize(new Dimension(280,50));
             btnAdministrador.setFont(new Font ("Georgia", Font.BOLD,13));
             btnAdministrador.setToolTipText("SOMENTE OS ADMINSTRADORES");
             btnAdministrador.setFont(new Font ("Georgia", Font.BOLD,13));
             btnAdministrador.setIcon(adm);
             btnAdministrador.setBackground(Color.green);
             
             
             btnfechar = new JButtonArredondado("",raio);
             btnfechar.setText("Fechar Apliacação");
             btnfechar.setFont(new Font ("Georgia", Font.BOLD,12));
             btnfechar.setMnemonic('F');
             btnfechar.setToolTipText("Para fechar a aplicação click em [Alt+F]");
             btnfechar.setBounds(10, 620, 200,35);
             btnfechar.setBackground(Color.yellow);
             btnfechar.setIcon(fechar);
             
             barra.setBounds(0,0,190,30);
             menu.add(sobreSoft);
             menu.add(versao);
             menu.add(developer);
             menu.setFont(new Font ("Georgia", Font.BOLD,16));
             barra.add(menu);
             
         
             
             
             
             painel.add(btnfechar);
             painel.add(painelButoes);
             painel.add(barra);
             painelButoes.add(btnfuncionario);
             painelButoes.add(btnAdministrador);
             painel.add(usuario);
             add(painel);
              
             
             //Tratamento de Enventos com classes anonimas
             
             btnAdministrador.addActionListener(
            		 
            		 new ActionListener()
            		 {
						
						@Override
						public void actionPerformed(ActionEvent e) 
						{
							/*
							 MenuAdminstrador menu = new MenuAdminstrador();
							 menu.setVisible(true);
							 dispose();
							 */
							
							TelaLoginADM telaAdm = new  TelaLoginADM();
							telaAdm.setVisible(true);
							dispose();
						}
					}
            		 
            		 );
             
             
                    btnfuncionario.addActionListener(
            		 
            		 new ActionListener()
            		 {
						
						@Override
						public void actionPerformed(ActionEvent e) 
						{
							 new TelaLoginFun();
							 dispose();
							
						}
					}
            		 
            		 );
                    
                    
                    btnfechar.addActionListener(
                   		 
                   		 new ActionListener()
                   		 {
       						
       						@Override
       						public void actionPerformed(ActionEvent e) 
       						{
       							  System.exit(0);
       							
       						}
       					}
                   		 
                   		 );
             
                    
                    sobreSoft.setIcon(icoAbout);
                    versao.setIcon(icovers);
                    developer.setIcon(icoDev);
                    
                    sobreSoft.setBackground(Color.white);
                    versao.setBackground(Color.white);
                    developer.setBackground(Color.white);
                    
                    
                    versao.addActionListener(
                    		new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									JOptionPane.showMessageDialog(null, "A actual do sistema é Versão 1.0");
									
								}
							}
                    		
                    		);
                    
                    developer.addActionListener(
                    		new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									new DensevolvidoresTela();
									
								}
							}
                    		
                    		);
             
                    sobreSoft.addActionListener(
                    		new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									new SobreSistema();
									
								}
							}
                    		
                    		);
                    
                    
                 EventosMouse ev = new EventosMouse();
                 btnfuncionario.addMouseListener(ev);
                 btnAdministrador.addMouseListener(ev);
                 btnfechar.addMouseListener(ev);
                 
                 menu.setIcon(icoSoft);
                    
                    
                    
         }
         
         public class Panel extends JPanel
         {

            @Override
            protected void paintComponent(Graphics g)
            {
                super.paintComponent(g); 
                Image img = carro.getImage();
                g.drawImage(img,0,0, this);
            }
            
      
      }
         
         
         public class EventosMouse implements MouseListener
         {

        
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				 
				if(e.getSource()==btnfuncionario)
				{
					btnfuncionario.setBackground(Color.cyan);
				}
				
				
				if(e.getSource()==btnAdministrador)
				{
					btnAdministrador.setBackground(Color.cyan);
				}
				
				if(e.getSource()==btnfechar)
				{
					btnfechar.setBackground(Color.red);
				}
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				if(e.getSource()==btnfuncionario)
				{
					btnfuncionario.setBackground(Color.green);
				}
				
				if(e.getSource()==btnAdministrador)
				{
					btnAdministrador.setBackground(Color.green);
				}
				
				if(e.getSource()==btnfechar)
				{
					btnfechar.setBackground(Color.yellow);
				}
			 
			}
        	 
         }
    
     
         
}
