package Lista2Java;
import java.util.Scanner;
public class Ex43 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		float num = scan.nextFloat();
		if (num % 1 == 0) {
			System.out.println("Inteiro");
		}else {
			System.out.println("Decimal");
		}
		scan.close();
	}
}
