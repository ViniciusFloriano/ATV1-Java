package Lista1Java;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		System.out.println("O número informado foi: " + num);
		scan.close();
	}
}
