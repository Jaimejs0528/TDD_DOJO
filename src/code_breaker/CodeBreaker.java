package code_breaker;
import utils.*;

public class CodeBreaker {

	public String compare(String entrada, String correcto) {
		
		if(!tools.validar(entrada, correcto)) return "ERROR";
		String respuesta = "";
		for(int j=0; j<4; j++) {
			int index = correcto.indexOf(entrada.charAt(j));
			if(index == -1) continue;
			if(index == j) {
				respuesta = "X" + respuesta; 
				continue;
			}
			respuesta += "_";
		}
		return respuesta;
	}
}
