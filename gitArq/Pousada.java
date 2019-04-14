package lista.exercicios.java;
import java.util.Scanner;

public class Pousada {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		float diaria;
		String nome = "";
		int qtdDias;
		float totalPousada=0;
		
		while(!nome.equalsIgnoreCase("fim")) {
			System.out.println("Informe o seu nome: ");
			nome = input.nextLine();
			if(!nome.equalsIgnoreCase("fim")) {
				System.out.println("Informe quantos dias passou na pousada: ");
				qtdDias = input.nextInt();
				String lixo = input.nextLine();
				if(qtdDias >= 10)
					diaria = (40+8)*qtdDias;
				else
					diaria = (40+15)*qtdDias;
				if(diaria>0) {
					System.out.println("Valor a ser pago por "+nome+" é de "+diaria);
					totalPousada+=diaria;
				}
			}
		}
		System.out.println("Pousada ganhou "+totalPousada);

	}

}
