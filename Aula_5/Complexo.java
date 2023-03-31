public class Complexo {
    private float parte_real;
    private float parte_imag;

    float aux_real, aux_imag;

    public Complexo(int real, int imag){
        parte_real = real;
        parte_imag = imag;
    }

    public Complexo(){
        parte_real = 0;
        parte_imag = 0;
    }

    public void imprimeNumero(){
        if(parte_imag >= 0){
            System.out.println(parte_real + "+" + parte_imag + "i");
        }
        else{
            System.out.println(parte_real + "" + parte_imag + "i");
        }
    }

    public boolean eIgual(Complexo nC){
        if(nC.parte_real == parte_real && nC.parte_imag == parte_imag){
            return true;
        }
        else
            return false;
    }

    public void soma(Complexo nC){

        aux_real = parte_real;

        parte_real = nC.parte_real + parte_real;
        parte_imag = nC.parte_imag + parte_imag;

    }

    public void subtrai(Complexo nC){
        aux_real = parte_real;


        parte_real = nC.parte_real - parte_real;
        parte_imag = nC.parte_imag - parte_imag;
    }

    public void multiplica(Complexo nC){

        aux_real = parte_real;

        parte_real = (nC.parte_real*parte_real)-(nC.parte_imag*parte_imag);
        parte_imag = (nC.parte_real*parte_imag)+(nC.parte_imag*aux_real);

    }

    public void divide(Complexo nC){
        aux_real = parte_real;

        parte_real = ((parte_real*nC.parte_real) + (parte_imag*nC.parte_imag))/((nC.parte_real * nC.parte_real) + (nC.parte_imag * nC.parte_imag));

        parte_imag = ((parte_imag*nC.parte_real) - (aux_real*nC.parte_imag))/
        ((nC.parte_real * nC.parte_real) + (nC.parte_imag * nC.parte_imag));

    }
}
