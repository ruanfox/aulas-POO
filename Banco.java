import java.util.*;

public class Banco {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.numero = 123;
		conta.saldo = 0.0;
		
		System.out.print("\nConta: "+conta.numero+" - "+conta.verSaldo());
		
		conta.depositar(300.0);
		
		System.out.print("\nConta: "+conta.numero+" - "+conta.verSaldo());
		
		conta.sacar(110.0);
		
		System.out.print("\nConta: "+conta.numero+" - "+conta.verSaldo());
		
	}
}