package Demostraciones;

public class ExamenUno {

	public static void main(String [] args) {
		// TODO Auto-generated method stub
		
		for (int a = 1; a < 3; a+=3){
				System.out.println(--a);
			}	
		System.out.println("--------------------------" );
		int a = f(56,28);
		System.out.println(a);
		
		System.out.println("--------------------------" );
		
		char nptel [] = {'N','P','T','E','L'};
		
		System.out.println("" + nptel[0] +  nptel[nptel.length - 1]);
		
		System.out.println("--------------------------" );
		
		String str1 = "NPTEL";
		String str2 = "Java";
		
		System.out.println(str1+str2);
		
		int d = 20;
		int e = 10;
		System.out.println(d + e);
		
		for(int i = 0; i < 100; i+=10) {
			System.out.print(i);
		}
		
		System.out.println("--------------------------" );
		
		int edades[] = new int[5];
		String grupos[] = new String [5];
		boolean estados[] = new boolean [5];
		
		System.out.println(edades[2]);
		System.out.println(grupos[4]);
		System.out.println(estados[0]);		
	}
	
	
	public static int f(int x, int y) {		 
		return (x > y) ? y : x;
	}
	
		
	
}

