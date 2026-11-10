package ejemploInterface;

public class Alumno {

	private String nombre;
	
	private Evaluable[] examenes;
	
	private String notaFinal;
	
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		examenes = new Examen[10];
	}
	
	public Alumno(String nombre,int cantidadExamenes) {
		this.nombre = nombre;
		examenes = new Evaluable[cantidadExamenes];
	}
	
	
	
	
	//Añadir Examen
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNotaFinal() {
		return notaFinal;
	}

	public void setNotaFinal(String notaFinal) {
		this.notaFinal = notaFinal;
	}

	public void addExamen(Evaluable ex) {
		
		for(int i = 0;i<examenes.length;i++) {
			if(examenes[i]==null) {
				examenes[i] = ex;
				break;
			}
		}
	}
	
	//Obtener acceso al array de examenes
	public Evaluable[] getExamenes() {
		return examenes;
	}
	
	//Método que permita evaluar a un alumno: Un alumno aprueba si aprueba todos los exámenes
	
	
	public void evaluar() {
		
		this.notaFinal = "Aprobado";
		for(Evaluable ex : examenes) {
			if(ex!=null) {
				if(ex.evaluar()==false) {
					this.notaFinal = "Suspenso";
					break;
				}
			}
		}
		
	}
	
	
	
	
	
	
	
	
}
