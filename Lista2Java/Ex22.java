package Lista2Java;
import java.util.Scanner;
public class Ex22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		if (num % 2 == 0) {
			System.out.println("O número " + num + " é par, transformando em impar: " + (num + 1));
		}else {
			System.out.println("O número " + num + " é impar, transformando em par: " + (num + 1));
		}
		scan.close();
	}
}
