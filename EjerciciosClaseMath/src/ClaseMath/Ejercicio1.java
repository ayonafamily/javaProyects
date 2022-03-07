package ClaseMath;

public class Ejercicio1 {
	
	public static void main(String args[]) {
	
		Potencia num = new Potencia();		
		num.setBase(10);
		num.setExponente(2);		
		
		System.out.println("la potencia es: " +  Math.pow(num.getBase(),num.getExponente()));
		
	}
}


	
	
	
	
	
	
