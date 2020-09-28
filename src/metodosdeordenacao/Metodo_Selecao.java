/*

Método de ordenação por seleção (SelectionSort).
Algoritmo simples, onde ele procura o menor elemento
e coloca na primeira posição do vetor.
Não recomendado para grande conjunto de dados
link > https://www.youtube.com/watch?v=ilv2U7jRArQ

*/

package metodosdeordenacao;

/**
 *
 * @author roger
 */
public class Metodo_Selecao {
    
   public static void main(String[] args) {

        int[] numA = {32, -13, 5, 8, 10, 12, 6, 3, 1};
        

        for (int i = 0; i < numA.length; i++) {
            int menor = i;
            for (int j = i + 1; j < numA.length; j++) {
                if (numA[menor] > numA[j]) {
                    menor = j;
                }
            }
            int aux = numA[i];
            numA[i] = numA[menor];
            numA[menor] = aux;
            System.out.print(numA[i] + " ");
        }
        System.out.println("");

    }
    
}
