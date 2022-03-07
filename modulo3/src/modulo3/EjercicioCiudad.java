package modulo3;

/**
 * Clase EjercicioCiudad.
 * 
 * @author jorge
 *
 */
public class EjercicioCiudad {
	//Variables de instancia.
	private String nombre;
	private String alcalde;
	private String pais;
	private int poblacion;
	
	/**
	 * Getters & Setters.
	 * @return
	 */		

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getAlcalde() {
			return alcalde;
		}

		public void setAlcalde(String alcalde) {
			this.alcalde = alcalde;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}

		public int getPoblacion() {
			return poblacion;
		}

		public void setPoblacion(int poblacion) {
			this.poblacion = poblacion;
		}
	

	public static void main(String[] args) {
		
		EjercicioCiudad c = new EjercicioCiudad(); // Nueva Instancia
		c.setNombre("Lima");
		c.setPoblacion(10000000);
		c.setPais("Peru");
		c.setAlcalde("Muñoz");
		
		System.out.println("Ciudad: " + c.getNombre() +"\n" + "País: " + c.getPais());
		System.out.println("Poblacion:  "   + c.getPoblacion() + "\n"+ "Alcalde: " + c.getAlcalde());
	}
}
