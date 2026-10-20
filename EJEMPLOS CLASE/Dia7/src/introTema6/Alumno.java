package introTema6;

public class Alumno {

	private String nombre;
	private float[] notas;
	private float media;
	
	//Constructores
	
	public Alumno() {
		notas = new float[10];
		reseteoNotas();
	}
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		notas = new float[10];
		reseteoNotas();
	}
	
	public Alumno(String nombre, int cantidadNotas) {
		this.nombre = nombre;
		notas = new float[cantidadNotas];
		reseteoNotas();
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//Metodo reseteo notas Alumno
	private void reseteoNotas() {
		//Guarda el valor -1 en todas las posiciones del array notas
		
		for(int i = 0;i<this.notas.length;i++) {
			this.notas[i] = -1;
		}
	}
	
	//Método que permita añadir una nota a un alumno
	public void setNota(float nota) {
		
		for(int i = 0;i<notas.length;i++) {
			if(notas[i] == -1) {
				notas[i] = nota;
				break;
			}
		}
	}
	
	//Método que indique cuantas notas tiene puestas un alumno
	
	private  int getNumeroNotas() {
		int contador = 0;
		
		for(float n : notas) {
			if(n != -1) {
				contador++;
			}
			else {
				break;
			}
		}
		return contador;
		
		
	}
	//Método que obtenga la media del alumno
	
	public void setMedia() {
		float suma = 0;
		int numeroNotas = getNumeroNotas();
		
		for(int i = 0;i<numeroNotas;i++) {
			suma+=notas[i];
		}
		
		 this.media = suma / numeroNotas;
		
	}
	
	public float getMedia() {
		return this.media;
	}
	
	
	
}
