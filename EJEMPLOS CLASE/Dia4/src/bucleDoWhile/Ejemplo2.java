package bucleDoWhile;

import java.io.IO;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa que solicita número de teléfon móvil con el formato
		// +dd-dddddddd
		
		String telefono;
		boolean error = false;
		int intentos = 0;
		do {
			 error = false; //El teléfono es ok
			telefono = IO.readln("Intro telefono con extension +dd-dddddddd");
			
			//Vamos a verificar que tiene extensión
			String extension = telefono.substring(0,4);
			
			if(extension.length()!=4) {
				error = true;
			}
			else if(!extension.startsWith("+")) {
				error = true;
			}
			else if(!extension.endsWith("-")) {
				error = true;
			}
			else {
				//La extensión es correcta
				//Vamos a validar el resto del teléfono
				int posGuion = telefono.indexOf("-");
				String numeroTlfn = telefono.substring(posGuion + 1);
				
				if(numeroTlfn.length()!=6) {
					
					error = true;
					
					}
				else {
					//Verificar que no haya letras
					for(int i = 0;i<numeroTlfn.length();i++) {
						if(!Character.isDigit(numeroTlfn.charAt(i))) {
							error = true;
							break;
						}
					}
				} //Fin del else que verifica 6 dígitos
					
				
			} //Fin del else que valida la extensión
			intentos ++; //Registrar número de veces que se ejecuta el do		
		}
		while(error==true && intentos<3);
		
		if(intentos ==3) {
			System.out.println("Has agotado el número de intentos");
		}
		else {
			System.out.println("Teléfono guardado con éxito");
		}
		
	}

}
