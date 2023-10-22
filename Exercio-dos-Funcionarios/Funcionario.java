import java.util.Scanner;

public class Funcionario{
	
	String nome;
	double horasTrabalhadas;
	double valorDaHora;
	
	public Funcionario(String nome, double horasTrabalhadas, double valorDaHora){
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorDaHora = valorDaHora;
		
	}
	
	public double salarioFinal(){
		double salarioBruto = horasTrabalhadas * valorDaHora;
		double desconto = salarioBruto *0.11;
		return salarioBruto - desconto;
	}
	
	public String getnome(){
		return nome;
	}
		
}
