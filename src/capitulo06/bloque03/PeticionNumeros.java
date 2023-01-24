package capitulo06.bloque03;

import capitulo04.bloque04.Utils;

public class PeticionNumeros {
	
	public static String pideNumeroPar(int numero) throws NumeroNoParException {
		
		if (numero % 2 != 0) {
			throw new NumeroNoParException("El número no es par");
		}
		return "El número es par";
	}

	public static void main(String[] args) {
		
		try {
			System.out.println(pideNumeroPar(Utils.obtenerEnteroPorJOptionPaneConDescripcion("Introduce un número par")));
		} catch (NumeroNoParException e) {
			e.printStackTrace();
		}

	}

}
