/* Luan Cardoso
 * Receba a hora de início e de final de um jogo (HH,MM) sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 */

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX25 {

    public static void main(String args[]) {
        double x = 0, hi, hf, mi, mf, th, tm;

        /*hora inicial = hi
         * hora final = hf
         * minuto inicial = mi
         * minto final = mf
         * total hora = th
         * total minuto = tm
         */
        
        //Painel para coletar a hora
        JPanel painel = new JPanel();
        painel.setLayout(null);
        JTextField tx1 = new JTextField();
        JTextField tx2 = new JTextField();
        tx1.setBounds(40, 0, 30, 30);
        tx2.setBounds(80, 0, 30, 30);
        painel.add(tx1);
        painel.add(tx2);
        JOptionPane.showMessageDialog(null, painel, "Digite a hora inicial do jogo", JOptionPane.QUESTION_MESSAGE);

        //Tranferindo de TextField para as variáveis
        hi = Double.parseDouble(tx1.getText());
        mi = Double.parseDouble(tx2.getText());

        while (hi < 0 || hi > 23 || mi < 0 || mi > 59) {
            JOptionPane.showMessageDialog(null, painel, "Horário Incorreto! Digite um horário válido para o início do jogo:", JOptionPane.QUESTION_MESSAGE);
            hi = Double.parseDouble(tx1.getText());
            mi = Double.parseDouble(tx2.getText());
        }

        //Coletando o horário final
        JOptionPane.showMessageDialog(null, painel, "Digite a hora final do jogo:", JOptionPane.QUESTION_MESSAGE);
        
        //Tranferindo de TextField para as variáveis
        hf = Double.parseDouble(tx1.getText());
        mf = Double.parseDouble(tx2.getText());

        while (hf < 0 || hf > 23 || mf < 0 || mf > 59) {
            JOptionPane.showMessageDialog(null, painel, "Horário inválido, digite um horário válido para o final do jogo:", JOptionPane.QUESTION_MESSAGE);
            hf = Double.parseDouble(tx1.getText());
            mf = Double.parseDouble(tx2.getText());
        }

        //Cálculo da duração da partida
        if (hi > hf) {
            hf = hf + 24;
        }
        th = hf - hi;
        if (mi > mf) {
            mf = mf + 60;
            th = th - 1;
        }
        tm = mf - mi;

        //Formatando a hora e minutos para não ter pontos ou vírgula
        int th1 = (int) th;
        int tm1 = (int) tm;

        //Saída de dados
        if (th1 > 0 && tm1 > 0) {
            JOptionPane.showMessageDialog(null, "A partida durou " + th1 + " horas e " + tm1 + " minutos!");
        }
        if (th1 > 0 && tm1 == 0) {
            JOptionPane.showMessageDialog(null, "A partida durou " + th1 + " horas!");
        }
        if (th1 == 0 && tm1 > 0) {
            JOptionPane.showMessageDialog(null, "A partida durou " + tm1 + " minutos!");
        }
    }
}