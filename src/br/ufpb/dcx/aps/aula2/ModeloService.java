package br.ufpb.dcx.aps.aula2;

import java.util.HashMap;
import java.util.Map;

public class ModeloService {

	private Map<Integer, Modelo> modelos = new HashMap<Integer, Modelo>();
	private int proximoId = 1;

	public int cadastrar(Modelo modelo) {
		this.modelos.put(proximoId, modelo);
		return proximoId++;

	}

	public Modelo get(int id) {
		return this.modelos.get(id);
	}

}
