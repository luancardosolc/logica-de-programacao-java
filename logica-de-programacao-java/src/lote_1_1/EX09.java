package lote_1_1;

/* Luan Cardoso
 * Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados
 */
import javax.swing.JOptionPane;

public class EX09 {

    public static void main(String args[]) {
        double x, y, soma;
        x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        soma = (Math.pow(x, 2)) + (Math.pow(y, 2));

        System.out.println("A Soma dos quadrados é: " + soma);

    }
}
