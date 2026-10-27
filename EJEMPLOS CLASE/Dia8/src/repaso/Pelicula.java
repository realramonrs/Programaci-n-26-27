package repaso;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Objects;

public class Pelicula {

	private String id; //Formato : A9999
	private String titulo;
	private LocalDate fechaEstreno;
	private float[] valoraciones; //Pueden ser valores entre 1 y 10
	private float valoracion; //Pueden ser valores entre 1 y 10
	
	private static String productora;  //Atributo de clase
	
	//Constructores
	
	public Pelicula(String id) {
		if(validarId(id)==true) {
			this.id = id;
		}
		
		//Dar tamaño al array de valoraciones
		valoraciones = new float[100];
	}
	
	public Pelicula(String id,String titulo, LocalDate fechaEstreno) {
		if(validarId(id)) {
			this.id = id;
		}
		this.titulo = titulo;
		this.fechaEstreno = fechaEstreno;
		//Dar tamaño al array de valoraciones
		valoraciones = new float[100];
	}
	
	public Pelicula(String id,String titulo, int year,int mes, int dia) {
		if(validarId(id)) {
			this.id = id;
		}
		this.titulo = titulo;
		this.fechaEstreno = LocalDate.of(year, mes, dia);
		//Dar tamaño al array de valoraciones
			valoraciones = new float[100];
	}
	
	//Validar el formato A9999
	
	private boolean validarId(String id) {
				
		if(id.length()!=5) {
			return false;
		}
		else {
			if(!Character.isLetter(id.charAt(0))){
				return false;
				}
			else {
				for(int i = 1;i<id.length();i++) {
					if(!Character.isDigit(id.charAt(i))) {
						return false;
						
						} // fin del If de IsDigit
				} // Fin del for
				
			} // Fin del else interior
			return true;
		} //Fin del else exterior
			
	} // Llave que cierra el método

	
	// Métodos de acceso
	public float[] getValoraciones() {
		return valoraciones;
	}

	public float getValoracion() {
		return valoracion;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(validarId(id)==true) {
			this.id = id;
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}
	
	
	
	public static String getProductora() {
		return productora;
	}

	public static void setProductora(String productora) {
		Pelicula.productora = productora;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub 
		
		//Construir un String con las valoraciones
		
		String valoraciones ="";
		int n = getNumeroValoraciones();
		for(int i = 0;i<n;i++) {
				valoraciones+= Float.toString(this.valoraciones[i]) + "\n";
		
			
		}
		
		
		return this.id + " " + this.titulo + " " + this.fechaEstreno + " valoración: " + this.valoracion + "\nValoraciones :\n" + valoraciones ;
	}
	
	
	// Método añadir valoraciones
	
	public boolean addValoracion(float valoracion) {
		
		if(valoracion>0 && valoracion <11) {
			//Buscar la primera pos vacía, la que tenga un cero
			for(int i = 0;i<valoraciones.length;i++) {
				if(valoraciones[i] == 0) {
					valoraciones[i] = valoracion;
					calcularValoracion();
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	//Método que cuente las valoraciones
	
	private int getNumeroValoraciones() {
	int contador = 0;
		for(float v : valoraciones) {
			if(v != 0) {
				contador++;
			}
		}
		
		return contador;
	}
	
	//Metodo que calcula la valoración media
	
	public void calcularValoracion() {
		float suma = 0;
		float n = getNumeroValoraciones();
		
		for(int i = 0;i<n;i++) {
			suma += valoraciones[i];
		}
		
		this.valoracion = suma /n;
	}
	
	//Método que recibe dos películas y devuelve el título de la que tiene mejor valoracion
	
	public static String comparadorPeliculas(Pelicula p1 , Pelicula p2) {
		
		if(p1!=null && p2 != null) {
			if(p1.getValoracion()>=p2.getValoracion()) {
				return p1.getTitulo();
			}
		
		return p2.getTitulo();
		}
		
		return "";
	}

	
	
}	

	


