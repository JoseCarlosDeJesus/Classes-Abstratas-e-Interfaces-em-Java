package br.com.pc2.semana7;

public class PessoaJuridica extends Cliente {
	private String cnpj;
	private String inscricaoEstadual;
	private String razaoSocial;

	public PessoaJuridica(Integer codigo, String nome, String endereco, String uf, String cep, String cnpj,
			String inscricaoEstadual, String razaoSocial) {
		super(codigo, nome, endereco, uf, cep);
		this.cnpj = cnpj;
		this.inscricaoEstadual = inscricaoEstadual;
		this.razaoSocial = razaoSocial;
	}

	@Override
	public void inserir() {
		System.out.println("Inserindo pessoa fisica: " + this.cnpj + "\n" + this.razaoSocial);

	}

	@Override
	public void alterar() {
		// TODO Auto-generated method stub

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
