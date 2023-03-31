public class Rational {
    private int numerador, denominador;

    public Rational(int nume, int deno){
        simplificar(nume, deno);
    }

    public boolean simplificar(int nume, int deno){
        int i;

        if (nume > deno){
            for(i=2; i<=deno; i++){
                if(nume % i == 0 && deno % i == 0){
                    numerador = nume/i;
                    denominador = deno/i;
                    return true;
                }
            }
        }
        else if(nume < deno){
            for(i = 2; i <= nume; i++){
                if(nume % i == 0 && deno % i == 0){
                   numerador = nume/i; 
                   denominador = deno/i;
                   return true;
                }
             }

        }
        else if(nume == deno){
            numerador = 1;
            denominador = 1;
            return true;
        }
       
        numerador = nume;
        denominador = deno;
        
        return false;
    }

    public Rational(){
        numerador = 1;
        denominador = 2;
    }

    public int MMC(int num_1, int num_2){
        if(num_1 % num_2 == 0){
            return num_1;
        } 

        if(num_2 % num_1 == 0){
            return num_2;
        }

        return num_1 * num_2;

    }

    public void Somar(Rational r_1){
        int denominador_aux = MMC(denominador, r_1.denominador);

        int numerador_aux = ((denominador_aux/denominador) * numerador) +
         ((denominador_aux / r_1.denominador) * r_1.numerador);

        simplificar(numerador_aux, denominador_aux);
    }

    public void Subtrair(Rational r_1){
        int denominador_aux = MMC(denominador, r_1.denominador);

        int numerador_aux = ((denominador_aux/denominador) * numerador) -
         ((denominador_aux / r_1.denominador) * r_1.numerador);


        simplificar(numerador_aux, denominador_aux);
    }

    public void Multiplicar(Rational r_1){
        int denominador_aux = denominador * r_1.denominador;
        int numerador_aux = numerador * r_1.numerador;
        
        simplificar(numerador_aux, denominador_aux);
    }

    public void Dividir(Rational r_1){
        int denominador_aux = denominador * r_1.numerador;
        int numerador_aux = numerador * r_1.denominador;
        
        simplificar(numerador_aux, denominador_aux);
    }

    public void Imprimir(){
        System.out.println(numerador + "/" + denominador);
    }

    public float manterCasas(float valor, int qtdCasas) {
        float fator = (float) Math.pow(10, qtdCasas);
        return (float) (Math.floor(valor * fator) / fator);
    }

    public void Imprimir_p_f(int num){
        float result = (float)numerador/(float)denominador;

        System.out.println(manterCasas(result, num));
    }
}
