import java.util.*;

public class calcular{
    public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calculadora valor = new Calculadora();
		
		System.out.print("escolha o primeiro numero: ");
		double numero1 = scanner.nextDouble();
		System.out.print("escolha o segundo numero: ");
		double numero2 = scanner.nextDouble();
		
		double resultadoMultiplicacao = valor.multiplicacao(numero1, numero2);
		double rusultadoDivisao = valor.divisao(numero1, numero2);
		double resultadoSubtracao = valor.subtracao(numero1, numero2);
		double resultadoSoma = valor.soma(numero1, numero2);
		
		System.out.println("Resultado da Multiplicação:" + resultadoMultiplicacao);
		System.out.println("resultado da divisão" + rusultadoDivisao);
		System.out.println("Resultado da subtração" + resultadoSubtracao);
		System.out.println("Resultado da Soma" + resultadoSoma);
	
	
	}
}
