package colecciones;

import java.io.IO;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListaFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Factura> facturas = new ArrayList<Factura>();
		
		
		facturas.add(new Factura("Pepe",550,LocalDate.of(2026, 9, 12)));
		facturas.add(new Factura("Maria",950,LocalDate.of(2026, 2, 5)));
		facturas.add(new Factura("Susana",450,LocalDate.of(2026, 6, 8)));
		
		//Recuperar facturas
		Factura f = facturas.get(0);
		
		for(Factura fact : facturas) {
			System.out.println(fact);
		}
		
		//Eliminar factura por nombre cliente:
		
		String cliente = IO.readln("Intro nombre cliente que quieres eliminar");
		
		for(Factura fact : facturas) {
			if(fact.getCliente().equals(cliente)) {
				facturas.remove(fact);
				break;
			}
		}
		
		System.out.println();
		
		for(Factura fact : facturas) {
			System.out.println(fact);
		}
		
		
		
		
		
	}

}
