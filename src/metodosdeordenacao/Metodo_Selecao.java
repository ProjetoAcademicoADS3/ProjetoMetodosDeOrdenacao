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

        int[] vetor = {32, -13, 5, 8, 10, 12, 6, 3, 1};

        //Vetor ordenado com o método seleção
        ordenaComSelecao(vetor);
    }

    //Método Seleção (SelectionSort)
    public static void ordenaComSelecao(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[menor] > vetor[j]) {
                    menor = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = aux;
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }

}
