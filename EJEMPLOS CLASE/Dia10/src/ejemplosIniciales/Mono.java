package ejemplosIniciales;

public class Mono extends Animal {
	
	private int edad;
	
	public Mono(String nombre,String especie,int edad) {
		//La primera línea tiene que ser una llamada a un constructor de la clase base
		super(nombre,especie);
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "Edad_ " + this.edad;
	}
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Como cómo un mono");
	}
	
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hablo como un mono");
	}
	
}
