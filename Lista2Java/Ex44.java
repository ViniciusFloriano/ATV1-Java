package Lista2Java;
import java.util.Scanner;
public class Ex44 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		float num1 = scan.nextFloat();
		System.out.print("Informe o segundo número: ");
		float num2 = scan.nextFloat();
		scan.nextLine();		
		System.out.print("Informe a operação (+, -, *, /): ");
		char op = scan.nextLine().charAt(0);
		float result = 0;
		if (op == '+') {
			result = num1 + num2;
		}else if (op == '-'){
			result = num1 - num2;
		}else if (op == '*'){
			result = num1 * num2;
		}else if (op == '/'){
			result = num1 / num2;
		}else {
			result = 0;
		}
		System.out.println("O resultado " + result + " é: ");
		if ((result / 1) % 2 == 0) {
			System.out.println("Par");
		}else {
			System.out.println("Impar");
		}
		if (result >= 0) {
			System.out.println("Positivo");
		}else {
			System.out.println("Negativo");
		}
		if (result % 1 == 0) {
			System.out.println("Inteiro");
		}else {
			System.out.println("Decimal");
		}
		scan.close();
	}
}
