package projetos.devDojo;

public class Array4 {
	public static void main(String[] args) {
		//Ligacao dias e meses.
		//ArrayMult
		int[][] dias = new int[3][3];
		
		//Incrementando
		dias[0][0] = 31;
		dias[0][1] = 28;
		dias[0][2] = 32;
		
		dias[1][0] = 27;
		dias[1][1] = 37;
		dias[1][2] = 9;
		
		//Listando os elementos do array.
		for (int i = 0; i < dias.length; i++) {
			for (int j = 0; j < dias[i].length; j++) {
				System.out.println(dias[i][j]);
			}
			System.out.println("--------------");
		}
		
		
	}
}
