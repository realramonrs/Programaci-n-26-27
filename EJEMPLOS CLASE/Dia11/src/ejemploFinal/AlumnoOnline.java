package ejemploFinal;

public class AlumnoOnline extends AlumnoFinal {

	private int numeroModulos;

	public AlumnoOnline(String nombre, String dni, int numeroModulos) {
		super(nombre, dni);
		this.numeroModulos = numeroModulos;
	}

	public int getNumeroModulos() {
		return numeroModulos;
	}

	public void setNumeroModulos(int numeroModulos) {
		this.numeroModulos = numeroModulos;
	}
	
	//Intentar sobreescribir el método validar dni
	
	/*public boolean validarDni(String dni) {
		return true;
	}*/
}
