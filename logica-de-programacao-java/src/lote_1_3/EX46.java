package lote_1_3;

/* Luan Cardoso
 Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria
 sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 */
import javax.swing.JOptionPane;

public class EX46 {

    public static void main(String[] args) {
        int ana, maria, a;
        ana = 110;
        maria = 150;
        a = 0;
        while (ana <= maria) {
            ana = ana + 3;
            maria = maria + 2;
            a = a + 1;
        }
        JOptionPane.showMessageDialog(null, "Ana será maior que Maria em: " + a + " anos");
    }
}
