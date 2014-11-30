package lote_3;

/* Luan Cardoso
 * 1.	Criar e carregar uma matriz [4][3] inteiro com Ex_01_quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
a.	A Ex_01_quantidade de cada produto vendido no mês;
b.	A Ex_01_quantidade de produtos vendidos por semana;
c.	O total de produtos vendidos no mês.

 */

public class Ex_01_Main {

    public static void main(String args[]) {
        Ex_01_quantidade Q = new Ex_01_quantidade();
        Q.ManipulaQuantidade();

        System.out.println();
        System.out.println("Venda mensal por produto:");
        Q.venda_mes();

        System.out.println();
        System.out.println("Total de produtos vendidos por semana:");
        Q.venda_semana();
        
        System.out.println();
        Q.total();
    }
}
