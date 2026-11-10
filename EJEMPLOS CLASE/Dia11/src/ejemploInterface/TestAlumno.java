package ejemploInterface;

import java.time.LocalDate;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno("Juanito");
		
		//Añadir examenes
		a1.addExamen(new ExamenEscrito(LocalDate.of(2026, 11, 26),58,8));
		a1.addExamen(new ExamenOral(LocalDate.of(2026, 10, 2),NotaOral.excelente));
		a1.addExamen(new ExamenTest(LocalDate.of(2026, 9, 28),100,60));
		a1.addExamen(new Tareas());
		
		//Evaluamos al alumno
		
		a1.evaluar();
		
		System.out.println("Nota final de a1: " + a1.getNotaFinal());
		
	}

}
