import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static String s2;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;

		System.out.println("Qual � o seu nome:");
		nome = sc.next();

		int idade;
		System.out.println("Qual � sua idade:");
		idade = sc.nextInt();

		double x = 2.32432;

		System.out.println(x);
		System.out.printf("%.2f%n", x);

		System.out.printf("%s tem %d anos e ganha 4,500 reais", nome, idade);
		
		
		String s1, s3;
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("F para fechar");

		char x1 = sc.next().charAt(0);
		
		
		//Condicao
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;


		///////////////////////////////////////////////////////////////////////////////////////


		//Strings

		String original = "abcde ABCDE ";

		String st1 = original.toLowerCase();
		String st2 = original.toUpperCase();
		String st3 = original.trim();
		String st4 = original.substring(2);
		String st5 = original.substring(2, 9);
		String st6 = original.replace( 'a', 'x');
		String st7 = original.replace( "abc", "yxz");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");


		System.out.println("toLowerCase: " + st1);
		System.out.println("toUpper: " + st2);
		System.out.println("trim: " + st3);
		System.out.println("substring: " + st4);

		String s = "potato apple lemon";

		String[] vet = s.split(" ");
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);


		Locale.setDefault(Locale.US);
		sc.close();

	}

}
