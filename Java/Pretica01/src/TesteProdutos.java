import java.util.Scanner;

public class TesteProdutos {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		float[] p = new float[5];
		String s1;
		float media, maior, menor;

		System.out.println("Digite o nome do produto:");
		s1 = leitura.nextLine();

		Produtos.atribuiProduto(s1);

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite o preco %d: ", i + 1);
			p[i] = leitura.nextFloat();
		}

		Produtos.atribuiPrecos(p);

		maior = Produtos.maiorPreco();
		menor = Produtos.menorPreco();
		media = Produtos.mediaPrecos();

		System.out.printf("O pre�o no mercado 1 �" + Produtos.retornaPrecos(0));
		System.out.printf("O maior pre�o � %.2f%n", maior);
		System.out.printf("O menor pre�o � %.2f", menor);
		System.out.printf("A m�dia � dos pre�os � %.2f%n", media);

		leitura.close();

	}

}
