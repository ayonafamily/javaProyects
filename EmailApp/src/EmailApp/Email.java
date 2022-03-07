package EmailApp;
import java.util.Scanner;


public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail;
	
	
	// Constructor for firstname, lastname
	
	public Email(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println(this.firstName + " " + this.lastName);
		
		//Call a method return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call a method that returns a random password
		
		
		
	}	
	
	// Ask for department

private String setDepartment() {
	System.out.println("Área de Trabajo: \n" + "Ventas: 1 \n" + "Contablidad: 2 \n" + "Desarrollo: 3 \n" );
	Scanner depa = new Scanner(System.in);	
	int x = depa.nextInt();
	if(x == 1) { return "Sales";} 
	else if(x == 2) {return "Accounting"; } 
	else if(x == 3) {return "Dev";} 
	else { return "";} 
	
	
}
	
	
	//Set mailbox capacity
	
	
	// Set alternate email
	
	
	//Change the password
	
	
	
	
}
