package ejemploInterface;

import java.time.LocalDate;

public abstract class Examen implements Evaluable {

	private LocalDate fecha;

	public Examen(LocalDate fecha) {
		super();
		this.fecha = fecha;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Fecha=" + fecha;
	}
	
	//Método abstracto porque no lo sabemos programar
	
	
	
}
