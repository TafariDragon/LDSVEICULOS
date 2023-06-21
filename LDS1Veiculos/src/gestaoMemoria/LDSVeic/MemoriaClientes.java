package gestaoMemoria.LDSVeic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import classesModelo.LDSVeic.Cliente_Modelo;

public class MemoriaClientes {
	
	public Vector <Cliente_Modelo> vectClient = new Vector <>();
	public Vector aux = new Vector();
	String ficheironome="ficheiros/client.dat";
	File f = new File(ficheironome);
	
	//Metodo que Escreve no Fich
	public void gravarClient () throws Exception
	{
		FileOutputStream escrever = new FileOutputStream(ficheironome);
		ObjectOutputStream obj = new ObjectOutputStream(escrever);
		obj.writeObject(vectClient);
		obj.close();
	}
	
	
	//Metodo que obtem dados do fich
	public  void obterClient () throws Exception
	{
		
		if(f.exists())
		{
			
			try {
				
				FileInputStream ler = new FileInputStream(ficheironome);
				ObjectInputStream obj = new ObjectInputStream(ler);
				
				vectClient = (Vector) obj.readObject();
				aux= vectClient;
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
