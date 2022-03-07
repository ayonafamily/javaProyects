package ticketTester;

import java.util.Scanner;

public class ticketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int times = 0;
		int entries = 0;
		int noEntries = 0;
		int age = 0;

		while (times < 5) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Ingrese la Edad: ");

			age = sc.nextInt();

			if (age >= 18) {
				System.out.println("Age " + age + ":" + "Entry");
				entries = entries + 1;
			} else {
				System.out.println("Age " + age + ":" + " No Entry");
				noEntries = noEntries + 1;
			}
			times = times + 1;
			// System.out.println(times);
		}
		System.out.println("\n" + "------------------------");
		String strI = Integer.toString(entries);
		String strII = Integer.toString(noEntries);
		
		System.out.println("\n" + "Total Admitidos: " + strI);
		System.out.println("\n" + "Total No admitidos: " + strII);
		System.out.println("\n" + "% Entradas: " + (entries) + "%");
		
	}

}
