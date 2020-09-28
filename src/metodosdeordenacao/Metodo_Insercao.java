/*
Método de ordenação inserção (InsertionSort).
 Ordenação por inserção, neste método as comparações são feitas dos últimos
para os primeiros valores e só deve ser usado para pequenos vetores
 */
package metodosdeordenacao;

/**
 * @author roger
 */
public class Metodo_Insercao {

    public static void main(String[] args) {
        int[] vetor = {54, 35, 48, 62, 11, 8, 63, 24, 28, 41};

        ordenaComInsercao(vetor);

    }

    //aqui é construído o método de inserção
    static void ordenaComInsercao(int vetor[]) {
        int atual;
        int i;
        int j;
        for (i = 1; i < vetor.length; i++) {
            atual = vetor[i];
            j = i - 1;
            while (j >= 0 && atual < vetor[j]) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
        for (int valores : vetor) {
            System.out.print(valores + " ");
        }
        System.out.println("");
    }
}
