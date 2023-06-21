package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import classesModelo.LDSVeic.Cliente_Modelo;
import classesModelo.LDSVeic.Veiculos_Modelo;
import classesModelo.LDSVeic.Vendas_Modelo;
import gestaoMemoria.LDSVeic.MemoriaClientes;
import gestaoMemoria.LDSVeic.MemoriaVeiculos;
import gestaoMemoria.LDSVeic.MemoriaVendas;

 

public class AlterarVenda extends JFrame{
	
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	ImageIcon icoProcurar = new ImageIcon("icons/magnifying-glass.png");
	JLabel info  = new JLabel("ALTERAR DADOS DA VENDA");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	
	//Elementos do cadastro
	JLabel lblNumClient = new JLabel("NUMERO UNICO DA VENDA");
	JLabel lblNumVeic = new JLabel("NUMERO UNICO DO VEICULO");
	
	//LABELS QUE PERTENCEM AOS DADOS DO CLIENTE
	JLabel lblNomeClient = new JLabel("NUMERO UNICO");
	JLabel lblemail = new JLabel("NOME");
	
	//LABELS QUE PERTENCEM AOS DADOS DO VEICULO
	JLabel lblMarc = new JLabel("NUMERO UNICO VEICULO");
	JLabel lblMatric = new JLabel("MATRICULA"); 
	JLabel lblPreco = new JLabel("PREÇO $");
	
	//LABELS QUE PERTENCEM AOS DADOS DA VENDA
	JLabel lblNumUnic = new JLabel("NÚMERO UNICO");
	JLabel lblPagamento = new JLabel("VALOR PAGO $: ");
	JLabel lblDATA = new JLabel("DATA");
	JLabel lblHora = new JLabel("HORA");
	JLabel lblTroco = new JLabel("TROCO :");
	
	
	JLabel lbldadosCli = new JLabel("DADOS DO CLIENTE");
	JLabel lbldadosVeic = new JLabel("DADOS DO VEICULO");
	JLabel lbldadosVenda = new JLabel("DADOS DA VENDA");
	
	JLabel elementos [] = {lblNumClient,lblMarc,lblNumVeic,lblMatric,lblPreco,lblNumUnic,lblDATA,lblHora,
			lblNomeClient,lblemail,lblPagamento,lblTroco};
	
	
	JTextField txtNumClient = new JTextField();
	JTextField txtNumVeic = new JTextField();
	
	//JTextField QUE PERTENCEM AOS DADOS DO CLIENTE
	JTextField txtNomeClient = new JTextField();
	 
	JTextField txtemail = new JTextField();
	
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
	
	JButton btnMenuADM = new JButton(" Voltar ao menu");
	JButton btnProcurar = new JButton("Procurar");
	JButton btnAlterar = new JButton("Alterar");
	
	String estados [] = {"Escolha Opção","0 KM","1 à 5 ANOS DE USO","MAIS DE 5 ANOS DE USO"};
	JComboBox cb = new JComboBox (estados);
	
	JSeparator separador = new JSeparator();
	JSeparator separador1 = new JSeparator();
	JSeparator separador2 = new JSeparator();
	
	
    public  AlterarVenda()
    {
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
        txtMarc.setBounds(250,245, 240, 25);
        txtMarc.setEditable(false);
        
       // lblMatric.setBounds(390, 250, 250, 14);
       // txtMatric.setBounds(490,245, 210, 25);
        txtMatric.setEditable(false);
        
        lblPreco.setBounds(10, 290, 250, 14);
        lblPreco.setForeground(Color.decode("#221A87"));
        txtPreco.setBounds(250,285, 240, 25);
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
        
       // lblHora.setBounds(460, 415, 250, 14);
       // txtHora.setBounds(530,410, 160, 25);
        txtHora.setEditable(false);
        
        lblTroco.setBounds(460, 415, 250, 14);
        lblTroco.setForeground(Color.decode("#221A87"));
        txtTroco.setBounds(530,410, 160, 25);
        txtTroco.setEditable(false);
        
        lblNumUnic.setBounds(10, 415, 250, 14);
        txtNumUnic.setBounds(200,410, 240, 25);
        txtNumUnic.setEditable(false);
		        
        
    	
    	lblNumClient.setBounds(10, 15, 250, 14);
    	lblNumClient.setForeground(new Color(55,155,57));
    	txtNumClient.setBounds(250, 10, 240, 25);
       
        
        //lblNumVeic.setBounds(340,290, 250, 14);
       // txtNumVeic.setBounds(490,285, 240, 25);
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
   	 	btnMenuADM.setBounds(250, 20, 240, 30);
    	btnMenuADM.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnMenuADM.setForeground(Color.decode("#221A87"));
    	ImageIcon icoBack = new ImageIcon("icons/back.png");
    	btnMenuADM.setIcon(icoBack);
    	
    	
    	btnProcurar.setBounds(500, 10, 200, 25);
    	btnProcurar.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnProcurar.setForeground(Color.red);
    	btnProcurar.setIcon(icoProcurar);
    	//btnProcurar.setBackground(Color.decode("#221A87"));
    	

    	btnAlterar.setBounds(500, 55, 200, 25);
    	btnAlterar.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnAlterar.setForeground(Color.red);
    	btnAlterar.setEnabled(false);
    	btnAlterar.setBackground(Color.white);
 
    	
    	 
    	
    	
    	
    	jp3.add(btnMenuADM);
    	jp2.add(btnProcurar);
    	jp2.add(btnAlterar);
      
    	
    	
    	TratamentoEventos tr = new TratamentoEventos();
    	txtNumClient.addActionListener(tr);
    	txtValor.addActionListener(tr);
    	txtMarc.addActionListener(tr);
    	txtNumVeic.addActionListener(tr);
    	txtMatric.addActionListener(tr);
    	txtPreco.addActionListener(tr);
    	btnAlterar.addActionListener(tr);
    	btnProcurar.addActionListener(tr);
    	btnMenuADM.addActionListener(tr);
    	cb.addActionListener(tr);
    	
    	txtNumClient.requestFocus();
    }
    
    
    private class TratamentoEventos implements ActionListener
    {

		@Override
		public void actionPerformed(ActionEvent e) 
	    {
			
			
			//EVENTOS DOS CAMPOS DE TEXTO JTEXTFIELD
			if(e.getSource()==txtNumClient)
			{
				try {
					memoryVendas.obterVendas();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				int n =1;
				receptorVendas = memoryVendas.vectVendas;
				
				  for(int i=0;i<receptorVendas.size();i++)
				  {
					  if(receptorVendas.get(i).getNumUnicVenda().equals(txtNumClient.getText()))
					  {
						  n=2;
						  //ANALISE BEMMMMM
						  txtemail.setText(receptorVendas.get(i).getNomeClient());
						  txtNomeClient.setText(receptorVendas.get(i).getNumUnicClent());
						  txtNomeClient.setEditable(true);
						  
						  
						  txtMarc.setText(receptorVendas.get(i).getNumUnicVeic());
						  txtMarc.setEditable(true);
						  txtPreco.setText(receptorVendas.get(i).getPrecoVeic());
						  
						  txtValor.setText(receptorVendas.get(i).getValorPago());
						  txtValor.setEditable(true);
						  txtData.setText(""+receptorVendas.get(i).getDataVenda());
						  txtTroco.setText(receptorVendas.get(i).getTroco());
						  txtNumUnic.setText(receptorVendas.get(i).getNumUnicVenda());
						  
						  btnAlterar.setEnabled(true);
						  
						  index=i;
						  
					  }
				  }
				  
				  if(n==1)
				  {
					   JOptionPane.showMessageDialog(null,"Numero Unico de venda Incorrecto Tente Novamente");
					   txtNumClient.setBackground(new Color(255,198,198));
					   txtNumClient.setText("");
				  }
				
				
				
				 
				 
			}
			
			 
			if(e.getSource()==btnProcurar)
			{
				
				try {
					memoryVendas.obterVendas();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				int n =1;
				receptorVendas = memoryVendas.vectVendas;
				
				  for(int i=0;i<receptorVendas.size();i++)
				  {
					  if(receptorVendas.get(i).getNumUnicVenda().equals(txtNumClient.getText()))
					  {
						  n=2;
						  //ANALISE BEMMMMM
						  txtemail.setText(receptorVendas.get(i).getNomeClient());
						  txtNomeClient.setText(receptorVendas.get(i).getNumUnicClent());
						  txtNomeClient.setEditable(true);
						  
						  
						  txtMarc.setText(receptorVendas.get(i).getNumUnicVeic());
						  txtMarc.setEditable(true);
						  txtPreco.setText(receptorVendas.get(i).getPrecoVeic());
						  
						  txtValor.setText(receptorVendas.get(i).getValorPago());
						  txtValor.setEditable(true);
						  txtData.setText(""+receptorVendas.get(i).getDataVenda());
						  txtTroco.setText(receptorVendas.get(i).getTroco());
						  txtNumUnic.setText(receptorVendas.get(i).getNumUnicVenda());
						  
						  btnAlterar.setEnabled(true);
						  
						  index=i;
						  
					  }
				  }
				  
				  if(n==1)
				  {
					   JOptionPane.showMessageDialog(null,"Numero Unico de venda Incorrecto Tente Novamente");
					   txtNumClient.setBackground(new Color(255,198,198));
					   txtNumClient.setText("");
				  }
			}	
			
	
			if(e.getSource()==btnAlterar)
			{
				
					try {
						double valor = Double.parseDouble(txtValor.getText());
						
						
						
					
					MemoriaClientes memoryClientes = new MemoriaClientes();
					MemoriaVeiculos memoryVeiculos = new MemoriaVeiculos();
					
					//Obter dados das memorias 
					try {
						memoryVendas.obterVendas();
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					///////////////////////////////////////
					try {
						memoryVeiculos.obterVeic();
					} catch (Exception e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					///////////////////////////////////
					
					//1-Memoria Clientes e Suas Manipulacoes
					try {
						memoryClientes.obterClient();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					Vector <Cliente_Modelo> receptorClientes = new Vector<>();
					receptorClientes=memoryClientes.vectClient;
					
					 int n=1;
					for(int i=0;i<receptorClientes.size();i++)
					{
						 if(receptorClientes.get(i).getNumUnic().equals(txtNomeClient.getText()))
						 {
							 n=-1;
							receptorVendas.get(index).setNumUnicClent(txtNomeClient.getText());
							receptorVendas.get(index).setNomeClient(receptorClientes.get(i).getNome());
							memoryVendas.vectVendas=receptorVendas;
							try {
								memoryVendas.gravarVenda();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
						 }
					}
					
					if(n==1)
					{
						 
						JOptionPane.showMessageDialog(null, "Cliente nao faz parte da loja");
						 txtNomeClient.setBackground(new Color(255,198,198));
					}
					
					//Manipulacao do e armazenamento de Veiculos ##ALTERACAO
					 Vector <Veiculos_Modelo>receptorVeic = new Vector<>();
					 receptorVeic=memoryVeiculos.vectVeic;
					 
					 double valorpagar1=Double.parseDouble(receptorVendas.get(index).getPrecoVeic());
					 int z=1;
					 for(int k=0;k<receptorVeic.size();k++)
					 {
						if(receptorVeic.get(k).getNumUnic().equals(txtMarc.getText()))
	                    {
							z=-1;
	                    	receptorVendas.get(index).setNumUnicVeic(txtMarc.getText());
	                    	receptorVendas.get(index).setMarcaVeic(receptorVeic.get(k).getMarca());
	                    	receptorVendas.get(index).setPrecoVeic(receptorVeic.get(k).getPreco());
	                    	valorpagar1= Double.parseDouble(receptorVeic.get(k).getPreco()) ;
	                    	
	                    	memoryVendas.vectVendas=receptorVendas;
	                    	
	                    	try {
								memoryVendas.gravarVenda();
							} catch (Exception e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
	                    	
	                    }
						  
					 }
					
					    if(z==1)
						{
							 
							//JOptionPane.showMessageDialog(null, "Veiculo nao faz parte da loja");
							// txtMarc.setBackground(new Color(255,198,198));
						}
					    
					   double valorpago1 = Double.parseDouble(txtValor.getText());
					   
					   if(valorpago1<valorpagar1)
					   {
						   JOptionPane.showMessageDialog(null, "Valor a ser pago é inferior");
						   txtValor.setBackground(new Color(255,198,198));
						   
					   }else {
						   
						   double troco1 =valorpago1-valorpagar1;
						   receptorVendas.get(index).setTroco(""+troco1);
						   receptorVendas.get(index).setValorPago(""+valorpago1);
						   receptorVendas.get(index).setPrecoVeic(""+valorpagar1);
						   memoryVendas.vectVendas=receptorVendas;
						   try {
							memoryVendas.gravarVenda();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						   
					   }
					   
					   
					JOptionPane.showMessageDialog(null,"DADOS DA VENDA ALTERADOS COM SUCESSO" );
					dispose();
					
					
				}catch(NumberFormatException p)
				{
					JOptionPane.showMessageDialog(null, "CARACTERE INVALIDO INTRODUZA SOMENTE NUMEROS");
					txtValor.setBackground(new Color(241,75,84));
				}
				
			}

			
			if(e.getSource()==btnMenuADM)
			{
				dispose();
			}
	
		 
			
		}//Fecho do metodo
		
		
    	
    }
    
    int index;
    MemoriaVendas memoryVendas = new MemoriaVendas();
	Vector <Vendas_Modelo>receptorVendas = new Vector<>();

}
