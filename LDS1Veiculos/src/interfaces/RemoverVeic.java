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
import javax.swing.JTextField;
import classesModelo.LDSVeic.Veiculos_Modelo;
import gestaoMemoria.LDSVeic.MemoriaADM;
import gestaoMemoria.LDSVeic.MemoriaVeiculos;
 

public class RemoverVeic extends JFrame {
	
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	JLabel info  = new JLabel("REMOVER VEICULO");
	JPanel jp1 = new JPanel();
	JPanel jp2 = new JPanel();
	JPanel jp3 = new JPanel();
	
	Vector <Veiculos_Modelo> receptor = new Vector<>();
	//Elementos do cadastro
	
	JLabel lblNumUnic = new JLabel ("Numero Unico");
	JLabel lblMatricula = new JLabel("Matricula");
	JLabel lblCor = new JLabel("Cor");
	JLabel lblModelo = new JLabel("Modelo");
	JLabel lblPreco = new JLabel("Preco $");
	JLabel lblMarca = new JLabel("Marca");
	
	JLabel elementos []= {lblNumUnic,lblMatricula,lblCor,lblModelo,lblPreco,lblMarca};
	
	
	JTextField txtNumUnic = new JTextField();
	JTextField txtMatricula = new JTextField();
	JTextField txtCor = new JTextField();
	JTextField txtModelo = new JTextField();
	JTextField txtPreco = new JTextField();
	JTextField txtMarca = new JTextField();
	
	JTextField campos [] = {txtNumUnic , txtMatricula,txtCor,txtModelo,txtPreco,txtMarca};
	 
	
	JButton btnMenuADM = new JButton(" Voltar ao menu");
	JButton btnProcurar = new JButton("Procurar");
	JButton btnRemover= new JButton("Remover");
	
	 
	
	String estados [] = {"Escolha Opção","0 KM","1 à 5 ANOS DE USO","MAIS DE 5 ANOS DE USO"};
	JComboBox cb = new JComboBox (estados);
	
    public   RemoverVeic()
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
    	
     
    	for(int i=0;i<elementos.length;i++)
    	{
    		jp2.add(elementos[i]);
    		jp2.add(campos[i]);
    		elementos[i].setFont(new Font ("Georgia", Font.BOLD,16));
    		campos[i].setFont(new Font ("Times New Roman", Font.PLAIN,14));
    	}
    	
    	lblNumUnic.setBounds(10,15,200,16);
        txtNumUnic.setBounds(140,10,200,25);
    	
    	lblMatricula.setBounds(10, 55, 200, 16);
    	txtMatricula.setBounds(140,50,200,25);
    	
    	
    	
    	lblCor.setBounds(10, 95, 200, 16);
    	txtCor.setBounds(140,90,200,25);
    	
    	
    	lblModelo.setBounds(10, 135, 200, 16);
    	txtModelo.setBounds(140,130,200,25);
    	
    	
    	
    	lblPreco.setBounds(10, 175, 200, 16);
    	txtPreco.setBounds(140,170,200,25);
    	
    	
    	
    	lblMarca.setBounds(10, 215, 200, 16);
    	txtMarca.setBounds(140,210,200,25);
    	
    	
    	
         for(int i=0;i<campos.length;i++)
         {
        	 if(i!=0)
        	 {
        		 campos[i].setEnabled(false);
        	 }
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
    	
    	btnRemover.setBounds(400, 48, 240, 30);
    	btnRemover.setFont(new Font ("Georgia", Font.BOLD,14));
    	btnRemover.setForeground(Color.red);
    	btnRemover.setEnabled(false);
     
     
    	
    	 
    	 
    	 
    	jp3.add(btnMenuADM);
    	jp2.add(btnProcurar);
    	jp2.add(btnRemover);
     
      
    	
    	
    	TratamentoEventos tr = new TratamentoEventos();
    	txtMatricula.addActionListener(tr);
    	txtNumUnic.addActionListener(tr);
    	txtMarca.addActionListener(tr);
    	txtCor.addActionListener(tr);
    	txtModelo.addActionListener(tr);
    	txtPreco.addActionListener(tr);
    	btnProcurar.addActionListener(tr);
    	btnRemover.addActionListener(tr);
    	btnMenuADM.addActionListener(tr);
    	cb.addActionListener(tr);
    }
    
    
    private class TratamentoEventos implements ActionListener
    {
    	MemoriaADM memoryAdm = new MemoriaADM();
		int indice=0;
		public void actionPerformed(ActionEvent e) 
	    {
			
			
			//EVENTOS DOS CAMPOS DE TEXTO JTEXTFIELD
			if(e.getSource()==txtNumUnic)
			{
				 //MANTEM ASSIM MESMOOOOOOO

				try {
					memoryVeiculos.obterVeic();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				 
				receptor=memoryVeiculos.vectVeic;
				 
				if(txtNumUnic.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Campo Vazio introduza a Matricula");
				}
				
				boolean confirm=false;
				
				for(int i=0;i<receptor.size();i++)
				{
					if(txtNumUnic.getText().equalsIgnoreCase(receptor.get(i).getNumUnic()))
					{
						confirm=true;
						txtCor.setText((receptor.get(i).getCor()));
						txtCor.setEditable(true);
						

						txtModelo.setText(receptor.get(i).getModelo());
						txtModelo.setEditable(true);
						
						txtMarca.setText(receptor.get(i).getMarca());
						txtMarca.setEditable(true);
						
						txtMatricula.setText(receptor.get(i).getMatricula());
						txtMatricula.setEditable(true);
						
						txtPreco.setText(receptor.get(i).getPreco());
						txtPreco.setEditable(true);
						
					    indice=i;
					    
					    btnRemover.setEnabled(true);
					    
					    
					}
				}
				
				
				if(confirm==false)
				{
					JOptionPane.showMessageDialog(null, "ERROOOOOOO O VEICULO [ "+txtMatricula.getText()+" ] NÃO FAZ PARTE DO SISTEMA");
					dispose();
				}
				
			}
			
			
			if(e.getSource()==btnProcurar)
			{
				
				try {
					memoryVeiculos.obterVeic();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
				 
				receptor=memoryVeiculos.vectVeic;
				 
				if(txtNumUnic.getText().equals(""))
				{
					JOptionPane.showMessageDialog(null,"Campo Vazio introduza a Matricula");
				}
				
				boolean confirm=false;
				
				for(int i=0;i<receptor.size();i++)
				{
					if(txtNumUnic.getText().equalsIgnoreCase(receptor.get(i).getNumUnic()))
					{
						confirm=true;
						txtCor.setText((receptor.get(i).getCor()));
						txtCor.setEditable(true);
						

						txtModelo.setText(receptor.get(i).getModelo());
						txtModelo.setEditable(true);
						
						txtMarca.setText(receptor.get(i).getMarca());
						txtMarca.setEditable(true);
						
						txtMatricula.setText(receptor.get(i).getMatricula());
						txtMatricula.setEditable(true);
						
						txtPreco.setText(receptor.get(i).getPreco());
						txtPreco.setEditable(true);
						
					    indice=i;
					    
					    btnRemover.setEnabled(true);
					    
					    
					}
				}
				
				
				if(confirm==false)
				{
					JOptionPane.showMessageDialog(null, "ERROOOOOOO O VEICULO [ "+txtMatricula.getText()+" ] NÃO FAZ PARTE DO SISTEMA");
					dispose();
				}
				
			}
			
			
			if(e.getSource()==btnRemover)
			{ 
				
				System.out.println(indice);
				receptor.remove(indice);
				receptor.trimToSize();
				 
				 
				memoryVeiculos.vectVeic=receptor;
			 
				
				
				try {
					memoryVeiculos.gravarVeic();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				JOptionPane.showMessageDialog(null,"Remoção Feita com sucesso");
				dispose();
				
			}
			
			if(e.getSource()==btnMenuADM)
			{
				dispose();
			}
			
			 
		}
		
		
    	
    }

    MemoriaVeiculos memoryVeiculos = new MemoriaVeiculos();
	

}
