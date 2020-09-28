/*
 Criado por Donald Shell em 1959, publicado pela
Universidade de Cincinnati, Shell sort é o mais eficiente
algoritmo de classificação dentre os de complexidade
quadrática.
• O algoritmo difere do método de inserção direta pelo fato
de no lugar de considerar o array a ser ordenado como um
único segmento, ele considera vários segmentos sendo
aplicado o método de inserção direta em cada um deles.
Compara elementos distantes

 - Vantagens
Recomendado para arquivos de tamanho moderado
Sua implementação é simples e requer uma quantidade de código pequena

 - Desvantagens
O tempo de execução do algoritmo é sensível à ordem inicial do arquivo
O método não é estável

Link --> https://www.youtube.com/watch?v=RVbgifh0HEA
Link --> https://www.youtube.com/watch?v=QnHOwrZllXk
 */
package metodosdeordenacao;

import java.util.Random;

/**
 * @author roger
 */
public class Metodo_ShellSort {

    public static void main(String[] args) {
        Random random = new Random();
        int tamanho = 10;
        int numero;
        int[] vetor = new int[tamanho];

        for (int i = 0; i < vetor.length; i++) {
            numero = random.nextInt(50) + 1;
            vetor[i] = numero;
        }
        
        //Vetor ordenado com ShellSort
        ordenaComShellSort(vetor);
    }

    //Método ShellSort
    public static void ordenaComShellSort(int vetor[]) {

        int i, j, aux, h;
        h = vetor.length / 2;
        System.out.print("Valor de h: " + h + "     Vetor: ");
        for (i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");

        while (h > 0) {
            for (i = h; i < vetor.length; i++) {
                aux = vetor[i];
                for (j = i - h; ((j >= 0) && (vetor[j] > aux)); j = j - h) {
                    vetor[j + h] = vetor[j];

                }
                vetor[j + h] = aux;
            }
            h /= 2;
            System.out.print("Valor de h: " + h + "     Vetor: ");
            for (i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " ");
            }
            System.out.println(" ");

        }
    }

}
