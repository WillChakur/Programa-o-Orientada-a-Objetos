import java.util.Random;

public class Die {
    private int sideUP;

    public Die(){
        sideUP = 1;
    }

    public Die(int i){
        sideUP = i;
    }

    public int getSideUp(){
        return sideUP;
    }

    public void roll(){
        Random r = new Random();

        sideUP = r.nextInt(6) + 1;
    }

}
