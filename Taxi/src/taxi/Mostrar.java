package taxi;

public class Mostrar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi bocho = new Taxi();

		bocho.setMarca("Volkswagen");
		bocho.setDistrito("Pueblo Libre");
		bocho.setCiudad("Lima");
		bocho.setMatricula("34EER");
		bocho.setTipoMotor(2);
		
		System.out.println("    Ficha De Taxi");
		System.out.println("----------------------");

		System.out.println(bocho.getMarca() + "\n" + bocho.getDistrito() + "\n" + bocho.getCiudad() + "\n" + bocho.getMatricula() + "\n"
				+ bocho.motor(bocho.getTipoMotor()));

	}

}
