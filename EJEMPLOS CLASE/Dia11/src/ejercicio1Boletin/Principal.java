package ejercicio1Boletin;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado[] misEmpleados = new Empleado[10];
		
		misEmpleados[0] = new Empleado("2345678","Francisco",LocalDate.of(2020, 5, 12),LocalDate.of(1990, 4, 4));
		misEmpleados[1] = new Directivo("1111111","Pepe",LocalDate.of(2010, 5, 12),LocalDate.of(1970, 4, 4),"654321232");
		misEmpleados[2] = new Administrativo("22222222","Sara",LocalDate.of(2000, 5, 12),LocalDate.of(1980, 4, 4),"mcst2027");

		//Mostrar toda la info de la matriz
		
		for(Empleado e : misEmpleados) {
			if(e!=null) {
				System.out.println(e);
			}
			else {
				break;
			}
		}
		
		//Calcular salarios de todos los trabajadores
		
		for(Empleado e : misEmpleados) {
			if(e!=null) {
				e.calcularSalario();
			}
			else {
				break;
			}
		}
		
		//Mostrar info tras calcular el salario
		
		//Mostrar toda la info de la matriz
		
				for(Empleado e : misEmpleados) {
					if(e!=null) {
						System.out.println(e);
					}
					else {
						break;
					}
				}
		
		
		
	}

}
