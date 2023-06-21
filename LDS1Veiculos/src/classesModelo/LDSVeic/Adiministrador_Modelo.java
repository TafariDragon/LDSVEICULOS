package classesModelo.LDSVeic;

import java.io.Serializable;
import java.time.*;
import java.util.Vector;

public class Adiministrador_Modelo implements Serializable {
	
	private String nome;
	private String apelido;
	private String numBI;
	private String numUnic;
	private LocalDateTime data;
	private String senha;
	
	
	
	public Adiministrador_Modelo(String nome, String apelido, String numBI, String numUnic, LocalDateTime data,
			String senha) {
		 
		this.nome = nome;
		this.apelido = apelido;
		this.numBI = numBI;
		this.numUnic = numUnic;
		this.data = data;
		this.senha = senha;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getApelido() {
		return apelido;
	}



	public void setApelido(String apelido) {
		this.apelido = apelido;
	}



	public String getNumBI() {
		return numBI;
	}



	public void setNumBI(String numBI) {
		this.numBI = numBI;
	}



	public String getNumUnic() {
		return numUnic;
	}



	public void setNumUnic(String numUnic) {
		this.numUnic = numUnic;
	}



	public LocalDateTime getData() {
		return data;
	}



	public void setData(LocalDateTime data) {
		this.data = data;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	@Override
	public String toString() {
		return "Adiministrador_Modelo [nome=" + nome + ", apelido=" + apelido + ", numBI=" + numBI + ", numUnic="
				+ numUnic + ", data=" + data + ", senha=" + senha + "]";
	}
	
	
	

}
