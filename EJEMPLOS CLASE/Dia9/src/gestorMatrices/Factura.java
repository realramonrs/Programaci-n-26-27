package gestorMatrices;

import java.time.LocalDate;

public class Factura {

	private String id;
	private LocalDate fechaEmision;
	private LocalDate fechaVencimiento; // Por defecto es una semana después de la emisión
	private LocalDate fechaPago;
	private float importe;
	private boolean estado; //True .> Pagada, False ->Sin pagar.
	private String cliente;
	
	public Factura(String id, float importe, String cliente) {
		super();
		setId(id);
		this.importe = importe;
		this.cliente = cliente;
		//Establece la fecha de emision a hoy
		this.fechaEmision = LocalDate.now();
		
		//Establecer la fecha de vencimiento
		this.fechaVencimiento = this.fechaEmision.plusDays(7);
					
	}
	
	private void setId(String id) {
		//Valida el formato de este string (tenga 4 caracteres)
		if(id.length()==4) {
			this.id = id;
		}
		else {
			this.id = null;
		}
		
		
		
	}

	public LocalDate getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
		this.fechaVencimiento.plusDays(7);
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getId() {
		return id;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}
	
	public void pagarFactura() {
		this.estado = true;
		this.fechaPago = LocalDate.now();
	}
	
	//Método que indica si la factura está vencida
	
	public boolean isVencida() {
		if(LocalDate.now().isAfter(fechaVencimiento) && this.estado==false) {
			return true;
		}
		return false;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String mensaje = "Id: " + id + "\n";
		mensaje+= "Cliente: " + this.cliente + "\n";
		mensaje+= "Fecha Emision: " + this.fechaEmision + "\n";
		mensaje+= "Fecha Vencimiento: " + this.fechaVencimiento + "\n";
		mensaje+= "Importe: " + this.importe + "\n";
		
		if(estado) {
			mensaje+= "Fecha Pago: " + this.fechaPago + "\n";
		}
		else {
			mensaje+= "Fecha Pago: Pendiente de pago";
		}
		
		return mensaje;
	}
	
}
