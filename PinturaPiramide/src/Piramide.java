import java.util.Arrays;

public class Piramide {
	
	protected final float[] TIPOS_TINTAS = {
			127.9f, 258.98f, 344.34f
	};
	
	protected final float RENDIMENTO = 4.76f;
	
	protected final int LATA_LITROS = 18;
	
	private float h = 1f;
	
	private float ab = 1f;
	
	private int tipoTinta = 0;
	
	Piramide(float h, float ab, int tipoTinta) {
		setH(h);
		setAb(ab);
		setTipoTinta(tipoTinta);
	}

	public float getH() {
		return h;
	}

	public void setH(float h) {
		if (h > 0) {
			this.h = h;
		}
	}

	public float getAb() {
		return ab;
	}

	public void setAb(float ab) {
		if (ab > 0) {
			this.ab = ab;
		}
	}

	public int getTipoTinta() {
		return tipoTinta;
	}

	public void setTipoTinta(int tipoTinta) {
		if (tipoTinta >=1 && tipoTinta <= 3) {
			this.tipoTinta = tipoTinta - 1;
		}
	}
	
	public float getGeratriz() {
		return (float) Math.sqrt(Math.pow(getH(), 2) + Math.pow(getAb(), 2));
	}
	
	public float getAreaTriangulo() {
		return getAb()*getH();
	}
	
	public float getAreaBase() {
		return (float) Math.pow(ab*2, 2);
	}
	
	public float getAreaTotal() {
		return getAreaTriangulo() * 4 + getAreaBase();
	}
	
	public float getLitrosGastos() {
		return getAreaTotal() / RENDIMENTO;
	}
	
	public int getLatas() {
		return (int) Math.ceil(getLitrosGastos()/LATA_LITROS);
	}
	
	public float getValorFinal() {
		return getLatas() * TIPOS_TINTAS[tipoTinta];
	}
	
	public float getVolume() {
		return getAb() * 2 * getH() / 3;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piramide [TIPOS_TINTAS=").append(Arrays.toString(TIPOS_TINTAS)).append(", RENDIMENTO=")
				.append(RENDIMENTO).append(", LATA_LITROS=").append(LATA_LITROS).append(", h=").append(h)
				.append(", ab=").append(ab).append(", tipoTinta=").append(tipoTinta).append("]");
		return builder.toString();
	}
	
}
