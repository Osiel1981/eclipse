import java.util.Scanner;

import entities.Rectangule;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangule rectangule = new Rectangule();
		System.out.println("Enter rectangle width and height: ");
		rectangule.Widht = sc.nextDouble();
		rectangule.Height = sc.nextDouble();
		
		System.out.println(rectangule.toString());
		
		sc.close();
	}

}
