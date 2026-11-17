package ejemploComparable;

import java.time.LocalDate;

public class Factura implements Comparable<Factura> {

	private String cliente;
	private float importe;
	private LocalDate fechaEmision;
	private LocalDate fechaPago ;
	
	
	public LocalDate getFechaPago() {
		return fechaPago;
	}
	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}
	public Factura(String cliente, float importe,LocalDate fecha) {
		super();
		this.cliente = cliente;
		this.importe = importe;
		this.fechaEmision = fecha;
	
		
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "Factura [cliente=" + cliente + ", importe=" + importe + " Fecha Emision: " + this.fechaEmision + " Fecha Pago " + this.fechaPago + "]";
	}
	
	
	public LocalDate getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDate fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	@Override
	public int compareTo(Factura o) {
		// TODO Auto-generated method stub
		
		//Ordenar por cliente
	//	int criterio = this.cliente.compareTo(o.cliente);
	//	return criterio;
		
		//Ordenar por precio
		
		return Float.compare(this.importe, o.importe);
	}
	
	
	public Transferencia createTransferencia() {
		return new Transferencia();
	}
	
	class Transferencia{
		
		
	}
	
	
}
