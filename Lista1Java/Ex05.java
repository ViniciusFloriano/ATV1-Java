package Lista1Java;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número em metros: ");
		float metros = scan.nextFloat();
		System.out.println(metros + "m em centimetros é: " + (metros * 100) + "cm");
		scan.close();
	}
}
