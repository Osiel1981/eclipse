import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
				
		System.out.printf("Products:%n%s, %.2f%n%s, wich price is %.2f%n" ,product1,price1,product2,price2);
		System.out.printf("%nRecord: %d years old, code %d and gender: %C%n",age,code,gender);
		System.out.printf("%nMeasure with 8 decimais places: %.8f",measure);
		System.out.printf("%nRounded (tree decimais places): %.3f",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("%nUS decimal point: %.3f",measure);
	}

}
