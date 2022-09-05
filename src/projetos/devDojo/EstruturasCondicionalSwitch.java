package projetos.devDojo;

public class EstruturasCondicionalSwitch {
	// Imprime o dia da semana considerando 1 = domingo 2 = segunda ... 
	public static void main(String[] args) {
		//byte pois o espaço ocupado vai ser menor.
		byte dia = 2 ;
	 
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
			
		default:
			System.out.println("Opção invalida informe, novamente.");
			break;
		}
		
		
		//Outro exemplo
		char sexo = 'M';
		switch (sexo) {
		case 'M':
			System.out.println("Sexo Masculino");
			break;
		case 'F': {
			System.out.println("Sexo Feminino");
			break;
		}	
		default:
			System.out.println("Outro Genero foi informado.");
			break;
		}
		
	}
}
