package lote_1_3;

/* Luan Cardoso
 Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */

import javax.swing.JOptionPane;

public class EX48{
    public static void main(String[] args){
        double x,i,s,o;
        x = 1;
        o = 1;
        s = 0;
	for(i = 0; i < 15; i++){
            i += 1;
            x = i * i;
            System.out.println("(" + i + "/" + x + ")");
            if(o == 1){
                s +=(i/x);
                o = 2;
            }
            else{
                s -= (i/x);
                o = 1;
            }
        }
              System.out.println("Soma: " + s);
    }
}