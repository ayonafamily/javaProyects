package algoritmos;
/**
 * Práctica de Algoritmos.
 * Autor: Jorge Ayona.
 * Descripción:
 * Algoritmo que calcula el factorial de
 * un número ingresado por el usuario.
 * Importados: java.util.Scanner. * 
 */

 import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {

		Factorial f = new Factorial(); // Se crea el objeto de clase factorial

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese el número a calcular: ");
			int numero = scanner.nextInt();
			f.setNumero(numero);
		} catch (Exception e) {
			System.out.print("Ingreso Inválido!!");
			System.exit(1);			
		}
		System.out.println("El factorial es: " + f.calculoFactorial(f.getNumero()));		
	}
}
