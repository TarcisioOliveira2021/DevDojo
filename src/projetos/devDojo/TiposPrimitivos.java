package projetos.devDojo;

public class TiposPrimitivos {
	
	//Aula sobre TiposPrimitivos
	public static void main(String[] args) {
		// Existem 8 --int,double,float,char,byte,short,long e boolean
		int idade = 10;
		long numeroGrande= 1000000;
		double salario = 2000;
		float salarioEmFloat = 2500;
		byte idadeEmByte = 10;
		short idadeShort = 10;
		boolean verdadeiro = true;
		boolean falso = false;
		/* Caso tenha um numero ele vai considerar a tabela ASCI  
		 * Da para usar unicode colocando  \ + u + codigo do caractere .
		 */
		char caractere = 'A';
		AulaCasting();
	}
	//Aula sobre Casting
	public static void AulaCasting () {
		//Tentando armazenar um 'long' dentro de um 'int'.
		int idade2 = (int) 100000000L;
		
		//Tentando armazenar um 'float' dentro de um 'double'.
		double salarioDouble = (float) 25.000D;
		
		//Tentando colocar um valor decimal em um 'long'.
		long valor = (long) 151.141214;
		System.out.println(salarioDouble);
	}
	
	//Aula sobre Sting
	public static void AulaString() {
		String nome = "Aqui vai um textão";
		System.out.println("Oi," + nome);
		System.out.println(nome);
		
	}

}
