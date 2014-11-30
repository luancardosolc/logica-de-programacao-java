/* Luan Cardoso
 * Métodos do main
 */

public class Ex_02_metodo {

    static int m[][] = new int [4][4];

    static void aleatorio() {
        int n = 0;
        for (int i = 0; i <= 3; i++) {
            for (int k = 0; k <= 3; k++) {
                n = n+1;
                m[i][k] = n;
            }
        }
    }


    static void diagonal () {
        int n=1;
        for (int i=0;i<=3;i++){
            m[i][i] = n;
            n = n*4;
        }
    }

    static void mostrar () {
        System.out.println("A matriz é:");
        for (int i=0;i<=3;i++) {
            for (int k=0;k<=3;k++){
                System.out.print(m[i][k]+"|");
            }
            System.out.println();
        }
    }
}
