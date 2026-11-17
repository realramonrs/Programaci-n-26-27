package ejinterfaces;

public class TestAnimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro p1 = new Perro();
		Mono m1 = new Mono();
		
		Animal ap1 = new Perro();
		Animal am1 = new Mono();
		
		Animal[] zoo = new Animal[100];
		zoo[0]  =p1;
		zoo[1] = m1;
		zoo[2] = ap1;
		zoo[3] = am1;
		zoo[4] = new Murcielago();
		zoo[5] = new Aguila();
		
		for(Animal a : zoo) {
			if(a!=null) {
				a.hablar();
			}
		}
		
		//Hacer volar a los objetos voladores
		
		for(Animal a : zoo) {
			if(a instanceof Volador) {
				Volador v = (Volador)a;
				v.volar();
				v.aterrizar();
			}
		}
		
		
		
	}

}
