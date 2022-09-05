package projetos.devDojo;

public class Arrays1 {
	public static void main(String[] args) {
		//variavel do tipo reference.
		//Com 3 espacos
		int[] idades = new int[3];
		idades[0] = 21;
		idades[1] = 15;
		idades[2] = 30;
		
		//Acessando
		System.out.println(idades[0]);
		System.out.println(idades[1]);
		System.out.println(idades[2]);
		
		//Provocando uma excecao
		idades[3] = 0;
		System.out.println(idades[3]);
	}
}
