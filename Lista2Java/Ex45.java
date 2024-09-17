package Lista2Java;
import java.util.Scanner;
public class Ex45 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Telefonou para a vítima? (s ou n): ");
		char q1 = scan.nextLine().charAt(0);
		System.out.print("Esteve no local do crime? (s ou n): ");
		char q2 = scan.nextLine().charAt(0);
		System.out.print("Mora perto da vítima? (s ou n): ");
		char q3 = scan.nextLine().charAt(0);
		System.out.print("Devia para a vítima? (s ou n): ");
		char q4 = scan.nextLine().charAt(0);
		System.out.print("Já trabalhou com a vítima? (s ou n): ");
		char q5 = scan.nextLine().charAt(0);
		float result = 0;
		if (q1 == 'S' || q1 == 's') {
			result += 1;
		}
		if (q2 == 'S' || q2 == 's'){
			result += 1;
		}
		if (q3 == 'S' || q3 == 's'){
			result += 1;
		}
		if (q4 == 'S' || q4 == 's'){
			result += 1;
		}
		if (q5 == 'S' || q5 == 's'){
			result += 1;
		}
		if (result == 2) {
			System.out.println("Suspeita");
		}else if (result == 3 || result == 4) {
			System.out.println("Cúmplice");
		}else if (result == 5) {
			System.out.println("Assasino");
		}else {
			System.out.println("Inocente");
		}
		scan.close();
	}
}
