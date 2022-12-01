package capitulo05.bloque02Herencia;

public class Articulos {
	
	private String codigo;
	private String nombre;
	private Float precio;
	
	public Articulos() {
		super();
	}
	
	public Articulos (String codigo, String nombre, Float precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public void setCodigo (String codigo) {
		this.codigo = codigo;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	
	public String getCodigo () {
		return codigo;
	}
	public String getNombre () {
		return nombre;
	}
	public Float getPrecio () {
		return precio;
	}
	
	public String toString () {
		return "Este es el codigo: " + this.codigo + " este es el nombre: " + this.nombre + " y este es el precio: " + this.precio;
	}
}
