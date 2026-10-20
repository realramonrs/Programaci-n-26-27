package introTema6;

import java.time.LocalDate;
import java.time.Month;

public class TestFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarando variables de tipo Factura (String frase;)
		String slogan;
		Factura f1;
		Factura f2, f3;
		Factura[] facturas = new Factura[100];
		
		//Instanciar (crear una instancia de...) crear un objeto de tipo Factura
		f1 = new Factura();
		f2 = new Factura("UY76", 350, "Panaderia Pichi");
		f3 = new Factura();
		
		//Inicializar atributos de factura F1
		f1.setId("OC01");
		f1.setFechaEmision(LocalDate.of(2026,Month.SEPTEMBER,28));
		f1.setImporte(345.99f);
		f1.setCliente("Frutas Olimpicas");
		//f1.pagada = true;
		
		System.out.println(f1);
		
		//Aplicar recargo a F1
		f1.pagarFactura();
		
		System.out.println("Importe después de aplicar recargo:");
		System.out.println(f1.getImporte() + " " + f1.isPagada());
		
		System.out.println("Dias desde la emision de la factura: " + f1.getDiasDesdeEmision());
		
		
	}

}
