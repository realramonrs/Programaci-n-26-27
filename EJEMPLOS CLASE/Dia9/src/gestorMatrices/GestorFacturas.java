package gestorMatrices;

public class GestorFacturas {

	private Factura[] facturas;
	
	public GestorFacturas() {
		facturas = new Factura[10];
	}
	
	public GestorFacturas(int capacidad) {
		facturas = new Factura[capacidad];
	}
	
	
	// Añadir Factura
	
	public void addFactura(Factura f) {
		for(int i = 0;i<this.facturas.length;i++) {
			if(this.facturas[i] == null) {
				facturas[i] = f;
				break;
			}
		}
	}
	// Eliminar Factura
	
	// "ER45"       "ER45"
	//  NULL        "PD88"     
	// "NULL"       Null  
	// "PD88"       Null
	
	
	public void eliminarFactura(String id) {
		int posicion = getPosicionFacturaById(id);
		if(posicion>=0) {
			this.facturas[posicion] = null;
			
			//Reordenar elementos vacios al final
			Factura[] copia = new Factura[facturas.length];
			int contador = 0;
			for(int i = 0;i<facturas.length;i++) {
				if(facturas[i]!=null) {
					copia[contador] = facturas[i];
					contador++;
				}
			} //Cierre del for
			
			facturas = copia;
		}
	}
	
	// Buscar Factura por Id
	public Factura getFacturaById(String id) {
		for(Factura f : facturas) {
			if(f!=null) {
				if(f.getId().equals(id)) {
					return f;
				}
			}
			else {
				return null;
			}
		}
		
		return null;
	}
	
	public int getPosicionFacturaById(String id) {
		for(int i = 0;i<this.facturas.length;i++) {
			if(this.facturas[i].getId().equals(id)) {
				return i;
			}
		}
		return -1;
	}
	
	//Pagar Factura por Id
	public void pagarFactura(String id) {
		int posicion = getPosicionFacturaById(id);
		if(posicion>=0) {
			this.facturas[posicion].pagarFactura();
		}
	}
	
	// Obtener facturas por cliente
	
	public Factura[] getFacturasByCliente(String cliente) {
		
		Factura[] local = new Factura[this.facturas.length];
		int indice = 0;
		for(Factura f : facturas) {
			if(f!=null) {
				if(f.getCliente().equals(cliente)) {
					local[indice] = f;
					indice++;
				}
			}
			else {
				break;
			}
		}
		
		return local;
	}
	
	// Obtener facturas pagadas
public Factura[] getFacturasPagadas() {
		
		Factura[] local = new Factura[this.facturas.length];
		int indice = 0;
		for(Factura f : facturas) {
			if(f!=null) {
				if(f.getEstado()) {
					local[indice] = f;
					indice++;
				}
			}
			else {
				break;
			}
		}
		
		return local;
	}
	
	// Obtener facturas vencidas

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String mensaje = "";
		for(Factura f : facturas) {
			if(f!=null) {
				mensaje+=" **************** \n";
				mensaje+=f.toString()+"\n";
				mensaje+=" **************** \n";
			}
		}
		
		return mensaje;
	}

	public float getTotalRecaudado() {
		float total = 0;
		
		for(Factura f : facturas) {
			if(f!=null) {
				if(f.getEstado()==true) {
					total+=f.getImporte();
					}
			}
			else {
				break;
			}
		} //Cierre for
		return total;
		
	}

}
