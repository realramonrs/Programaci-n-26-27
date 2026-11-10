package otrosEjemplos;

public class Paypal extends MetodoPago {

	private String email;
	
	public Paypal(String titular, float precioBase,String email) {
			
		super(titular,precioBase);
		this.email = email;
	}
	
	@Override
	public void procesarPago(float cantidad) {
		// TODO Auto-generated method stub
		super.precioFinal = super.precioBase + 1.50f;
		
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
		System.out.println("Email: " + this.email);
	}
}
