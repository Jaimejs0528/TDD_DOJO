package utils;

public class tools {
	public static boolean validar_formato(String entrada) {
		try {
			Integer.parseInt(entrada);
			return  true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	
	public static boolean tiene_numeros_repetidos(String numero) {
		for(int i=0; i<3; i++) {
			for(int j=i+1; j<4; j++) {
				if(numero.charAt(i)==numero.charAt(j)) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean validar_longitud(String numero) {
		return numero.length() == 4;
	}
	
	public static boolean validar (String entrada, String correcto) {

		boolean r = validar_formato(entrada) && validar_formato(correcto);
		r = r && validar_longitud(entrada) && validar_longitud(correcto);
		return r && !tiene_numeros_repetidos(entrada) && !tiene_numeros_repetidos(correcto);
	}
}
