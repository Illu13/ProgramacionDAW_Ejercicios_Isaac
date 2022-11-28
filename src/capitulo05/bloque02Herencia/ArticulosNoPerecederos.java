package capitulo05.bloque02Herencia;

public class ArticulosNoPerecederos extends Articulos {

	private String etiqueta;

	public ArticulosNoPerecederos() {
		super();
	}

	public ArticulosNoPerecederos(String codigo, String nombre, float precio, String etiqueta) {
		super(codigo, nombre, precio);
		this.etiqueta = etiqueta;
	}
	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String toString() {
		return "Este es el codigo: " + this.getCodigo() + " este es el nombre: " + this.getNombre() + " y este es el precio: "
				+ this.getPrecio() + " esta es la etiqueta: " + etiqueta;
	}
}
