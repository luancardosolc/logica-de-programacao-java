/* Luan Cardoso
Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa:	1	2	3	4	...	64
Qte:	1	2	4	8	...	N
 */

public class EX42 {

    public static void main(String args[]) {
        double c, g;
        c = 1;
        g = 1;
        System.out.println("Casa:" + c);
        System.out.println("Grãos:" + g);
        
        while (c<=64) {
            c++;
            g = g * 2;
            System.out.println("Casa: " + c);
            System.out.println("Grãos: " + g);
        }
    }
}
