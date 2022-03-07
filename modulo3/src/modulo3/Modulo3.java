package modulo3;


public class Modulo3 {
	
		public static void main(String[] args) {
		Persona jorge = new Persona();
		jorge.setNombre("Jorge");
		jorge.setPais("Perú");
		jorge.setEdad(51);
		
		System.out.println("El nombre es: " + jorge.getNombre());
		System.out.println("Es de : " + jorge.getPais());
		System.out.println("Tiene " + jorge.getEdad() + " años");		
		
	}
}


