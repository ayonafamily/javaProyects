package ClasesOperadores;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeroUno = 8;
		int numeroDos = 2;
		
		System.out.println("Ejercicio Nro. 3 - Invertir números");
		
		System.out.println("1. numeroUno: " + numeroUno + " numero2: " + numeroDos);
						
		int auxiliar = numeroUno ; //8
		numeroUno = numeroDos; //2
		numeroDos = auxiliar;
		
		System.out.println("2. numeroUno: " + numeroUno + " numero2: " + numeroDos);		

	}

}
