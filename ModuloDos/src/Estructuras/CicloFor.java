package Estructuras;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CicloFor {

	public static int factor, num,numero;

	public static void main(String[] args) {
		
		factor = 1;
		num = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Ingrese el numero: ");
			numero = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Ingreso inválido!!!");
			System.out.println("");
			System.exit(0);
		}
			
			// Uso del ciclo for, conocemos el número de iteraciones	
		
			for (num = numero; num != 0; num--) {
				factor = factor * num;
			}
		
		System.out.println("El factorial es: " + factor);

	}
}