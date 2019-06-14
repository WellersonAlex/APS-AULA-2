package br.ufpb.dcx.aps.aula2;

import java.util.HashMap;
import java.util.Map;

public class GenericService<T> {
	
	protected int proximoId = 1;
	
	protected Map<Integer, T> itens = new HashMap<Integer, T>();
	
	public T get(int id) {
		return this.itens.get(id);
	}
	
	public int cadastrar(T t) {
		this.itens.put(proximoId, t);
		return proximoId++;
		
	}
}
