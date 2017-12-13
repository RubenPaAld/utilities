package utilitites;

public class Utilities {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Integer[][] m = new Integer[8][8];
		
		//System.out.println(m[0].getClass().isArray());
		
		Utilities.imprimirMatriz(m);
	}

}
