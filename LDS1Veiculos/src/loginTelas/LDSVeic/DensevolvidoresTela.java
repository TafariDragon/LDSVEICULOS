package loginTelas.LDSVeic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;

import javax.swing.*;

public class DensevolvidoresTela extends JFrame {
	
	
	   ImageIcon ft = new ImageIcon("imagens/perrFilDev (2)2.jpg");
	   ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	   ImageIcon icogit = new ImageIcon("icons/github.png");
	   ImageIcon icoWhats = new ImageIcon("icons/whatsapp.png");
	   ImageIcon icoPhone = new ImageIcon("icons/phone-call.png");
	   
	   
	  JLabel lblDevfoto = new JLabel(ft);
	  JLabel lblIcoGuit = new JLabel(icogit);
	  JLabel lblIcoWhats = new JLabel(icoWhats);
	  JLabel lblIcoPhone = new JLabel(icoPhone);
	  
	  JLabel lblNome = new JLabel("Tafari Vilanculos");
	  JLabel lblCode = new JLabel("<THE FRIRE CODE>");
	  String texto =("Tafari estudante de desenvolvimento de software<br> na USTM"+ "(Universidade São Tomas de Moçambique).<br>"
	  		+ "Aprendiz de Programação em Java.<br>"+ "<THE FIRE CODE>");
	  JLabel lblinfo = new JLabel("<html>"+texto+"</html>");
	  		 
	  
	  JPanel painel = new JPanel();
	  
	  
	  JScrollPane srcl = new JScrollPane(painel);
	
	 public DensevolvidoresTela()
	 {
		 
		 super("Desenvolvidores");
		 int largura =830;
		 int altura = 400;
		 
		 setIconImage(simbolo.getImage());
		 setSize(largura,altura);
		 setVisible(true);
	     setLocationRelativeTo(null);
		 setResizable(false);
		 add(painel);
		 
		 
		  
		 //Foto do dev responsavel
		 lblDevfoto.setBounds(0, 0, 225, 300);
		 
		 lblNome.setFont(new Font ("Georgia", Font.BOLD,16));
		 lblNome.setBounds(290,20,200,16);
		 lblinfo.setFont(new Font ("Courier New", Font.BOLD,16));
		 lblinfo.setBounds(249, 80, 600, 90);
		 
		 lblCode.setForeground(Color.RED);
		 lblCode.setFont(new Font ("Courier New", Font.BOLD,16));
		 lblCode.setBounds(249, 200, 600, 90);
		 
		 
		  
		//Icons de contacto ao dev
		 lblIcoGuit.setBounds(240,10,50,32);
		 lblIcoGuit.setCursor(new Cursor(Cursor.HAND_CURSOR));
		 lblIcoWhats.setBounds(460,10,50,32);
		 lblIcoPhone.setBounds(630,10,50,32);
		 
		 
		 JLabel lblContact0 = new JLabel("+258/869881092");
		 JLabel lblContact = new JLabel("+258/869881092");
		 lblContact.setFont(new Font ("Times New Roman", Font.BOLD,16));
		 lblContact.setBounds(510,20,250,16);
		 
		 lblContact0.setFont(new Font ("Times New Roman", Font.BOLD,16));
		 lblContact0.setBounds(679,20,250,16);
		 
		 
		 painel.add(lblIcoPhone);
		 painel.add(lblIcoGuit);
		 painel.add(lblCode);
		 painel.add(lblNome);
		 painel.add(lblContact);
		 painel.add(lblContact0);
		 painel.add(lblinfo);
		 painel.setSize(largura, altura);
		 painel.setLayout(null);
		 painel.setBackground(Color.white);
		 painel.add(lblDevfoto);
		 painel.add(lblIcoWhats);
		 painel.add(lblIcoPhone);
		 
		 lblIcoGuit.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mouseClicked(MouseEvent e) {
	                try {
	                    // Abre o link no navegador padrão
	                    Desktop.getDesktop().browse(new java.net.URI("https://github.com/TafariDragon"));
	                } catch (Exception ex) {
	                    ex.printStackTrace();
	                }
	            }
	        });
		 
	 }

}
