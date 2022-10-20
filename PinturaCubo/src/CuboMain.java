
public class CuboMain {

	public static void main(String[] args) {
		Cubo cube = new Cubo(4, 2, 1);
		
		System.out.println("Area Total: " + cube.getArea() + "m²");
		System.out.println("Litros Gastos: " + cube.getLitrosGastos());
		System.out.println("Latas Compradas: " + cube.getQuantidadeLatas());
		System.out.println("Valor Final: R$" + cube.getValorTotal());
		
		System.out.println(cube.toString());
	}

}
