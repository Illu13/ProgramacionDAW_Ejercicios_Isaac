package capitulo06.bloque03;

import java.util.StringTokenizer;

import capitulo04.bloque04.Utils;

public class BombillaFrase {

	public static String comprobacionesFrase(String str)
			throws FraseSinPalabrasException, FrasesCortasException, NoBombillaException, PalabrasOfensivasException {

		StringTokenizer st = new StringTokenizer(str);

		int comprobacion = str.indexOf("bombilla");
		int comprobacionPM = str.indexOf("tonto");
		int comprobacionPM2 = str.indexOf("tonta");
		int comprobacionPM3 = str.indexOf("idiota");
		
		if (str.isBlank() == true) {
			throw new FraseSinPalabrasException("La frase no tiene palabras");
		}
		if (comprobacion == -1) {
			throw new NoBombillaException("La frase no contiene la palabra bombilla.");
		}

		if (st.countTokens() < 3) {
			throw new FrasesCortasException("La frase es demasiado corta");
		}

		if (comprobacionPM != -1 | comprobacionPM2 != -1 | comprobacionPM3 != -1) {
			throw new PalabrasOfensivasException("La frase contiene palabras malsonantes.");
		}
		

		return "La frase es correcta";
	}

	public static void main(String[] args) {
		String str;

		str = Utils.obtenerStringPorJOptionPaneConDescripcion("Introduzca una frase con la palabra bombilla");

		StringTokenizer st = new StringTokenizer(str);

		try {
			System.out.println(comprobacionesFrase(str));
		} catch (FraseSinPalabrasException e) {
			e.printStackTrace();
			System.out.println("La frase solo tiene un espacio en blanco.");

		} catch (FrasesCortasException e) {
			System.out.println("La frase tiene pocas palabras.");
			e.printStackTrace();

		} catch (NoBombillaException e) {
			e.printStackTrace();
			System.out.println("No está la palabra pedida.");

		} catch (PalabrasOfensivasException e) {
			e.printStackTrace();
			System.out.println("La frase contiene palabras malsonantes.");

		}

	}

}
