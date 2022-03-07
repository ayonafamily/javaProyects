package ClasesOperadores;
/**
 * Cómputo de operaciones básicas.
 * Ingreso de datos del teclado
 * @jorge ayona
 */
import java.util.Scanner;

public class Ejercicio2 { //Inicio
	/**
	 * Declaracion de campos
	 */
	static public int variable1, variable2;	
	private static float division;
	private static float suma;
	private static float resta;
	private static float multiplicacion;
	
	public static void main(String[] args) {
		/**
		 * Se recibe entrada del teclado
		 */
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			System.out.print("Ingrese número 1   ");
			variable1 = scan.nextInt();
			
			System.out.print("Ingrese número 2   ");
			variable2 = scan.nextInt();	
			
			/**
			 * Salida del programa
			 */
			
			System.out.println("Ejercicio 2: Operadores");			
			operaciones();
			divi();
	}

	
	public static void  operaciones(){
		/**
		 * Definicion de operaciones.
		 */
		suma = variable1 + variable2;
		resta = variable1 - variable2;
		multiplicacion = variable1 * variable2;
		division = variable1 / variable2;
		
		System.out.println("La suma es: " + suma) ;
		System.out.println("La resta es: " + resta) ;
		System.out.println("La multiplicación es: " + multiplicacion) ;
	}
	
	/**
	 * Caso especial de la división
	 */
	public static void divi() {		
		//Division por zero
		if(variable2 == 0) {
			System.out.println("La división no es posible!!");
		} else {
			System.out.print("La división está redondeada al entero más proximo:   " + "Resultado: " + division);			
		}		
	}	
}//Final
	


