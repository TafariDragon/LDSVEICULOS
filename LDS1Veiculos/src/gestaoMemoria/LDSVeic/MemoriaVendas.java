package gestaoMemoria.LDSVeic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import classesModelo.LDSVeic.Vendas_Modelo;

public class MemoriaVendas {
	
	//Alterar os nomes dos metodos
		//Nome do vector
		//Nome do fich
		
		public Vector <Vendas_Modelo> vectVendas = new Vector<>();
		public Vector aux = new Vector();
		
		String ficheironome="ficheiros/vendas.dat";
		File f = new File(ficheironome);
		
		//Metodo que Escreve no Fich
		public void gravarVenda () throws Exception
		{
			FileOutputStream escrever = new FileOutputStream(ficheironome);
			ObjectOutputStream obj = new ObjectOutputStream(escrever);
			obj.writeObject(vectVendas);
			obj.close();
		}
		
		
		//Metodo que obtem dados do fich
		public  void obterVendas () throws Exception
		{
			
			if(f.exists())
			{
				
				try {
					
					FileInputStream ler = new FileInputStream(ficheironome);
					ObjectInputStream obj = new ObjectInputStream(ler);
					
					vectVendas = (Vector) obj.readObject();
					aux= vectVendas;
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
