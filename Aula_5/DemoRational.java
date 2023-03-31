public class DemoRational {
    public static void main(String[] args){
        Rational r_1 = new Rational(2, 4);
        Rational r_2 = new Rational(4, 7);


        System.out.println("==== Racional 1 ====");
        r_1.Imprimir();
        r_1.Imprimir_p_f(2);

        System.out.println("==== Racional 2 ====");
        r_2.Imprimir();
        r_2.Imprimir_p_f(2);

        
       System.out.println("==== Somando ====");
        r_1.Somar(r_2);
        r_1.Imprimir();


        System.out.println("==== Subtraindo ====");
        r_1.Subtrair(r_2);
        r_1.Imprimir();

        System.out.println("==== Dividindo ====");
        r_1.Dividir(r_2);
        r_1.Imprimir();

        System.out.println("==== Multiplicando ====");
        r_1.Multiplicar(r_2);
        r_1.Imprimir();
    }
}
