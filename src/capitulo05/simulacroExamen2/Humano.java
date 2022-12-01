package capitulo05.simulacroExamen2;

import capitulo04.bloque04.Utils;

public class Humano {
	
	private int vida;
	private String nombre;
	private boolean estaVivo;
	private int tirosRecibidos;
	
	
	public Humano() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Humano(int vida, String nombre, boolean estaVivo, int tirosRecibidos) {
		super();
		this.vida = vida;
		this.nombre = nombre;
		this.estaVivo = estaVivo;
		this.tirosRecibidos = tirosRecibidos;
	}




	public int getVida() {
		return vida;
	}


	public void setVida(int vida) {
		this.vida = vida;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isEstaVivo() {
		return estaVivo;
	}

	

	public void setEstaVivo(boolean estaVivo) {
		this.estaVivo = estaVivo;
	}


	public int getTirosRecibidos() {
		return tirosRecibidos;
	}


	public void setTirosRecibidos(int tirosRecibidos) {
		this.tirosRecibidos = tirosRecibidos;
	}


	@Override
	public String toString() {
		return "Humano [vida=" + vida + ", nombre=" + nombre + ", estaVivo=" + estaVivo + ", tirosRecibidos="
				+ tirosRecibidos + "]";
	}
	

}
