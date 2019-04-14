/*Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são inferiores a 500 reais. Escreva um programa que leia o salário de vários funcionários se mostre o valor do salário reajustado ou uma mensagem caso o 
 * funcionário não tenha direito ao aumento. O programa será encerrado quando se digitar “fim” para o nome do funcionário. (Comando while)*/
package lista.exercicios.java;

import java.util.Scanner;

public class Empresa {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double salario = 0;
		double reajuste;
		String funcionario;
		String nome;
		int x;

		System.out.println("Deseja saber dos valores? \n S - para sim \n N - para não");
		funcionario = leitor.nextLine();
		System.out.println("Informe o seu nome: ");
		funcionario = leitor.nextLine();
		if (funcionario.equals("fim")) {
			System.out.println("Fim do programa.");
		}

		while (funcionario.equals("S")) {
			System.out.println("Informe o seu nome: ");
			funcionario = leitor.nextLine();
			if (funcionario.equals("fim")) {
				System.out.println("Fim do programa.");
			} else {
				System.out.println("Informe o seu salário");
				salario = leitor.nextDouble();
				if (salario >= 500) {
					reajuste = (salario * 20) / 100;
					salario = reajuste + salario;
					System.out.println("O seu salário reajustado é de :" + salario);

				} else {
					System.out.println("Seu salário é maior que R$500,00, não houve reajuste.");
				}

			}

		}
	}

}
