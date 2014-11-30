/* Luan Cardoso
 4.Receba a data de nascimento e atual em ano, mês e dia.
 * Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 */

import javax.swing.JOptionPane;

public class EX33teste {

    public static void main(String args[]) {
        int na, nm, nd, aa, am, ad, ia, im, id, b, x = 0;
        /* Legenda:
         * na = ano de nascimento
         * nm = mes de nascimento
         * nd = dia de nascimento
         * aa = ano atual
         * am = mes atual
         * ad = dia atual
         * ia = idade em anos
         * im = idade em meses
         * id = idade em dias
         * b = ano bisexto
         */

        String Data = JOptionPane.showInputDialog("Digite a data de nascimento nesse padrão: dd/mm/aaaa");

        String[] dt = Data.split("/");

        //while (dt[0] < 0 || dt[1] > 31) {
    }
}
