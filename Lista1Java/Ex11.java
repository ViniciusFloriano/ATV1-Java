package Lista1Java;
import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe sua altura em metros: ");
		float altura = scan.nextFloat();
		System.out.println("Com a sua altura de " + altura + "m, seu peso ideial seria: " + ((72.7 * altura) - 58));
		scan.close();
	}
}
