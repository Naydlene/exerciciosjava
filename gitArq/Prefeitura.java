/*A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários
municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário
bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
prestação e informar se o empréstimo pode ou não ser concedido. (comando if)*/
package lista.exercicios.java;
import java.util.Scanner;
public class Prefeitura {
	static Scanner leitor = new Scanner(System.in);
	public static void main(String[] args) {
		float salarioBruto;
		double prestacaoMax;
		float prestacao;
		System.out.println("Informe o seu salario: ");
		salarioBruto = leitor.nextFloat();
		System.out.println("Quanto pode ser a sua prestação?");
		prestacao = leitor.nextFloat();
		prestacaoMax = salarioBruto * 0.3;
		if(prestacaoMax < prestacao) {
			System.out.println("O empréstimo pode ser concedido.");	
			
		}else {
			System.out.println("O empréstimo não pode ser concedido.");
		}
	}

}
