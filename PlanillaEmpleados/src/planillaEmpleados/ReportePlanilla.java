package planillaEmpleados;

import java.util.Scanner;

/**
 * Programa para calcular nómina
 * 
 * @author jorge
 *
 */
public class ReportePlanilla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlanillaEmpleados x = new PlanillaEmpleados(); // Constructor por defecto.
		Scanner scan = new Scanner(System.in);

		System.out.print("Ingrese Nombres: ");
		String nombre = scan.nextLine();

		System.out.print("Ingrese Apellidos: ");
		String apellidos = scan.nextLine();

		System.out.print("Ingrese Total Horas Trabajadas: ");
		int totalHoras = scan.nextInt();

		// Setters
		x.setNombre(nombre);
		x.setApellidos(apellidos);
		x.setTotalHoras(totalHoras);
		x.setTarifaHora(15);

		// Salidas
		System.out.println("Empleado: " + x.getNombre() + " " + x.getApellidos());
		System.out.println("Total Horas trabajadas: " + x.getTotalHoras());
		System.out.println("Total a cobrar: " + x.getTarifaHora() * x.getTotalHoras());

		scan.close();

	}

}