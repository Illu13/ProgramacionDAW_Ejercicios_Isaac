package capitulo05.simulacroExamen03;

import capitulo04.bloque04.Utils;

public class Platos {

	private int id;
	private int suciedad;
	private int dureza;
	private int suciedadReal;
	private boolean roto;
	
	public Platos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Platos(int id, int suciedad, int dureza, int suciedadReal, boolean roto) {
		super();
		this.id = id;
		this.suciedad = suciedad;
		this.dureza = dureza;
		this.suciedadReal = suciedadReal;
		this.roto = roto;
	}

	public boolean isRoto() {
		return roto;
	}

	public void setRoto(boolean roto) {
		this.roto = roto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSuciedad() {
		return suciedad;
	}

	public void setSuciedad(int suciedad) {
		this.suciedad = suciedad;
	}

	public int getDureza() {
		return dureza;
	}

	public void setDureza(int dureza) {
		this.dureza = dureza;
	}

	public int getSuciedadReal() {
		return suciedadReal;
	}

	public void setSuciedadReal(int suciedadReal) {
		this.suciedadReal = suciedadReal;
	}

	@Override
	public String toString() {
		return "Este es el plato " + id + ", tiene este porcentaje de suciedad:" + suciedad + ", con esta dureza: " + dureza + ", así que la suciedad real es: " + suciedadReal + " y está roto: " + roto;
	}
	
	
	
	

}
