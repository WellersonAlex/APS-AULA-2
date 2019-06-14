package br.ufpb.dcx.aps.aula2;

public class Marca {
	
	private String nome;
	private int quantidadeModelos = 0;

	public Marca(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Marca [nome=" + nome + "]";
	}

	public int getQunatidadeModelos() {
		return quantidadeModelos;
	}

	public void novoModelo() {
		quantidadeModelos++;
		
	}

}
