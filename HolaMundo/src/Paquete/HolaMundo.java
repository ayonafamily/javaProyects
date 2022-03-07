package Paquete;
import java.util.Scanner;


public class HolaMundo {
	
	public static void main(String args[]) {
		
		String user = "jayona";
		
		try (Scanner myObj = new Scanner(System.in)) {
			System.out.println("Enter username: ");

			String userName = myObj.nextLine();  // Read user input
			
			System.out.println("Username is: " + userName);  // Output user input
			
			if(userName == user) {	    	
				System.out.println("Acceso concedido");	    	
			} else {	    	
				System.out.println("Acceso denegado");	    	
			}
		}
		
	}

}
