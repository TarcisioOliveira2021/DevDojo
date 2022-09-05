package projetos.devDojo;

public class EstruturasDeRepetiçãoExercisio2 {
	
	//Imprima os primeiro 25 de um dado valor. Por exemplo 50.
	public static void main(String[] args) {
		int valorMax = 50;
		for (int i = 0; i <= valorMax; i++) {
			//Caso o i seja maior que 25 pare o for.
			if (i > 25) {
				break;
			}
			System.out.println(i);
		}
	}

}
