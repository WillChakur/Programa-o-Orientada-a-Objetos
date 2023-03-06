import java.util.Scanner;

public class repeticao_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            System.out.println(i);
        }

        sc.close();
    }
}
