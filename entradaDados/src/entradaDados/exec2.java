package entradaDados;

import java.util.Scanner;

public class exec2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.println("Você digitou, "+ x );
		sc.close()
		*/
		int x;
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		System.out.println("Dados digitados");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}
