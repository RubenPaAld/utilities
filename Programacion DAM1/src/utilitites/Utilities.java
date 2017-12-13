package utilitites;

import java.io.IOException;
import java.util.Scanner;

public class Utilities {

	private static Scanner s = new Scanner(System.in); 
	
	public static void imprimirMatriz(Object[] m) {
		
		for (int i = 0; i < m.length; i++) {

			try {
				if(m[i].getClass().isArray()) 
					Utilities.imprimirMatriz((Object[]) m[i]);
				else
					System.out.print(m[i] + "\t");
				
			}catch(java.lang.NullPointerException e) {
			
				System.out.print("null" + "\t");
			}	
		}
		System.out.println();
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
	
	public static double getdouble(double min, double max) {
		
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
		
		return Utilities.getdouble(Double.MIN_VALUE, Double.MAX_VALUE);
	}
	
	public static String getString() {
		
		return s.nextLine();
	}
	
	public static char getChar() {
		
		try {
			char c = (char) System.in.read();
			while(System.in.read() != '\n');
			return c;
		}catch(java.io.IOException e) {
			return ' ';
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(Utilities.getDouble());
		System.out.println(Utilities.getDouble());
	}

}
