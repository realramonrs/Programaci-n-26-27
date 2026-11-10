package otrosEjemplos;

public class Cripto extends MetodoPago {

	private String red;
	
	public Cripto(String titular, float precioBase,String red) {
		super(titular,precioBase);
		this.red = red;
	}
	
	@Override
	public void procesarPago(float cantidad) {
		// TODO Auto-generated method stub
		super.precioFinal = super.precioBase - super.precioBase*0.02f;
		
		if(cantidad == super.precioFinal) {
			System.out.println("Transacción realizada");
		}
		else {
			System.out.println("No se ha podido ejecutar el pago");
		}
	}
	
	
	
	
}
