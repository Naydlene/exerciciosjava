package lista.exercicios.java;

import java.util.Scanner;

public class Clinica {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		String nome = "",sexo, nomeMulherBaixa="",nomeMVelho="";
		float altura, peso, alturaMBaixa = 99999;
		int qtdHomens=0,idade=0,idadeMVelho=0,qtdPacientes=0,mediaIdadeHomens=0,idade1825=0,qtdMulheresAP=0;
		while(!nome.equalsIgnoreCase("fim")) {
			System.out.println("Informe o seu nome: ");
			nome = input.nextLine();
			if(!nome.equalsIgnoreCase("fim")) {
				System.out.println("Informe sua idade");
				idade = input.nextInt();
				System.out.println("Informe seu peso");
				peso = input.nextFloat();
				System.out.println("Informe sua altura");
				altura = input.nextFloat();
				String lixo = input.nextLine();
				System.out.println("H - homem /// M - mulher");
				sexo = input.nextLine();
				qtdPacientes++;
				if(sexo.equalsIgnoreCase("h")) {
					mediaIdadeHomens+=idade;
					qtdHomens++;
				}
				if(sexo.equalsIgnoreCase("m")) {
					if(altura >= 1.60 && altura <= 1.70 && peso > 70 )
						qtdMulheresAP++;
					if(altura < alturaMBaixa) {
						alturaMBaixa = altura;
						nomeMulherBaixa= nome;
					}
				}
				if(idade >= 18 && idade <=25)
					idade1825++;
				if(idade>idadeMVelho)
					nomeMVelho=nome;
					
			}
		}
		System.out.println("Quantidade de pacientes"+qtdPacientes);
		System.out.println("A media de didade dos homens"+(mediaIdadeHomens/qtdHomens));
		System.out.println("Quantidade mulheres entre 1,60 e 1,70 e acima de 70kg"+qtdMulheresAP);
		System.out.println("Quantidade de Pessoas entre 18 e 25"+idade1825);
		System.out.println("Paciente mais velho: "+nomeMVelho);
		System.out.println("Paciente mais baixa"+nomeMulherBaixa);
		
	}

}
