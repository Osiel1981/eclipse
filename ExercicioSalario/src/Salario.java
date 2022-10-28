import java.util.Scanner;

import entities.Employee;

public class Salario {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Employee employee  = new Employee();
		System.out.println("Entre com nome: ");
		employee.name = sc.nextLine();
		System.out.println("Entre com Salário Bruto: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Entre com taxa: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee.toStringNameSalary());
		
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println(employee.toStringNameSalary());

		
		
		sc.close();
	}

}
