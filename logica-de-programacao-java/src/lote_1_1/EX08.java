package lote_1_1;

/* Luan Cardoso
 * Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */
import javax.swing.JOptionPane;

public class EX08 {

    public static void main(String args[]) {
        float deposito, taxa, tempo, montante;
        deposito = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do depósito:"));
        taxa = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa utilizando ponto (.) como separador de decimais:"));
        tempo = Float.parseFloat(JOptionPane.showInputDialog("Digite o tempo de aplicação:"));

        montante = (float) (deposito * (Math.pow((1 + (taxa / 100)), tempo)));

        System.out.println("O valor após o tempo de aplicação é de: R$ " + montante);

    }

}
