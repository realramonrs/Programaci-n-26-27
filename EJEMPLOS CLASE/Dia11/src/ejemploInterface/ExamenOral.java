package ejemploInterface;

import java.time.LocalDate;

public class ExamenOral extends Examen {

	NotaOral notaOral;
	
	public ExamenOral(LocalDate fecha,NotaOral notaOral) {
		super(fecha);
		this.notaOral = notaOral;
	}

	public NotaOral getNotaOral() {
		return notaOral;
	}

	public void setNotaOral(NotaOral notaOral) {
		this.notaOral = notaOral;
	}
	
	public boolean evaluar() {
		if(this.notaOral == NotaOral.insuficiente) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() +  "Nota : " + this.notaOral.toString();
	}
}
