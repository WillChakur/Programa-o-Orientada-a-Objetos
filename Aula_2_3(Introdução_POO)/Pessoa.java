public class Pessoa {
    
    // Atributos
    private String nome;
    private String cpf;
    private int anoNasc;


    // Metodo construtor carregado e nao carregado
    public Pessoa(){
        nome = ""; cpf = ""; anoNasc = 0;
    }  

    public Pessoa(String no){
        nome = no; cpf = ""; anoNasc = 0;
    }

    public Pessoa(String no, String c, int a){
        nome = no;
        cpf = c;
        anoNasc = a;
    }

    // Metodos Definidores
    public void setNome(String n){
        nome = n;
    }

    public void setCpf(String c){
        cpf = c;
    }

    public void setAnoNasc(int a){
        anoNasc = a;
    }

    // Outros Metodos
    public void imprimirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Ano: " + anoNasc);
    } 
}
