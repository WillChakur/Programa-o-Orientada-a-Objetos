import java.util.Random;

public class OlaMundo{
    public static void main(String[] args){

        double d;
        d = Math.sqrt(25);
        d = Math.pow(4, 2);
        d = Math.sin(93);

        // o new cria um novo objeto da classe especificada 
        Random r = new Random();
        int i = r.nextInt(10);

        System.out.printf("%8.2f", d);

        int[] vet = new int[10];
        vet[0] = 5;
        vet[9] = 4;

        System.out.println("Olá Mundo!!");
    }
}
