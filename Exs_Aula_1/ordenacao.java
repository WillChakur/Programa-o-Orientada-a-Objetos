import java.util.Random;

public class ordenacao {
    public static void main(String[] args){
        Random random = new Random();

        int[] array = new int[10];

        for(int i=0; i<10; i++){
            array[i] = random.nextInt(100);
        }

        int aux;

        for (int i=0; i < array.length; ++i){
            for (int j=i; j < array.length; ++j){
                if (array[i]>array[j]){
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        for (int i=0; i<array.length; ++i)
            System.out.println(array[i] + " ");
    }
}
