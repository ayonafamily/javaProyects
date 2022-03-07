package algoritmos;

/**
 * Práctica de Algoritmos.
 * Autor: Jorge Ayona.
 * Descripción:
 * Algoritmo que calcula el factorial de
 * un número ingresado por el usuario.
 * Importados: java.util.Scanner. * 
 */

public class Factorial {
	// Variables de instancia
	int factorial;
	private int numero;

	// Devuelve el número ingresado
	public int getNumero() {
		return numero;
	}

	// Define el número
	public void setNumero(int numero) {
		this.numero = numero;
	}

	// Cálculo del factorial
	public int calculoFactorial(int numero) {

		int contador = 1; //Contador
		factorial = 1; //Acumulador

		do {
			factorial = factorial * (numero - contador);
			contador++;
			continue;
		} while (numero - contador != 0);
		return factorial * numero;
	}
}
