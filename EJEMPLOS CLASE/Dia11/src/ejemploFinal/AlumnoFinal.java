package ejemploFinal;

public class AlumnoFinal {

	private String nombre;
	private String dni;
	
	
	public AlumnoFinal(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public final boolean validarDni(String dni) {
		if(dni.length()==9) {
			return true;
		}
		return false;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	
	
	
}
