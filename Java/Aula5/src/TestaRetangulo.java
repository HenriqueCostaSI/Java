
public class TestaRetangulo {

	public static void main(String[] args) {
		
		
		Retangulo r = Retangulo();
		//r.lado[0] = 2;
		//r.lado[1] = 1;
		
		float lados [] = {2,3};
		
		r.alteraLado(lados);
	
		System.out.println("Area: " + r.calculaArea());
		System.out.println("Perimetro: " + r.calculaPerimetro());
	
		lados[0] = 5;
		
		System.out.println("Area: " + r.calculaArea());
	
		
	}
	
	

}
