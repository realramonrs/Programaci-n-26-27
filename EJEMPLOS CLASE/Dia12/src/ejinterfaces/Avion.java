package ejinterfaces;

public class Avion implements Volador {

	private String compania;

	public Avion(String compania) {
		super();
		this.compania = compania;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	@Override
	public void volar() {
		System.out.println("Vuelo como un avión");
		
	}
	
	
}
