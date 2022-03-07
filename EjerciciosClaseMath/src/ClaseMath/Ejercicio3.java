package ClaseMath;

public class Ejercicio3 {
	
	public static void main(String args[]) {
		
		double promedio;
	
	double nota1 = Math.floor(10 * Math.random());
	double nota2 = Math.floor(10 * Math.random());
	
	promedio = Math.round(nota1 + nota2) / 2;
	
	System.out.println("Las notas son: " +" "+ nota1 + "  " + nota2);
	System.out.println("El promedio es: " + promedio);
	System.out.println("Nota Máxima: " +  Math.max(nota1, nota2));
	
	
	}

}
