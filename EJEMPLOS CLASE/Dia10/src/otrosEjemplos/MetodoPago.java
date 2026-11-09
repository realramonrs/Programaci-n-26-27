package otrosEjemplos;

import java.util.Random;

public class MetodoPago {

	private String titular;
	private String id;
	protected float precioBase;
	protected float precioFinal;
	
	public MetodoPago(String titular, float precioBase) {
		super();
		this.titular = titular;
		this.precioBase = precioBase;
		this.id = generarID();			
		
	}
	
	private String generarID() {
		//Generar id
				char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L'};
				
				Random generador = new Random();
				
				String idLocal="MCST-";
				for(int i = 0;i<17;i++){
					char letra = letras[generador.nextInt(13)];
					idLocal+=letra;
				}
				return idLocal;
	}
	
	public void procesarPago() {
		this.precioFinal = 0;
	}
	
	public void mostrarDetalle() {
		String mensaje = "Titular: " + this.titular + "\n";
		mensaje+= "Id transacción: " + this.id + "\n";
		mensaje+= "Precio base: " + this.precioBase + "\n";
		mensaje += "Precio final: " + this.precioFinal;
		
		System.out.println(mensaje);
	}
	
	
	
}
