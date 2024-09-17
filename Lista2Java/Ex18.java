package Lista2Java;
import java.util.Scanner;
public class Ex18 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe um número: ");
		int num = scan.nextInt();
		if (num == 0) {
			System.out.println("O número é zero");
		}else if (num > 0){
			System.out.println("O número é positivo");
		}else {
			System.out.println("O número é negativo");
		}
		scan.close();
	}
}