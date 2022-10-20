import java.util.Arrays;

public class Cone {
	protected final float[] TIPOS_TINTA = {
			238.90f,
			467.98f,
			758.34f
	};
	
	protected final float rendimento = 3.5f;
	protected final int litroLata = 18;
	protected final float PI = 3.14f;
	
	private float altura = 1f;
	private float raio = 1f;
	private int tipoTinta;
	
	Cone(float altura, float raio, int tipoTinta) {
		setAltura(altura);
		setRaio(raio);
		setTipoTinta(tipoTinta);
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		if (altura > 0) {
			this.altura = altura;
		}
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		if (raio > 0) {
			this.raio = raio;
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
	
	public float getGeratriz() {
		return (float) Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2));
	}
	
	public float getAreaTotal() {
		return PI * raio * (raio + getGeratriz());
	}
	
	public float getLitrosGastos() {
		return getAreaTotal()/rendimento;
	}
	
	public int getQtdLatas() {
		return (int) Math.ceil(getLitrosGastos()/litroLata);
	}
	
	public float getValorFinal() {
		return getQtdLatas() * TIPOS_TINTA[tipoTinta];
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cone [TIPOS_TINTA=").append(Arrays.toString(TIPOS_TINTA)).append(", rendimento=")
				.append(rendimento).append(", litroLata=").append(litroLata).append(", PI=").append(PI)
				.append(", altura=").append(altura).append(", raio=").append(raio).append(", tipoTinta=")
				.append(tipoTinta).append("]");
		return builder.toString();
	}
}
