
public class ConeMain {

	public static void main(String[] args) {
		Cone con = new Cone(6, 8, 1);
		
		System.out.println("Area Total: " + con.getAreaTotal());
		System.out.println("Litros Gastos: " + con.getLitrosGastos());
		System.out.println("Quantidade de Latas: " + con.getQtdLatas());
		System.out.println("Valor Total: " + con.getValorFinal());
		
		System.out.println(con.toString());
	}

}
