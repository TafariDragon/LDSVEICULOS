package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import classesModelo.LDSVeic.Veiculos_Modelo;
import classesModelo.LDSVeic.Vendas_Modelo;
import gestaoMemoria.LDSVeic.MemoriaVeiculos;
import gestaoMemoria.LDSVeic.MemoriaVendas;

public class ListaVendas extends JFrame{
	
	//As imagens 
    MemoriaVendas memoryVendas = new MemoriaVendas();
	ImageIcon bmw = new ImageIcon("imagens/bmw.jpg");
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	ImageIcon imgTotal = new ImageIcon("icons/sales.png");
	JLabel lblinfo = new JLabel("LISTA DAS VENDAS ");
	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();
	JPanel painel4 = new JPanel();
	
	JLabel labelTotal = new JLabel();
	JLabel lblIconJLabel = new JLabel();
	
    int total=0;
	Vector <Vendas_Modelo> receptor = new Vector<>(); 
	
	Vector aux = new Vector(); 
	//String ficheironome="ficheiros/adm.dat";
	//File f = new File(ficheironome);
	
	 String strTot ="";
	 boolean recent=false;
	 
	public void colocarDados ()
    {
    	MemoriaVendas memoryVendas = new MemoriaVendas();
    	
    	try {
			memoryVendas.obterVendas();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	receptor=memoryVendas.vectVendas;
    	total= receptor.size();
    	strTot=("Total Vendas "+total);
    	
    	if(recent==true)
    	{
    		Collections.reverse(receptor);;
    	}
    	
    	if(az==true)
    	{
    		receptor.sort(Comparator.comparing(Vendas_Modelo::getNomeClient));
    	}
    	
    	 
    	
    }
		 
  JTable tabela = new JTable();		
	
 
 JButton btnMenuADM = new JButton("Voltar ao menu");
 ImageIcon back = new ImageIcon("icons/back.png");
 
 
 

	public void configTabela()
	{ 
	 
		
		DefaultTableModel model = new DefaultTableModel(new Object[]{"Nome Cliente", "Numero Cliente", 
				"Numero Veiculo","Marca","Preco Veiculo","Valor Pago","Numero Venda","Troco","Data"}, 0);
		
		
	     for(Vendas_Modelo a :receptor)
	     {
	    	  
	    	 
	  
	    	 Object[] rowData = {a.getNomeClient(),a.getNumUnicClent(),a.getNumUnicVeic(),a.getMarcaVeic(),a.getPrecoVeic()+" mt",a.getValorPago(),
	    		a.getNumUnicVenda(),a.getTroco()+" mt",a.getDataVenda()};
	    	 model.addRow(rowData);
	     }
	     
	     tabela.setModel(model);
	     
	     
	     
	}
	
	 String opcoes[] = {"Cronologica","Rencentes","Nomes Ordem A - Z"};
	 JComboBox cb = new  JComboBox(opcoes);
	
public  ListaVendas()   
{
		 
	       colocarDados();
	        
	        configTabela();
	  
		
		int largura =850;
		 setTitle("Lista de Vendas");
		 setSize(1085,500);
		 setVisible(true);
		 setResizable(false);
		 setIconImage(simbolo.getImage());
		 setLocationRelativeTo(null);
		 setLayout(null);
		 setBackground(Color.white);
		 add(painel1);
		 add(painel2);
		 add(painel3);
		 add(painel4);
		 
		 tabela.setFont(new Font("Times New Roman",Font.PLAIN,14));
		 lblinfo.setFont(new Font("Georgia",Font.BOLD,16));
		 lblinfo.setForeground(Color.white);
		 painel1.setBounds(0, 0, 1080, 40);
		 painel1.setBackground(new Color(34,177,76));
		 painel1.setLayout(new FlowLayout());
		 painel1.add(lblinfo);
		 
		 painel2.setBounds(0, 40, 1080, 40);
		 painel2.setLayout(null);
		 painel2.setBackground(new Color(34,177,76));
		 
		  
		 //Colocar o vector no painel
		 JLabel lblopList = new JLabel("Ordem de listagem");
		 lblopList.setFont(new Font ("Georgia",Font.BOLD,14));
		 lblopList.setForeground(Color.white);
		 lblopList.setBounds(15, 10, 200, 20);
		 
		  
		 cb.setBounds(180, 10, 150, 25);
		 cb.setBackground(Color.white);
		// tabela.setBounds(15, 80, 200, 250);
		 painel2.add(lblopList);
		 painel2.add(cb);
		 
		 painel3.setLayout(new BorderLayout());
		 painel3.setBackground(new Color(34,177,76));
		 painel3.setBounds(220, 80, largura, 400);
		 tabela.setBackground(Color.white);
		 painel3.add(new JScrollPane(tabela));
		 
		 painel4.setLayout(null);
		 painel4.setBackground(Color.GRAY);
		 painel4.setBounds(0,80, 240,400);
		 labelTotal.setText(strTot);
		 labelTotal.setFont(new Font("Times New Roman", Font.BOLD, 16));
		 labelTotal.setForeground(Color.white);
		 labelTotal.setBounds(50, 30, 200, 14);
		 
		 lblIconJLabel.setBounds(10, 20, 50, 32);
		 lblIconJLabel.setIcon(imgTotal);
		 
		 painel4.add(labelTotal);
		 painel4.add(lblIconJLabel);
		 
		 btnMenuADM.setBounds(10, 300, 200, 35);
		 	 btnMenuADM.setBackground(Color.lightGray);
		 btnMenuADM.setFont(new Font ("Georgia", Font.BOLD,14));
		 btnMenuADM.setForeground(Color.decode("#221A87"));
		 btnMenuADM.setIcon(back);
		 
		 
		 painel4.add(btnMenuADM);
		 
		 btnMenuADM.addActionListener(
				 new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						dispose();
						
					}
				}
				 
				 );
	
		 
	   
		 TratamentoCombo trCombo = new TratamentoCombo();
		 cb.addItemListener(trCombo);
		 	 
		 
	}
	
	
	private class TratamentoCombo implements ItemListener
	{
	
		@Override
		public void itemStateChanged(ItemEvent e) {
			
			if(e.getSource() == cb)
			{
				if(cb.getSelectedIndex()==0)
				{
					colocarDados();
					configTabela();
				}
				
				if(cb.getSelectedIndex()==1)
				{
					recent=true;
					colocarDados();
					configTabela();
				}
				
				if(cb.getSelectedIndex()==2)
				{
					az=true;
					colocarDados();
					configTabela();
				
				}
				
			}
		
			
		}
		
	}
	
	boolean az=false;
	

}
