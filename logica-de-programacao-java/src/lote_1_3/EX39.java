package lote_1_3;

/* Luan Cardoso
 * 10.	Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 */
import javax.swing.JOptionPane;

public class EX39 {

    public static void main(String args[]) {
        double n, fat, i;
        double soma;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de N:"));
        soma = 1;
        String buffer = ("  " + soma);;

        //cálculo do fatorial
        fat = 1;
        for (i = 1; i <= n; i++) {
            fat = fat * i;
            soma = soma + 1 / fat;
            buffer += ("\n" + "+ " + soma);
        }
        JOptionPane.showMessageDialog(null, "A série é: \n" + buffer);
    }
}
