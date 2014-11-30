package lote_1_1;

import javax.swing.JOptionPane;

/* Luan Cardoso
 * Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes.
 * Calcule o salário que serão as horas trabalhadas x o valor por hora.
 * Calcule o salário líquido (= Salário Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário Líquido.
 * Exiba o salário a receber.
 */
public class EX16 {

    public static void main(String args[]) {

        double hora, valor, filhos, sal_l, sal_b, sal_rec, perc_desc;
        /*sal_liq = salário liquido
         * sal_b = salário bruto
         * sal_rec = salário a receber
         * perc_desc = percentual de desconto
         */

        //Cáculo do Salário
        hora = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas:"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora:"));
        perc_desc = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:"));
        filhos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de filhos"));
        sal_b = hora * valor;
        sal_l = sal_b * (1 - (perc_desc / 100));
        sal_rec = sal_l + (filhos * 100);

        //Saída de dados
        System.out.println("O salário a receber é de: R$ " + sal_rec);

    }
}
