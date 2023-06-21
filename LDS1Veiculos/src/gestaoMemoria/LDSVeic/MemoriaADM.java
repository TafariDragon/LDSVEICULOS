package gestaoMemoria.LDSVeic;

import java.io.*;
import java.util.*;

import classesModelo.LDSVeic.Adiministrador_Modelo;

public class MemoriaADM {
	
	public Vector <Adiministrador_Modelo> vectAdm = new Vector<>();
	public Vector aux = new Vector();
	String ficheironome="ficheiros/adm.dat";
	File f = new File(ficheironome);
	
	public void gravarADM () throws Exception
	{
		FileOutputStream escrever = new FileOutputStream(ficheironome);
		ObjectOutputStream obj = new ObjectOutputStream(escrever);
		obj.writeObject(vectAdm);
		obj.close();
	}
	
	
	public  void obterADM () throws Exception
	{
		
		if(f.exists())
		{
			
			try {
				
				FileInputStream ler = new FileInputStream(ficheironome);
				ObjectInputStream obj = new ObjectInputStream(ler);
				
				vectAdm = (Vector) obj.readObject();
				aux= vectAdm;
				obj.close();
				
			}catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			
		}else {
			try {
				
				if(f.createNewFile())
				{
					System.out.println("Arquivo criado com sucesso");
				}else {
					System.out.println("Nao foi possivel criar o arquivo");
				}
				
			}catch(Exception j) {
				System.out.println(j.getMessage());
			}
		}
		 
		 
	}
	


}
