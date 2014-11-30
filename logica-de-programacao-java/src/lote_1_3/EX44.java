/* Luan Cardoso
 * 15.	Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */

import javax.swing.JOptionPane;

public class EX44 {
    public static void main(String[] args){
        int x1,x2;
        x1 = 1;
	x2 = 6;
        System.out.println("Possibilidades de soma 7:");
	for(int i = 1; i <= 6; i++){
		System.out.println(x1 + " + " + x2);
		x1 = x1+1;
		x2 = x2-1;
        }

    }
}
