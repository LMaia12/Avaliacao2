/*
 * A multiplicação Russa consiste em:
 * a) Escrever os números A e B, que se deseja multiplicar na parte superior das
 * colunas;
 *
 * b) Dividir A por 2, sucessivamente, ignorando o resto até chegar à unidade, 
 * escrever os resultados da coluna A;
 *
 * c) Multiplicar B por 2 tantas vezes quantas se haja dividido A por 2, 
 * escrever os resultados sucessivos na coluna B;
 *
 * d) Somar todos os números da coluna B que estejam ao lado de um número ímpar
 * da coluna A.
 *
 * Exemplo: 27 x 82 = 2214
 * A  | B    | Parcelas
 * 27 | 82   | 82
 * 13 | 164  | 164
 * 6  | 328  | -
 * 3  | 656  | 656
 * 1  | 1312 | 1312
 * Soma: 2214
 *
 * Criar uma função recursiva que permita fazer à multiplicação russa de 2 
 * entradas.
 */
package avaliacao2;

/**
 * @author Evelyn Milene Carmo
 * @author Leonardo Maia Silva
 * @author Rone Silva
 */

public class Exer06 {

    public static void main(String[] args) {
        System.out.println("A  | B    | Parcela" );
        System.out.println("Total : " + multiplicacaoRussa(27, 82));
    }
    
    public static int multiplicacaoRussa(int a, int b){
        
        if (a == 1) {
            int parcela = b;
            exibeLinha(a, b, parcela);
            return parcela;
        }
        if (a % 2 == 1 ) {
            int parcela = b;
            exibeLinha(a, b, parcela);
            return parcela + multiplicacaoRussa(a/2, b*2);
        }
        
        exibeLinha(a, b, 0);
        return multiplicacaoRussa(a/2, b*2);
    }
    
    public static void exibeLinha (int a, int b, int parcela){
        
        if (a == 1) {
            System.out.println(a + "  | " + b + " | " + parcela);
        }else if (parcela == 0) {
            System.out.println(a + "  | " + b + "  | " + "-");
        } else if (a < 10) {
            System.out.println(a + "  | " + b + "  | " + parcela);
        }else if (b >= 10 && b <= 99) {
            System.out.println(a + " | " + b + "   | " + parcela);
        }else {
            System.out.println(a + " | " + b + "  | " + parcela);
        }
    }
    
}
