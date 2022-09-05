package projetos.devDojo;

public class Array3 {

	public static void main(String[] args) {
		// Tipos de inicialização de um Array
		int[] arrayNumeros = new int[3];
		int[] arrayNumeros1 = { 9, 8, 5, 1 };
		int[] arrayNumeros2 = new int[] { 9, 8, 5, 1 };

		for (int i = 0; i < arrayNumeros2.length; i++) {
			System.out.println(arrayNumeros1[i]);
		}

		// Foreach
		for (int numeros : arrayNumeros2) {
			System.out.println(numeros);
		}

		// Foreach
		for (int numeros : arrayNumeros) {
			System.out.println(numeros);
		}
	}

}
