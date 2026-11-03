package repasoPOO;

public class TestFestival {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Festival f1 = new Festival("Eurovision",10);
		
		//Añadir Grupos al Festival
		Grupo g1 = new Grupo("Roxette",120,9,9000);
		f1.addGrupo(g1);
		Grupo g2 = new Grupo("Bon Jovi",180,8,25000);
		f1.addGrupo(g2);
		//Instanciación anónima
		f1.addGrupo(new Grupo("AC/DC",160,10,29000));
		
	
		Grupo acdc = f1.dameGrupo("AC/DC");
		
		System.out.println("FESTIVAL: ");
		System.out.println(f1);
	}

}
