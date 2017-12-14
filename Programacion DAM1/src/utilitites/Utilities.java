package utilitites;

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
	
	public static boolean containsElement(Object[] m, Object e) {
		
		boolean flag = false;
		
		for (int i = 0; i < m.length; i++) {

			try {
				if(m[i].getClass().isArray()) { 
					
					if (Utilities.containsElement((Object[]) m[i], e)) {
						flag = true;
						break;
					}
				}else {
					
					if (m[i].equals(e)) {
						flag = true;
						break;
					}
				}
			}catch(java.lang.NullPointerException ex) {}	
		}
		return flag;
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
		
		do {
			try {
				char c = (char) System.in.read();
				while(System.in.read() != '\n');
				return c;
			}catch(java.io.IOException e) {
				
			}
		}while(true);
	}
	
	public static void main(String[] args) {
		
		Integer[][][] x = new Integer[8][12][13];
		
		
		
		x[7][11][12] = 9;
		
		System.out.println(Utilities.containsElement(x, 9));
	}

}
