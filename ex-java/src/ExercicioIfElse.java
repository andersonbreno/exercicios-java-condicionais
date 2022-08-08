import javax.swing.JOptionPane;

public class ExercicioIfElse {
    public static void main(String[] args) {
        
        String valor = JOptionPane.showInputDialog("Informe um número: ");
        int num = Integer.parseInt(valor);

        if (num % 2 == 0) {
            System.out.println("Número Par!");
        } else {
            System.out.println("Número Ímpar");

        }
    }
}
