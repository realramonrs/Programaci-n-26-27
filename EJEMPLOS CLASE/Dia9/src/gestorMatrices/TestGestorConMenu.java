package gestorMatrices;

import java.io.IO;

public class TestGestorConMenu {

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
		
				
				// MOSTRAR MENÚ PARA USUARIO
				
				
				int opcion = 0;
				char deseaContinuar = 'n';
				
				do {
					System.out.println("0. Eliminar factura.");
					System.out.println("1. Añadir factura");
					System.out.println("2. Ver todas las facturas");
					System.out.println("3. Pagar factura");
					System.out.println("4. Mostrar facturas pagadas");
					System.out.println("5. Mostrar facturas por cliente");
					System.out.println("6. Mostrar facturas vencidas");
					System.out.println("7. Obtener total recaudado.");
					System.out.println("8. Obtener total recaudado por fecha");
					System.out.println("9. Obtener factura con el importe más alto");
					System.out.println("10. Obtener lista de clientes morosos (Con facturas vencidas)");
					System.out.println("11. Obtener el cliente con suma importes pagado más alto");
			
				opcion = Integer.parseInt(IO.readln("Escoja una opción del menú"));
				
				switch(opcion) {
				
				case 0:
					String idEliminar = IO.readln("Intro id factura que desea eliminar");
					
					gf.eliminarFactura(idEliminar);
				
					break;
				case 1:
					
					String tipoFactura = IO.readln("Que tipo de factura desea añadir: Nacional/Internacional/Electronica ");
					
					switch(tipoFactura) {
						case "Nacional":
							System.out.println("Introduzca los datos de la factura:");
							String id = IO.readln("Intro id :");
							String cliente = IO.readln("(Intro Cliente: ");
							float importe = Float.parseFloat(IO.readln("Intr importe: "));
							
							gf.addFactura(new Factura(id,importe,cliente));
							break;
					case "Internacional":
						System.out.println("Introduzca los datos de la factura:");
						String id2 = IO.readln("Intro id :");
						String clienteInt = IO.readln("(Intro Cliente: ");
						float importeInt = Float.parseFloat(IO.readln("Intr importe: "));
						String codPais= IO.readln("Intro pais:");
						float arancel = Float.parseFloat(IO.readln("Intro arancel"));
						
						gf.addFactura(new FacturaInternacional(id2, importeInt, clienteInt, codPais, arancel));
						
						break;
					case "Electrónica:":
						
						gf.addFactura(new FacturaElectronica("EL89",450,"AMAZON"));
					
					
					}
					
									
					
					break;
				case 2:
					
					System.out.println("Facturas almacenadas : ");
					System.out.println(gf);
									
					break;
				case 3:
					
					String id3 = IO.readln("Introduzca el id de la factura: ");
					gf.pagarFactura(id3);
										
					break;
				case 4:
					
					System.out.println("Facturas pagadas: ");
					Factura[] pagadas = gf.getFacturasPagadas();
					
					for(Factura f : pagadas) {
						if(f!=null) {
							System.out.println(f);
						}
						else {
							break;
						}
					}
										
					break;
				case 5:
					
					String cli = IO.readln("Intro cliente para obtener facturas: ");
					Factura[] cliente5 = gf.getFacturasByCliente(cli);
					
					for(Factura f : cliente5) {
						if(f!=null) {
							System.out.println(f);
						}
						else {
							break;
						}
					}
					break;
				case 6:
					break;
					
				case 7:
					
					float total = gf.getTotalRecaudado();
					System.out.println("Total recaudado: " + total);
					break;
				default:
					break;
				
					}
				
				deseaContinuar = IO.readln("Desea continuar s/n").charAt(0);
				
				}while(deseaContinuar=='s');
				
				
				
				
				
				
				
				
				
				
	}

}
