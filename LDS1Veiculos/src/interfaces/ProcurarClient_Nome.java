package interfaces;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import classesModelo.LDSVeic.Cliente_Modelo;
import gestaoMemoria.LDSVeic.MemoriaClientes;
 

public class ProcurarClient_Nome extends JFrame {
	
Vector <Cliente_Modelo> receptor = new Vector<>();
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	JLabel info  = new JLabel("PROCURAR CLIENTE NOME");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	
	//Elementos do cadastro
	JLabel lblNome = new JLabel("NOME");
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
	
	JButton btnMenuADM = new JButton("Voltar ao menu");
	JButton btnProcurar = new JButton("Procurar");
	
	
    public  ProcurarClient_Nome()
    {
    	super("PROCURAR");
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
    	lblNome.setForeground(Color.blue);
    	txtNome.setBounds(150, 10, 240, 25);
        lblApelido.setBounds(400, 135, 150, 14);
        txtApelido.setBounds(480, 130, 220, 25);
        txtApelido.setEditable(false);
        
        btnProcurar.setBounds(400, 10, 200, 30);
        
        lblNumBI.setBounds(10, 55, 150, 14);
        txtNumBI.setBounds(150, 50, 240, 25);
        txtNumBI.setEditable(false);
        lblNumUnic.setBounds(10, 95, 150, 14);
        txtNumUnic.setBounds(150, 90, 240, 25);
        txtNumUnic.setEditable(false);
        
        lblemail.setBounds(400, 175, 150, 14);
        txtemail.setBounds(480, 170, 220, 25);
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
    	 
    
    	
    	
    	//Configuracao e adicao de elementos no segundo painel jp3
    	jp3.setBounds(0,300, 800,100);
   	 	//jp3.setBackground(Color.red);
   	 	jp3.setLayout(null);
    	
   	 	
   	 	//Adicao dos elementos a jp3
   	 	btnMenuADM.setBounds(250, 20, 240, 30);
    	btnMenuADM.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnMenuADM.setForeground(Color.decode("#221A87"));
   
    	
    	 
    	btnProcurar.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnProcurar.setForeground(Color.blue);
 
    	
    	 
    	 
    	jp3.add(btnMenuADM);
      //  jp3.setBackground(Color.white);
    	jp2.add(btnProcurar);
     
      
    	
    	
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
    	btnProcurar.addActionListener(tr);
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
				try {
					memoryClient.obterClient();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				 
				receptor=memoryClient.vectClient;
				 
				if(txtNome.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Campo Vazio introduza o Numero Unico");
				}
				
				boolean confirm=false;
				for(int i=0;i<receptor.size();i++)
				{
					if(txtNome.getText().equalsIgnoreCase(receptor.get(i).getNome()))
					{
						confirm=true;
						txtApelido.setText((receptor.get(i).getApelido()));
						txtApelido.setEditable(true);
						
						txtNumBI.setText((receptor.get(i).getNumBI()));
						txtNumBI.setEditable(true);
						
						txtNome.setText(receptor.get(i).getNome());
						
						txtNumUnic.setText((receptor.get(i).getNumUnic()));
						txtNumUnic.setEditable(true);
						
						LocalDate data = receptor.get(i).getData().toLocalDate();
					    txtData.setText(""+data);
					    
					    
					    LocalTime hora = receptor.get(i).getData().toLocalTime();
					    txtHora.setText(""+hora);
					    
					    txtemail.setText(receptor.get(i).getEmail());
					    txtemail.setEditable(true);
					  //  btnA.setEnabled(true);
					    
					  //  indice=i;
					    
					    
					}
				}
				
				
				if(confirm==false)
				{
					JOptionPane.showMessageDialog(null, "ERROOOOOOO O Cliente [ "+txtNome.getText()+" ] NÃO FAZ PARTE DO SISTEMA");
					dispose();
				}
				 
			}
			
			
			
			if(e.getSource()==btnProcurar)
			{
				
				try {
					memoryClient.obterClient();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				 
				receptor=memoryClient.vectClient;
				 
				if(txtNome.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Campo Vazio introduza o Numero Unico");
				}
				
				boolean confirm=false;
				for(int i=0;i<receptor.size();i++)
				{
					if(txtNome.getText().equalsIgnoreCase(receptor.get(i).getNome()))
					{
						confirm=true;
						txtApelido.setText((receptor.get(i).getApelido()));
						txtApelido.setEditable(true);
						
						txtNumBI.setText((receptor.get(i).getNumBI()));
						txtNumBI.setEditable(true);
						
						txtNome.setText(receptor.get(i).getNome());
						
						txtNumUnic.setText((receptor.get(i).getNumUnic()));
						txtNumUnic.setEditable(true);
						
						LocalDate data = receptor.get(i).getData().toLocalDate();
					    txtData.setText(""+data);
					    
					    
					    LocalTime hora = receptor.get(i).getData().toLocalTime();
					    txtHora.setText(""+hora);
					    
					    txtemail.setText(receptor.get(i).getEmail());
					    txtemail.setEditable(true);
					  //  btnA.setEnabled(true);
					    
					  //  indice=i;
					    
					    
					}
				}
				
				
				if(confirm==false)
				{
					JOptionPane.showMessageDialog(null, "ERROOOOOOO O Cliente [ "+txtNome.getText()+" ] NÃO FAZ PARTE DO SISTEMA");
					dispose();
				}
				 
				
				
			}
			
			
			
			if(e.getSource()==btnMenuADM)
			{
				dispose();
			}
	
		 
			
		}
		
		
    	
    }
    
    MemoriaClientes memoryClient = new MemoriaClientes();


}
