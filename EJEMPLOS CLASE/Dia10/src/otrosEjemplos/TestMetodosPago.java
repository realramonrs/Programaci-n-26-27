package otrosEjemplos;

public class TestMetodosPago {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tarjeta t1 = new Tarjeta("Pepito", 300,"4567898736363",5);
		Paypal p1 = new Paypal("Juanito",600,"juanito@hotmail.com");
		Cripto c1 = new Cripto("Sara",100,"Ethereal");
		//Ejecutar el pago
		t1.procesarPago(303);
		
		//Mostrar toda la info de T1
		t1.mostrarDetalle();
		
		p1.procesarPago(601.5f);
		//Mostrar la info de 91
		p1.mostrarDetalle();
		
		c1.procesarPago(98);
		c1.mostrarDetalle();
		
		
		
		
		
	}

}
