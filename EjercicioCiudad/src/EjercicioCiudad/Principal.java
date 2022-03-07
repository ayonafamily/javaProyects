package EjercicioCiudad;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ciudad ciudad = new Ciudad();
		ciudad.setNombre("Honjou");
		ciudad.setPoblacion(20000);
		ciudad.setPais("Japón");
		ciudad.setPresidente("Naruhito");
		
		System.out.println("La ciudad: " + ciudad.getNombre() + " pertenece a: " + ciudad.getPais() + " .Su publación es de: " + ciudad.getPoblacion() + " . Y es gobernada por: " + ciudad.getPresidente());

	}

}
