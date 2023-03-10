import javax.swing.JOptionPane;

public class Lendo_2 {
    public static void main(String[] args){
        String texto;
        texto = JOptionPane.showInputDialog("Entre com um numero");
        //convertendo string em int

        int numero = Integer.parseInt(texto);
        
        //imprimindo a mensagem
        JOptionPane.showMessageDialog(null, numero);
        //o null aqui é o endereço
    }
}
