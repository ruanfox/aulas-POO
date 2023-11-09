/**
 Exercício de POO
Boleto

- codigo: int
- descricao: String
- diaDeVencimento: int
- valor: Double
- status: boolean
+ Boleto(codigo: int, descricao: String, diaDeVencimento: int, valor: Double)
+ pagar(dia: int, desconto: Double, valorPago: Double): boolean
+ exibir(): String

O status do boleto se refere a estar pago ou não (true = pago). Todo boleto é criado
com o status false.
O método pagar registra o pagamento do boleto e modifica seu status. (Não permita o
pagamento do boleto em duplicidade). Ele recebe um inteiro (dia), um Double
(desconto) e um Double (valorPago), e verifica se a boleto está vencido, se estiver
aumenta o valor em 10%, se não estiver vencido aplica o desconto informado e
verifica se o valorPago é suficiente para pagar o boleto.
Ao efetuar um pagamento exiba na tela a informação se o pagamento foi realizado
com sucesso ou não.
O método exibir() retorna uma String com os detalhes do boleto.
Crie uma classe Financeiro que implemente dois boletos e teste seus métodos.
Opcional: Implemete um menu com opções para criação e pagamento de boletos.
Não se esqueça do encapsulamento.
 */
public class Boleto {
    private int codigo;
    private String descricao;
    private int diaDeVencimento;
    private double valor;
    private boolean status;
    
    public Boleto(int codigo, String descricao, int diaDeVencimento, double valor){
        this.codigo = codigo;
        this.descricao = descricao;
        this.diaDeVencimento = diaDeVencimento;
        this.valor = valor;
        this.status = false;
    }
    public String exibir(){
        String statusStr = status ? "Pago" : "Em berto";
        String detalhes = "Codigo: "+ codigo + "\n" + "Descrição:" + descricao + "\n" + "Dia de vencimento:" + diaDeVencimento + "\n" + "valor: R$ " + valor + "\n" + "Status" + statusStr;
        return detalhes;
    }
    public boolean pagar(int dia,double desconto, double valorPago){
        if(status){
            return false;
        }
        double valor_a_pagar;
        if(dia > diaDeVencimento){
            valor_a_pagar = valor * 1.1;
        }else{
            valor_a_pagar = valor - desconto;
        }
        if(valorPago >= valor_a_pagar){
            status = true;
            return status;
        }else{
            System.out.println("pagamento nao realizado");
        }
        
        return status;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    public void setDiaDeVencimento(int diaDeVencimento){
        this.diaDeVencimento = diaDeVencimento;
    }
    public int getDiaDeVencimmento(){
        return diaDeVencimento;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public double getValor(){
        return valor;
    }
    public boolean getStatus(){
        return status;
    }
}