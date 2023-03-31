public class ArrayDePontos2D {
    private Ponto_2D[] pontos;

    public ArrayDePontos2D(int num){
        pontos = new Ponto_2D[num];
    }

    public int tamanho(){
        return pontos.length;
    }

    public void modifica(int pos, Ponto_2D p2D){
        double x = p2D.getX();
        double y = p2D.getY();

        pontos[pos] = new Ponto_2D(x, y);
    }

    public Ponto_2D valor(int pos){
        double x = pontos[pos].getX();
        double y = pontos[pos].getY();

        Ponto_2D p2D = new Ponto_2D(x, y);

        return p2D;
    }

    public String toString(){
        String str = "";
        for(int i=0; i < pontos.length; i++){

            if(pontos[i] != null){
                str +="Ponto " + i + ": (" + String.valueOf(pontos[i].getX() + "," + String.valueOf(pontos[i].getY()) +") ");
            }
            
        }

        return str;
    }
}
