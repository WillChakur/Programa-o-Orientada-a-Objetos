public class UsaCarro {
    public static void main(String[] args){
        // declarando o objeto fusca da classe 
        CarroNaoIdeal fusca = new CarroNaoIdeal();

        //alterando a velocidade atraves dos metodos do objeto
        fusca.definirVelocidade(150);// velocidade = 150
        fusca.acelerar(400); // velocidade = 200
        //alterando diretamente o valor do atributo
        fusca.velocidade = 400;
    }    
}
