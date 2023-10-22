import java.util.*;
public class Empresa {
	
	public static void main (String[] args) {
		Funcionario funcionario1 = new Funcionario("Ruan", 10,1);
		Funcionario funcionario2 = new Funcionario("Pablo", 200,10);
		Funcionario funcionario3 = new Funcionario("Ferreira", 100, 20);
		
		System.out.println("Funcionario 1:"+ funcionario1.getnome() + " => " + funcionario1.salarioFinal());
		System.out.println("Funcionario 1:"+ funcionario2.getnome() + " => " + funcionario2.salarioFinal());
		System.out.println("Funcionario 1:"+ funcionario3.getnome() + " => " + funcionario3.salarioFinal());
	}
}

