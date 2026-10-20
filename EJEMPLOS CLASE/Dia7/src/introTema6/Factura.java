package introTema6;

import java.time.LocalDate;
import java.time.Period;

public class Factura {

	//Atributos,campos, datos, estado
	//Cada Factura está compuesta por : Id, FechaEmision, importe, pagada,nombreCliente
	//El Id: está formado siempre por 4 caracteres
	
	private String id;
	private LocalDate fechaEmision;
	private float importe;
	private boolean pagada;
	private String cliente;
	
	
	//Constructore: Métodos que permite inicializar los atributos en el momento de la instanciación
	//Son llamados por el operador new
	//No tienen tipo de retorno y se llaman igual que la clase
	//Cuando no se añade ningún constructor, el compilador añade uno por defecto
	
	public Factura() {
		id = null;
		fechaEmision = null;
		importe = 0;
		pagada = false;
		cliente = null;
	}
	
	
	public Factura(String id, float importe, String cliente) {
		setId(id);
		this.importe = importe;
		this.cliente = cliente;
		
	}
	
	//Métodos de acceso , getters and setters
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		if(id.length()==4) {
			this.id = id;
		}
	}
	
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public boolean isPagada() {
		return pagada;
	}
	
	//***********************************  FIN METODOS ACCESO  *****************************************//
	
	//Método aplicar recargo del 10% si la factura está sin pagar y han pasado 10 días desde la fecha de Emision
	
	private void aplicarRecargo() {
	
		int dias = getDiasDesdeEmision();
		
		if(!pagada && dias>10)
			importe = (float) (importe + 0.1*importe);
	}
	
	public void pagarFactura() {
		if(!pagada) {
			//Aplicar recargo si es necesario
			aplicarRecargo();
			pagada = true;
		}
			 
	}
	
	public int getDiasDesdeEmision() {
		LocalDate hoy = LocalDate.now();
		
		Period p = Period.between(fechaEmision, hoy);
		
		int dias = p.getDays();
		
		return dias;
	}
	
	@Override

	public String toString() {
		String mensaje="Id: " + this.id + "\n";
		mensaje+= "Fecha Emision: " + this.fechaEmision + "\n";
		mensaje+= "Importe: " + this.importe + "\n";
		mensaje+= "Estado: ";
		if(pagada)
				mensaje+= " Pagada \n";
		else
				mensaje+=" No pagada \n";
		
		mensaje+= "Cliente: " + this.cliente;
		return mensaje;
	}
	
}
