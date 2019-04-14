//Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’ se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. (Comando if).
package lista.exercicios.java;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num[] = new int[10];
		int i;

		for (i = 0; i < 10; i++) {
			System.out.println("Informe um numero: ");
			num[i] = leitor.nextInt();
			if ((num[i] % 2) == 0) {
				System.out.println("Par");

			} else {
				System.out.println("Ímpar");
			}
		}

	}

}
