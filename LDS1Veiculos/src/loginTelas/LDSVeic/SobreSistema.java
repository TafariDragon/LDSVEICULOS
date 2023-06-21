package loginTelas.LDSVeic;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class SobreSistema extends JFrame {

	String info = ("O sistema foi criado com objectivo principal de realizar vendas de veiculos\n Alem disso o Sistema permite fazer a gestão dos utilizadores que são eles : \n \n\n"
			+ "* ADMINISTRADORES - Responsaveis por tratar a parte Administrativa do sistema.\n\n"
			+ "* FUNCIONARIOS - Responsaveis por fazer a gestão das vendas e dos clientes");
	
	JTextArea txtArea = new JTextArea(info);
	JScrollPane srcl = new JScrollPane(txtArea);
	ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	
	public SobreSistema()
	{
		
		super("SOBRE O SISTEMA");
		setVisible(true);
		setIconImage(simbolo.getImage());
		setSize(590,300);
		setResizable(false);
		Container c = getContentPane();
	    setLocationRelativeTo(null);
		srcl.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        c.setBackground(Color.white);
		c.setLayout(null);
		srcl.setBounds(40, 50, 500, 200);
		c.add(srcl);
		
		txtArea.setFont(new Font ("Georgia", Font.BOLD,13));
		txtArea.setEditable(false);
		
		
	 
	}
}
