package operadores;

public class Incremento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ++ y --
		int x = 9;
		x++; // Es lo mismo x = x + 1
		++x; // Es lo mismo x = x + 1
		System.out.println("x = " + x);
		
		//Cuidado esto cambia cuando este operador se combina con el de asignacion
		int y = 5;
		int z = y++;
		int h = ++y;
		
		System.out.println("z = " + z);
		System.out.println("y = " + y);
		System.out.println("h = " + h);
		
	}

}
