package br.ufpb.dcx.aps.aula2;

public class App {
	
	private static GenericService<Marca> marcaService = new GenericService<Marca>();
	private static ModeloService modeloService = new ModeloService();
	private static GenericService<Veiculo> veiculoService = new GenericService<Veiculo>();
	
	public static void main(String [] args) {
		Marca vw = new Marca("Volkswagen");
		int vwId = marcaService.cadastrar(vw);
		Marca vwRetornada = marcaService.get(vwId);
		
		assert "Marca [nome=Volkswagen]".equals(vwRetornada.toString());

		Modelo gol = new Modelo("Gol", vw);		
		int golId = modeloService.cadastrar(gol);
		Modelo golRetornado = modeloService.get(golId);
		
		assert "Modelo [nome=Gol, Marca [nome=Volkswagen]]".equals(golRetornado.toString());
		
		assert 1 == vw.getQunatidadeModelos();
		
		Veiculo veiculo = new Veiculo("Preto", 2012, gol);
		int veiculoId = veiculoService.cadastrar(veiculo);
		Veiculo veiculoRetornado = veiculoService.get(veiculoId);
		
		assert "Veiculo [cor=Preto, ano=2012, Modelo [nome=Gol, Marca [nome=Volkswagen]]]".equals(veiculoRetornado.toString());
	}

}
