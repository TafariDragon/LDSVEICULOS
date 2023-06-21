package gestaoMemoria.LDSVeic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

import classesModelo.LDSVeic.Veiculos_Modelo;

public class MemoriaVeiculos {
	
	  //Alterar os nomes dos metodos
		//Nome do vector
		//Nome do fich
		
		public Vector <Veiculos_Modelo> vectVeic = new Vector <>();
		public Vector aux = new Vector();
		String ficheironome="ficheiros/veic.dat";
		File f = new File(ficheironome);
		
		//Metodo que Escreve no Ficheiro
		public void gravarVeic () throws Exception
		{
			FileOutputStream escrever = new FileOutputStream(ficheironome);
			ObjectOutputStream obj = new ObjectOutputStream(escrever);
			obj.writeObject(vectVeic);
			obj.close();
		}
		
		
		//Metodo que obtem dados do ficheiro
		public  void obterVeic () throws Exception
		{
			
			if(f.exists())
			{
				
				try {
					
					FileInputStream ler = new FileInputStream(ficheironome);
					ObjectInputStream obj = new ObjectInputStream(ler);
					
					vectVeic = (Vector) obj.readObject();
					aux= vectVeic;
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
