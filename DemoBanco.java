public class DemoBanco {
    public static void main(String[] args){
        Banco caixa_economica = new Banco(10);

        caixa_economica.inserir_cliente("William", 200, 0);
        caixa_economica.inserir_cliente("Pedro", 2000, 1);
        caixa_economica.inserir_cliente("Felipe", 20000, 2);

        double saldo = caixa_economica.somar_saldos();

        System.out.println(saldo);
        //contas[0] = new ContaBancaria_2("William", 200);

    }
}
