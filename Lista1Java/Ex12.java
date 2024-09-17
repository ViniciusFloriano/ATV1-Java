package Lista1Java;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe sua altura em metros: ");
		float altura = scan.nextFloat();
		System.out.println("Com a sua altura de " + altura + "m, caso você for homem seu peso ideial seria: " + ((72.7 * altura) - 58));
		System.out.println("Com a sua altura de " + altura + "m, caso você for mulher seu peso ideial seria: " + ((62.1 * altura) - 44.7));
		scan.close();
	}
}
