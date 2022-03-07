package Contactos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Contactos amigoDatos = new Contactos("Luis","Paredes","Castrovirreyna 1200","Breña");
		Contactos amigoContacto = new Contactos("luchoparedes@gmail.com","99567889");

		System.out.println("Datos Personales");
		System.out.println("=================");
		System.out.print("Nombre: " + amigoDatos.getNombres() + " " + amigoDatos.getApellidos() );
		System.out.println("Dirección: " + amigoDatos.getDireccion() + " Distrito: " + amigoDatos.getDistrito() );
		
		System.out.println("");
		System.out.println("Datos Contacto");
		System.out.println("=================");
		System.out.println("Email: " + amigoContacto.getEmail() +" Celular: " + amigoContacto.getCelular());
	
		
	}

}
