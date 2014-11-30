package lote_1_3;

/* Luan Cardoso
 34.	Calcule e mostre o quadrado dos números entre 10 e 150.
 */
public class EX34 {

    public static void main(String args[]) {
        String buffer = "";
        for (int x = 10; x <= 150; x++) {
            buffer += ("\n" + x + "^2 = " + (x * x));
        }
        System.out.println(buffer);
    }
}
