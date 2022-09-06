package projetos.devDojo;
public class Arrays5 {
	public static void main(String[] args) {
		
		//Esse array de array's tem 3 possições ( 0 - 1 - 2 ) 
		//Array é uma variavél que inicia vazia.
		int[][] arrayArayInt = new int [3][];
		
		//Podemos criar dessa forma tbm :
		int[][] array2 = {{0,0},{0,0,0},{5,4,3,2}}; 
		
		
		//Cada posição está sendo referenciada para um outro array de "X" posições.
		//Aqui para cada objeto é definido o valor inicial 0.
		//0 -> 2 posições.
		//1 -> 3 posições.
		//2 -> 6 posições.
		arrayArayInt[0] = new int[2];
		arrayArayInt[1] = new int[3];
		//arrayArayInt[2] = new int[6];
		//Segunda forma de fazer :
		arrayArayInt[2] = new int[]{1,2,3,4};
		
		//Varendo o arrayArayInt trazendo os valores das posições do seus array's internos.
		for (int[] arrayBase : arrayArayInt) {
			System.out.println("---");
			for(int num : arrayBase) {
				System.out.print(num);
			}
		}

		//Varrendo o array2 :
		for(int[] array2Base: array2) {
			System.out.println("---");
			for(int num: array2Base) {
				System.out.print(num);
			}
		}
	}
}
