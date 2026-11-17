package colecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListasLinkadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<Factura> lista = new LinkedList<Factura>();
		
		lista.add(new Factura("Pepe",550,LocalDate.of(2026, 9, 12)));
		lista.add(new Factura("Maria",950,LocalDate.of(2026, 2, 5)));
		lista.add(new Factura("Susana",450,LocalDate.of(2026, 6, 8)));
		
		lista.addFirst(new Factura("Primera Factura",900,LocalDate.of(2024, 4, 3)));
		lista.offerFirst(new Factura("Nueva primera FActura",870,LocalDate.of(2023, 4, 2)));
		
		
		for(Factura f : lista) {
			System.out.println(f);
		}
		
		
		List<Factura> listaGeneral = new ArrayList<Factura>();
		
		listaGeneral = new LinkedList<Factura>(listaGeneral);
		
		
		
		
		
	}

}
