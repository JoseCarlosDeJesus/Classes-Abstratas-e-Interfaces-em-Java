package br.com.pc2.semana7;

public class Inquilino extends Morador {

	private Integer tempoContrato;

	@Override
	public double calcularTaxaDeposito(int qtdeVolume) {
		return qtdeVolume * 5.0;
	}

	public Integer getTempoContrato() {
		return tempoContrato;
	}

	public void setTempoContrato(Integer tempoContrato) {
		this.tempoContrato = tempoContrato;
	}

}
