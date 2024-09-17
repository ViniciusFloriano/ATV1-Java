package Lista1Java;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o lado: ");
		float lado = scan.nextFloat();
		System.out.println("Com o lado " + lado + " a área do quadrado vai ser: " + (lado * lado));
		scan.close();
	}
}
