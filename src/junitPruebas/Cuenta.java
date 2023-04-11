
/**
 * <h2>Clase cuenta, se utiliza para gestionar los datos de una cuenta bancaria.</h2>
 * 
 * @see <a href = "http://google.com"/>
 * @version 1-2023
 * @author Isaac
 *
 */
package junitPruebas;

/**
 * 
 * @author isaac
 *
 */
public class Cuenta {
	private String numeroCuenta;
	private float saldo;
	
	
	/**
	 * Este método crea un objeto de tipo cuenta.
	 * @param numeroCuenta String
	 * @param saldo, numeroCuenta
	 */
	public Cuenta(String numeroCuenta, float saldo) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	
	/**
	 * Este método devuelve el número de la cuenta.
	 * @return numeroCuenta
	 */
	public String getNumeroCuenta() {
		return numeroCuenta;
	}
	
	/**
	 * Este método establece el número cuenta.
	 * @param numeroCuenta String
	 */ 

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	/**
	 * Este método devuelve el saldo de la cuenta.
	 * @return saldo
	 */

	public float getSaldo() {
		return saldo;
	}
	
	/**
	 * Este método establece el saldo de la cuenta.
	 * @param saldo float
	 */

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	/**
	 * Método que suma un número dado por el usuario al saldo total.
	 * @param cantidad float
	 */

	public void ingresarDinero(float cantidad) {
		saldo += cantidad;
	}

	/**
	 * Método que resta dinero al saldo total.
	 * En el caso de que el número que le intentamos restar sea superior al saldo disponible, lanzará una excepción.
	 * @param cantidad float
	 * @throws Exception e
	 */
	public void extraerDinero(float cantidad) throws Exception {
		if (saldo - cantidad < 0) {
			throw new Exception("Saldo negativo");
		}
		saldo -= cantidad;
	}
	
	
	/**
	 * Este método muestra el número y el saldo de la cuenta.
	 */
	public void mostrarCuenta() {
		System.out.println("Número de cuenta: " + numeroCuenta);
		System.out.println("Saldo: " + saldo);
	}
	
	/**
	 * Este método devuelve si el saldo es superior a 100.
	 * @return saldo > 100
	 */

	public boolean esSaldoMayorA100() {
		return saldo > 100;
	}
	
	/**
	 * Este método pone el dinero de la cuenta a 0.
	 */

	public void resetearCuenta() {
		saldo = 0;
	}
}