
public class Retangulo {
	
	public float lado[] = new float[2];
	
	public float[] retornaLado() {
		return lado;
	}
	
	public void alteraLado(float l[]) {
		//lado = l; //Perigo
		for (int i = 0; i<l.length; i++) {
			lado[i] = l[i];
		}
	}
	
	
	public float calculaArea() {
		
		return lado[0]*lado[1];
	}

	public float calculaPerimetro() {
		
		return lado[0]*2 + lado[1]*2;
	}
}
