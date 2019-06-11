package br.ufpb.dcx.aps.aula2;

public class App {
	
	private static MarcaService marcaService = new MarcaService();
	
	public static void main(String [] args) {
		
		Marca vw = new Marca("Volkswagen");
		
		int vwId = marcaService.cadastrar(vw);
		
		Marca vwRetornada = marcaService.get(vwId);
		
		System.out.println(vw);
		
	}

}
