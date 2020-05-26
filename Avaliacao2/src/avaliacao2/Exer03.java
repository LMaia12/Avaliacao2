/* Temos vários coelhos e cada coelho tem duas orelhas grandes e flexíveis. 
 * Queremos calcular o número total de orelhas em todos os coelhos de forma
 * recursiva (sem loops ou multiplicação). Criar uma função recursiva que receba 
 * um número N representando o número de coelhos e retorne a número total de 
 * orelhas.
 *
 * Exemplos:
 * orelhasCoelho(0) → 0
 * orelhasCoelho(1) → 2
 * orelhasCoelho(2) → 4
 */

package avaliacao2;

/**
 * @author Evelyn Milene Carmo
 * @author Leonardo Maia Silva
 * @author Rone Silva
 */

public class Exer03 {

    public static void main(String[] args) {
        System.out.println(orelhaCoelho(1));
    }
    
    public static int orelhaCoelho(int coelho){
        
        if (coelho == 0) {
            return 0;
        } if (coelho == 1) {
            return 2;
        } 
        return 2 + orelhaCoelho(coelho-1);
    }
}
