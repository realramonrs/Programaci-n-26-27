package ejemplosIniciales;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mono miMono = new Mono("Cheetah","Monus Amongus",19);
		Loro miLoro = new Loro("Loro Park","Lorus Parlantis",12);
		
		Animal a1 = new Mono("King Kong","Gorilus Gigantis",22);
		Animal a2 = new Loro("Lorelai","Lorus fantasticus",5); //UpCast
		Animal a3 = new Animal("Desconocido","Unknow");
		
		//Métodos definidos en la clase base y sobresscritos en la clase hija
		//Hacer comer a los animales
		miMono.comer();
		miLoro.comer();
		a1.comer();
		a2.comer();
		a3.comer();
		
		//Métodos definidos en la clase base y no sobrescritos en las hijas
		//Hacer dormir a los animales
		a1.dormir();
		a2.dormir();
		a3.dormir();
		miMono.dormir();
		miLoro.dormir();
		
		//Métodos definidos en las clases hijas
		//Hacer volar a los loros desde referencias de tipo Loro es fácil
		miLoro.volar();
		//Hacer volar a un Loro desde una referencia de tipo Animal
		//a2.volar() -> No lo encuentra pq no está definido en la clase Animal
		Loro l1 = (Loro)a2; //Downcast -> Peligroso !!! a2 puede ser un mono
		l1.volar();
		
		//Que pasaría si a2 es un mono
		//Loro l2 = (Loro)a1; //Da un CastException
		//l2.volar(); //Estoy intentando hacer volar a un mono!!!!!!!!
		
		//Para hacer downcast seguros -< instanceof
		
		if(a1 instanceof Loro) {
			Loro l3 = (Loro)a1;
			l3.volar();
		}
		else {
			System.out.println("estás intentando hacer volar a un mono!!! Tu si que eres un animal!");
		}			
		
	}

}
