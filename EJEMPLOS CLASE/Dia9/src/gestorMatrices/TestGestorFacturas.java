package gestorMatrices;

public class TestGestorFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos un gestor
		GestorFacturas gf = new GestorFacturas(20);
		
		//Añadir Facturas
		Factura f1 = new Factura("QW23",450,"Mercadona");
		Factura f2 = new Factura("P98Y",2500,"Alcampo");
		
		gf.addFactura(f1);
		gf.addFactura(f2);
		gf.addFactura(new Factura("AA23",780,"Mercadona"));
		gf.addFactura(new Factura("P098",875,"Gadis"));
		
		
		//Mostrar info de las facturas guardadas
		System.out.println(gf);
		
		//Pagar facturas
		gf.pagarFactura("AA23");
		gf.pagarFactura("P98Y");
		//Mostrar facturas pagadas
		Factura[] pagadas = gf.getFacturasPagadas();
		
		System.out.println("Facturas Pagadas: ");
		
		for(Factura f : pagadas) {
			if(f!=null) {
				System.out.println(f);
			}
			else {
				break;
			}
		}
		
		
		
		
		
	}

}
