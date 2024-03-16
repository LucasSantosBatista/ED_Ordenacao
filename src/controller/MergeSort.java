package controller;

public class MergeSort {

	public MergeSort() {
		super();
	}

	public int[] ordenaMergeSort(int[] vet, int inicio, int fim) {
		if (inicio < fim) {
			int meio = (inicio + fim) / 2;
			ordenaMergeSort(vet, inicio, meio); // Esquerda
			ordenaMergeSort(vet, meio + 1, fim); // Direita
			
			intercala(vet, inicio, meio, fim);
		}
		return vet;
	}

	private void intercala(int[] vet, int inicio, int meio, int fim) {
	    int[] vetAux = new int[vet.length];
	    for (int i = inicio; i <= fim; i++) {
	        vetAux[i] = vet[i];
	    }

	    int ponteiroEsquerda = inicio;
	    int ponteiroDireita = meio + 1;

	    for (int cont = inicio; cont <= fim; cont++) {
	        if (ponteiroEsquerda > meio) {
	            vet[cont] = vetAux[ponteiroDireita];
	            ponteiroDireita++;
	        } else if (ponteiroDireita > fim) {
	            vet[cont] = vetAux[ponteiroEsquerda];
	            ponteiroEsquerda++;
	        } else if (vetAux[ponteiroEsquerda] < vetAux[ponteiroDireita]) {
	            vet[cont] = vetAux[ponteiroEsquerda];
	            ponteiroEsquerda++;
	        } else {
	            vet[cont] = vetAux[ponteiroDireita];
	            ponteiroDireita++;
	        }
	    }
	}
}
