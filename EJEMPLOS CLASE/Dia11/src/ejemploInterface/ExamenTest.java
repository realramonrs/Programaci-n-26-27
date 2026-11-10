package ejemploInterface;

import java.time.LocalDate;

public class ExamenTest extends Examen {

	private int preguntas;
	private float aciertos;
	
	public ExamenTest(LocalDate fecha, int preguntas,float aciertos) {
		super(fecha);
		this.preguntas = preguntas;
		this.aciertos = aciertos;
	}
	
	@Override
	public boolean evaluar() {
		// TODO Auto-generated method stub
		
		if(aciertos>preguntas/2) {
			return true;
		}
		return false;
	}

}
