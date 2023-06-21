package interfaces;

import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import javax.swing.*;

import classesModelo.LDSVeic.Adiministrador_Modelo;
import gestaoMemoria.LDSVeic.MemoriaADM;

 

public class ProcurarADM extends JFrame {
	
	Vector <Adiministrador_Modelo> receptor = new Vector<>();
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	ImageIcon icoProcurar = new ImageIcon("icons/magnifying-glass.png");
	ImageIcon icoVoltar = new ImageIcon("icons/back.png");
	
	
	JLabel info  = new JLabel("PROCURAR");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	
	//Elementos do cadastro
	JLabel lblNome = new JLabel("DIGITE O NOME");
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
	
	JButton btnMenuADM = new JButton(" Voltar ao menu");
	JButton btnProcuar = new JButton(" Procurar");
	 
	
	
	
    public ProcurarADM()
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
    	jp1.setLayout(new FlowLayout());
    	//Adicao de elementos a jp1
    	info.setFont(new Font ("Georgia", Font.BOLD,14));
    	info.setForeground(Color.white);
    	JLabel lblicoProcurar = new JLabel(icoProcurar);
    	jp1.add(info);
    	jp1.add(lblicoProcurar);
    	
    	
    	//Configuracao e adicao de elementos no segundo painel jp2
    	jp2.setBounds(0,30, largura,250);
    	 //jp2.setBackground(Color.blue);
    	jp2.setLayout(null);
    	
    	lblNome.setBounds(10, 15, 150, 14);
    	txtNome.setBounds(150, 10, 240, 25);
    	
        lblApelido.setBounds(400, 215, 150, 14);
        txtApelido.setBounds(480, 210, 220, 25);
        txtApelido.setEditable(false);
        
        lblNumBI.setBounds(10, 55, 150, 14);
        txtNumBI.setBounds(150, 50, 240, 25);
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
    	 
       
    	   camposprencher[0].setToolTipText("Pressione [ENTER] para procurar");
       
       
    
    	
    	
    	//Configuracao e adicao de elementos no segundo painel jp3
    	jp3.setBounds(0,300, 800,100);
   	 	//jp3.setBackground(Color.red);
   	 	jp3.setLayout(null);
    	
   	 	
   	 	//Adicao dos elementos a jp3
   	 	btnMenuADM.setBounds(240, 20, 240, 30);
    	btnMenuADM.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnMenuADM.setForeground(Color.decode("#221A87"));
    	btnMenuADM.setIcon(icoVoltar);
    	btnMenuADM.setBackground(Color.white);
    	
    	//Adicao dos elementos a jp3
   	 	btnProcuar.setBounds(400, 10, 240, 30);
    	btnProcuar.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnProcuar.setForeground(Color.blue);
    	
    	
    	 
    	 
    	jp3.add(btnMenuADM);
    	jp2.add(btnProcuar); 
    	
    	
    	TratamentoEventos tr = new TratamentoEventos();
    	txtNome.addActionListener(tr);
    	txtApelido.addActionListener(tr);
    	txtNumBI.addActionListener(tr);
    	txtNumUnic.addActionListener(tr);
    	txtData.addActionListener(tr);
    	btnMenuADM.addActionListener(tr);
    	btnProcuar.addActionListener(tr);
    }
    
    
    private class TratamentoEventos implements ActionListener
    {

		@Override
		public void actionPerformed(ActionEvent e) 
	    {
			MemoriaADM memoryAdm = new MemoriaADM();
			
			//EVENTOS DOS CAMPOS DE TEXTO JTEXTFIELD
			if(e.getSource()==txtNome)
			{
				try {
					memoryAdm.obterADM();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				 
				receptor=memoryAdm.vectAdm;
				 
				if(txtNome.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Campo Vazio introduza o nome");
				}
				
				boolean confirm=false;
				for(int i=0;i<receptor.size();i++)
				{
					if(txtNome.getText().equals(receptor.get(i).getNome()))
					{
						confirm=true;
						txtApelido.setText((receptor.get(i).getApelido()));
						 
						
						txtNumBI.setText((receptor.get(i).getNumBI()));
						 
						
						txtNome.setText(receptor.get(i).getNome());
						
						txtNumUnic.setText((receptor.get(i).getNumUnic()));
					 
						
						LocalDate data = receptor.get(i).getData().toLocalDate();
					    txtData.setText(""+data);
					    
					    
					    LocalTime hora = receptor.get(i).getData().toLocalTime();
					    txtHora.setText(""+hora);
					    
					    txtSenha.setText(receptor.get(i).getSenha());
					 
					   
					    
					    
					    
					    
					}
				}
				
				
				if(confirm==false)
				{
					JOptionPane.showMessageDialog(null, "ERROOOOOOO O ADMINISTRADOR [ "+txtNome.getText()+" ] NÃO FAZ PARTE DO SISTEMA");
					dispose();
				} 
				 
			}
			
			
			if(e.getSource()==btnMenuADM)
			{
				 dispose();
			}
			
			if(e.getSource()==btnProcuar)
			{
				
				try {
					memoryAdm.obterADM();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				 
				receptor=memoryAdm.vectAdm;
				 
				if(txtNome.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Campo Vazio introduza o nome");
				}
				
				boolean confirm=false;
				for(int i=0;i<receptor.size();i++)
				{
					if(txtNome.getText().equals(receptor.get(i).getNome()))
					{
						confirm=true;
						txtApelido.setText((receptor.get(i).getApelido()));
						 
						
						txtNumBI.setText((receptor.get(i).getNumBI()));
						 
						
						txtNome.setText(receptor.get(i).getNome());
						
						txtNumUnic.setText((receptor.get(i).getNumUnic()));
					 
						
						LocalDate data = receptor.get(i).getData().toLocalDate();
					    txtData.setText(""+data);
					    
					    
					    LocalTime hora = receptor.get(i).getData().toLocalTime();
					    txtHora.setText(""+hora);
					    
					    txtSenha.setText(receptor.get(i).getSenha());
					 
					   
					    
					    
					    
					    
					}
				}
				
				
				if(confirm==false)
				{
					JOptionPane.showMessageDialog(null, "ERROOOOOOO O ADMINISTRADOR [ "+txtNome.getText()+" ] NÃO FAZ PARTE DO SISTEMA");
					dispose();
				} 
				
			}
			
		 
			
		}
		
		
    	
    }
	

}
