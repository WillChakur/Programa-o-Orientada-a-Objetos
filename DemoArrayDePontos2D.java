public class DemoArrayDePontos2D {
    public static void main(String[] args){
        ArrayDePontos2D arrayPontos = new ArrayDePontos2D(2);
        Ponto_2D ponto_aux = new Ponto_2D(3, 3);
        Ponto_2D ponto_aux2 = new Ponto_2D(4, 5);


        System.out.println(arrayPontos.tamanho());

        arrayPontos.modifica(0, ponto_aux);
        arrayPontos.modifica(1, ponto_aux2);

        System.out.println(arrayPontos.toString());

        Ponto_2D ponto_aux3 = arrayPontos.valor(0);

        System.out.println(ponto_aux3.toString());
    }
}
