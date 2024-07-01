package calculadoraOrientaObjetos;
import calculadoraaa.Calculadora;




public class Main {

	public static void main(String[] args) {
		int somaX = Calculadora.soma(10,3);
		int subX = Calculadora.sub(10,3);
		int multx = Calculadora.multi(10, 3);
		int divx = Calculadora.div(10, 5);
		
		System.out.println("a soma é " + somaX);
		System.out.println("a subtracao é " + subX);
		System.out.println("a multiplicacao é " + multx);
		System.out.println("a divisao é " + divx);
		

	}

}
