package utilitites;

import java.io.IOException;
import java.util.Scanner;

public class Vector {
	
	private static Scanner s = new Scanner(System.in);

	public static void imprimirVector(Object[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i].toString() + "\t");
		}
	}
	
	public static void imprimirVectorBidimensional(Object[][] v) {
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.println(v[i][j].toString() + "\t");	
			}
		}
	}
	
	public static boolean arrayContainsElement(Object[] v, Object e) {
		
		for (int i = 0; i < v.length; i++) {
			
			if(v[i].equals(e))
				return true;
		}
		return false;
	}
	
	public static int getEntero(int min, int max) {

		do {		
			try {		
				int n = Integer.parseInt(s.nextLine());
				
				if(n >= min && n <= max)
					return n;
				else
					System.out.println("Inserte un numero valido entre " + min + " y " + max);
			}catch(java.lang.NumberFormatException e) {
				System.out.println("Inserte un numero valido entre " + min + " y " + max);	
			}			
		}while(true);
	}
	
	public static String getString() {

		return s.nextLine();
	}
	
	public static char getChar() {
		
		try {
			char c = (char) System.in.read();
			while(System.in.read() != '\n');
			return c;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ' ';
	}
	
	public static void main(String[] args) {
		
		Integer[] x = {1,2,3};
		
		System.out.println(Vector.arrayContainsElement(x, 2));
	}
}
