package br.com.pc2.semana7;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		
		  Bicicleta b = new Bicicleta(1,0); Carro c = new Carro(1,0);
		  System.out.println(b.iniciando()); b.aumentarVelocidade(5);
		  b.trocarMarcha(2); b.aplicarFrenagem(2);
		  System.out.println("Estado da bicicleta"); b.mostraEstado();
		  System.out.println(Veiculo.finalizando()); System.out.println(c.iniciando());
		  c.aumentarVelocidade(50); c.trocarMarcha(2); c.aplicarFrenagem(15);
		  System.out.println("Estado do carro"); c.mostraEstado();
		  System.out.println(Veiculo.finalizando());
		 
		
		/*
		 * PessoaFisica pf = new PessoaFisica(); PessoaJuridica pj = new
		 * PessoaJuridica();
		 * 
		 * pf.setCpf("123");
		 * 
		 * pj.setCnpj("900000"); pj.setRazaoSocial("Razão social");
		 * 
		 * pf.inserir();
		 * 
		 * pj.inserir();
		 */
		
	}

}
