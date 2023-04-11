package aula19_Arrays;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho, obedecento as seguintes regras de formação: a) B[x] deverá
		 * receber 'a' quando A[x] for menor que 7 b) B[x] deverá receber 'b' quando
		 * A[x] for igual a 7 c) B[x] deverá receber 'c' quando A[x] for maior que 7 e
		 * menor que 10 d) B[x] deverá receber 'd' quando A[x] for igual a 10 e) B[x]
		 * deverá receber 'e' quando A[x] for maior que 10. Sugestão char B[10]
		 */
		Scanner ler = new Scanner(System.in);
		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		for (int x = 0; x < vetorA.length; x++) {
			System.out.println("Entre com o valor da posicao = " + (x + 1));
			vetorA[x] = ler.nextInt();
			if (vetorA[x] < 7) {
				vetorB[x] = 'a';
			} else if (vetorA[x] == 7) {
				vetorB[x] = 'b';
			} else if (vetorA[x] > 7 && vetorA[x] < 10) {
				vetorB[x] = 'c';
			} else if (vetorA[x] == 10) {
				vetorB[x] = 'd';
			} else if (vetorA[x] > 10) {
				vetorB[x] = 'e';
			}
		}
		System.out.print("vetor A = ");
		for (int x = 0; x < vetorA.length; x++) {
			System.out.print(vetorA[x] + " ");
		}
		System.out.println();
		System.out.print("vetor B = ");
		for (int x = 0; x < vetorB.length; x++) {
			System.out.print(vetorB[x] + " ");
		}
	}
}
