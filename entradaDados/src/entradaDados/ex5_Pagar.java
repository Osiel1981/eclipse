package entradaDados;
import java.util.Scanner;

public class ex5_Pagar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("código peça 1:");
		int codigo1 = sc.nextInt();
		System.out.println("Quantidade de peças:");
		int qtd1 = sc.nextInt();
		System.out.println("valor unitário da peça1: R$");
		double valor1 = sc.nextDouble();
		
		System.out.println("código peça 2:");
		int codigo2 = sc.nextInt();
		System.out.println("Quantidade de peças:");
		int qtd2 = sc.nextInt();
		System.out.println("valor unitário da peça 2: R$");
		double valor2 = sc.nextDouble();
		
		double total = (valor1 * qtd1)+(valor2*qtd2);
		
		System.out.printf("Valor a pagar: %.2f", total);
		
		

	}

}
