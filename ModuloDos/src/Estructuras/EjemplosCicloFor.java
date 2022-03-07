package Estructuras;

public class EjemplosCicloFor {

	public static void main(String[] args) {
				
		//Calcular Numeros pares
		int i = 0;
		System.out.println("Método 1");
		for(; i <=20;  i++ ) { 
			if (i % 2 == 0) {
				System.out.print(i + " ");
				continue;
			}
		}
		
		
		int j = 0;
		System.out.println("\nMétodo 2");
		for( ; j <= 20; System.out.print(j + " "), j = j + 2);

	}
	
	//------------------------------------------------------
	
	

}
