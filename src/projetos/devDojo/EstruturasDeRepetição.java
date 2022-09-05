package projetos.devDojo;

public class EstruturasDeRepetição {
	public static void main(String[] args) {
		// while , do  while , for.
		
		//while
		byte count = 0;
		while (count < 10) {
			System.out.println("Numero - "+ ++count);
			// count += 1;
			// count = count + 1;
			// count++;
		}
		
		
		//Do- while
		count = 0;
		do {
			System.out.println("do - while : "+ ++count);
		} while (count < 10);

		
		//For
		count = 0;
		for (count = 0; count <= 10; count++) {
			System.out.println("For :" + count);
		}
	}
}
