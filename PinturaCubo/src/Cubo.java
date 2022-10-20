import java.util.Arrays;

public class Cubo {
	
	protected final float[] TIPOS_TINTA = {
			101.90f,
			212.45f,
			345,56f
	};
	
	protected final int LITRO_POR_LATA = 18;
	
	private int l = 1;
	private int metrosQuadradosPorLitro = 1;
	private int tipoTinta = 0;
	
	Cubo(int l, int metrosPorLitro, int tipoTinta) {
		setL(l);
		setTipoTinta(tipoTinta);
		setMetrosQuadradosPorLitro(metrosPorLitro);
	}

	public int getL() {
		return l;
	}

	public void setL(int l) {
		if (l > 0) {
			this.l = l;
		}
	}

	public int getMetrosPorLitro() {
		return metrosQuadradosPorLitro;
	}

	public void setMetrosQuadradosPorLitro(int metrosQuadradosPorLitro) {
		if (metrosQuadradosPorLitro > 0) {
			this.metrosQuadradosPorLitro = metrosQuadradosPorLitro;
		}
	}

	public int getTipoTinta() {
		return tipoTinta;
	}

	public void setTipoTinta(int tipoTinta) {
		if (tipoTinta >= 1 && tipoTinta <=3) {
			this.tipoTinta = tipoTinta - 1;
		}
		
	}
	
	public int getArea() {
		return l*l*6;
	}
	
	public float getLitrosGastos() {
		return getArea()/metrosQuadradosPorLitro;
	}
	
	public int getQuantidadeLatas() {
		return (int) Math.ceil(getLitrosGastos()/LITRO_POR_LATA);
	}
	
	public float getValorTotal() {
		return getQuantidadeLatas() * TIPOS_TINTA[tipoTinta];
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cubo [TIPOS_TINTA=");
		builder.append(Arrays.toString(TIPOS_TINTA));
		builder.append(", LITRO_POR_LATA=");
		builder.append(LITRO_POR_LATA);
		builder.append(", l=");
		builder.append(l);
		builder.append(", metrosQuadradosPorLitro=");
		builder.append(metrosQuadradosPorLitro);
		builder.append(", tipoTinta=");
		builder.append(tipoTinta);
		builder.append("]");
		return builder.toString();
	}
	
}
