package com.questao.bubblesort;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BubblesortApplication {

	public static void main(String[] args) {
		SpringApplication.run(BubblesortApplication.class, args);

		int[] vet = { 5, 3, 2, 4, 7, 1, 0, 6 };

		System.out.print("\n");
		System.out.print("Vetor Desorganizado: ");
		for (int n : vet) {
			System.out.print(n + " ");
		}

		for (int i = 0; i < vet.length - 1; i++) { //Controla até qual posicao percorrer
			boolean ordenado = true; // Seta flag Ordenado
			for (int j = 0; j < vet.length - 1 - i; j++) { // Ordenação

				if (vet[j] > vet[j + 1]) { // Se valor atual > proximo valor = Inverte posicao
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
					ordenado = false;
				}
			}
			
			if (ordenado) //Se ordenado, encerra e exibi resultado...
				break;
		}
		System.out.print("\n");
		System.out.print("Vetor Organizado: ");
		for (int n : vet) {
			System.out.print(n + " ");
		}

	}
}
