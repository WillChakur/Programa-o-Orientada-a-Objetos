public class DieDemo {
    public static void main(String[] args){
        Die d_1 = new Die(2);
        Die d_2 = new Die(3);

        int soma;

        d_1.roll();
        d_2.roll();

        soma = d_1.getSideUp() + d_2.getSideUp();
        
        System.out.println(soma);
    }
}
