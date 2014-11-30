package lote_1_1;

/* Luan Cardoso
 * Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 */

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class EX02 {

    public static void main(String args[]) {

        //Quantidade de Casas Decimais
        DecimalFormat format = new DecimalFormat();
        format.setMaximumFractionDigits(3);
        format.setMinimumFractionDigits(2);

        //Procedimento
        double salario, sal_aumentado;
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario: "));
        sal_aumentado = salario + (salario * 15 / 100);
        JOptionPane.showMessageDialog(null, "O valor do salario reajustado é de: R$ " + format.format(sal_aumentado));
    }
}
