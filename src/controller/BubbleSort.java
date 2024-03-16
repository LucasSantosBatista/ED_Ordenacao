package controller;
/**
 * @author Lucas Batista
 * 16 de mar. de 2024
 */
public class BubbleSort {

	public BubbleSort() {
		super();
	}

	public int[] ordenaBubbleSort(int[] vet, int tamanho) {
        if (tamanho == 1)
            return vet;

        for (int i = 0; i < tamanho - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                int aux = vet[i];
                vet[i] = vet[i + 1];
                vet[i + 1] = aux;
            }
        }
        return ordenaBubbleSort(vet, tamanho - 1);
    }

}