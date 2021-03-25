
public class Produtos {

	static String produto;

	static int codigo;

	static float precos[] = new float[5];

	public static void atribuiProduto(String str) {
		produto = str;

	}

	public String retornaProduto() {
		return produto;
	}

	public static void atribuiCodigo(int cod) {
		codigo = cod;

	}

	public int retornaCodigo() {
		return codigo;
	}

	public static void atribuiPrecos(float p[]) {

		for (int i = 0; i < 10; i++) {
			precos[i] = p[i];
		}
	}

	public static float retornaPrecos(int i) {
		return precos[i];
	}

	public static float maiorPreco() {
		float maior = precos[0];

		for (int i = 0; i < 10; i++) {
			if (maior < precos[i]) {
				maior = precos[i];
			}

		}

		return maior;
	}

	
	public static float menorPreco() {
		float menor = precos[0];

		for (int i = 0; i < 10; i++) {
			if (menor > precos[i]) {
				menor = precos[i];
			}

		}

		return menor;
		
	}
	
	
	public static float mediaPrecos() {
		float total = 0;

		for (int i = 0; i < 10; i++) {
			total += precos[i];
		}

		return (float) (total / 5);
		
		
	}
	
	
	
}
