package ejinterfaces;

public class Murcielago extends Animal implements Volador {

	public Murcielago() {
		super("Murcielago");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hablo como un murcielago");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Vuelo como un murciélago");
	}

}
