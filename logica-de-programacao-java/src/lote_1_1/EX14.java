package lote_1_1;

/* Luan Cardoso
 * Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 */
import javax.swing.JOptionPane;

public class EX14 {

    public static void main(String args[]) {
        double a, b, c;

        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro angulo:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo angulo:"));

        c = 180 - (a + b);

        System.out.println("O valor do terceiro ângulo é de: " + c + " graus");

    }
}
