package matricesIrregulares;

import java.util.Random;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] irregular = new int[5][];
		
		
		irregular[0] = new int[2];
		irregular[1] = new int[5];
		irregular[2] = new int[8];
		irregular[3] = new int[4];
		irregular[4] = new int[7];
		
		for(int i = 0;i<irregular.length;i++) {
			for(int j = 0;j<irregular[i].length;j++) {
				irregular[i][j] = new Random().nextInt(11);
			}
		}
		
		for(int i = 0;i<irregular.length;i++) {
			for(int j = 0;j<irregular[i].length;j++) {
				
				System.out.print(irregular[i][j] + " ");

			}
			System.out.println();
		}

		
	}

}
