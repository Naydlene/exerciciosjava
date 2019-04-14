package lista.exercicios.java;
import java.util.Scanner;
public class Aluno {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		float nota1;
		float nota2;
		int i;
		float media;
		float mediaSala=0;
		int aprovados=0, reprovados=0,exame=0;
		
		for(i = 0; i < 6; i++) {
			System.out.println("Informe a sua primeira nota: ");
			nota1 = input.nextFloat();
			System.out.println("Informe a sua segunda nota: ");
			nota2 = input.nextFloat();
			media = (nota1 + nota2) / 2;
			mediaSala += media;
			
			if(media > 7) {
				System.out.println("Aprovado!");
				aprovados++;
				
			}else if ((media <= 7) && (media >= 3)){
				System.out.println("Exame!");
				exame++;
				
			}else {
				System.out.println("Reprovado!");	
				reprovados++;
			}
			
			
		}
		mediaSala/=6;
		System.out.println("A quantidade de alunos aprovados foram: " +aprovados);
		System.out.println("A quantidade de alunos que vão fazer exames são: "+exame);
		System.out.println("A quantidade de alunos reprovados foram: " +reprovados);
		System.out.println("A media da sala é: " +mediaSala);
	}

}
