package lote_1_3;

/* Luan Cardoso
 * 16.	Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */
import javax.swing.JOptionPane;

public class EX45 {

    public static void main(String[] args) {
        double x, i, s;
        x = -1;
        s = 0;
        for (i = 1; i <= 50; i++) {
            x += 2;
            s += i / x;
            System.out.println("(" + i + "/" + x + ")");
        }
        System.out.println("Soma da sequência: " + s);
    }
}
