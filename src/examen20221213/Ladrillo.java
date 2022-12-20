package examen20221213;

import capitulo04.bloque04.Utils;

public class Ladrillo {
	
	private int ordenMuerte;
	private int x;
	private int y;
	private int ancho;
	private int alto;
	private String color;
	private int puntosVida;
	private boolean roto;
	
	
	public Ladrillo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ladrillo(int ordenMuerte, int x, int y, int ancho, int alto, String color, int puntosVida, boolean roto) {
		super();
		x = Utils.obtenerNumeroAzar(0, 800);
		
		this.ordenMuerte = ordenMuerte;
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.puntosVida = puntosVida;
		this.roto = roto;
		
	}


	public boolean isRoto() {
		return roto;
	}


	public void setRoto(boolean roto) {
		this.roto = roto;
	}


	public int getOrdenMuerte() {
		return ordenMuerte;
	}


	public void setOrdenMuerte(int ordenMuerte) {
		this.ordenMuerte = ordenMuerte;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int getAncho() {
		return ancho;
	}


	public void setAncho(int ancho) {
		this.ancho = ancho;
	}


	public int getAlto() {
		return alto;
	}


	public void setAlto(int alto) {
		this.alto = alto;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getPuntosVida() {
		return puntosVida;
	}


	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}


	@Override
	public String toString() {
		return "Ladrillo [ordenMuerte=" + ordenMuerte + ", x=" + x + ", y=" + y + ", ancho=" + ancho + ", alto=" + alto
				+ ", color=" + color + ", puntosVida=" + puntosVida + " roto=" + roto + "]";
	}
	
	

}
