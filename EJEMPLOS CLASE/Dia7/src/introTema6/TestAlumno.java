package introTema6;

public class TestAlumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno("Peter Pan");
		Alumno a3 = new Alumno("Hulk", 20);
		
		//Poner notas a los alumnos
		
		a1.setNota(4);
		a1.setNota(9);
		a2.setNota(8);
		a2.setNota(10);
		a3.setNota(10);
		a3.setNota(9.5f);
		
		a1.setMedia();
		a2.setMedia();
		a3.setMedia();
		
		System.out.println("a1: " + a1.getMedia());
		System.out.println(a2.getNombre() + " Media: " + a2.getMedia());
		System.out.println(a3.getNombre() + " Media: " + a3.getMedia());
		
	}

}
