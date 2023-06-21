package interfaces;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import classesModelo.LDSVeic.Cliente_Modelo;
import classesdeEdicaoComponentes.LDSVeic.PlaceHolderJPassword;
import classesdeEdicaoComponentes.LDSVeic.PlaceHolderJTextField;
import gestaoMemoria.LDSVeic.MemoriaClientes;
 

public class ListaProcuraClient extends JFrame {
	
	//As imagens 
    MemoriaClientes memoryClientes = new MemoriaClientes();
	ImageIcon bmw = new ImageIcon("imagens/bmw.jpg");
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	ImageIcon imgTotal = new ImageIcon("icons/users-group.png");
	JLabel lblinfo = new JLabel("LISTA PARA PROCURAR CLIENTE");
	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();
	JPanel painel4 = new JPanel();
	
	JLabel labelTotal = new JLabel();
	JLabel lblIconJLabel = new JLabel();
	
    int total=0;
	Vector <Cliente_Modelo> receptor = new Vector<>(); 
	
	Vector aux = new Vector(); 
	//String ficheironome="ficheiros/adm.dat";
	//File f = new File(ficheironome);
	
	 String strTot ="";
	 boolean recent=false;
	 
	 PlaceHolderJTextField campo = new PlaceHolderJTextField("Procurar pelo nome");
	 
	public void colocarDados ()
    {
    	MemoriaClientes memoryClent = new  MemoriaClientes();
    	
    	try {
			memoryClent.obterClient();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	receptor=memoryClent.vectClient;
    	
    	total= receptor.size();
    	strTot=("Total Clientes "+total);
    	
    	if(recent==true)
    	{
    		Collections.reverse(receptor);;
    	}
    	
    	if(az==true)
    	{
    		 receptor.sort(Comparator.comparing(Cliente_Modelo::getNome));
    	}
    	
    	 
    	
    }
		 
  JTable tabela = new JTable();		
	
 
 JButton btnMenuADM = new JButton("Efectuar Venda");
 ImageIcon back = new ImageIcon("icons/back.png");
 
 
 

	public void configTabela()
	{
		
	 
		DefaultTableModel model = new DefaultTableModel(new Object[]{"Nome", "Apelido", "Numero BI",
		"Numero Unico","Data","Hora","Email @"}, 0);
		
		
	     for(Cliente_Modelo a :receptor)
	     {
	    	 int h = a.getData().getHour();
	    	 int min =a.getData().getMinute();
	    	 LocalDate data = a.getData().toLocalDate();
	    	 String hora =(h+"h : "+min+"min");
	    	 Object[] rowData = {a.getNome(),a.getApelido(),a.getNumBI(),a.getNumUnic(),data,
	    		 hora,a.getEmail()};
	    	 model.addRow(rowData);
	     }
	     
	     tabela.setModel(model);
	     
	     
	     
	}
	
	 String opcoes[] = {"Cronologica","Rencentes","Nomes Ordem A - Z"};
	 JComboBox cb = new  JComboBox(opcoes);
	
	public  ListaProcuraClient()   
	{
		 
	        colocarDados();
	        
	        configTabela();
	  
		
		int largura =1100;
		 setTitle("Lista dos Clientes");
		 setSize(largura,500);
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
		 
		 painel1.setBounds(0, 0, largura, 40);
		 painel1.setBackground(new Color(255,201,14));
		 painel1.setLayout(new FlowLayout());
		 painel1.add(lblinfo);
		 
		 painel2.setBounds(0, 40, largura, 40);
		 painel2.setLayout(null);
		 painel2.setBackground(new Color(255,201,14));
		 
		  
		 //Colocar o vector no painel
		 JLabel lblopList = new JLabel("Ordem de listagem");
		 lblopList.setFont(new Font ("Georgia",Font.BOLD,14));
		 lblopList.setForeground(Color.white);
		 lblopList.setBounds(15, 10, 200, 20);
		 
		 JButton search = new JButton("Procurar");
		 
		  
		 campo.setBounds(700,10,180,20);
		 campo.setBorder(null);
		 search.setBounds(900,5,100,30);
		 search.requestFocus();
		 
		 
		
		 cb.setBounds(180, 10, 150, 25);
		 cb.setBackground(Color.white);
		// tabela.setBounds(15, 80, 200, 250);
		 painel2.add(lblopList);
		 painel2.add(cb);
		 painel2.add(campo);
		 painel2.add(search);
		 
		 painel3.setLayout(new BorderLayout());
		 painel3.setBackground(new Color(34,177,76));
		 painel3.setBounds(220, 80, 865, 400);
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
		 
		 
		 
		 ///////////////////////////////////////////////////////////
		 //EVENTO DE CLICK
	  tabela.addMouseListener(
			  
			  new MouseAdapter() {
				  
				  public void mouseClicked(MouseEvent e) 
				  {
					  int selectedRow = tabela.getSelectedRow();
		              int valueColumnIndex = 3;
		              
		              if (selectedRow != -1) {
		                    Object value = tabela.getValueAt(selectedRow, valueColumnIndex);
		                    EfectuarVenda eft = new EfectuarVenda();
		                    eft.efectuar.txtNumClient.setText(value.toString());
		                    dispose();
		                    
		                }
				  }
				  
			     }
			  
			  );
				 
				 
				 
		
		 
	  
	  campo.addActionListener(
			    
			  new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					String nome = campo.getText();
					DefaultTableModel model = (DefaultTableModel) tabela.getModel();
					int numRows = model.getRowCount();
					int colunaNome = 0; // Índice da coluna "Nome"
					int linhaEncontrada = -1;
				 
					
					for (int row = 0; row < numRows; row++) {
					    String valorCelula = model.getValueAt(row, colunaNome).toString();
					    if (valorCelula.equalsIgnoreCase(nome)) {
					        linhaEncontrada = row;
					        break;
					    }
					}
					
					if (linhaEncontrada != -1) {
					    tabela.setRowSelectionInterval(linhaEncontrada, linhaEncontrada);
					    tabela.scrollRectToVisible(tabela.getCellRect(linhaEncontrada, 0, true));
					} else {
					    // Ação caso o dado não seja encontrado na tabela
						JOptionPane.showMessageDialog(null, "O cliente "+nome+" nao faz parte do sistema");
					}
				 
					
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
