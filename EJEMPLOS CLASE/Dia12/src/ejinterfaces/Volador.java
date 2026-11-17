package ejinterfaces;

public interface Volador {

	void volar();
	
	public default void aterrizar() {
		System.out.println("Estoy aterrizando...");
	}
	
	
}
