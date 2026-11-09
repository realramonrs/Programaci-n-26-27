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
	public void procesarPago() {
		// TODO Auto-generated method stub
		if(cuotas>1) {
			super.precioFinal= super.precioFinal + 0.1f*super.precioFinal;
		}
		else {
			super.precioFinal = super.precioBase;
		}
			
	}
}
