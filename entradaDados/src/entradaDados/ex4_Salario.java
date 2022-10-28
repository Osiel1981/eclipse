package entradaDados;

import java.util.Scanner;

public class ex4_Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Seu número");
		int numero = sc.nextInt();
		System.out.printf("Suas horas trabalhadas");
		int horas = sc.nextInt();
		System.out.printf("Seu salário por hora");
		double salarioHora = sc.nextDouble();
		double AReceber = salarioHora*horas;
		System.out.printf("NUMBER = "+ numero + "%nSALARY = U$%.2f", AReceber);
		

	}

}
