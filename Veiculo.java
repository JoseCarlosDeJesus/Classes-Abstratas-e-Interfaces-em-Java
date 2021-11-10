package br.com.pc2.semana7;

public interface Veiculo {	
	void trocarMarcha(int marcha);
	void aumentarVelocidade(int velocidade);
	void aplicarFrenagem(int intensidade);
	
	default String iniciando() {
		return "Iniciando movimentação";
	}
	static String finalizando() {
		return "Finalizando movimento";
	}
}
