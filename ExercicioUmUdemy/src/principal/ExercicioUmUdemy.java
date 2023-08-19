package principal;

import java.util.Locale;

public class ExercicioUmUdemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String product1 = "Computer";
			String product2 = "Office desk";
			int age = 30;
			int code = 5290;
			char gender = 'F';
			double price1 = 2100.0;
			System.out.println("Products : " + "\n");
			System.out.println("Computer, which price is $ " + price1);
			double price2 = 650.50;
			System.out.println("Office desk, which price is $ 650,50");
			System.out.println("Record: 30 years old, code 5290 and gender: F");
			double measure = 53.234567;
			System.out.println("Measure with eight decimal places: 53,23456700");
			System.out.print("Rouded three decimal places:");
			System.out.printf("%.3f%n", measure);
			System.out.printf("US decimal point:");
			
			Locale.setDefault(Locale.US);
			System.out.printf("%.3f%n", measure);
		
		/*Products:
Computer, which price is $ 2100,00
Office desk, which price is $ 650,50
Record: 30 years old, code 5290 and gender: F
Measure with eight decimal places: 53,23456700
Rouded (three decimal places): 53,235
US decimal point: 53.235
		 * 
		 */
	
	
	}

}
