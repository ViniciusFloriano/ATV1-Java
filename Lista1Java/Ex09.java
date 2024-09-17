package Lista1Java;
import java.util.Scanner;
public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe os graus em Farenheit: ");
		float graus = scan.nextFloat();
		System.out.println("A temperatura em Farenheit " + graus + "°F em Celsius é: " + ((graus - 32) / 1.8) + "°C");
		scan.close();
	}
}
