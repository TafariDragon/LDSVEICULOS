package interfaces;

import javax.swing.*;

import classesModelo.LDSVeic.Adiministrador_Modelo;
import gestaoMemoria.LDSVeic.MemoriaADM;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class CadastroADM extends JFrame{
	
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	
	//Icon para os buttons
	ImageIcon back = new ImageIcon("icons/back.png");
	ImageIcon limpar = new ImageIcon("icons/clean.png");
	ImageIcon confirm = new ImageIcon("icons/confirm.png");
	
	JLabel info  = new JLabel("Preencha os dados do novo Administrador");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	
	//Elementos do cadastro
	JLabel lblNome = new JLabel("PRIMEIRO NOME");
	JLabel lblApelido = new JLabel("APELIDO");
	JLabel lblNumBI = new JLabel("NÚMERO DE BI");
	JLabel lblNumUnic = new JLabel("NÚMERO UNICO");
	JLabel lblDATA = new JLabel("DATA CADASTRO");
	JLabel lblHora = new JLabel("HORA CADASTRO");
	JLabel lblsenha = new JLabel("SENHA");
	
	JLabel elementos [] = {lblNome,lblApelido,lblNumBI,lblNumUnic,lblDATA,lblHora,lblsenha};
	
	
	JTextField txtNome = new JTextField();
	JTextField txtApelido = new JTextField();
	JTextField txtNumBI = new JTextField();
	JTextField txtNumUnic = new JTextField();
	JTextField txtData = new JTextField();
	JTextField txtHora = new JTextField();
	JTextField txtSenha = new JTextField();
	JTextField camposprencher[] = {txtNome,txtApelido,txtNumBI,txtNumUnic,txtData,txtHora,txtSenha};
	
	JButton btnMenuADM = new JButton("Voltar ao menu");
	JButton btncadastrar = new JButton("Cadastrar");
	JButton btnlimpar = new JButton("Limpar Campos");
	
	
    public CadastroADM()
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
    	jp1.setBackground(Color.decode("#221A87"));
    	
    	//Adicao de elementos a jp1
    	info.setFont(new Font ("Georgia", Font.BOLD,14));
    	info.setForeground(Color.white);
    	jp1.add(info);
    	
    	
    	//Configuracao e adicao de elementos no segundo painel jp2
    	jp2.setBounds(0,30, largura,250);
    	 //jp2.setBackground(Color.blue);
    	jp2.setLayout(null);
    	
    	lblNome.setBounds(10, 15, 150, 14);
    	txtNome.setBounds(150, 10, 240, 25);
        lblApelido.setBounds(400, 15, 150, 14);
        txtApelido.setBounds(480, 10, 220, 25);
        txtApelido.setEditable(false);
        
        lblNumBI.setBounds(10, 55, 150, 14);
        txtNumBI.setBounds(150, 50, 335, 25);
        txtNumBI.setEditable(false);
        lblNumUnic.setBounds(10, 95, 150, 14);
        txtNumUnic.setBounds(150, 90, 240, 25);
        txtNumUnic.setEditable(false);
        
        lblDATA.setBounds(10, 135, 150, 14);
        txtData.setBounds(150, 130, 240, 25);
    	
        lblHora.setBounds(10, 175, 150, 14);
        txtHora.setBounds(150, 170, 240, 25);
        
        lblsenha.setBounds(10, 215, 150, 14);
        txtSenha.setBounds(150, 210, 240, 25);
        txtSenha.setEditable(false);
        
    	
    	for(int i=0; i<elementos.length;i++)
    	{
    		elementos[i].setFont(new Font("Georgia",Font.BOLD,14));
    		
    		if(i==2 || i==3 || i==4)
    		{
    			txtNumBI.setFont(new Font ("Times New Roman", Font.PLAIN,18));
    		}
    		camposprencher[i].setFont(new Font ("Times New Roman", Font.PLAIN,18));
    	}
    	
    	
    	for(int j =0 ; j<elementos.length;j++)
    	{
    		jp2.add(elementos[j]);
    		
    		if(j==3)
    		{
    			txtNumUnic.setEditable(false);
    			txtData.setEditable(false);
    			txtHora.setEditable(false);
    		}
        	jp2.add(camposprencher[j]);
    	}
    	 
       for(int i =0; i<=2;i++)
       {
    	   camposprencher[i].setToolTipText("Pressione [ENTER] para preencher o proximo campo");
    	   camposprencher[i].setBorder(null);
       }
       
    
    	
    	
    	//Configuracao e adicao de elementos no segundo painel jp3
    	jp3.setBounds(0,300, 800,100);
   	 	//jp3.setBackground(Color.red);
   	 	jp3.setLayout(null);
    	
   	 	
   	 	//Adicao dos elementos a jp3
   	 	btnMenuADM.setBounds(10, 20, 240, 30);
   	 	btnMenuADM.setBackground(Color.white);
    	btnMenuADM.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnMenuADM.setForeground(Color.decode("#221A87"));
    	btnMenuADM.setIcon(back);
    	
    	
    	btncadastrar.setBounds(260, 20, 200, 30);
    	btncadastrar.setFont(new Font ("Georgia", Font.BOLD,14));
    	btncadastrar.setForeground(new Color(55,155,57));
    	btncadastrar.setEnabled(false);
    	btncadastrar.setBackground(Color.decode("#221A87"));
    	btncadastrar.setIcon(confirm);
    	
    	btnlimpar.setBounds(470, 20, 235, 30);
    	btnlimpar.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnlimpar.setForeground(Color.red);
    	btnlimpar.setEnabled(false);
    	btnlimpar.setIcon(limpar);
    	btnlimpar.setBackground(Color.decode("#221A87"));
    	 
    	jp3.add(btnMenuADM);
    	jp3.add(btncadastrar);
    	jp3.add(btnlimpar);
      
    	
    	
    	TratamentoEventos tr = new TratamentoEventos();
    	txtNome.addActionListener(tr);
    	txtApelido.addActionListener(tr);
    	txtNumBI.addActionListener(tr);
    	txtNumUnic.addActionListener(tr);
    	txtData.addActionListener(tr);
    	btnlimpar.addActionListener(tr);
    	btncadastrar.addActionListener(tr);
    	btnMenuADM.addActionListener(tr);
    }
    
    
    private class TratamentoEventos implements ActionListener
    {

		@Override
		public void actionPerformed(ActionEvent e) 
	    {
			
			
			//EVENTOS DOS CAMPOS DE TEXTO JTEXTFIELD
			if(e.getSource()==txtNome)
			{
				
				lblNome.setForeground(new Color(55,155,57));
				txtApelido.setEditable(true);
				txtApelido.requestFocus();
				btnlimpar.setEnabled(true);
			}
			
			if(e.getSource()==txtApelido)
			{
				lblApelido.setForeground(new Color(55,155,57));
				txtNumBI.setEditable(true);
			    txtNumBI.requestFocus();
				 
			}
			
			
			if(e.getSource()==txtNumBI)
			{
				lblNumBI.setForeground(new Color(55,155,57));
				lblNumUnic.setForeground(new Color(55,155,57));
				lblDATA.setForeground(new Color(55,155,57));
				lblHora.setForeground(new Color(55,155,57));
				lblsenha.setForeground(new Color(55,155,57));
				
				Random num = new Random();
				int numunic = num.nextInt(100000,999999);
				String n = Integer.toString(numunic);
				
				MemoriaADM memoryAdm = new MemoriaADM();
				try {
					memoryAdm.obterADM();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			    for(int i=0; i<memoryAdm.vectAdm.size();i++)
			    {
			    	if(n.equalsIgnoreCase(memoryAdm.vectAdm.get(i).getNumUnic()))
			    	{
			    		int numunic1 = num.nextInt(100000,999999);
			    		txtNumUnic.setText(Integer.toString(numunic));
			    	}
			    }
				
			
				txtNumUnic.setText(n);
				
				
				
				int senh = num.nextInt(1000,9999);
				String senha =(senh+"LDS");
				txtSenha.setText(senha);
				
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
				
			}
			
			
			if(e.getSource()==btnlimpar)
			{
				for(int i =0 ; i< camposprencher.length;i++)
				{
					camposprencher[i].setText("");
					if (i==1 || i==2)
					{
						camposprencher[i].setEditable(false);	
					}
				}
				 
				for(int i =0 ; i< camposprencher.length;i++)
				{
					 elementos[i].setForeground(Color.black);
				}
				btncadastrar.setEnabled(false);
				btnlimpar.setEnabled(false);
			}
			
			
			if(e.getSource()==btnMenuADM)
			{
				dispose();
			}
			
			
			if(e.getSource()==btncadastrar)
			{
				
				MemoriaADM memoryAdm = new MemoriaADM();
				
				try {
					memoryAdm.obterADM();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String nome = txtNome.getText();
				String apelido = txtApelido.getText();
				String numBI = txtNumBI.getText();
				String numUnic = txtNumUnic.getText();
				LocalDateTime data = dt;
				String senha = txtSenha.getText();
				
				Adiministrador_Modelo adm =  new Adiministrador_Modelo(nome, apelido, numBI, numUnic, data, senha);
				memoryAdm.vectAdm.add(adm);
				memoryAdm.vectAdm.trimToSize();
				
				
				try {
					memoryAdm.gravarADM();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				for(int i =0 ; i< camposprencher.length;i++)
				{
					camposprencher[i].setText("");
					if (i==1 || i==2)
					{
						camposprencher[i].setEditable(false);	
					}
				}
				 
				for(int i =0 ; i< camposprencher.length;i++)
				{
					 elementos[i].setForeground(Color.black);
				}
				btncadastrar.setEnabled(false);
				btnlimpar.setEnabled(false);
				
				 
	
				Font fontePersonalizada = new Font("Georgia", Font.BOLD, 12);
				Color corFonte = Color.blue;

				 
				UIManager.put("OptionPane.messageFont", fontePersonalizada);
				UIManager.put("OptionPane.messageForeground", corFonte);

				
				JOptionPane.showMessageDialog(null, "ADMINISTRADOR (a) [ "+nome+" ] \n Cadastrado com sucesso");
				dispose();
			 	//list();
				 
			}
			
	
		 
			
		}
		
		
    	
    }
	
    LocalDateTime dt = LocalDateTime.now();
    
    
    public void list ()
    {
    	MemoriaADM memoryAdm = new MemoriaADM();
    	
    	try {
			memoryAdm.obterADM();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	for(int i = 0 ; i<memoryAdm.aux.size();i++)
    	{
    		System.out.println(memoryAdm.aux.get(i).toString());
    	}
    }
	

}
