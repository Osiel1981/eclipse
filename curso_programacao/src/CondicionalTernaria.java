import java.util.Scanner;

public class CondicionalTernaria {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite um valor");
        double valor = sc.nextDouble();
        double desconto = (valor<=100)? valor * 1: valor*0.15;
        System.out.println(desconto);
        sc.close();
	}

}
