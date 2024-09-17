package Lista2Java;
import java.util.Scanner;
public class Ex23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o segundo número: ");
		int num2 = scan.nextInt();
		System.out.print("Informe o terceiro número: ");
		int num3 = scan.nextInt();
		if (num1 > num2 && num1 > num3) {
			if (num2 > num3) {
				System.out.println("A sequencia em ordem decrescente fica: " + num1 + ", " + num2 + ", " + num3);
			}else {				
				System.out.println("A sequencia em ordem decrescente fica: " + num1 + ", " + num3 + ", " + num2);
			}
		}else if (num2 > num1 && num2 > num3){
			if (num1 > num3) {
				System.out.println("A sequencia em ordem decrescente fica: " + num2 + ", " + num1 + ", " + num3);
			}else {				
				System.out.println("A sequencia em ordem decrescente fica: " + num2 + ", " + num3 + ", " + num1);
			}
		}else {
			if (num1 > num2) {
				System.out.println("A sequencia em ordem decrescente fica: " + num3 + ", " + num1 + ", " + num2);
			}else {
				System.out.println("A sequencia em ordem decrescente fica: " + num3 + ", " + num2 + ", " + num1);
			}
		}
		scan.close();
	}
}
