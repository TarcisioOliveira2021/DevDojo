package projetos.devDojo;

public class EstruturasCondicionalSwitchExercisio {
	public static void main(String[] args) {
		// Ultilizando switch e dado os valores de 1 a 7 imprima se � dia util ou final de semana.
		// Considerando 1 como domingo.
		
		byte dia = 1;
		
		switch (dia) {
		case 1:
		case 7:
			System.out.println("Final de semana");
			break;
			
		case 2:	
		case 3:			
		case 4:			
		case 5:			
		case 6:
			System.out.println("Dia �til");
			break;
			
		default:
			System.out.println("Op��o , invalida :(");
			break;
		}
	}
}
