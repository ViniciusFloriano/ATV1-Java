package Lista1Java;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int numA = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int numB = scan.nextInt();
		System.out.println("A soma dos números " + numA + " e " + numB + " é: " + (numA + numB));
		scan.close();
	}
}
