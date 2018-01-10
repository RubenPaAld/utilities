package utilitites;
 
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Utilities {

	private static Scanner s = new Scanner(System.in); 
	
	public static void imprimirMatriz(Object[] m) {
		
		for (Object e: m) {

			try {
				if(e.getClass().isArray()) 
					Utilities.imprimirMatriz((Object[]) e);
				else
					System.out.print(e.toString() + "\t");
				
			}catch(java.lang.NullPointerException ex) {
			
				System.out.print("null" + "\t");
			}	
		}
		System.out.println();
	}
	
	public static boolean containsElement(Object[] m, Object e) {
		
		boolean flag = false;
		
		for (Object el: m) {

			try {
				if(el.getClass().isArray()) { 

					if (Utilities.containsElement((Object[]) el, e)) {
						flag = true;
						break;
					}
				}else {

					if (el.equals(e)) {
						flag = true;
						break;
					}
				}
			}catch(java.lang.NullPointerException ex) {}	
		}
		return flag;
	}
	
	public static void sortArrayDescent(Object[] m) { //la matriz tiene que ser rectangular
		
		if(m[0].getClass().isArray()) {
		
			for (Object e: m) {
				
				try {			
					Utilities.sortArrayDescent((Object[]) e);
					
				}catch(java.lang.NullPointerException ex) {}	
			}
		}else {
			Arrays.sort(m, Collections.reverseOrder());
		}
	}
	
	public static void sortArrayAscent(Object[] m) {
		
		if(m[0].getClass().isArray()) {
		
			for (Object e: m) {
				
				try {			
					Utilities.sortArrayAscent((Object[]) e);
					
				}catch(java.lang.NullPointerException ex) {}	
			}
		}else {
			Arrays.sort(m);
		}
	}
	
	public static int getInteger(int min, int max) {
		
		do {
			try {
				int n = Integer.parseInt(s.nextLine());
				
				if(n >= min && n <= max)
					return n;
				
			}catch(java.lang.NumberFormatException e) {}
			
			System.out.println("Inserte un numero entre " + min + " y " + max);
			
		}while(true);
	}
	
	public static int getInteger() {
		
		return Utilities.getInteger(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static double getDouble(double min, double max) {
		
		do {
			try {
				double n = Double.parseDouble(s.nextLine());
				
				if(n >= min && n <= max)
					return n;
				
			}catch(java.lang.NumberFormatException e) {}
			
			System.out.println("Inserte un numero entre " + min + " y " + max);
			
		}while(true);
	}
	
	public static double getDouble() {
		
		return Utilities.getDouble(Double.MIN_VALUE, Double.MAX_VALUE);
	}
	
	public static String getString() {
		
		return s.nextLine();
	}
	
	public static char getChar() {
		
		do {
			try {
				char c = (char) System.in.read();
				while(System.in.read() != '\n');
				return c;
			}catch(java.io.IOException e) {}
		}while(true);
	}
	
	public static boolean isDniCompleto(String dni) {
		
		if(dni.matches("\\d{1,8}[a-zA-Z]{1}"))
			
			return getLetraDni(Integer.parseInt(dni.substring(0, dni.length()-1))) == Character.toUpperCase(dni.charAt(dni.length()-1));
			
		return false;			
	}
	
	public static boolean isDniNumero(int dni) {
		
		if(dni > 0 && dni < 100000000)
			return true;
			
		return false;		
	}
	
	public static Character getLetraDni(int n) {
		
		if(n > 0 && n < 100000000) {
			
			return "TRWAGMYFPDXBNJZSQVHLCKE".charAt(n % 23);
			
		}
		return null;	
	}
	
	public static String rellenarDni(String dni) {
			
		if(dni.matches("\\d{1,8}[a-zA-Z]{1}")) {
			
			if(isDniCompleto(dni))
				return getZero(dni.substring(0, dni.length()-1)) + dni.toUpperCase();
			
		}else if(dni.matches("\\d{1,8}")) {
			
			int n = Integer.parseInt(dni);
			
			if(isDniNumero(n)) 
				return getZero(dni) + dni + getLetraDni(n);
		}	
		return null;
	}
	
	private static String getZero(String n) {
		
		String s = "";
		
		for(int i = 0; i < (8-n.length()); i++) 	
			s += "0";
			
		return s;	
	}
	
	public static void main(String[] args) {
		
		System.out.println(rellenarDni("33559930d"));

	}

}
