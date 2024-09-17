package Lista1Java;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro número (int): ");
		int num1 = scan.nextInt();
		System.out.print("Informe o segundo número (int): ");
		int num2 = scan.nextInt();
		System.out.print("Informe o terceiro número (float ou real): ");
		float num3 = scan.nextFloat();
		System.out.println("a) o produto do dobro de " + num1 + " com a metade do  " + num2 + " é: " + ((num1 * 2) * (num2 / 2)));
		System.out.println("b) a soma do triplo de " + num1 + " com " + num3 + " é: " + ((num1 * 3) * num3));
		System.out.println("c) o " + num3 + " elevado ao cubo  " + (num3 * num3 * num3));
		scan.close();
	}
}
