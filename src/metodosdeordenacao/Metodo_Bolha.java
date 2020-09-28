/*
Interação sobre um conjunto de dados várias vezes
Comparação dos dados de dois em dois
Se o maior estiver à esquerda, troca de posição com o da sua direita
Link --> https://www.youtube.com/watch?v=ZYO43bi0IXY
 */
package metodosdeordenacao;

import java.util.Random;

/**
 * @author roger
 */
public class Metodo_Bolha {

    public static void main(String[] args) {
        int numero;
        int tamanho = 15;
        Random random = new Random();
        int[] vetor = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            numero = random.nextInt(50) + 1;
            vetor[i] = numero;
        }
        //Vetor ordenado com bolha 
        ordenaComBolha(vetor);
    }

    //Método bolha (BubbleSort)
    public static void ordenaComBolha(int vetor[]) {
        int i;
        int j;
        int aux;

        for (i = vetor.length - 1; i > 0; i--) {
            //o maior valor entre vetor[0] e vetor[i] vai para a posição vetor[i]

            for (j = 0; j < i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for (int elementos : vetor) {
            System.out.print(elementos + " ");
        }
        System.out.println("");
    }
}
