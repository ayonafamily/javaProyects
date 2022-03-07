/* 
 * Programa para determinarel tipo
 * de vía según la velocidad
 * 
 * Autor: Jorge Ayona
 * Curso: Diplomado de Java
 * Politécnico de Colombia 
 *
 */
package Estructuras;
import java.util.Scanner;

public class LimiteVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated
		
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print ( "Ingrese velocidad: " );
			int velocidad = sc.nextInt();  
			
			if(velocidad >0 && velocidad <= 30) {
				System.out.println("Zona Escolar");
			} 
			else if(velocidad > 30 && velocidad <= 60) {
				System.out.println("Vías urbanas");
			}
			else if (velocidad >60 && velocidad <= 80) {
				System.out.println("Vías Rurales");
			}
			
			else  if (velocidad > 80 && velocidad <= 100) {
				System.out.println("Vías nacionales");
			}
			else {
				System.out.println("Esstas fuera de los límites de velocidad");
			}
		}
		
		
			
		}
			
		

	}


