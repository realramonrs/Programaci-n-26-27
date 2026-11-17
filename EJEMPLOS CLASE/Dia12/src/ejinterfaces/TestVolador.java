package ejinterfaces;

public class TestVolador {

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
		
		Volador[] v1 = new Volador[100];
		
		v1[0] = new Murcielago();
		v1[1] = new Aguila();
		v1[2] = new Avion("Iberia");
		
		for(Volador v : v1) {
			if(v!=null) {
				v.volar();
				v.aterrizar();
			}
		}
		
	}

}
