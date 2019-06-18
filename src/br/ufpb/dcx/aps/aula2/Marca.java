package br.ufpb.dcx.aps.aula2;

import java.util.ArrayList;
import java.util.List;

public class Marca {
	
	private String nome;
	
	private List<Modelo> modelos = new ArrayList<Modelo>();

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
		return modelos.size();
	}


	public int getQunatidadeVeiculos() {
		int quantidadeVeiculos = 0;
		for (Modelo modelo : modelos) {
			quantidadeVeiculos += modelo.getQunatidadeVeiculos();
			
		}
		return quantidadeVeiculos;
	}
	
	public void addModelo(Modelo modelo) {
		this.modelos.add(modelo);
	}
}
