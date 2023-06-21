package loginTelas.LDSVeic;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import classesModelo.LDSVeic.Adiministrador_Modelo;
import classesdeEdicaoComponentes.LDSVeic.PlaceHolderJPassword;
import classesdeEdicaoComponentes.LDSVeic.PlaceHolderJTextField;
import gestaoMemoria.LDSVeic.MemoriaADM;
import interfaces.MenuAdminstrador;
import interfaces.TelaInicial;

public class TelaLoginADM extends JFrame {
	
   	 //Imagens e Icons
	  ImageIcon simbolo = new ImageIcon("icons/iconLDS.png");
	  ImageIcon iconProfile = new ImageIcon("icons/userr.png");
	  ImageIcon iconConfirmar = new ImageIcon("icons/confirm.png");
	  ImageIcon iconCancelar = new ImageIcon("icons/back.png");
	  ImageIcon iconLimpar = new ImageIcon("icons/clean.png");
	  ImageIcon iconUsuario = new ImageIcon("icons/pessoa.png");
	  ImageIcon iconCadeado = new ImageIcon("icons/cadeado.png");
		
	
	  //Elementos da Janela
	  JButton btnConfirmar = new JButton("Confirmar");
	  JButton btnCancelar = new JButton("Cancelar");
	  JButton btnLimpar = new JButton("Limpar Campos");
	  
	  JLabel lblImagem = new JLabel(iconProfile);
	  JLabel lblIconUsuario = new JLabel(iconUsuario);
	  JLabel lblIconCadeado = new JLabel(iconCadeado);
	  JLabel lblNome = new JLabel("Nome");
	  JLabel lblSenha = new JLabel("Senha");
	  
	  PlaceHolderJTextField txtNome = new PlaceHolderJTextField("Primeiro Nome");
	  PlaceHolderJPassword txtSenha = new PlaceHolderJPassword("****Senha");
      
      JPanel painel = new JPanel();
      
      
      public TelaLoginADM ()
      {
    	  super("LOGIN ADMINISTRADOR");
    	  int largura =550;
    	  int altura = 500;
    	  setResizable(false);
    	  setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	  setIconImage(simbolo.getImage());
    	  setSize(largura, altura);
    	  setLocationRelativeTo(null);
    	  
    	  add(painel);
    	  
    	  
    	  //Configuracao do painel
    	  painel.setBackground(new Color (43,142,217));
    	  painel.setLayout(null);
    	  
    	  //Adicionando os elementos ao painel
    	  painel.add(lblImagem);
    	  painel.add(lblNome);
    	  painel.add(lblSenha);
    	  painel.add(lblIconUsuario);
    	  painel.add(lblIconCadeado);
    	  painel.add(btnConfirmar);
    	  painel.add(btnLimpar);
    	  painel.add(btnCancelar);
    	  painel.add(txtNome);
    	  painel.add(txtSenha);
    	  
    	  
    	  //Estilizacao das Labels
    	  lblNome.setFont(new Font("Georgia",Font.BOLD,16));
    	  lblSenha.setFont(new Font("Georgia",Font.BOLD,16));
    	  
    	  //Estilizando os campos de texto
    	   txtNome.setBorder(null);
    	   txtSenha.setBorder(null);
    	   
    	   txtNome.setBackground(Color.white);
    	   txtNome.setFont(new Font("Times New Roman",Font.BOLD,18));
    	   txtNome.setToolTipText("Introduza somente o seu primeiro de cadastro");
    	   txtNome.requestFocus();
    	  
    	   
    	   
    	   txtSenha.setBackground(Color.white);
    	   txtSenha.setFont(new Font("Times New Roman",Font.BOLD,18));
    	   txtSenha.setToolTipText("Introduza a sua senha");
    	   
    	   //Estilizacao dos buttoes
    	   btnCancelar.setBackground(Color.orange);
    	   btnCancelar.setForeground(Color.blue);
    	   btnCancelar.setFont(new Font("Times New Roman",Font.BOLD,14));
    	   btnCancelar.setIcon(iconCancelar);
    	   
    	   btnConfirmar.setFont(new Font("Times New Roman",Font.BOLD,14));
    	   btnConfirmar.setForeground(Color.white);
    	   btnConfirmar.setBackground(Color.decode("#221A87"));
    	   btnConfirmar.setIcon(iconConfirmar);
    	   
    	   
    	   btnLimpar.setFont(new Font("Times New Roman",Font.BOLD,14));
    	   btnLimpar.setForeground(Color.white);
    	   btnLimpar.setBackground(Color.decode("#221A87"));
    	   btnLimpar.setIcon(iconLimpar);
    	   
    	   
    	   
    	   
    	  //Posicionando os elementos
    	  
    	  lblImagem.setBounds(180, 20, 200, 128);
    	  
    	  lblNome.setBounds(70, 185, 200, 16);
    	  lblSenha.setBounds(70, 250, 200, 16);
    	  
    	  
    	  txtNome.setBounds(140, 180, 250, 30);
    	  txtSenha.setBounds(140, 245, 250, 30);
    	 
    	  btnLimpar.setBounds(340,380, 180,30);
    	  btnCancelar.setBounds(20,380, 140,30);
    	  btnConfirmar.setBounds(175,380, 150,30);
    	  
    	  lblIconUsuario.setBounds(310, 180, 200, 24);
    	  lblIconCadeado.setBounds(315, 250, 200, 24);
    	  
    	  TratamentoEventos tr = new TratamentoEventos();
    	  txtSenha.addActionListener(tr);
    	  txtNome.addActionListener(tr);
    	  btnLimpar.addActionListener(tr);
    	  btnCancelar.addActionListener(tr);
    	  btnConfirmar.addActionListener(tr);
    	  
    	  
    	  
      }
      
      
      private class TratamentoEventos implements ActionListener
      {

		@Override
		public void actionPerformed(ActionEvent e) {
			 
			if(e.getSource()==txtNome)
			{
				txtSenha.requestFocus();
			}
			
			
			if(e.getSource()==txtSenha)
			{
				try {
					memoryAdm.obterADM();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			   char[] senhaChars = txtSenha.getPassword();
			   String senha = new String(senhaChars);
			   
			  
			  
			  boolean v = false;
			  for(int i=0 ; i<memoryAdm.vectAdm.size();i++)
			  {
				   if(senha.equalsIgnoreCase(memoryAdm.vectAdm.get(i).getSenha())&& 
				      txtNome.getText().equalsIgnoreCase(memoryAdm.vectAdm.get(i).getNome()))
				   {
					    v=true;
					    strLogin =(memoryAdm.vectAdm.get(i).getNome()+"_"+memoryAdm.vectAdm.get(i).getNumUnic()+"_ ADM");
					   
					  MenuAdminstrador menuadm = new MenuAdminstrador();
					  menuadm.setVisible(true);
					  menuadm.menu.lblUsuario.setText(strLogin);
					   
					   dispose();
					   
				   }
			  }
			  
			  
		
				if(v==false)
				{
					JOptionPane.showMessageDialog(null, "O NOME OU A SENHA DO ADMINISTRADOR ESTA INCONRRECTO!");
				}
			}
			
			
			
			if(e.getSource()==btnConfirmar)
			{
				

				try {
					memoryAdm.obterADM();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			   char[] senhaChars = txtSenha.getPassword();
			   String senha = new String(senhaChars);
			   
			  
			   
			  
			  
			  
			  boolean v = false;
			  for(int i=0 ; i<memoryAdm.vectAdm.size();i++)
			  {
				   if(senha.equalsIgnoreCase(memoryAdm.vectAdm.get(i).getSenha())&& 
				      txtNome.getText().equalsIgnoreCase(memoryAdm.vectAdm.get(i).getNome()))
				   {
					   v=true;
					    
					    strLogin =(memoryAdm.vectAdm.get(i).getNome()+"_"+memoryAdm.vectAdm.get(i).getNumUnic()+"_ ADM");
					   
						  MenuAdminstrador menuadm = new MenuAdminstrador();
						  menuadm.setVisible(true);
						  menuadm.menu.lblUsuario.setText(strLogin);
						  
					   dispose();
				   }
			  }
			  
			  
		
				if(v==false)
				{
					JOptionPane.showMessageDialog(null, "O NOME OU A SENHA DO ADMINISTRADOR ESTA INCONRRECTO!");
				}
				
			}
			
			
			if(e.getSource()==btnLimpar)
			{
				txtNome.setText("");
				txtSenha.setText("");
			}
			
			
			if(e.getSource()==btnCancelar)
			{
				TelaInicial tl = new TelaInicial();
				tl.setVisible(true);
				dispose();
			}
			
		}//Fecho ActionPermofed
    	  
      }
      
      
    
      String strLogin;
      
   

	public String getStrLogin() {
		return strLogin;
	}



	public void setStrLogin(String strLogin) {
		this.strLogin = strLogin;
	}



	MemoriaADM memoryAdm =new MemoriaADM();

}
