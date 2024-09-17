package Lista1Java;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o raio: ");
		float raio = scan.nextFloat();
		System.out.println("Com o raio " + raio + " a área do circulo vai ser: " + (3.14 * (raio * raio)));
		scan.close();
	}
}
