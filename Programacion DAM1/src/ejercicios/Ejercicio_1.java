package ejercicios;

import utilitites.Utilities;

public class Ejercicio_1 {

	
	public static Character getLetra(int numero) {
		
		if(numero > 0 && numero < 100000000) {
			
			return "TRWAGMYFPDXBNJZSQVHLCKE".charAt(numero % 23);
			
		}else {
			return null;
		}	
	}
	
	public static Character getLetra(String numero) {
		
		if(numero.matches("\\d{1,8}")) {
			
			return getLetra(Integer.parseInt(numero));
			
		}else {
			return null;
		}	
	}
	
	public static Character getLetra(char[] numero) {
		
		return getLetra(String.valueOf(numero));
	}
	
	public static boolean isDni(int dni, char c) {
		
		return getLetra(dni) == Character.toUpperCase(c);
		
	}
	
	public static boolean isDni(String dni) {
		
		if(dni.matches("\\d{1,8}[a-zA-Z]{1}")) {
			
			return getLetra(Integer.parseInt(dni.substring(0, dni.length()-1))) == Character.toUpperCase(dni.charAt(dni.length()-1));
			
		}else {
			return false;
		}		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isDni(33559930,'c'));
	}

}
