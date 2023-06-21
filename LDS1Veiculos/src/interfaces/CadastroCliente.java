package interfaces;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.util.*;
import javax.swing.*;

import classesModelo.LDSVeic.Cliente_Modelo;
import classesModelo.LDSVeic.Funcionario_Modelo;
import gestaoMemoria.LDSVeic.MemoriaClientes;

public class CadastroCliente extends JFrame{
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	JLabel info  = new JLabel("Preencha os dados do novo Cliente");
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
	JLabel lblemail = new JLabel("EMAIL");
	
	JLabel elementos [] = {lblNome,lblApelido,lblNumBI,lblNumUnic, lblemail,lblDATA,lblHora};
	
	
	JTextField txtNome = new JTextField();
	JTextField txtApelido = new JTextField();
	JTextField txtNumBI = new JTextField();
	JTextField txtNumUnic = new JTextField();
	JTextField txtData = new JTextField();
	JTextField txtHora = new JTextField();
	JTextField txtemail = new JTextField();
	
	JTextField camposprencher[] = {txtNome,txtApelido,txtNumBI,txtNumUnic,txtemail,txtData,txtHora};
	
	JButton btnMenuADM = new JButton("<- Voltar ao menu");
	JButton btncadastrar = new JButton("Cadastrar");
	JButton btnlimpar = new JButton("Limpar Todos os Campos");
	
	
    public  CadastroCliente()
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
    	info.setForeground(Color.black);
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
        txtNumBI.setBounds(150, 50, 240, 25);
        txtNumBI.setEditable(false);
        lblNumUnic.setBounds(10, 95, 150, 14);
        txtNumUnic.setBounds(150, 90, 240, 25);
        txtNumUnic.setEditable(false);
        
        lblemail.setBounds(400, 55, 150, 14);
        txtemail.setBounds(480, 50, 220, 25);
        txtemail.setEditable(false);
        
        lblDATA.setBounds(10, 135, 150, 14);
        txtData.setBounds(150, 130, 240, 25);
    	
        lblHora.setBounds(10, 175, 150, 14);
        txtHora.setBounds(150, 170, 240, 25);
        
    	
    	for(int i=0; i<elementos.length;i++)
    	{
    		elementos[i].setFont(new Font("Georgia",Font.BOLD,14));
    		
    		if(i==2 || i==3 || i==4)
    		{
    			txtNumBI.setFont(new Font ("Times New Roman", Font.PLAIN,16));
    		}
    		camposprencher[i].setFont(new Font ("Georgia", Font.PLAIN,16));
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
    	txtNome.addActionListener(tr);
    	txtApelido.addActionListener(tr);
    	txtNumBI.addActionListener(
    			 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						 lblNumBI.setForeground(new Color(55,155,57));
						 txtemail.setEditable(true);
						 txtemail.requestFocus();
					}
				}
    			
    			);
    	txtNumUnic.addActionListener(tr);
    	txtemail.addActionListener(tr);
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
			
			
			if(e.getSource()==txtemail)
			{
				
				lblNumUnic.setForeground(new Color(55,155,57));
				lblDATA.setForeground(new Color(55,155,57));
				lblHora.setForeground(new Color(55,155,57));
				lblemail.setForeground(new Color(55,155,57));
				Random num = new Random();
				int numunic = num.nextInt(100000,999999);
				String n = Integer.toString(numunic);
				
				
				try {
					memoryClient.obterClient();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
		         for(int i=0; i<memoryClient.vectClient.size();i++)
			    {
			    	if(n.equalsIgnoreCase(memoryClient.vectClient.get(i).getNumUnic()))
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
		        txtHora.requestFocus();
		        btncadastrar.setEnabled(true); 
				
			}
			
			
 
			
			
			if(e.getSource()==btnlimpar)
			{
				for(int i =0 ; i< camposprencher.length;i++)
				{
					camposprencher[i].setText("");
					if (i!=0)
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
				try {
					memoryClient.obterClient();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				String nome = txtNome.getText();
				String apelido = txtApelido.getText();
				String numBI = txtNumBI.getText();
				String numUnic = txtNumUnic.getText();
				LocalDateTime data = LocalDateTime.now();
				String email = txtemail.getText();
				
				Cliente_Modelo  cliente =  new Cliente_Modelo(nome, apelido, numBI, email, numUnic, data);
				memoryClient.vectClient.add(cliente);
				memoryClient.vectClient.trimToSize();
				
				
				try {
					memoryClient.gravarClient();
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
				Color corFonte = Color.black;

				 
				UIManager.put("OptionPane.messageFont", fontePersonalizada);
				UIManager.put("OptionPane.messageForeground", corFonte);

				
				JOptionPane.showMessageDialog(null, "Cliente (a) [ "+nome+" ] Cadastrado com sucesso");
				dispose();
			 	list();
			}
	
		 
			
		}
		
		
    	
    }
    
    
    public void list ()
    {
    	
    	try {
			memoryClient.obterClient();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	for(int i = 0 ; i<memoryClient.vectClient.size();i++)
    	{
    		System.out.println(memoryClient.vectClient.get(i).toString());
    	}
    }
    
    MemoriaClientes memoryClient = new MemoriaClientes();

}
