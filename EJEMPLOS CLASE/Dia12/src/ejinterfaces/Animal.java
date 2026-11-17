package ejinterfaces;

public abstract class Animal {

	String nombre;

	public Animal(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract void hablar();
	
	public void dormir() {
		System.out.println("Duermo como un animal zzz....");
		
	}
}
