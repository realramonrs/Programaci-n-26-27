package introTema6;

import java.io.IO;

public class TestCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente c1 = new Cliente();
		
		System.out.println("Introduzca los datos del cliente: ");
		String dni = IO.readln("Introduzca el DNI: ");
		c1.setDni(dni);
		
		c1.setEmail(IO.readln("Introduzca el email: "));
		c1.setNombre(IO.readln("Introduzca el nombre: "));
		c1.setTelefono(IO.readln("Intro teléfono: "));
		
		System.out.println("Cliente introducido: ");
		System.out.println(c1);
	}

}
