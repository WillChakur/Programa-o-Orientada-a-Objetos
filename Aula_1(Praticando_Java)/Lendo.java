import java.util.Scanner;

public class Lendo {
   public static void main(String[] a){
    Scanner t = new Scanner(System.in);

    int i = t.nextInt();
    double r = t.nextDouble();

    //Precisamos limpar o buffer do teclado
    String s = t.nextLine();

    System.out.println("Inteiro: " + i);
    System.out.println("Real: " + r);
    System.out.println("Frase: " + s);
   } 
}
