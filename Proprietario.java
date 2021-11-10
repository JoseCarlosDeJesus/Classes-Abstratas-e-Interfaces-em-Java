package br.com.pc2.semana7;

public class Proprietario extends Morador {

	private Integer qtdeApartamento;
	
	@Override
	public double calcularTaxaDeposito(int qtdeVolume){
		return qtdeVolume*3.0;
	}

	public Integer getQtdeApartamento() {
		return qtdeApartamento;
	}

	public void setQtdeApartamento(Integer qtdeApartamento) {
		this.qtdeApartamento = qtdeApartamento;
	}
	

}
