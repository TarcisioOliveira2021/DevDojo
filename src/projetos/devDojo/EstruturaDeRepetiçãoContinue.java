package projetos.devDojo;


public class EstruturaDeRepetiçãoContinue {
	//Dado um valor de um carro , descubra em quantas ele pode ser parcelado.
	//Condição é que o valorDaParcela >= 1000.
	public static void main(String[] args) {
		double valorTotal = 40000;
		for (int parcela = (int)valorTotal; parcela >= 1; parcela--) {
			double valorParcela = valorTotal /parcela;
			if (valorParcela < 1000) {
				//Não vai executa o bloco do sysout enquando o valorDaParcela for menor que 1000.
				continue;
			}
			System.out.println("Parcela "+parcela + " R$ " + valorParcela);			
		}
	}
}
