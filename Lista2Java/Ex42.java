package Lista2Java;
import java.util.Scanner;
public class Ex42 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		float num = scan.nextFloat();
		if (num % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		scan.close();
	}
}
