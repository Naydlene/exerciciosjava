//Faça um programa que receba o valor do salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.
package lista.exercicios.java;

import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		double salario = 0;
		double aumento = 0;
		double novoSalario = 0;

		System.out.println("Informe o seu salário: ");
		salario = leitor.nextDouble();
		System.out.println("Informe o seu percentual de aumento: ");
		aumento = leitor.nextDouble();
		aumento = (salario * aumento) / 100;
		System.out.println("Seu aumento foi de: " + aumento );
		novoSalario = aumento + salario;
		System.out.println("Seu novo salário é: " + novoSalario);

	}

}
