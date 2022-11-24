package capitulo05.bloque01;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private int telefono;
	
//	Método constructor sin argumentos de entrada.
	public Persona () {
		
	}
	
//	Método constructor con argumentos de entrada.
	public Persona (String nombre, String apellidos, String dni, String direccion, int telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public void setNombre (String nombre){
		this.nombre = nombre;
	}
	public void setApellidos (String apellidos) {
		this.apellidos = apellidos;
	}
	public void setDni (String dni) {
		this.dni = dni;
	}
	public void setDireccion (String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono (int telefono) {
		this.telefono = telefono;
	}
	public String getNombre () {
		return this.nombre;
	}
	public String getApellidos () {
		return this.apellidos;
	}
	public String getDni () {
		return this.dni;
	}
	public String getDireccion () {
		return this.direccion;
	}
	public int getTelefono () {
		return this.telefono;
	}
	public String toString () {
		return "La persona se llama " + this.nombre + " se apellida " + this.apellidos + " tiene este DNI " + this.dni
				+ " vive en " + this.direccion + " tiene este teléfono " + this.telefono;
	}
}
