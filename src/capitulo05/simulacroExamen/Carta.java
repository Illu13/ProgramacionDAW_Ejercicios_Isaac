package capitulo05.simulacroExamen;

public class Carta {
	private String palo;
	private int valor;
	private int id;
	
	public Carta () {
		super();
	}

	public Carta(String palo, int valor, int id) {
		super();
		this.palo = palo;
		this.valor = valor;
		this.id = id;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", valor=" + valor + ", id=" + id + "]";
	}

}
