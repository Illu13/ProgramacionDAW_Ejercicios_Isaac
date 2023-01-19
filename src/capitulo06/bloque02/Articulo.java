package capitulo06.bloque02;

public class Articulo {
	
	private int numeroEstante;
	private int cantidadStock;
	private int codigoBarras;
	
	
	public Articulo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Articulo(int codigoBarras, int cantidadStock, int numeroEstante) {
		super();
		this.codigoBarras = codigoBarras;
		this.cantidadStock = cantidadStock;
		this.numeroEstante = numeroEstante;
	}

	
	
	
	public int getCodigoBarras() {
		return codigoBarras;
	}


	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}


	public int getNumeroEstante() {
		return numeroEstante;
	}


	public void setNumeroEstante(int numeroEstante) {
		this.numeroEstante = numeroEstante;
	}


	public int getCantidadStock() {
		return cantidadStock;
	}


	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}


	@Override
	public String toString() {
		return "Hay un total de: " + cantidadStock + " en este estante: " + numeroEstante + " su código de barras es: "
				+ codigoBarras;
	}
	
	
	
	
	

}
