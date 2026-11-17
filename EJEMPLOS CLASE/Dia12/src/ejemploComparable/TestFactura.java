package ejemploComparable;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class TestFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factura[] facturas = new Factura[6];
		
		facturas[0] = new Factura("Pedro",550,LocalDate.of(2025, 2, 20));
		facturas[1] = new Factura("Juan",950,LocalDate.of(2024, 2, 20));
		facturas[2] = new Factura("Sara",520,LocalDate.of(2023, 2, 20));
		facturas[3] = new Factura("Maria",430,LocalDate.of(2022, 2, 20));
		facturas[4] = new Factura("Alejandro",5210,LocalDate.of(2021, 2, 20));
		facturas[5] = new Factura("Nuria",1550,LocalDate.of(2020, 2, 20));
		
		//Fechas de pago
		facturas[0].setFechaPago(LocalDate.of(2025, 2, 28));
		facturas[1].setFechaPago(LocalDate.of(2024, 2, 28));
		facturas[2].setFechaPago(LocalDate.of(2023, 2, 28));
		facturas[3].setFechaPago(LocalDate.of(2022, 2, 28));
		facturas[4].setFechaPago(LocalDate.of(2021, 2, 28));
		facturas[5].setFechaPago(LocalDate.of(2020, 2, 28));
		//Ordenar este array alfabéticamente por el nombre del cliente
				
		Arrays.sort(facturas);
		
		for(Factura f : facturas) {
			System.out.println(f);
		}	
		
		//Ordenar alfabéticamente
		Arrays.sort(facturas,new ComparadorFacturas());
		
		System.out.println("Facturas ordenadas por cliente");
		for(Factura f : facturas) {
			System.out.println(f);
		}	
		
		//Ordenar por fecha emision
		System.out.println();
		Arrays.sort(facturas,new ComparadorFacturasPorFecha());
		
		System.out.println("Facturas ordenadas por fecha emision");
		for(Factura f : facturas) {
			System.out.println(f);
		}	
		
		System.out.println();
		Arrays.sort(facturas);
		System.out.println("Facturas ordenadas por importe ");
		for(Factura f : facturas) {
			System.out.println(f);
		}	
		//Ordenar por fecha de pago:
		
		Arrays.sort(facturas, new Comparator<Factura>() {

			@Override
			public int compare(Factura o1, Factura o2) {
				// TODO Auto-generated method stub
				return o1.getFechaPago().compareTo(o2.getFechaPago());
			}		
			
			
		});
		
		System.out.println();
		
		System.out.println("Facturas ordenadas por fecha pago");
		for(Factura f : facturas) {
			System.out.println(f);
		}	
		
		
		
		
		
		
		
		
		
	}

}
