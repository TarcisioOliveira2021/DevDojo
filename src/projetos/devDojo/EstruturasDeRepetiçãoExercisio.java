package projetos.devDojo;

public class EstruturasDeRepeti��oExercisio {
	public static void main(String[] args) {
		//imprimir todos os numeros pares entre 0 a 1 milh�o
		for (int valor = 0; valor <= 1000000; valor++) {
			if (valor % 2 == 0) {
				System.out.println(valor);
			}
		}
	}
}
