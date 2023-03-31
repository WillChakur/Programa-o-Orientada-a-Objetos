import java.util.Scanner;

public class numPerfeito {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = sc.nextInt();
        int aux=0;

        for(int i=1; i<num; i++){
            if(num % i == 0){
                aux += i;
            }
        }

        if(aux == num){
            System.out.print("Eh perfeito");
        }
        else{
            System.out.print("N eh perfeito");
        }

        sc.close();

    }
}
