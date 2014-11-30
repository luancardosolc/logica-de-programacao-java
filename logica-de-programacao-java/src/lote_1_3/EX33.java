/* Luan Cardoso
 4.Receba a data de nascimento e atual em ano, mês e dia.
 * Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 */

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX33 {

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

        //Painel para coletar as datas
        JPanel painel = new JPanel();

        painel.setLayout(null);
        painel.setBounds(0, 0, 2000, 2000);

        JTextField tx1 = new JTextField("hh");
        JTextField tx2 = new JTextField("mm");
        JTextField tx3 = new JTextField("aaaa");
        tx1.setBounds(40, 0, 30, 30);
        tx2.setBounds(80, 0, 30, 30);
        tx3.setBounds(120, 0, 60, 30);

        painel.add(tx1);
        painel.add(tx2);
        painel.add(tx3);

        //Coletando e Validando a data de nascimento
        JOptionPane.showMessageDialog(null, painel, "Digite a data de nascimento", JOptionPane.QUESTION_MESSAGE);
        nd = Integer.parseInt(tx1.getText());
        nm = Integer.parseInt(tx2.getText());
        na = Integer.parseInt(tx3.getText());

        while (nd < 1 || nd > 31 || nm < 1 || nm > 12 || na < 1850) {
            JOptionPane.showMessageDialog(null, "Data inválida! Digite outra data!", "Erro", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, painel, "Digite a data de nascimento:", JOptionPane.QUESTION_MESSAGE);
            nd = Integer.parseInt(tx1.getText());
            nm = Integer.parseInt(tx2.getText());
            na = Integer.parseInt(tx3.getText());
        }

        //Colentando e Validando a data atual
        JOptionPane.showMessageDialog(null, painel, "Digite a data atual:", JOptionPane.QUESTION_MESSAGE);
        ad = Integer.parseInt(tx1.getText());
        am = Integer.parseInt(tx2.getText());
        aa = Integer.parseInt(tx3.getText());

        while (ad < 1 || ad > 31 || am < 1 || am > 31 || aa < 1850) {
            JOptionPane.showMessageDialog(null, "Data Inválida! Digite outra data!", "Erro", JOptionPane.ERROR_MESSAGE);
            ad = Integer.parseInt(tx1.getText());
            am = Integer.parseInt(tx2.getText());
            aa = Integer.parseInt(tx3.getText());
        }

        //Cálculo do ano
        ia = aa - na;

        //Cálculo do mes
        if (am < nm) {
            am = am + 12;
            ia = ia - 1;
        }
        im = am - nm;
        am = am - 12;

        //Calculo do dia
        if (ad < nd) {
            switch (am) {
                case 1:
                    ad = ad + 31;
                    im--;
                    break;
                case 3:
                    ad = ad + 31;
                    im--;
                    break;
                case 5:
                    ad = ad + 31;
                    im--;
                    break;
                case 7:
                    ad = ad + 31;
                    im--;
                    break;
                case 8:
                    ad = ad + 31;
                    im--;
                    break;
                case 10:
                    ad = ad + 31;
                    im--;
                    break;
                case 4:
                    ad = ad + 30;
                    im--;
                    break;
                case 6:
                    ad = ad + 30;
                    im--;
                    break;
                case 9:
                    ad = ad + 30;
                    im--;
                    break;
                case 11:
                    ad = ad + 30;
                    im--;
                    break;
                case 2:
                    b = aa % 4;
                    if (b == 0) {
                        ad = ad + 29;
                        im--;
                    } else {
                        ad = ad + 28;
                        im--;
                    }
                    break;
            }
        }

        id = ad - nd;

        JOptionPane.showMessageDialog(null, "A idade é de " + ia + " anos, " + im + " meses e " + id + " dias");
    }
}
