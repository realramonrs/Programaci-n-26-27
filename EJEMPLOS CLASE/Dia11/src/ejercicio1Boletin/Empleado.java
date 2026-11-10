package ejercicio1Boletin;

import java.time.LocalDate;
import java.time.Period;

public class Empleado {
	
	private String dni;
	private String nombre;
	private LocalDate fechaContratacion;
	private LocalDate fechaNacimiento;
	protected float salario;
	private static float salarioBase = 1000;
	
	public Empleado(String dni, String nombre, LocalDate fechaContratacion, LocalDate fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaContratacion = fechaContratacion;
		this.fechaNacimiento = fechaNacimiento;
		salario = Empleado.salarioBase;
	}

	public int calcularAnhosAntiguedad() {
		Period diferencia = Period.between(fechaContratacion,LocalDate.now());
		
		return diferencia.getYears();
	}
	
	public void calcularSalario() {
		int antiguedad = calcularAnhosAntiguedad();
		this.salario = Empleado.salarioBase + (antiguedad/3)*Empleado.salarioBase*0.05f;
	}
	
	//Subir salario base
	
	public static void aumentarSalarioBase() {
		Empleado.salarioBase = 1.1f*Empleado.salarioBase;
	}
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(LocalDate fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre + " Fecha Contratacion :" + this.fechaContratacion + " Salario: " +  this.salario;
	}

	public static float getSalarioBase() {
		return salarioBase;
	}

	public static void setSalarioBase(float salarioBase) {
		Empleado.salarioBase = salarioBase;
	}
	
	

}
