public class Balanco_Trimestral {
    public static void main(String[] args){
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosFevereiro + gastosJaneiro + gastosMarco;
        int mediaMensal = gastosTrimestre / 3;

        System.out.println("Gastos no Trimestre: R$" + gastosTrimestre);
        System.out.print("Valor da média mensal: R$" + mediaMensal);
    }
}
