package Casa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Inmobiliaria Cosmos");
		System.out.println("---------------------");
		Casa casa = new Casa("Lima", "Pueblo Libre", "Blanco");
		System.out.println("Ciudad: " + casa.getCiudad());
		System.out.println("Barrio: " + casa.getBarrio());
		System.out.println("Color: " + casa.getColor());

		Casa casa1 = new Casa(3, 7, 1, 3);
		System.out.println("Pisos: " + casa1.getPisos());
		System.out.println("Habitaciones: " + casa1.getHabitaciones());
		System.out.println("Baños: " + casa1.getBanos());
		System.out.println("Cocinas: " + casa1.getCocinas());
	}

}
