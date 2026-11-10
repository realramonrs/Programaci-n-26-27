package ejercicio1Boletin;

import java.time.LocalDate;

public class Administrativo extends Empleado {

	public String codigo;

	public Administrativo(String dni, String nombre, LocalDate fechaContratacion, LocalDate fechaNacimiento,
			String codigo) {
		super(dni, nombre, fechaContratacion, fechaNacimiento);
		setCodigo(codigo);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		if(validarCodigo(codigo)) {
			this.codigo = codigo;
		}
	}
	
	private boolean validarCodigo(String codigo) {
		if(Character.isDigit(codigo.charAt(0)) && Character.isLetter(1)) {
			return true;
		}
		return false;
	}
	
	@Override
	public void calcularSalario() {
		// TODO Auto-generated method stub
		int antiguedad = calcularAnhosAntiguedad();
		this.salario = Empleado.getSalarioBase() + (antiguedad/3)*Empleado.getSalarioBase()*0.5f;
	}
	
}
