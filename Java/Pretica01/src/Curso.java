
public class Curso {

	static String nomeCurso;

	static float notas[] = new float[10];

	public static void atribuiNome(String str) {
			nomeCurso = str;
	
	}

	public String retornaNome() {
		return nomeCurso;
	}

	public static void atribuiNotas(float n[]) {

		for (int i = 0; i < 10; i++) {
			notas[i] = n[i];
		}
	}

	public static float retornaNotas(int i) {
		return notas[i];
	}

	public static float CalcMedia() {
		float total = 0;

		for (int i = 0; i < 10; i++) {
			total += notas[i];
		}

		return (float) (total / 10);
	}

	public static float CalcMaior() {
		float maior = notas[0];
		
		for (int i = 0; i < 10; i++) {
			if(maior < notas[i]) {
				maior = notas[i];
			}
			
			
		}
		return maior;
	}

		
		
		
}