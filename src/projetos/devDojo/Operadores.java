package projetos.devDojo;

public class Operadores {
	public static void main(String[] args) {
		// Aritmeticos:  + , - , / , *
		int numero01 = 10;
		int numero02 = 20;
		int resultado = numero01 + numero02;
		
		/*- Da para usar um cast é ficaria: 
		 * double resultado = numero01 + (double) numero02;
		*/
		
		System.out.println(numero02 - numero01);
		System.out.println(numero01 * numero02);
		System.out.println(numero01 + numero02);
		System.out.println(numero01 / numero02); 
		System.out.println(resultado);
		
		
		//Resto: %
		int resto = 20 % 2; 
		System.out.println(resto);
		
		
		//Logicos: < > <= >= == !=
		//Por padrao usa-se o is na frente do nome da variavel.
		boolean isDezMaiorQueVinte = 10 > 20;
		boolean isDezMenorQueVinte = 10 < 20;
		boolean isDezDiferenteDeVinte = 10 != 20;		
		boolean isDezIgualVinte = 10 == 20;
		System.out.println("isDezMaiorQueVinte"+isDezMaiorQueVinte);
		System.out.println("isDezMenorQueVinte"+isDezMenorQueVinte);
		System.out.println("isDezDiferenteDeVinte"+isDezDiferenteDeVinte);
		System.out.println("isDezIgualVinte"+isDezIgualVinte);
		
		//Logico: && (and) , || (or) , !
		//AND
		int idade = 29;
		double salario = 3500D;
		boolean isDentrodaleiMaiorQueTrinta = idade > 30 && salario >= 4612;
		boolean isDentrodaleiMenorQueTrinta = idade < 30 && salario >= 3381;
		System.out.println("Ele está dentro da lei: "+isDentrodaleiMaiorQueTrinta);
		System.out.println("Ele está dentro da lei: "+isDentrodaleiMenorQueTrinta);
		
		//OR
		double valorTotalContaCorrente = 200;
		double valorTotalContaPolpanca = 10000;
		float valorDoPlay = 5000F;
		boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorDoPlay || valorTotalContaPolpanca > valorDoPlay;
		System.out.println("O play5 é compravel:"+isPlaystationCincoCompravel);
		
		//Atribuição: = , += , -= , *= , %= e /=
 		double bonus = 1800;
 		bonus += 1000; //2800
 		bonus -= 1000; //1800
 		bonus *= 2;    //3600
 		bonus /= 2;    //1800
 		bonus %= 2;    //0
 		System.out.println("O valor do Bonus é:" + bonus);
 		
 		//Incrementadores:
 		int contador = 0;
 		contador += 1; //1
 		contador++;    //2
 		contador--;    //1
 		++contador;    //2
 		--contador;    //1
 		System.out.println("Contador = "+contador);
 	    // Na frente indicam que precisam ser feitos e atras são feitos dps
 		int contador2 = 0;
 		System.out.println("Contador2 = "+contador2++); //0
 		System.out.println("Contador2 = "+contador2); //1
 		System.out.println(++contador2); //2
 		
	}
}
