package loginTelas.LDSVeic;

import java.awt.*;

import javax.swing.*;

 
import interfaces.TelaInicial;

public class TelaProgressBar extends JFrame{
	 ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	
	
	public TelaProgressBar()
	{
		 
		setSize(450,200);
		setLocationRelativeTo(null);
		setIconImage(simbolo.getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		
		Container c = getContentPane();
		c.setLayout(null);
		c.setBackground(Color.white);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(1);
		progressBar.setFont(new Font("Papyrus", Font.ITALIC, 14));
		progressBar.setBackground(Color.LIGHT_GRAY);
		progressBar.setForeground(Color.CYAN);
		progressBar.setStringPainted(true);
		progressBar.setBounds(25, 60, 384, 20);
		c.add(progressBar);
		
		JLabel lblinfo = new JLabel("Carregando...");
		lblinfo.setForeground(Color.BLACK);
		lblinfo.setFont(new Font("Segoe Script", Font.PLAIN, 12));
		lblinfo.setBounds(25, 85, 384, 14);
		c.add(lblinfo);
		
		new Thread()
		{
			public void run()
			{
				for(int i=0 ; i<=100;i++)
				{
					try
					{
						sleep(100);
						progressBar.setValue(i);
					
						
						if(i==23)
						{
							lblinfo.setText("Verificando os dados salvos....");
						}
						
						
						if(i==49)
						{
							lblinfo.setText("Criado aos 02/06/2023");
						}
						
						
						if(i==70)
						{
							lblinfo.setText("Desenvolvida por Tafari Vilanculos....");
						}
						
						
						if (i==100) {
							 TelaInicial ti = new TelaInicial();
							 ti.setVisible(true);
							 dispose();
							
							
						}
						
						
					}catch(Exception m)
					{
						System.out.println(m.getMessage());
					}
					
				}
			}
		}.start();
	}

}
