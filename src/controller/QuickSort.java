package controller;

/**
 * @author Lucas Batista 16 de mar. de 2024
 */
public class QuickSort{

	public QuickSort() {
		super();
	}

	public int[] ordenaQuickSort(int[] vet, int inicio, int fim) {
		if (fim > inicio) {
			int pivoFixo = dividir(vet, inicio, fim);
			ordenaQuickSort(vet, inicio, pivoFixo - 1);
			ordenaQuickSort(vet, pivoFixo + 1, fim);
		}
		return vet;

	}

	private int dividir(int[] vet, int inicio, int fim) {
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		int pivo = vet[inicio];

		while (ponteiroEsquerda <= ponteiroDireita) {
			while (ponteiroEsquerda <= ponteiroDireita && vet[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}
			while (ponteiroDireita >= ponteiroEsquerda && vet[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}
			if (ponteiroEsquerda < ponteiroDireita) {
				trocar(vet, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		trocar(vet, inicio, ponteiroDireita);
		return ponteiroDireita;
	}

	private void trocar(int[] vet, int i, int j) {
		int aux = vet[j];
		vet[j] = vet[i];
		vet[i] = aux;
	}

}
