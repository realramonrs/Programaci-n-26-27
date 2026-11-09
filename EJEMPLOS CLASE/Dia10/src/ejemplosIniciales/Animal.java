package ejemplosIniciales;

public class Animal {

	private String nombre;
	private String especie;
	
	public Animal(String nombre, String especie) {
		super();
		this.nombre = nombre;
		this.especie = especie;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	// Hablar
	
	public void hablar() {
		System.out.println("Hablo como un animal");
	}
	
	// Comer
	
	public void comer() {
		System.out.println("Como como un animal");
	}
	
	//Dormir
	
	public void dormir() {
		System.out.println("Duermo como un animal");
	}
	
	// toString
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre + " Especie: " + especie;
	}
	
}
