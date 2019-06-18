package br.ufpb.dcx.aps.aula2;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
	
	private String nome;
	private Marca marca;
	
	private List<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public Modelo(String nome, Marca marca) {
		this.nome = nome;
		this.marca = marca;
		marca.addModelo(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Modelo [nome=" + nome + ", " + marca + "]";
	}
	

	public int getQunatidadeVeiculos() {
		return veiculos.size();
	}

	public void addVeiculo(Veiculo veiculo) {
		this.veiculos.add(veiculo);
	}

}
