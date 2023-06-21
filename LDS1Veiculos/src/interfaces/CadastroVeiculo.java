package interfaces;

import javax.swing.*;

import classesModelo.LDSVeic.Veiculos_Modelo;
import gestaoMemoria.LDSVeic.MemoriaVeiculos;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.time.*;


public class CadastroVeiculo  extends JFrame {
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	JLabel info  = new JLabel("Preencha os dados do novo Veiculo");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	
	//Elementos do cadastro
	JLabel lblMatri = new JLabel("MATRÍCULA");
	JLabel lblMarc = new JLabel("MARCA");
	JLabel lblCor = new JLabel("COR DO VEICULO");
	JLabel lblModelo = new JLabel("MODELO");
	JLabel lblEstado = new JLabel("SITUÇÃO VEICULO");
	JLabel lblPreco = new JLabel("PREÇO");
	JLabel lblNumUnic = new JLabel("NÚMERO UNICO");
	JLabel lblDATA = new JLabel("DATA CADASTRO");
	JLabel lblHora = new JLabel("HORA CADASTRO");
	
	JLabel elementos [] = {lblMatri,lblMarc,lblCor,lblModelo,lblPreco,lblNumUnic,lblDATA,lblHora};
	
	
	JTextField txtMatric = new JTextField();
	JTextField txtMarc = new JTextField();
	JTextField txtCor = new JTextField();
	JTextField txtModelo = new JTextField();
	JTextField txtPreco = new JTextField();
	JTextField txtNumUnic = new JTextField();
	JTextField txtData = new JTextField();
	JTextField txtHora = new JTextField();
	JTextField camposprencher[] = {txtMatric,txtMarc,txtCor,txtModelo,txtPreco,txtNumUnic,
			txtData,txtHora};
	
	JButton btnMenuADM = new JButton("<- Voltar ao menu");
	JButton btncadastrar = new JButton("REGISTRAR");
	JButton btnlimpar = new JButton("Limpar Todos os Campos");
	
	String estados [] = {"Escolha Opção","0 KM","1 à 5 ANOS DE USO","MAIS DE 5 ANOS DE USO"};
	JComboBox cb = new JComboBox (estados);
	
    public  CadastroVeiculo()
    {
    	int largura=730;
    	setVisible(true);
    	setSize(largura,400);
    	setResizable(false);
    	setLocationRelativeTo(null);
    	setIconImage(simbolo.getImage());
    	setLayout(null);
    	add(jp1);
    	add(jp2);
    	add(jp3);
    	
    	//Configuracao do primeiro painel jp1
    	jp1.setBounds(0, 0, largura, 30);
    	jp1.setBackground(Color.LIGHT_GRAY);
    	
    	//Adicao de elementos a jp1
    	info.setFont(new Font ("Georgia", Font.BOLD,14));
    	info.setForeground(Color.blue);
    	jp1.add(info);
    	
    	
    	//Configuracao e adicao de elementos no segundo painel jp2
    	jp2.setBounds(0,30, largura,250);
    	 //jp2.setBackground(Color.blue);
    	jp2.setLayout(null);
    	
    	lblMatri.setBounds(10, 15, 150, 14);
    	txtMatric.setBounds(150, 10, 240, 25);
        lblMarc.setBounds(400, 15, 150, 14);
        txtMarc.setBounds(480, 10, 220, 25);
        txtMarc.setEditable(false);
        
        lblCor.setBounds(10, 55, 150, 14);
        txtCor.setBounds(150, 50, 240, 25);
        txtCor.setEditable(false);
        lblModelo.setBounds(400, 55, 150, 14);
        txtModelo.setBounds(480, 50, 220, 25);
        txtModelo.setEditable(false);
        
        jp2.add(lblEstado);
        jp2.add(cb);
        lblEstado.setFont(new Font("Georgia",Font.BOLD,14));
        lblEstado.setBounds(10, 95, 150, 14);
        cb.setBounds(155, 90, 235, 25);
        cb.setFont(new Font("Times New Roman",Font.BOLD,14));
        cb.setEnabled(false);
        
        lblPreco.setBounds(400, 95, 150, 14);
    	txtPreco.setBounds(480, 90, 220, 25);
    	
        lblNumUnic.setBounds(10, 135, 150, 14);
        txtNumUnic.setBounds(155, 130, 235, 25);
        txtNumUnic.setEditable(false);
        
        lblDATA.setBounds(10, 175, 150, 14);
        txtData.setBounds(155, 170, 235, 25);
        txtData.setEditable(false);
        lblHora.setBounds(10, 215, 150, 14);
        txtHora.setBounds(155, 210, 235, 25);
        txtHora.setEditable(false);
        
         
        
    	
    	for(int i=0; i<elementos.length;i++)
    	{
    		elementos[i].setFont(new Font("Georgia",Font.BOLD,14));
    		
    		if(i==2 || i==3 || i==4)
    		{
    			txtCor.setFont(new Font ("Times New Roman", Font.PLAIN,16));
    		}
    		camposprencher[i].setFont(new Font ("Times New Roman", Font.PLAIN,16));
    	}
    	
    	
    	for(int j =0 ; j<elementos.length;j++)
    	{
    		jp2.add(elementos[j]);
    		
    		if(j==3)
    		{
    			txtModelo.setEditable(false);
    			 
    			txtPreco.setEditable(false);
    		}
        	jp2.add(camposprencher[j]);
    	}
    	 
       for(int i =0; i<=2;i++)
       {
    	   camposprencher[i].setToolTipText("Pressione [ENTER] para preencher o proximo campo");
       }
       
    
    	
    	
    	//Configuracao e adicao de elementos no segundo painel jp3
    	jp3.setBounds(0,300, 800,100);
   	 	//jp3.setBackground(Color.red);
   	 	jp3.setLayout(null);
    	
   	 	
   	 	//Adicao dos elementos a jp3
   	 	btnMenuADM.setBounds(10, 20, 240, 30);
    	btnMenuADM.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnMenuADM.setForeground(Color.decode("#221A87"));
    	
    	
    	btncadastrar.setBounds(260, 20, 200, 30);
    	btncadastrar.setFont(new Font ("Georgia", Font.BOLD,14));
    	btncadastrar.setForeground(new Color(55,155,57));
    	btncadastrar.setEnabled(false);
    	
    	btnlimpar.setBounds(470, 20, 235, 30);
    	btnlimpar.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnlimpar.setForeground(Color.red);
    	btnlimpar.setEnabled(false);
    	 
    	jp3.add(btnMenuADM);
    	jp3.add(btncadastrar);
    	jp3.add(btnlimpar);
      
    	
    	
    	TratamentoEventos tr = new TratamentoEventos();
    	txtMatric.addActionListener(tr);
    	txtMarc.addActionListener(tr);
    	txtCor.addActionListener(tr);
    	txtModelo.addActionListener(tr);
    	txtPreco.addActionListener(tr);
    	btnlimpar.addActionListener(tr);
    	btncadastrar.addActionListener(tr);
    	btnMenuADM.addActionListener(tr);
    	cb.addActionListener(tr);
    }
    
    
    private class TratamentoEventos implements ActionListener
    {

		@Override
		public void actionPerformed(ActionEvent e) 
	    {
			
			
			//EVENTOS DOS CAMPOS DE TEXTO JTEXTFIELD
			if(e.getSource()==txtMatric)
			{
				lblMatri.setForeground(new Color(55,155,57));
				txtMarc.setEditable(true);
				txtMarc.requestFocus();
				btnlimpar.setEnabled(true);
			}
			
			if(e.getSource()==txtMarc)
			{
				lblMarc.setForeground(new Color(55,155,57));
				txtCor.setEditable(true);
			    txtCor.requestFocus();
				 
			}
			
			
			if(e.getSource()==txtCor)
			{
				lblCor.setForeground(new Color(55,155,57));
				 txtModelo.setEditable(true); 
				 txtModelo.requestFocus();
				
			}
			
			if(e.getSource()== txtModelo)
			{
				lblModelo.setForeground(new Color(55,155,57));
				cb.setEnabled(true);
				cb.requestFocus();
			}
			
			if(e.getSource() == cb)
			{
				lblEstado.setForeground(new Color(55,155,57));
				txtPreco.setEditable(true);
				txtPreco.requestFocus();
			}
			
			
			if(e.getSource()==txtPreco)
			{
				
				
				  
				 
				 try {
					 
					 double valor = Double.parseDouble(txtPreco.getText());
					 
					    lblPreco.setForeground(new Color(55,155,57));
						lblDATA.setForeground(new Color(55,155,57));
						lblHora.setForeground(new Color(55,155,57));
						lblNumUnic.setForeground(new Color(55,155,57));
						Random num = new Random();
						int numunic = num.nextInt(100000,999999);
						String n = Integer.toString(numunic);
						
						
						try {
							memoryVeic.obterVeic();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						 for(int i=0; i<memoryVeic.vectVeic.size();i++)
						    {
						    	if(n.equalsIgnoreCase(memoryVeic.vectVeic.get(i).getNumUnic()))
						    	{
						    		int numunic1 = num.nextInt(100000,999999);
						    		txtNumUnic.setText(Integer.toString(numunic));
						    	}
						    }
						
						
						
						txtNumUnic.setText(n);
						
						LocalDateTime datahora = LocalDateTime.now();
				        int ano = datahora.getYear();
				        int dia = datahora.getDayOfMonth();
				        int mes = datahora.getMonthValue();
				        
				        String data = (ano+"-"+mes+"-"+dia);
				        txtData.setText(data);
				        
				        int hor = datahora.getHour();
				        int min =datahora.getMinute();
				        String hora =(hor+"h : "+min+"min");
				        
				        txtHora.setText(hora);
				        btncadastrar.setEnabled(true); 
						
						
					 
				 }catch(NumberFormatException p)
				 {
					 JOptionPane.showMessageDialog(null, "CARACTERE INVALIDO INTRODUZA SOMENTE NUMEROS");
					 txtPreco.setBackground(new Color(241,75,84));
				 }
				
			}
			
			
			if(e.getSource()==btnlimpar)
			{
				for(int i =0 ; i< camposprencher.length;i++)
				{
					camposprencher[i].setText("");
					 
					if(i!=0)
					{
						camposprencher[i].setEditable(false);
						cb.setEnabled(false);
					}
				}
				 
				for(int i =0 ; i< camposprencher.length;i++)
				{
					 elementos[i].setForeground(Color.black);
				}
				
				lblEstado.setForeground(Color.black);
				btncadastrar.setEnabled(false);
				btnlimpar.setEnabled(false);
			}
			

			
			if(e.getSource()==btnMenuADM)
			{
				dispose();
			}
			
			
			if(e.getSource()==btncadastrar)
			{
				try {
					memoryVeic.obterVeic();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			 
				
				String matricula= txtMatric.getText();
				String marca = txtMarc.getText();
				String cor = txtCor.getText();
				String modelo= txtModelo.getText();
				String situacao="";
				String preco =txtPreco.getText();
				
				if(cb.getSelectedIndex()==0)
				{
					situacao="";
				}
				
				if(cb.getSelectedIndex()==1)
				{
					situacao="0 Km";
				}
				
				if(cb.getSelectedIndex()==2)
				{
					situacao="1-5 Anos de Uso";
				}
				
				if(cb.getSelectedIndex()==3)
				{
					situacao="+5 anos de uso";
				}
				
				
				String estado = situacao;
				String numUnic = txtNumUnic.getText();
				LocalDateTime data = LocalDateTime.now();
				
				Veiculos_Modelo v = new Veiculos_Modelo(matricula, marca, cor, modelo, estado, preco, numUnic, data);
				
				memoryVeic.vectVeic.add(v);
				memoryVeic.vectVeic.trimToSize();
				
				try {
					memoryVeic.gravarVeic();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				//list();
				JOptionPane.showMessageDialog(null, "VEICULO REGISTRADO COM SUCESSO");
				dispose();
				
				 
			}
	
		 
			
		}
		
		
    	
    }
    
    
    public void list()
    {
    	try {
			memoryVeic.obterVeic();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	for(int i=0;i<memoryVeic.vectVeic.size();i++)
    	{
    		System.out.println(memoryVeic.vectVeic.get(i).toString());
    	}
    		
    }
	
    MemoriaVeiculos memoryVeic = new MemoriaVeiculos();

}
