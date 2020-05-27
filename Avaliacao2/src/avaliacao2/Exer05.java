/*
 * Temos triângulos feito de blocos. A linha superior tem 1 bloco, a próxima
 * linha abaixo tem 2 blocos, a próxima linha tem 3 blocos e assim por diante.
 * Criar uma função recursiva que calcule (sem loops ou multiplicação) o número 
 * total de blocos em um triângulo com o número especificado de linhas.
 *
 * Exemplos:
 * triangulo(0) → 0
 * triangulo(1) → 1
 * triangulo(2) → 3
 */
package avaliacao2;

/**
 * @author Evelyn Milene Carmo
 * @author Leonardo Maia Silva
 * @author Rone Silva
 */

public class Exer05 {

    public static void main(String[] args) {
        System.out.println(triangulo(100));
    }
    
    public static int triangulo (int linha){
        
        if (linha == 1) {
            return 1;
        } 
        return 1 + triangulo(linha-1);
    }
}
