public class CalculadoraDeLinhaDeComando_2 {
    public static void main(String[] argumentos)
    {
        int quant_args = argumentos.length;
        int i;
        int valores[] = new int[quant_args];
        char operador = argumentos[0].charAt(0);
        int resultado = 0;

        for(i=0; i<quant_args; i++){
            valores[i] = Integer.parseInt(argumentos[i+ 1]);
        }

        switch(operador){
            case '+': 
                for(i=0; i<quant_args; i++)
                {
                    resultado += valores[i];
                }
                    break;
            case 'x': 
                resultado = 1;
                for(i=0; i<quant_args; i++){
                    resultado = resultado * valores[i];
                }
                break;
        }
    }
}
