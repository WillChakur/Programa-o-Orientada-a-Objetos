public class ComplexoDemo {
    
    public static void main(String[] args){

        Complexo nC = new Complexo(2, 3);
        Complexo nC_2 = new Complexo(4, 2);

        nC.imprimeNumero();
        nC_2.imprimeNumero();

        System.out.println("======== Verificando se são iguais =========");
        System.out.println(nC.eIgual(nC_2));

        System.out.println("======== SOMA =========");
        nC.soma(nC_2);
        nC.imprimeNumero();

        System.out.println("======== SUBTRAÇÃO =========");
        nC.subtrai(nC_2);
        nC.imprimeNumero(); 

        System.out.println("======== MULTIPLICAÇÃO =========");
        nC.multiplica(nC_2);
        nC.imprimeNumero();

        System.out.println("======== DIVISÃO =========");
        nC.divide(nC_2);
        nC.imprimeNumero();
        
    }
}
