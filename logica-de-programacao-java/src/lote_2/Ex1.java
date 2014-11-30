/* Luan Cardoso
 * 1.	Carregar um vetor[30] inteiros.Exibir:
Quantidade de números pares
Quantidade de números ímpares
Média dos números pares
 */

import javax.swing.JOptionPane;

public class Ex1 {
    public static void main(String args[]){
        int vetor[] = new int[30];
        int p,imp,mP;
        
        p = 0;
        imp = 0;
        mP = 0;
        
        for(int i = 0; i < 30; i ++){
            vetor[i] = i + 1;
            System.out.println(vetor[i]);
            if(vetor[i] % 2 == 0){
                p += 1;
                mP += vetor[i];
            }
            else{
                imp += 1;
            }
        }
        mP /= p;
        JOptionPane.showMessageDialog(null,"Quantidade pares " + p +
        "\nQuantidade de ímpares: " + imp +
        "\nMédia dos pares: " + mP);
    }
}
