package otrosEjemplos;

public class Tarjeta extends MetodoPago {

	String numeroTarjeta;
	int cuotas;
	
	public Tarjeta(String titular,float precioBase,String numeroTarjeta,int cuotas) {
		super(titular,precioBase);
		this.numeroTarjeta = numeroTarjeta;
		this.cuotas = cuotas;
	}
	
	@Override
	public void procesarPago(float cantidad) {
		// TODO Auto-generated method stub
		//Calcular el precio final
		if(cuotas>1) {
			super.precioFinal= super.precioBase + 0.1f*super.precioBase;
		}
		else {
			super.precioFinal = super.precioBase;
		}
		
		//Comprobar que la cantidad recibida es correcta
		if(cantidad==super.precioFinal) {
			System.out.println("Transacción realizada correctamente");
		}
		else {
			System.out.println("no se ha podido procesar el pago");
		}
			
			
	}
	
	@Override
	public void mostrarDetalle() {
		// TODO Auto-generated method stub
		super.mostrarDetalle();
		String mensaje = " Nº de tarjeta: " + this.numeroTarjeta.substring(this.numeroTarjeta.length()-4);
		mensaje += " Número de cuotas: " + this.cuotas;
		System.out.println(mensaje);
	}
	
}
