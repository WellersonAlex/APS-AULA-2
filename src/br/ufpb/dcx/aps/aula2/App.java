package br.ufpb.dcx.aps.aula2;

public class App {
	
	private static MarcaService marcaService = new MarcaService();
	private static ModeloService modeloService = new ModeloService();
	
	public static void main(String [] args) {
		
		Marca vw = new Marca("Volkswagen");
		
		int vwId = marcaService.cadastrar(vw);
		
		Marca vwRetornada = marcaService.get(vwId);
		
		System.out.println(vwRetornada);
		
		Modelo gol = new Modelo("Gol", vw);
		
		int golId = modeloService.cadastrar(gol);
		
		Modelo golRetornado = modeloService.get(golId);
		
		System.out.println(golRetornado);
		
	}

}
