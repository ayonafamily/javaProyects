package Estructuras;

/**
 *@author jorge
 * Empleo de bucle do-while  * y un método factorial
 * Solución que permite ingreso de datos. *
 * Calcula el factorial de un número.
 */
import java.util.Scanner;


public class FactorialEjercicio {
	// Propiedad conmutativa, se invierten los términos para comenzar de 1
	public static int numero;
	public static long factor;

	public static void main(String[] args) {
		


		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese el numero: ");
			int numero = sc.nextInt();

			factorial(numero);

		} catch (Exception e) {
			System.out.println("Ingreso inválido!!!");
			System.exit(0);
		}
	}

	static void factorial(int numero) {
		factor = 1;
		if (numero < 0) {
			System.out.println("El número debe ser positivo!");
			System.exit(0);

		} else {

			do {
				factor = factor * numero;
				numero--;
				continue;
			} while (numero != 0);
			
//         return factorial;
			if (factor < 0) {
				System.out.print("Factorial Excede la capacidad\ndel procesador!!!");
			} else {
				System.out.println("El Factorial es " + factor);
			}
		}
	}
}
