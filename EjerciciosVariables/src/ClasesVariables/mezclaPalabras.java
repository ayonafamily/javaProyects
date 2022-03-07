/**
 * 
 */
package ClasesVariables;

/**
 * @author jorge
 *
 */
public class mezclaPalabras {

	/**
	 * @param args
	 * cadena frase 
	 * entero i (posicion del caracter 
	 */
	static String frase; 
	static int i = 0;
	
	public static void main(String[] args) {
		
		frase = "Jorge Ayona";
		char []carac = frase.toCharArray();	
				
		while(i < frase.length()) {
			System.out.println(frase.charAt(i) +" " + i++);			
		}
		
		for(int j = 0; j < frase.length(); j++) {
				System.out.println(carac[j]);	
		}
		
		String cdn = "   Bienvenidos a tinchicus.com   ";

		System.out.println("Valor original: " + cdn + ".");
		System.out.println("Valor devuelto: " + cdn.trim() + ".");
		
		System.exit(0);
	}
}
