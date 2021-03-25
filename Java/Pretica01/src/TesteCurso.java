import java.util.Scanner;

public class TesteCurso {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);
		float[] n = new float[10];
		String s1;
		float media, maior;

		System.out.println("Digite o nome do curso:");
		s1 = leitura.nextLine();

		Curso.atribuiNome(s1);

		for (int i = 0; i < 10; i++) {
			System.out.printf("Digite a nota %d: ", i + 1);
			n[i] = leitura.nextFloat();
		}

		Curso.atribuiNotas(n);

		media = Curso.CalcMedia();
		maior = Curso.CalcMaior();

		System.out.printf("A média é %.2f%n", media);
		System.out.printf("A maior nota é %.2f", maior);

		leitura.close();

	}

}
