package repaso;

import java.time.LocalDate;

public class TestPelicula2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Pelicula.comparadorPeliculas(null, null));
		Pelicula.setProductora("Warner Bros");
		System.out.println(Pelicula.getProductora());
		Pelicula p1 = new Pelicula("T5678","Interestellar",LocalDate.of(2021, 9, 28));
		Pelicula p2 = new Pelicula("A3462","Parque Jurásico",LocalDate.of(1992, 10, 2));
		
		p1.addValoracion(10);
		p1.addValoracion(8);
		
		p2.addValoracion(9);
		p2.addValoracion(10);
		
		System.out.println(p1.getProductora());
		
		String tituloMejorPelicula = Pelicula.comparadorPeliculas(p1, p2);
		
		System.out.println("Pelicula mejor valorada: " + tituloMejorPelicula);
		
		}

}
