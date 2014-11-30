/* Luan Cardoso
 * Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem.
Mostre os 4 números em ordem crescente.
 */

import javax.swing.JOptionPane;

public class EX23 {

    public static void main(String args[]) {
        double a, b, c, d;

        JOptionPane.showMessageDialog(null,"Digite três valores em ordem crescente"
                + " e um quarto número não necessariamente em ordem:");
        
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
        
        //Verificando se o segundo número é maior que o primeiro
        while (a>=b) {
            b = Double.parseDouble(JOptionPane.showInputDialog("O valor digitado é menor ou igual ao anterior,"
                    + "digite outro valor:"));
        }
        
        //Recebendo o valor do terceiro número
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número:"));
        
        //Verificando se o terceiro número é maior que o segundo
        while (b>=c) {
            c = Double.parseDouble(JOptionPane.showInputDialog("O valor digitado é menor ou igual ao anterior,"
                    + "digite outro valor:"));
        }
        
        //Recebendo o quarto número
        d = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto número"));


        if (d > c) {
            JOptionPane.showMessageDialog(null,"A sequência é: " + a + ", " + b + ", " + c + ", " + d);
        } else {
            if (d > b) {
                JOptionPane.showMessageDialog(null,"A Sequência é: " + a + ", " + b + ", " + d + " e " + c);
            } else {
                if (d > a) {
                    JOptionPane.showMessageDialog(null,"A sequência é: " + a + ", " + d + ", " + b + ", " + c);
                } else {
                    JOptionPane.showMessageDialog(null,"A sequência é: " + d + ", " + a + ", " + b + ", " + c);
                }
            }
        }
    }
}