package Libros;

/**
 * Clase para ingresar libros
 * 
 * @author jorge
 *
 */
public class Libro {
	/**
	 * Variables de instancia
	 */
	private String autor;
	private String titulo;
	private int paginas;

	/**
	 * @param autor
	 * @param titulo
	 * @param paginas
	 */
	public Libro(String autor, String titulo, int paginas) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.paginas = paginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void mostrarLibro(String autor, String titulo, int paginas) {
		System.out.println("El libro " + titulo + ", del autor: " + autor + " tiene " + paginas + " páginas.");
	}

	// Clase Libro, instancia libro1
	public String compararLibros(Libro libro1, Libro libro2) {
		if (libro1.getPaginas() > libro2.getPaginas())
			return libro1.getTitulo() + " Tiene más páginas ";
		else
			return libro2.getTitulo() + " tiene más páginas";

	}

}
