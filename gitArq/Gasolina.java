/*Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu
o seu carro com gasolina. Leia a quantidade de litros de gasolina foram
necessários para abastecer o veículo e informe o valor total da conta desse cliente,
sabendo-se que cada refrigerante custou R$3,00 e o litro de gasolina está
custando R$2,50. (Estrutura Sequencial).*/
package lista.exercicios.java;
import java.util.Scanner;

public class Gasolina {
	static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) {
		int qtdRefri = 2;
		double qtdLitro;
		double valorRefri = 3;
		double valorLitro = 2.50;
		double total;
		System.out.println("Quantos litros de gasolina deseja abastecer?");
		qtdLitro = leitor.nextDouble();
		total = (qtdRefri * valorRefri) + (qtdLitro * valorLitro);
		System.out.println("O valor total da sua conta foi de: " + total);
		
	}

}
