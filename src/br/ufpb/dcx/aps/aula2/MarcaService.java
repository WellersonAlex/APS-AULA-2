package br.ufpb.dcx.aps.aula2;

import java.util.HashMap;
import java.util.Map;

public class MarcaService {
	
	private Map<Integer, Marca> marcas = new HashMap<Integer, Marca>();
	private int proximoId = 1;
	
	public int cadastrar(Marca marca) {
		this.marcas.put(proximoId, marca);
		return proximoId++;
		
	}

	public Marca get(int id) {
		return this.marcas.get(id);
	}

}
