public class funcionario {
    public static void main(String[] args){
        //public Boleto(int codigo, String descricao, int diaDeVencimento, double valor)
        Boleto funcionario1 = new Boleto(12345,"banco",3,200);
        Boleto funcionario2 = new Boleto(98457345,"banco",3,500);
        System.out.println(funcionario1.pagar(3,20,100));
        System.out.println(funcionario1.exibir());
        System.out.println(funcionario2.pagar(2,100,400));
        System.out.println(funcionario2.exibir());
        
        
    }
    
}