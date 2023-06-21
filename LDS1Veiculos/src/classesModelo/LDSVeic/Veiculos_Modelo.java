package classesModelo.LDSVeic;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Veiculos_Modelo implements Serializable {
	
	private String matricula;
	private String marca;
	private String cor;
	private String modelo;
	private String estado;
	private String preco;
	private String numUnic;
	private LocalDateTime data;
	public Veiculos_Modelo(String matricula, String marca, String cor, String modelo, String estado, String preco,
			String numUnic, LocalDateTime data) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.cor = cor;
		this.modelo = modelo;
		this.estado = estado;
		this.preco = preco;
		this.numUnic = numUnic;
		this.data = data;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	public String getCor() {
		return cor;
	}
	
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPreco() {
		return preco;
	}
	public void setPreco(String preco) {
		this.preco = preco;
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
		return "Veiculos_Modelo [matricula=" + matricula + ", marca=" + marca + ", cor=" + cor + ", modelo=" + modelo
				+ ", estado=" + estado + ", preco=" + preco + ", numUnic=" + numUnic + ", data=" + data + "]";
	}
	
	
	
	 


 

	 
	
	
	
	

}
