package utilitites;

import java.io.IOException;
import java.util.Scanner;

public class Vector {
	
	private static Scanner s = new Scanner(System.in);

	public static void imprimirVector(int[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\t");
		}
	}
	
	public static void imprimirVector(char[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\t");
		}
	}
	
	public static void imprimirVector(float[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\t");
		}
	}
	
	public static void imprimirVector(double[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\t");
		}
	}
	
	public static void imprimirVector(long[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\t");
		}
	}
	
	public static void imprimirVector(String[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\t");
		}
	}
	
	public static void imprimirVectorBidimensiona(int[][] v) {
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.println(v[i][j] + "\t");	
			}
		}
	}
	
	public static void imprimirVectorBidimensional(char[][] v) {
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.println(v[i][j] + "\t");	
			}
		}
	}
	
	public static void imprimirVectorBidimensional(float[][] v) {
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.println(v[i][j] + "\t");	
			}
		}
	}
	
	public static void imprimirVectorBidimensional(double[][] v) {
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.println(v[i][j] + "\t");	
			}
		}
	}
	
	public static void imprimirVectorBidimensional(long[][] v) {
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.println(v[i][j] + "\t");	
			}
		}
	}
	
	public static void imprimirVectorBidimensional(String[][] v) {
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.println(v[i][j] + "\t");	
			}
		}
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
		
		System.out.println(getChar());
		System.out.println(getChar());
	}
}
