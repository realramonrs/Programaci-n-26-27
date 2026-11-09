package ejemplosIniciales;

public class TestAnimalMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal[] zoo = new Animal[100];
		
		zoo[0] = new Mono("Mono1","Monus monus",25);
		zoo[1] = new Loro("Loro1","Lorus lorus",25);
		zoo[2] = new Mono("Mono2","Monus hilariense",15);
		zoo[3] = new Loro("Loro2","Lorus lonus",25);
		zoo[4] = new Mono("Mono3","Monus romanus",5);
		zoo[5] = new Loro("Loro3","Lurus cantantis",25);
		zoo[6] = new Tiburon("Pujol","Tiburón blanco",3);
		
		//Hacer comer a todos los animales
		for(Animal a :zoo) {
			if(a!=null) {
				a.comer();
			}
		}
			
		//Hacer hablar a los Loros
		System.out.println("Que hablen los loros: ");
		for(int i = 0;i<zoo.length;i++) {
			if(zoo[i]!=null) {
				if(zoo[i] instanceof Loro) {
					zoo[i].hablar();
				}
			}
			else {
				break;
			}
		} //Fin del For
		System.out.println();
		//Hacer hablar a los Monos pero con un Foreach
		System.out.println("Que hablen los monos: ");
		for(Animal m : zoo) {
			if(m instanceof Mono) {
				m.hablar();
			}
			
		}
		System.out.println();
		//Hacer volar a los Loros
		System.out.println("Que vuelen los loros:");
		
		for(Animal a : zoo) {
			if(a instanceof Loro) {
				//Loro l3 = (Loro)a;
				//l3.volar();
				
				((Loro)a).volar();
			}
		}
		
		//Comer como un tiburón
				if(zoo[6] instanceof Tiburon) {
					Tiburon t = (Tiburon)zoo[6];
					t.comer("Comer tortugas");
					}
		
		
		
		
		
		
		
		
		
		
	}

}
