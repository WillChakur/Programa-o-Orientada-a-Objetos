import java.util.Scanner;

public class primo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num = sc.nextInt();
        boolean primo = true;


        for(int i=2; i<num; i++){
            if(num % i == 0){
                primo = false;
            } 
        }

        if(primo){
            System.out.print("Primo");
        }
        else{
            System.out.print("Nao eh Primo");
        }

        sc.close();
    }
}