package ejinterfaces;

public class Aguila extends Animal implements Volador {

	public Aguila() {
		super("Aguila");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hablo como un águila");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Vuelo como un águila.");
	}

}
