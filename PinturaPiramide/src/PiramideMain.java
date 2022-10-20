
public class PiramideMain {
	
	public static void main(String args[]) {
		Piramide piram = new Piramide(41.87f,13.89f, 3);
		
		System.out.println("H: " + piram.getH());
		System.out.println("AB: " + piram.getAb());
		System.out.println("Tipo de Tinta: " + (piram.getTipoTinta() + 1));
		System.out.println("Geratriz: " + piram.getGeratriz());
		System.out.println("Area do Triangulo: " + piram.getAreaTriangulo());
		System.out.println("Area da Base: " + piram.getAreaBase());
		System.out.println("Area Total: " + piram.getAreaTotal());
		System.out.println("Litros: " + piram.getLitrosGastos());
		System.out.println("Latas: " + piram.getLatas());
		System.out.println("Preco: " + piram.getValorFinal());
		System.out.println("Vaolume: " + piram.getVolume());
		
		System.out.println(piram.toString());
	}

}
