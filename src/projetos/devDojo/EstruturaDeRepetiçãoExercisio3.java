package projetos.devDojo;

public class EstruturaDeRepetiçãoExercisio3 {
	//Dado um valor de um carro , descubra em quantas ele pode ser parcelado.
	//Condição é que o valorDaParcela >= 1000.
	public static void main(String[] args) {
		
		double valorTotal = 40000;
		for (int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if (valorParcela < 1000) {
				break;
			}
			System.out.println("Parcela "+parcela + " R$ " + valorParcela);			
		}
	}
}
