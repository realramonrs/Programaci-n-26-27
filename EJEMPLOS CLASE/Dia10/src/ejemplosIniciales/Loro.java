package ejemplosIniciales;

public class Loro extends Animal {

	private int numeroPalabras;
	
	public Loro(String nombre,String especie, int numeroPalabras) {
		super(nombre,especie);
		this.numeroPalabras = numeroPalabras;
	}
	public int getNumeroPalabras() {
		return numeroPalabras;
	}
	public void setNumeroPalabras(int numeroPalabras) {
		this.numeroPalabras = numeroPalabras;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Numero Palabras: " + numeroPalabras;
	}
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub
		System.out.println("Como como un loro");
	}
	
	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Hablo como un loro");
	}
	
	public void volar() {
		System.out.println("Vuelo como un loro");
	}
	
}
