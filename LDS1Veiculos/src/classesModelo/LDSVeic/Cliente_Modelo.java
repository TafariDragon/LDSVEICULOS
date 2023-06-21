package classesModelo.LDSVeic;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Cliente_Modelo implements Serializable {
	
	private String nome;
	private String apelido;
	private String numBI;
	private String email;
	private String numUnic;
	private LocalDateTime data;
	
	
	public Cliente_Modelo(String nome, String apelido, String numBI, String email,String numUnic, 
	   LocalDateTime data) {
		 
		this.nome = nome;
		this.apelido = apelido;
		this.numBI = numBI;
		this.email = email;
		this.numUnic = numUnic;
		this.data = data;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	@Override
	public String toString() {
		return "Cliente_Modelo [nome=" + nome + ", apelido=" + apelido + ", numBI=" + numBI + ", email=" + email
				+ ", numUnic=" + numUnic + ", data=" + data + "]";
	}
	
	
	
 
	

}
