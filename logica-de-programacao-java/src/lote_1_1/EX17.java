/* Luan Cardoso
 * Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
 Receber o tempo de percurso e a velocidade média.
 */

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EX17 {

    public static void main(String args[]) {

        double t, vm, l, s, kpl;
        /*t = tempo
         * vm = velocidade média
         * l = litro
         * s = espaço
         * kpl = km por litro
         */

        //Entradas de dados
        vm = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média:"));
        kpl = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos km o carro faz por litro:"));

        //Painel Personalizado para inserir a hora
        JPanel painel = new JPanel();

        painel.setLayout(null);
        painel.setBounds(0, 0, 2000, 2000);

        JTextField tx1 = new JTextField("hh");
        JTextField tx2 = new JTextField("mm");
        tx1.setBounds(40, 0, 30, 30);
        tx2.setBounds(80, 0, 30, 30);

        painel.add(tx1);
        painel.add(tx2);

        JOptionPane.showMessageDialog(null, painel, "Digite a duração do percurso:", JOptionPane.QUESTION_MESSAGE);

        //Pegar os valos JTextField e transferir para as variáveis
        double h = Double.parseDouble(tx1.getText());
        double m = Double.parseDouble(tx2.getText());

        //Convertendo horas para minutos
        t = h * 60 + m;
        t = t / 60;

        //Cálculo
        s = vm * t;
        l = s / kpl;

        //Saída de dados
        JOptionPane.showMessageDialog(null, "A Quantidade de litros gastos foi de: " + l);

    }
}
