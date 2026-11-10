package ejercicio1Boletin;

import java.time.LocalDate;

public class Directivo extends Empleado {

	private String telefono;

	public Directivo(String dni, String nombre, LocalDate fechaContratacion, LocalDate fechaNacimiento,
			String telefono) {
		super(dni, nombre, fechaContratacion, fechaNacimiento);
		this.telefono = telefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		int antiguedad = calcularAnhosAntiguedad();
		this.salario = Empleado.getSalarioBase() + (antiguedad/3)*Empleado.getSalarioBase()*0.5f;
	}

	@Override
	public String toString() {
		return super.toString() +  "  Directivo -> telefono= " + telefono;
	}
	
	
}
