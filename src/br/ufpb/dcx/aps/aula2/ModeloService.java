package br.ufpb.dcx.aps.aula2;

public class ModeloService extends GenericService<Modelo> {

	@Override
	public int cadastrar(Modelo modelo) {
		modelo.getMarca().novoModelo();
		return super.cadastrar(modelo);
	}

}
