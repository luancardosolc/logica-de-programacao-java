package lote_1_3;

/* Luan Cardoso
 3.Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
 * Demais tipos não serão considerados.
 */
import javax.swing.JOptionPane;

public class EX32 {

    public static void main(String args[]) {
        double v;
        int i;

        i = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de investimento:"
                + "\n1-Poupança;"
                + "\n2-Renda Fixa."));

        while (i != 1 && i != 2) {
            i = Integer.parseInt(JOptionPane.showInputDialog("Opção inválida! Digite o tipo de investimento"
                    + "\n1-Poupança;"
                    + "\n2-Renda Fixa."));
        }

        v = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser investido:"));

        if (i == 1) {
            v = ((v * 3) / 100) + v;
            JOptionPane.showMessageDialog(null, "O Valor corrigido é de: R$ " + v);
        }
        if (i == 2) {
            v = ((v * 5) / 100) + v;
            JOptionPane.showMessageDialog(null, "O valor corrigido é de: R$ " + v);
        }
    }
}
