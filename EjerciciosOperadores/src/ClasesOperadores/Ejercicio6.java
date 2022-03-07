package ClasesOperadores;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cuadrado
		int ladoCuadrado = 8;		
		int areaCuadrado = (int) Math.pow(ladoCuadrado, 2);
		int perimetroCuadrado = ladoCuadrado * 4;
		
		// Triángulo
		int baseTriangulo = 9;
		int alturaTriangulo = 8;		
		int ladoUnoTriangulo = 8;
		int ladoDosTriangulo = 8;
		int ladoTresTriangulo= 8;
		
		int perimetroTriangulo = ladoUnoTriangulo + ladoDosTriangulo + ladoTresTriangulo;
		
		double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2 ;
		
		
	//-----------------------------------------------------	
		System.out.println("Ejercicio 6\n");
		System.out.println("Cuadrado");
		System.out.println("Area Cuadrado: " + areaCuadrado);
		System.out.println("Perímetro Cuadrado: " + perimetroCuadrado);
		
		System.out.println("\nTriangulo");
		
		System.out.println("Área Triángulo: " + areaTriangulo);
		System.out.println("Perímetro Triángulo: " + perimetroTriangulo);
		
		

	}

}
