public class CarroNaoIdeal{
    // atributos
    public float velocidade;
    // metodos
    public void definirVelocidade(float v){
    if (v <= 200){ velocidade = v;}
    else velocidade = 0;
    }
    public void acelerar(float v){
    // o carro so’ pode atingir 200km/h
        if ((velocidade + v) <= 200){
            velocidade += v;
        }
        else{
            velocidade = 200;
        }
    }
}
