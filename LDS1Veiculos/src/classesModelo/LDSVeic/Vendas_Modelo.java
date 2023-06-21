package classesModelo.LDSVeic;

import java.io.Serializable;
import java.time.LocalDate;

public class Vendas_Modelo implements Serializable {
     
	private String numUnicClent;
	private String nomeClient;
	private String numUnicVeic;
	private String marcaVeic;
	private String precoVeic;
	private String valorPago;
	private String numUnicVenda;
	private String Troco;
	private LocalDate dataVenda;
	
	
	
	
	public Vendas_Modelo(String numUnicClent, String nomeClient, String numUnicVeic, String marcaVeic, String precoVeic,
			String valorPago, String numUnicVenda, String troco, LocalDate dataVenda) {
	  
		this.numUnicClent = numUnicClent;
		this.nomeClient = nomeClient;
		this.numUnicVeic = numUnicVeic;
		this.marcaVeic = marcaVeic;
		this.precoVeic = precoVeic;
		this.valorPago = valorPago;
		this.numUnicVenda = numUnicVenda;
		Troco = troco;
		this.dataVenda = dataVenda;
	}




	public String getNumUnicClent() {
		return numUnicClent;
	}




	public void setNumUnicClent(String numUnicClent) {
		this.numUnicClent = numUnicClent;
	}




	public String getNomeClient() {
		return nomeClient;
	}




	public void setNomeClient(String nomeClient) {
		this.nomeClient = nomeClient;
	}




	public String getNumUnicVeic() {
		return numUnicVeic;
	}




	public void setNumUnicVeic(String numUnicVeic) {
		this.numUnicVeic = numUnicVeic;
	}




	public String getMarcaVeic() {
		return marcaVeic;
	}




	public void setMarcaVeic(String marcaVeic) {
		this.marcaVeic = marcaVeic;
	}




	public String getPrecoVeic() {
		return precoVeic;
	}




	public void setPrecoVeic(String precoVeic) {
		this.precoVeic = precoVeic;
	}




	public String getValorPago() {
		return valorPago;
	}




	public void setValorPago(String valorPago) {
		this.valorPago = valorPago;
	}




	public String getNumUnicVenda() {
		return numUnicVenda;
	}




	public void setNumUnicVenda(String numUnicVenda) {
		this.numUnicVenda = numUnicVenda;
	}




	public String getTroco() {
		return Troco;
	}




	public void setTroco(String troco) {
		Troco = troco;
	}




	public LocalDate getDataVenda() {
		return dataVenda;
	}




	public void setDataVenda(LocalDate dataVenda) {
		this.dataVenda = dataVenda;
	}




	@Override
	public String toString() {
		return "Vendas_Modelo [numUnicClent=" + numUnicClent + ", nomeClient=" + nomeClient + ", numUnicVeic="
				+ numUnicVeic + ", marcaVeic=" + marcaVeic + ", precoVeic=" + precoVeic + ", valorPago=" + valorPago
				+ ", numUnicVenda=" + numUnicVenda + ", Troco=" + Troco + ", dataVenda=" + dataVenda + "]";
	}
	
	
	
	
	
	
	
	
	//private
	
	
}
