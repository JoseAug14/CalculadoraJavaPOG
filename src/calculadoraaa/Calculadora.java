 package calculadoraaa;

public class Calculadora {
	
	
	public static int soma(int a, int b) {
		int result = a + b;
		return result;
		
	}
	public static int sub(int a, int b) {
		int result = a - b;
		return result;
		
	}
	public static int multi(int a, int b) {
		int result = a * b;
		return result;
		
		
	}
	public static int div(int a, int b) {
		if (a != 0) {
			int result = a / b;
			return result;
		} 
		else {
			System.out.println("valor invalido");
			return 0;
		}
		
		
		
	}
	 
}	
