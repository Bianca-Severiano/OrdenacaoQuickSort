package br.edu.fateczl.ordenacao.quicksort;

public class ControllerQuinckSort {

	public ControllerQuinckSort() {
		super();
	}
	
	public int[] quickSort(int vet[], int inicio, int fim) {
		if (fim > inicio) {
			int pivoFixo = dividir(vet, inicio, fim);
			quickSort(vet, inicio, pivoFixo - 1); // Vet esquerda
			quickSort(vet, pivoFixo + 1, fim); // Vet direita
		}
		return vet;
	}

	private int dividir(int vet[], int inicio, int fim) {
		int pivo = vet[inicio];
		int ponteiroEsq = inicio + 1;
		int ponteiroDir = fim;

		while (ponteiroEsq <= ponteiroDir) {
			while (ponteiroEsq <= ponteiroDir && vet[ponteiroEsq] <= pivo) {
				ponteiroEsq++;
			}

			while (ponteiroDir >= ponteiroEsq && vet[ponteiroDir] > pivo) {
				ponteiroDir--;
			}

			if (ponteiroEsq < ponteiroDir) {
				
				trocar(vet, ponteiroEsq, ponteiroDir);
				ponteiroEsq++;
				ponteiroDir--;
			}

		}
		trocar(vet, inicio, ponteiroDir);
		return ponteiroDir;
	}

	private void trocar(int vet[], int i, int j) {
		int aux = vet[i];
		vet[i] = vet[j];
		vet[j] = aux;
	}

}
