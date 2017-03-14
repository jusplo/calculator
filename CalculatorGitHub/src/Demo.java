import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
	/*	System.out.println("Wybierz opcje: ");
		System.out.println("1)+");
		System.out.println("2)-");
		System.out.println("3)*");
		System.out.println("4)/");
		String option = scanner.nextLine();
	*/		
		

		System.out.println("Podaj pierwsza liczbe: ");
		int a = scanner.nextInt();
		
		System.out.println("Podaj druga liczbe: ");
		int b = scanner.nextInt();
		
		System.out.println("Podaj trzecia liczbe: ");
		int c = scanner.nextInt();
		
		int sum = a + b * c;
		System.out.println("a + b * c = " + sum);
		 

		

	}

}
