package interfaces;

import javax.swing.*;
import classesModelo.LDSVeic.Cliente_Modelo;
import classesModelo.LDSVeic.Veiculos_Modelo;
import classesModelo.LDSVeic.Vendas_Modelo;
import gestaoMemoria.LDSVeic.MemoriaClientes;
import gestaoMemoria.LDSVeic.MemoriaVeiculos;
import gestaoMemoria.LDSVeic.MemoriaVendas;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.time.*;

public class EfectuarVenda extends JFrame{
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	ImageIcon limpar = new ImageIcon("icons/clean.png");
	ImageIcon back = new ImageIcon("icons/back.png");
	ImageIcon confirm = new ImageIcon("icons/confirm.png");
	
	
	JLabel info  = new JLabel("PREENCHA OS DADOS DA NOVA VENDA");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	
	//BUTOES PARA FACILITAR A BUSCA
	JButton btnClient = new JButton("Procurar cliente");
	JButton btnVeic = new JButton("Procurar veiculo");
	
	//Elementos do cadastro
  public static JLabel lblNumClient = new JLabel("NUMERO UNICO DO CLIENTE");
  public static JLabel lblNumVeic = new JLabel("NUMERO UNICO DO VEICULO");
	
	//LABELS QUE PERTENCEM AOS DADOS DO CLIENTE
  public static JLabel lblNomeClient = new JLabel("NOME DO CLIENTE");
  public static	JLabel lblemail = new JLabel("EMAIL");
	
	//LABELS QUE PERTENCEM AOS DADOS DO VEICULO
	JLabel lblMarc = new JLabel("MARCA");
	JLabel lblMatric = new JLabel("MATRICULA"); 
	JLabel lblPreco = new JLabel("PREÇO $");
	
	//LABELS QUE PERTENCEM AOS DADOS DA VENDA
	JLabel lblNumUnic = new JLabel("NÚMERO UNICO");
	JLabel lblPagamento = new JLabel("INTRODUZA O VALOR: ");
	JLabel lblDATA = new JLabel("DATA");
	JLabel lblHora = new JLabel("HORA");
	JLabel lblTroco = new JLabel("TROCO :");
	
	
	JLabel lbldadosCli = new JLabel("DADOS DO CLIENTE");
	JLabel lbldadosVeic = new JLabel("DADOS DO VEICULO");
	JLabel lbldadosVenda = new JLabel("EFECTUAR VENDA");
	
	JLabel elementos [] = {lblNumClient,lblMarc,lblNumVeic,lblMatric,lblPreco,lblNumUnic,lblDATA,lblHora,
			lblNomeClient,lblemail,lblPagamento,lblTroco};
	
	
	public EfectuarVenda efectuar;
	public static JTextField txtNumClient = new JTextField();
	public static JTextField txtNumVeic = new JTextField();
	
	//JTextField QUE PERTENCEM AOS DADOS DO CLIENTE
	public  static JTextField txtNomeClient = new JTextField();
	 
	public static JTextField txtemail = new JTextField();
	
    //JTextField QUE PERTENCEM AOS DADOS DO VEICULO
	JTextField txtMarc = new JTextField();
	JTextField txtMatric = new JTextField();
	JTextField txtPreco = new JTextField();
	
	//JTextField QUE PERTENCEM AOS DADOS DA VENDA
	JTextField txtNumUnic = new JTextField();
	JTextField txtData = new JTextField();
	JTextField txtHora = new JTextField();
	JTextField txtValor = new JTextField();
	JTextField txtTroco = new JTextField();
	
	JTextField camposprencher[] = {txtNumClient,txtMarc,txtNumVeic,txtMatric,txtPreco,txtNumUnic,
			txtData,txtHora,txtNomeClient,txtemail,txtValor,txtTroco};
	
	JButton btnMenuADM = new JButton("Voltar ao menu");
	JButton btncadastrar = new JButton("VENDER $");
	public  JButton btnlimpar = new JButton("Limpar Campos");
	
	public JButton btnVerList = new JButton("Clientes Lista");
	public JButton btnVerList2 = new JButton("Veiculos Lista");
	
	String estados [] = {"Escolha Opção","0 KM","1 à 5 ANOS DE USO","MAIS DE 5 ANOS DE USO"};
	JComboBox cb = new JComboBox (estados);
	
	JSeparator separador = new JSeparator();
	JSeparator separador1 = new JSeparator();
	JSeparator separador2 = new JSeparator();
	
	
    public  EfectuarVenda()
    {
    	
    	
    	btncadastrar.setIcon(confirm);
    	btncadastrar.setForeground(Color.black);
    	btncadastrar.setBackground(Color.white);
    	
    	btnlimpar.setIcon(limpar);
    	btnlimpar.setForeground(Color.red);
    	btnlimpar.setBackground(Color.white);
    	
    	btnMenuADM.setIcon(back);
    	btnMenuADM.setForeground(Color.black);
    	btnMenuADM.setBackground(Color.white);
    	
    	efectuar=this;
    	int largura=730;
    	int altura=630;
    	setVisible(true);
    	setSize(largura,altura);
    	setResizable(false);
    	setLocationRelativeTo(null);
    	setIconImage(simbolo.getImage());
    	setLayout(null);
    	add(jp1);
    	add(jp2);
    	add(jp3);
    	
    	//Configuracao do primeiro painel jp1
    	jp1.setBounds(0, 0, largura, 30);
    	jp1.setBackground(Color.cyan);
    	
    	//Adicao de elementos a jp1
    	info.setFont(new Font ("Georgia", Font.BOLD,14));
    	info.setForeground(new Color(63,72,204));
    	jp1.add(info);
    	
    	
    	//Configuracao e adicao de elementos no segundo painel jp2
    	jp2.setBounds(0,30, largura,490);
    	//jp2.setBackground(Color.blue); 
    	jp2.setLayout(null);
    	jp2.add(separador);
    	jp2.add(separador1);
    	jp2.add(separador2);
    	
    	//Adicionando os butoes para facilitar a procura
    	jp2.add(btnClient);
    	jp2.add(btnVeic);
    	
    	jp2.add(lbldadosVeic);
    	jp2.add(lbldadosCli);
    	jp2.add(lbldadosVenda);
    	
    	separador.setOrientation(SwingConstants.HORIZONTAL);
        separador.setForeground(Color.black);
        separador.setBounds(0, 90, largura, 30);
        
        
        lbldadosCli.setFont(new Font ("Georgia", Font.BOLD,14));
        lbldadosCli.setForeground(Color.blue);
        lbldadosCli.setBounds(290, 100, 250, 14);
        
  
        
        lblNomeClient.setBounds(10, 140, 250, 14);
        txtNomeClient.setBounds(170,135, 240, 25);
        txtNomeClient.setEditable(false);
        
        lblemail.setBounds(430, 140, 250, 14);
        txtemail.setBounds(490,135, 210, 25);
        txtemail.setEditable(false);
        
      ///////////////////////////////////////////////  
        separador1.setForeground(Color.black);
        separador1.setBounds(0, 190, largura, 30);
        
        lbldadosVeic.setFont(new Font ("Georgia", Font.BOLD,14));
        lbldadosVeic.setForeground(Color.blue);
        lbldadosVeic.setBounds(290, 210, 250, 14);
        
        lblMarc.setBounds(10, 250, 250, 14);
        txtMarc.setBounds(80,245, 240, 25);
        txtMarc.setEditable(false);
        
        lblMatric.setBounds(390, 250, 250, 14);
        txtMatric.setBounds(490,245, 210, 25);
        txtMatric.setEditable(false);
        
        lblPreco.setBounds(10, 290, 250, 14);
        lblPreco.setForeground(Color.decode("#221A87"));
        txtPreco.setBounds(80,285, 240, 25);
        txtPreco.setEditable(false);
        
		///////////////////////////////////////////////  
		separador2.setForeground(Color.black);
		separador2.setBounds(0, 320, largura, 30);
		
		lbldadosVenda.setFont(new Font ("Georgia", Font.BOLD,14));
        lbldadosVenda.setForeground(Color.blue);
        lbldadosVenda.setBounds(300, 335, 250, 14);
        
        lblPagamento.setBounds(10, 375, 250, 14);
        txtValor.setBounds(200,370, 240, 25);
        txtValor.setEditable(false);
        
        lblDATA.setBounds(460, 375, 250, 14);
        txtData.setBounds(530,370, 160, 25);
        txtData.setEditable(false);
        
        lblHora.setBounds(460, 415, 250, 14);
        txtHora.setBounds(530,410, 160, 25);
        txtHora.setEditable(false);
        
        lblTroco.setBounds(460, 450, 250, 14);
        lblTroco.setForeground(Color.decode("#221A87"));
        txtTroco.setBounds(530,445, 160, 25);
        txtTroco.setEditable(false);
        
        lblNumUnic.setBounds(10, 415, 250, 14);
        txtNumUnic.setBounds(200,410, 240, 25);
        txtNumUnic.setEditable(false);
		        
        
    	
    	lblNumClient.setBounds(10, 15, 250, 14);
    	txtNumClient.setBounds(250, 10, 240, 25);
    	btnClient.setBounds(510, 10, 180, 25);
    	btnClient.setBackground(new Color(255,201,14));
    	btnClient.setForeground(Color.white);
    	btnClient.setFont(new Font ("Georgia", Font.BOLD,14));
    	
    	btnVeic.setBackground(new Color(24,207,207));
    	btnVeic.setForeground(Color.white);
    	btnVeic.setBounds(510, 50, 180, 25);
    	btnVeic.setFont(new Font ("Georgia", Font.BOLD,14));
       
        
        lblNumVeic.setBounds(10, 55, 250, 14);
        txtNumVeic.setBounds(250, 50, 240, 25);
        txtNumVeic.setEditable(false);
        
         
       
        
        
        jp2.add(cb);
         
        
        
         
        
    	
    	for(int i=0; i<elementos.length;i++)
    	{
    		elementos[i].setFont(new Font("Georgia",Font.BOLD,14));
    		
    		if(i==2 || i==3 || i==4)
    		{
    			txtNumVeic.setFont(new Font ("Times New Roman", Font.PLAIN,16));
    		}
    		camposprencher[i].setFont(new Font ("Times New Roman", Font.PLAIN,16));
    	}
    	
    	
    	for(int j =0 ; j<elementos.length;j++)
    	{
    		jp2.add(elementos[j]);
    		
    		if(j==3)
    		{
    			txtMatric.setEditable(false);
    			 
    			txtPreco.setEditable(false);
    		}
        	jp2.add(camposprencher[j]);
    	}
    	 
       for(int i =0; i<=2;i++)
       {
    	   camposprencher[i].setToolTipText("Pressione [ENTER] para preencher o proximo campo");
       }
       
    
    	
    	
    	//Configuracao e adicao de elementos no segundo painel jp3
    	jp3.setBounds(0,530, 800,100);
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
      
    	txtNumVeic.setEditable(false);
    	
    	TratamentoEventos tr = new TratamentoEventos();
    	txtNumClient.addActionListener(tr);
    	txtValor.addActionListener(tr);
    	txtMarc.addActionListener(tr);
    	txtNumVeic.addActionListener(tr);
    	txtMatric.addActionListener(tr);
    	txtPreco.addActionListener(tr);
    	btnlimpar.addActionListener(tr);
    	btncadastrar.addActionListener(tr);
    	btnMenuADM.addActionListener(tr);
    	btnClient.addActionListener(tr);
    	btnVeic.addActionListener(tr);
    	cb.addActionListener(tr);
    	
    	txtNumClient.requestFocus();
    	btnVerList2.setEnabled(false);
    	
    	 
    }
    
    
    private class TratamentoEventos implements ActionListener
    {

		@Override
		public  void actionPerformed(ActionEvent e) 
	    {
			//Dados Usados para manipulacao dos clientes
			MemoriaClientes memoryClientes = new MemoriaClientes();
			Vector <Cliente_Modelo> auxClientes = new Vector<>();
			
			//Dados Usados para manipulacao dos veiculos
			MemoriaVeiculos memoryVeiculos = new MemoriaVeiculos();
			Vector <Veiculos_Modelo> auxVeiculos = new Vector<>();
			
			 
			if(e.getSource()==btnClient)
			{
				new ListaProcuraClient();
				dispose();
			}
			
			
			if(e.getSource()==btnVeic)
			{
				new ListaProcuraVeic();
				dispose();
			}
			
			//EVENTOS DOS CAMPOS DE TEXTO JTEXTFIELD
			if(e.getSource()==txtNumClient)
			{
				boolean verifClient=true;
				
				try {
					memoryClientes.obterClient();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				auxClientes=memoryClientes.vectClient;
				
				
				if(txtNumClient.equals(""))
				{
					JOptionPane.showMessageDialog(null, "INTRODUZ O NUMERO UNICO DO CLIENTE");
				}else {
					
					for(int i=0;i<auxClientes.size();i++)
					{
					     if(txtNumClient.getText().equals(auxClientes.get(i).getNumUnic()))
					     {
					    	 verifClient=false;
					    	 
					    	 //Preechimento dos dados do Cliente
					    	 txtNomeClient.setText(auxClientes.get(i).getNome());
					    	 txtemail.setText(auxClientes.get(i).getEmail());
					 
					    	 
					    	 txtNumVeic.requestFocus();
							 txtNumVeic.setEditable(true);
							 lblNumClient.setForeground(new Color(48,184,51));
							 lblNomeClient.setForeground(new Color(48,184,51));
							 lblemail.setForeground(new Color(48,184,51));
							// btnVerList2.setEnabled(true);
							 btnlimpar.setEnabled(true);
					    	 
					     }
					}
					
				}
				 
				
				
				if(verifClient==true)
				{
					JOptionPane.showMessageDialog(null, "NUMERO UNICO DO CLIENTE INCORRECTO TENTE NOVAMENTE");
					txtNumClient.requestFocus();
					txtNumClient.setText("");
					txtNumClient.setBackground(new Color(255,198,198));
				}
			
				 
			}
			
			
			if(e.getSource()==txtNumVeic)
			{
				 
				boolean verifVeic=true;
				try {
					memoryVeiculos.obterVeic();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				
				auxVeiculos = memoryVeiculos.vectVeic;
				
				if(txtNumVeic.equals(""))
				{
					JOptionPane.showMessageDialog(null, "INTRODUZ O NUMERO UNICO DO VEICULO");
				}else {
					
					for(int i=0;i<auxVeiculos.size();i++)
					{
					     if(txtNumVeic.getText().equals(auxVeiculos.get(i).getNumUnic()))
					     {
					    	 verifVeic=false;
					    	 //Preechimento dos dados do Veiculo
					    	 txtMatric.setText(auxVeiculos.get(i).getMatricula());
					    	 txtMarc.setText(auxVeiculos.get(i).getMarca());
					    	 txtPreco.setText(auxVeiculos.get(i).getPreco());
					    	 
					    	 valorpagar =  Double.parseDouble(auxVeiculos.get(i).getPreco());
					        
					    	 lblMarc.setForeground(new Color(48,184,51));
					    	 lblMatric.setForeground(new Color(48,184,51));
					    	 lblPreco.setForeground(new Color(48,184,51));
					    	 lblNumVeic.setForeground(new Color(48,184,51));
					    	 
					    	 txtValor.requestFocus();
					    	 txtValor.setEditable(true);
					    	 index =i;
					         
					    	 
					    	 
					     }
					    	 
					    	 
					    	 
				     }
				}
				
				if(verifVeic==true)
				{
					JOptionPane.showMessageDialog(null,"NUMERO UNICO DO VEICULO INCORRECTO TENTE NOVAMENTE");
					txtNumVeic.requestFocus();
					txtNumVeic.setBackground(new Color(255,198,198));
				}
				
				
				
				 
					
			}
				
				 
				
			
			
			if(e.getSource()==txtMarc)
			{
				lblMarc.setForeground(new Color(55,155,57));
				txtNumVeic.requestFocus();
				txtNumVeic.setEditable(true);
			    
				 
			}
			
			
			 
			
			 
			
			if(e.getSource()==txtValor)
			{
				 
				try {
					
					 double valor = Double.parseDouble(txtValor.getText());
					 
					 Random num = new Random();
						int numunic = num.nextInt(100000,999999);
						String n = Integer.toString(numunic);
						
						

						 for(int i=0; i<memoryVendas.vectVendas.size();i++)
						    {
						    	if(n.equalsIgnoreCase(memoryVendas.vectVendas.get(i).getNumUnicVenda()))
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
				        
				        
				        valorpago = Double.parseDouble(txtValor.getText());
				        
				        if(valorpago>=valorpagar)
				        {
				        	troco = valorpago-valorpagar;
				        	String tr =(""+troco);
				            btncadastrar.setEnabled(true); 
				        	txtTroco.setText(tr);
				        	lblTroco.setForeground(Color.red);
				        }else {
				        	JOptionPane.showMessageDialog(null, "O valor introduzido é inferior a "+valorpagar+" mt");
				        	txtValor.setBackground(new Color(255,198,198));
				        }
					 
					 
					
				}catch(NumberFormatException z) {
					JOptionPane.showMessageDialog(null, "CARACTERE INVALIDO INTRODUZA SOMENTE NUMEROS");
					txtValor.setBackground(new Color(241,75,84));
					 
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
					    camposprencher[i-1].setBackground(Color.white);
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
					memoryVeiculos.obterVeic();
				} catch (Exception e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				try {
					memoryVendas.obterVendas();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				receptor=memoryVendas.vectVendas;
				
			 
				
				String numUnicClient = txtNumClient.getText();
				String nomeClient = txtNomeClient.getText();
				String numUnicVeic = txtNumVeic.getText();
				String marcaVeic = txtMarc.getText();
				String precoVeic = txtPreco.getText();
				String valorPago = txtValor.getText();
				String numUnicVenda= txtNumUnic.getText();
				String Troco = txtTroco.getText();
				LocalDate dataVenda = LocalDate.now();
				
				Vendas_Modelo venda = new Vendas_Modelo(numUnicClient, nomeClient, numUnicVeic, marcaVeic, precoVeic, valorPago, numUnicVenda, Troco, dataVenda);
				memoryVendas.vectVendas.add(venda);
				memoryVendas.vectVendas.trimToSize();
				
				
				 
				 
				
				
				
				int resposta = JOptionPane.showConfirmDialog(null, "Deseja Vender o veiculo ?", "Confirmação", JOptionPane.YES_NO_OPTION);
				
				if (resposta == JOptionPane.YES_OPTION) {
					
					try {
						memoryVendas.gravarVenda();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					 
					JOptionPane.showMessageDialog(null, "VENDA EFECTUADA COM SUCESSO");
				     memoryVeiculos.vectVeic.remove(index);
				     
				     try {
							memoryVeiculos.gravarVeic();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
					
			 
					dispose();
					
					 
				   
				} else {
				    
				}
				
				 
				
				 
				
				//list();
			
				
			}
	
		 
			
		}

	 
		
		
    	
    }
    
    
    
    public void list()
    {
    	try {
			memoryVendas.obterVendas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	for(Vendas_Modelo v : memoryVendas.vectVendas)
    	{
    		System.out.println(v.toString());
    		
    	}
    }
     int index;
	
     MemoriaVendas memoryVendas = new MemoriaVendas();
     Vector <Vendas_Modelo> receptor = new Vector<>();
    //Dinheiro variaveis
    double valorpagar;
    double valorpago;
    double troco;
}
