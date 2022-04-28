package main.java.unit;

import org.hamcrest.core.IsInstanceOf;

public class Cadena {
	
private Object contenido;
	
	
	public Cadena(Object contenido) {
		this.contenido = contenido;
	}
	
	
	
	public boolean esAnagrama() {
		
		boolean anagrama = false;
		if (this.contenido instanceof String) {
			String content = (String) contenido;
			/*Se cambia el lamda por un if*/
			if(content!=null && !content.isEmpty()	&& !content.trim().isEmpty()) {
				anagrama = true;
				for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
					if(!Character.isAlphabetic(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
						anagrama = false;
					}
				}
		
			}
		}		
		return anagrama;
		
	}
	
	public boolean esAnagrama(String cadena) {
		
		boolean anagrama = false;
		//String content = cadena instanceof String? (String) cadena: null;
		/*cambio de content por cadena que se le pasa*/
		if(cadena!=null && !cadena.isEmpty() && !cadena.trim().isEmpty()) {
			anagrama = true;
			for(int i=0; i<Integer.valueOf(cadena.length()/2); i++) {
				if(!Character.isAlphabetic(cadena.charAt(i)) || cadena.charAt(i)!=cadena.charAt(cadena.length()-i-1)) {
					anagrama = false;
				}
			}
		}
		return anagrama;
		
	}
	
	
	public boolean esCapicua() {
		
		String content = this.contenido instanceof Integer? String.valueOf(this.contenido): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
	
	public boolean esCapicua(Integer numero) {
		
		String content = numero instanceof Integer? String.valueOf(numero): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
	
	public boolean esCapicua(Long numero) {
		
		String content = numero instanceof Long? String.valueOf(numero): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}
	
	
	
	public boolean esCapicua(Double numero) {
		
		String content = numero instanceof Double? String.valueOf(numero): null;
		boolean capicua = content!=null && !content.isEmpty() && !content.trim().isEmpty();
		
		if(capicua) {

			for(int i=0; i<Integer.valueOf(content.length()/2); i++) {
				if(!Character.isDigit(content.charAt(i)) || content.charAt(i)!=content.charAt(content.length()-i-1)) {
					capicua = false;
				}
			}
		}
		return capicua;
		
	}

}
