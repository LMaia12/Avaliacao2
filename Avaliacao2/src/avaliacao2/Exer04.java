/*
 * Dada uma string, criar uma função recursiva (sem laços) que compute o número
 * de caracteres ’x’ na string.
 *
 * Exemplos:
 * contarX("xxhixx") → 4
 * contarX("xhixhix") → 3
 * contarX("hi") → 0
 *
 * Dica: utilize os métodos length() e substring() da classe String.
 */
package avaliacao2;

/**
 * @author Evelyn Milene Carmo
 * @author Leonardo Maia Silva
 * @author Rone Silva
 */
public class Exer04 {

    public static void main(String[] args) 
    {
        //chamada do método e armazenamento do retorno na variável retorno
        int retorno = contarX("hixx", 'x');
        //impressão do resultado
        System.out.println("Quantidade: "+retorno);
    }

    private static int contarX(String texto, char letraProcurada) 
    {
        //se o texto for vazio, retorna zero.
        if (texto.isEmpty()) 
            return 0;
        
        //se não, se a primeira posição do texto for a letra procurada
        //então faz uma chamada recursiva com o incremento +1
        else 
            if (texto.charAt(0) == letraProcurada)
                return contarX(texto.substring(1), letraProcurada) + 1;
        //se não, faz a chamada recursiva sem incremento
            else return contarX(texto.substring(1), letraProcurada);
    }

}
