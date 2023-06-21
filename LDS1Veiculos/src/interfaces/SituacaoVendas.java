package interfaces;

import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JLabel;

import classesModelo.LDSVeic.Vendas_Modelo;
import classesdeEdicaoComponentes.LDSVeic.PlaceHolderJTextField;
import gestaoMemoria.LDSVeic.MemoriaVendas;

public class SituacaoVendas extends JFrame{
	
	ImageIcon iconCres = new ImageIcon("imagens/graph.png");
	ImageIcon iconDecres = new ImageIcon("imagens/graph (1).png");
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	
	
	
	JLabel lblGraficoCrescente = new JLabel(iconCres);
	JLabel lblGraficoDrescente = new JLabel(iconDecres);
	MemoriaVendas memoryVendas = new MemoriaVendas();
	
	JLabel lblObj = new JLabel("O VALOR A ALCANCAR É  " +20000+"MT");
	PlaceHolderJTextField campoObjectivo = new PlaceHolderJTextField("O valor $");
	
	public SituacaoVendas() 
	{
		super("GRAFICO DE BARRAS DAS VENDAS");
		setIconImage(simbolo.getImage());
		setSize(940,550);
		setVisible(true);
		setLocationRelativeTo(null);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(new Color (156,217,235));
		
		
	    try {
			memoryVendas.obterVendas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
	    double soma =0;
	    
	    for(int i = 0; i<memoryVendas.vectVendas.size();i++)
	    {
	    	try {
	    		double v =  Integer.parseInt(memoryVendas.vectVendas.get(i).getPrecoVeic());
		    	 soma = soma+v;
		    	 
	    		
	    	}catch (NumberFormatException e)
	    	{
	    		System.out.println(e.getMessage());
	    	}
	    	 
	    }
	    
	    double objctivo = 20000;
	   
	    JLabel lblTotalValor = new JLabel("Valor das vendas "+soma+" mt");
	    lblTotalValor.setBounds(40, 250, 300, 16);
	    lblTotalValor.setFont(new Font("Times New Roman",Font.BOLD,20));
	    lblTotalValor.setForeground(Color.black);
	    
	    
	    
	    
	    lblObj.setFont(new Font("Times New Roman",Font.BOLD,20));
	    lblObj.setBounds(40, 80, 400, 16);
	    lblObj.setForeground(Color.white);
	   // campoObjectivo.setBounds(240, 75, 150, 25);
	    campoObjectivo.setBackground(Color.white);
	    campoObjectivo.setBorder(null);
	    campoObjectivo.setToolTipText("Para estudar click em [Enter]");
	    
 
	    		
	    		 
	    c.add(lblObj);
	    c.add(campoObjectivo);
	    
	    c.add(lblTotalValor);
	    lblGraficoCrescente.setBounds(400, 30, 512, 512);
	    lblGraficoDrescente.setBounds(400, 30, 512, 512);
	    if(soma>=objctivo)
	    {
	    	c.add(lblGraficoCrescente);
	    }else {
	    	c.add(lblGraficoDrescente);
	    }
	    
		 
	}
	

}
