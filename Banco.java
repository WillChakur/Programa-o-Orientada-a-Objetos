public class Banco{
    
    private ContaBancaria_2[] conta;
    int i;

    public Banco(int n){
        conta = new ContaBancaria_2[n];
    }

    public void inserir_cliente(String nome, double saldo, int i){
        conta[i] = new ContaBancaria_2(nome, saldo);
    }

    public double somar_saldos(){
        double total=0;
       
        for(i=0; i < conta.length; i++){
            if(conta[i] != null)
                total += conta[i].getSaldo();
        }

        return total;
    }
}