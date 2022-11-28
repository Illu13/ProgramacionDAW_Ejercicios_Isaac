package capitulo05.bloque02Herencia;

public class ArticulosPerecederos extends Articulos {
	
	private String fecha;
	
	public ArticulosPerecederos() {
		super();
	}
	
	public ArticulosPerecederos(String codigo, String nombre, float precio, String fecha) {
		super(codigo, nombre, precio);
		this.fecha = fecha;
	}
	
	

	public void setFecha (String fecha) {
		this.fecha = fecha;
	}
	
	public String getFecha () {
		return fecha;
	}
	
	public String toString () {
		return "Este es el codigo: " + this.getCodigo() + " este es el nombre: " + this.getNombre() + " y este es el precio: " + this.getPrecio()
		 + " esta es la fecha de caducidad: " + fecha;
	}

}
