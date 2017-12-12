package utilitites;

public class Vector {

	public static void imprimirVectorDeEnteros(int[] v) {
		
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + "\t");
		}
	}
	
	public static void imprimirVectorBidimensionalDeEnteros(int[][] v) {
		
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[i].length; j++) {
				System.out.println(v[i][j] + "\t");	
			}
		}
	}
}
