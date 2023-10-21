public class ContaBancaria {
	
	int numero;
	double saldo;
	
	public void sacar(double saque){
		this.saldo -= saque;
	}
	
	public void depositar(double deposito){
		this.saldo += deposito;
	}
	
	public String verSaldo(){
		return "Saldo: R$ "+this.saldo;
	}
	
}