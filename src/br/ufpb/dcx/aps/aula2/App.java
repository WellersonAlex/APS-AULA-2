package br.ufpb.dcx.aps.aula2;

public class App {
	
	private static GenericService<Marca> marcaService = new GenericService<Marca>();
	private static GenericService<Modelo> modeloService = new GenericService<Modelo>();
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
		
		Veiculo meuCarro = new Veiculo("Preto", 2012, gol);
		int veiculoId = veiculoService.cadastrar(meuCarro);
		Veiculo meuCarroRetornado = veiculoService.get(veiculoId);
		
		assert "Veiculo [cor=Preto, ano=2012, Modelo [nome=Gol, Marca [nome=Volkswagen]]]".equals(meuCarroRetornado.toString());
		
		Veiculo meuCarro2 = new Veiculo("Vermelho", 1990, gol);
		veiculoService.cadastrar(meuCarro2);
		
		assert 2 == gol.getQunatidadeVeiculos();
		
		Modelo voyage = new Modelo("Voyage", vw);		
		modeloService.cadastrar(voyage);
		
		Veiculo meuCarro3 = new Veiculo("Prata", 2019, voyage);
		veiculoService.cadastrar(meuCarro3);
		
		assert 3 == vw.getQunatidadeVeiculos();
		
		Marca fiat = new Marca("FIAT");
		marcaService.cadastrar(fiat);
		
		Modelo palio = new Modelo("Palio", fiat);
		modeloService.cadastrar(palio);
		
		Veiculo meuCarro4 = new Veiculo("Preto", 2018, palio);
		veiculoService.cadastrar(meuCarro4);
		
		assert 2 == marcaService.getQuantidade();
		assert 3 == modeloService.getQuantidade();
		assert 4 == veiculoService.getQuantidade();
	}

}
