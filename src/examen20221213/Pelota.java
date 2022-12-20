package examen20221213;

public class Pelota {
	
	private int x;
	private int y;
	
	
	public Pelota() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * 
	 * @param x
	 * @param y
	 */

	public Pelota(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * 
	 * @return
	 */

	public int getX() {
		return x;
	}
	
	/**
	 * 
	 * @param x
	 */

	public void setX(int x) {
		this.x = x;
	}
	/**
	 * 
	 * @return
	 */

	public int getY() {
		return y;
	}
	
	/**
	 * 
	 * @param y
	 */


	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * 
	 */


	@Override
	public String toString() {
		return "La pelota tiene una posción x: " + x + " y una posición y: " + y;
	}
	
	

}
