package interfaces;

import javax.swing.*;

import classesModelo.LDSVeic.Veiculos_Modelo;
import gestaoMemoria.LDSVeic.MemoriaVeiculos;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.time.*;


public class ProcurarVeic_NumUnic extends JFrame {
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	JLabel info  = new JLabel("PROCURAR PELO NUMERO UNICO");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	Vector <Veiculos_Modelo> receptor = new Vector<>();
	
	//Elementos do cadastro
	JLabel lblMatri = new JLabel("NÚMERO UNICO");
	JLabel lblMarc = new JLabel("MARCA");
	JLabel lblCor = new JLabel("COR DO VEICULO");
	JLabel lblModelo = new JLabel("MODELO");
	JLabel lblEstado = new JLabel("SITUÇÃO VEICULO");
	JLabel lblPreco = new JLabel("PREÇO $");
	JLabel lblNumUnic = new JLabel("MATRÍCULA");
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
	
	JButton btnMenuADM = new JButton(" Voltar ao menu");
	JButton btnProcurar = new JButton("Procurar");
	 
	
	String estados [] = {"Escolha Opção","0 KM","1 à 5 ANOS DE USO","MAIS DE 5 ANOS DE USO"};
	JComboBox cb = new JComboBox (estados);
	
    public  ProcurarVeic_NumUnic()
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
        lblMarc.setBounds(400,175, 150, 14);
        txtMarc.setBounds(480,170, 220, 25);
        txtMarc.setEditable(false);
        
        lblCor.setBounds(10, 55, 150, 14);
        txtCor.setBounds(150, 50, 240, 25);
        txtCor.setEditable(false);
        lblModelo.setBounds(400,215, 150, 14);
        txtModelo.setBounds(480,210, 220, 25);
        txtModelo.setEditable(false);
        
        jp2.add(lblEstado);
        jp2.add(cb);
     //   lblEstado.setFont(new Font("Georgia",Font.BOLD,14));
      //  lblEstado.setBounds(10, 95, 150, 14);
        //cb.setBounds(155, 90, 235, 25);
      //  cb.setFont(new Font("Times New Roman",Font.BOLD,14));
      //  cb.setEnabled(false);
        
        lblPreco.setBounds(10, 95, 150, 14);
    	txtPreco.setBounds(150, 90, 240, 25);
    	
        lblNumUnic.setBounds(10, 135, 150, 14);
        txtNumUnic.setBounds(150, 130, 240, 25);
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
   	 	btnMenuADM.setBounds(250, 20, 240, 30);
    	btnMenuADM.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnMenuADM.setForeground(Color.decode("#221A87"));
    	
    	btnProcurar.setBounds(400, 8, 240, 30);
    	btnProcurar.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnProcurar.setForeground(Color.blue);
     
    	
    	 
    	 
    	 
    	jp3.add(btnMenuADM);
    	jp2.add(btnProcurar);
     
      
    	
    	
    	TratamentoEventos tr = new TratamentoEventos();
    	txtMatric.addActionListener(tr);
    	txtMarc.addActionListener(tr);
    	txtCor.addActionListener(tr);
    	txtModelo.addActionListener(tr);
    	txtPreco.addActionListener(tr);
    	btnProcurar.addActionListener(tr);
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
				 //MANTEM ASSIM MESMOOOOOOO
				try {
					memoryVeiculos.obterVeic();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				 
				receptor=memoryVeiculos.vectVeic;
				 
				if(txtMatric.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Campo Vazio introduza a Matricula");
				}
				
				boolean confirm=false;
				
				for(int i=0;i<receptor.size();i++)
				{
					if(txtMatric.getText().equalsIgnoreCase(receptor.get(i).getNumUnic()))
					{
						confirm=true;
						txtCor.setText((receptor.get(i).getCor()));
						 
						

						txtModelo.setText(receptor.get(i).getModelo());
						 
						
						txtMarc.setText(receptor.get(i).getMarca());
						txtMarc.setEditable(false);
						
						txtNumUnic.setText(receptor.get(i).getMatricula());
						
						LocalDate data = receptor.get(i).getData().toLocalDate();
						LocalTime hora = receptor.get(i).getData().toLocalTime();
						
						
						txtData.setText(""+data);
						txtHora.setText(""+hora);
						
						for(int x =0 ;x<camposprencher.length;x++)
						{
							if(x!=0)
							{
								camposprencher[i].setEnabled(false);	
							}
							 
						}
						
					 
						
						txtPreco.setText(receptor.get(i).getPreco());
						 
						
					    //indice=i;
					    
					   // btnRemover.setEnabled(true);
					    
					    
					}
				}
				
				
				if(confirm==false)
				{
					JOptionPane.showMessageDialog(null, "ERROOOOOOO O VEICULO [ "+txtNumUnic.getText()+" ] NÃO FAZ PARTE DO SISTEMA");
					dispose();
				}
				
			}
			
			if(e.getSource() == btnProcurar)
			{
				
				try {
					memoryVeiculos.obterVeic();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				 
				receptor=memoryVeiculos.vectVeic;
				 
				if(txtMatric.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Campo Vazio introduza a Matricula");
				}
				
				boolean confirm=false;
				
				for(int i=0;i<receptor.size();i++)
				{
					if(txtMatric.getText().equalsIgnoreCase(receptor.get(i).getNumUnic()))
					{
						confirm=true;
						txtCor.setText((receptor.get(i).getCor()));
						 
						

						txtModelo.setText(receptor.get(i).getModelo());
						 
						
						txtMarc.setText(receptor.get(i).getMarca());
						txtMarc.setEditable(false);
						
						txtNumUnic.setText(receptor.get(i).getMatricula());
						
						LocalDate data = receptor.get(i).getData().toLocalDate();
						LocalTime hora = receptor.get(i).getData().toLocalTime();
						
						
						txtData.setText(""+data);
						txtHora.setText(""+hora);
						
						for(int x =0 ;x<camposprencher.length;x++)
						{
							if(x!=0)
							{
								camposprencher[i].setEnabled(false);	
							}
							 
						}
						
					 
						
						txtPreco.setText(receptor.get(i).getPreco());
						 
						
					    //indice=i;
					    
					   // btnRemover.setEnabled(true);
					    
					    
					}
				}
				
				
				if(confirm==false)
				{
					JOptionPane.showMessageDialog(null, "ERROOOOOOO O VEICULO [ "+txtNumUnic.getText()+" ] NÃO FAZ PARTE DO SISTEMA");
					dispose();
				}
				
				
			}
			
			if(e.getSource()==btnMenuADM)
			{
				dispose();
			}
			
			 
		}
		
		
    	
    }
    MemoriaVeiculos memoryVeiculos = new MemoriaVeiculos();

}
