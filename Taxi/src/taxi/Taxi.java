package taxi;

/**
 * @author jorge
 *
 */
public class Taxi {

	/* Ejemplo - aprenderaprogramar.com */

	// Esta clase representa un taxi. -- > Comentario general que puede incluir:
	// cometido, autor, versión, etc…

	// El nombre de la clase

	private String marca;

	private String ciudad; // Ciudad de cada objeto taxi

	private String matricula; // Matrícula de cada objeto taxi

	private String distrito; // Distrito asignado a cada objeto taxi

	private int tipoMotor;

	public String getMarca() {
		return "Marca: " + marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCiudad() {
		return "ciudad :" + ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getMatricula() {
		return "Placa: " + matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getDistrito() {
		return "Distrito: " + distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public int getTipoMotor() {
		return tipoMotor;
	}

	public void setTipoMotor(int tipoMotor) {
		this.tipoMotor = tipoMotor;
	} // tipo de motor asignado a cada objeto taxi. 0 = desconocido, 1 = gasolina, 2 =
		// diesel

	public String motor(int tipoMotor) {
		String motor;
		switch (tipoMotor) {
		case 0:
			motor = "Diesel";
			break;
		case 1:
			motor = "Gasolina";
			break;
		case 2:
			motor = "GLV";
			break;
		case 3:
			motor = "Eléctrico";
			break;
		default:
			motor = "Desconocido";
			break;

		}
		return "Motor: " + motor;
	}

}