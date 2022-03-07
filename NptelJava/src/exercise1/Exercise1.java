package exercise1;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  try (Scanner s = new Scanner(System.in)) {
		  System.out.print("Enter radius: "); double radius = s.nextDouble(); double
		  perimeter; double area;
		  
		  if (radius <= 0) { System.out.println("please enter a non-zero value");
		  
		  } else { perimeter = (radius * 2) * Math.PI;
		  
		  area = Math.PI * Math.pow(radius, 2); System.out.println("Perimeter: " +
		  perimeter); System.out.println("Area: " + area); }
		  
		 
		Scanner scan = new Scanner(System.in);

		
		  System.out.print("Ingrese x: "); int x = scan.nextInt();
		  System.out.print("Ingrese y: "); int y = scan.nextInt();
		  System.out.print("Ingrese z: "); int z = scan.nextInt(); int result = 0;
		  
		  if (x > y && x > z) { result = x; } else if (y > x && y > z) { result = y; }
		  else if (z > x && z > y) { result = z; }
		  
		  System.out.println("El mayor es: " +result);
		 

		System.out.println("Ingrese numero: ");
		int n = s.nextInt();
		int sum = 0;

		for (int i = 0; i <= n; i += 2) { // lista "n" números pares
			
			if (i % 3 == 0) { // Elige si son divisibles por 3
				System.out.println(i);
				sum = sum + i;
				continue;
			}
		}

		System.out.print("La suma: " + sum);

	}
}
}
