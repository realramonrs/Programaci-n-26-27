package ejemplosIniciales;

public class Tiburon extends Animal {

	private int longitud;

	public Tiburon(String nombre, String especie, int longitud) {
		super(nombre, especie);
		this.longitud = longitud;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	//************************* SOBREESCRIBIR VS SOBRECARGAR ************************//
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Como cómo un tiburón");
	}
	
	//Este método como cambia la firma con respecto a la de la clase Animal,
	//no lo estoy sobreescribiendo lo estoy sobrecargando-> Sólo se ejecutará en Tiburones
	public void comer(String f) {
		// TODO Auto-generated method stub
		System.out.println(f);
	}
	
	
}
