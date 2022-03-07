package Libros;

public class Principal {

	public static void main(String[] args) {
		
		// Libro 1

		Libro libro1 = new Libro("Ricardo Palma", "Tradiciones Peruanas", 456);
		libro1.mostrarLibro(libro1.getAutor(), libro1.getTitulo(), libro1.getPaginas());

		// Libro 2

		Libro libro2 = new Libro("Homero", "La Iliada", 200);
		libro2.mostrarLibro(libro2.getAutor(), libro2.getTitulo(), libro2.getPaginas());

		System.out.println(libro1.compararLibros(libro1, libro2));

	}

}
