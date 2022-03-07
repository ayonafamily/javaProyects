package debuging;

public class Errores {

	static int[] lista1 = { 1, 2, 3, 4, 5, 6, 7, 8,9,10};
	static int suma;

	public static void main(String[] args) {

		for (int i = 0; i < lista1.length; i++) {
			suma = lista1[i] + suma;
		}
		double average = (suma / lista1.length);
		String doubleToString = Double.toString(average); 
		System.out.println("La suma es: " + suma);
		System.out.println("El numero de elementos es:  " + lista1.length);
		System.out.println("El promedio es " + doubleToString);
	}

}
