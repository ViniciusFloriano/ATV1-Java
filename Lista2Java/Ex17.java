package Lista2Java;
import java.util.Scanner;
public class Ex17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int numA = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int numB = scan.nextInt();
		if (numA > numB) {
			System.out.println("O maior número é: " + numA);
		}else {
			System.out.println("O maior número é: " + numB);
		}
		scan.close();
	}
}
