package repasoHerencia;

import java.time.LocalDate;

public class ExamenEscrito extends Examen {

	private int duracion;
	private int nota;
	
	public ExamenEscrito(LocalDate fecha,int duracion,int nota) {
		super(fecha);
		this.duracion = duracion;
		this.nota = nota;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public boolean evaluar() {
		if(nota > 6 && duracion < 90) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Duracion: " + this.duracion + " Nota: " + this.nota  ;
	}
	
	
	
}
