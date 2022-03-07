package Casa;

public class Casa {
	private String ciudad;
	private String barrio;
	private String color;
	private int pisos = 0;
	private int habitaciones = 0;
	private int banos = 0;
	private int cocinas = 0;

	public Casa(String ciudad, String barrio, String color) {
		super();
		this.ciudad = ciudad;
		this.barrio = barrio;
		this.color = color;
	}

	public Casa(int pisos, int habitaciones, int banos, int cocinas) {
		super();
		this.pisos = pisos;
		this.habitaciones = habitaciones;
		this.banos = banos;
		this.cocinas = cocinas;
	}

	/*---------------------*/

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getBarrio() {
		return barrio;

	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPisos() {
		return pisos;
	}

	public void setPisos(int pisos) {
		this.pisos = pisos;
	}

	public int getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	public int getBanos() {
		return banos;
	}

	public void setBanos(int banos) {
		this.banos = banos;
	}
	
	public int getCocinas() {
		return cocinas;
	}
	
	
	public void setCocinas(int cocinas) {
		this.cocinas = cocinas;
	}

}