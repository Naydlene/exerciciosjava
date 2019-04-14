//Faça um programa em Java que permita ao usuário escolher a tabuada que deseja ver. Mostrar a tabuada escolhida. (Comando for)
package lista.exercicios.java;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int num;
		int i;
		int numdesj;
		float result;
		do {
			System.out.println(
					"Informe qual a operação matemática deseja realizar com a tabuada: \n 1 - Adição \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão \n 0 - Sair\n");
			num = leitor.nextInt();
			if (num < 1 || num > 4) {

				System.out.println("Número inválido.");
			} else {

				System.out.println("Informe o número da tabuada que deseja:");
				numdesj = leitor.nextInt();

				for (i = 0; i <= 10; i++) {

					if (num == 1) {
						result = i + numdesj;
						System.out.printf("%d + %d = %.2f \n", i, numdesj, result);
					} else if (num == 2) {

						result = i - numdesj;
						System.out.printf("%d - %d = %.2f \n", i, numdesj, result);
					} else if (num == 3) {

						result = i * numdesj;
						System.out.printf("%d * %d = %.2f \n", i, numdesj, result);
					} else if (num == 4) {

						result = (float) i / (float) numdesj;
						System.out.printf("%d / %d = %.2f \n", i, numdesj, result);
					}

				}
			}
		} while (num != 0);
	}
}
