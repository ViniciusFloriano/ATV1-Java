package Lista2Java;
import java.util.Scanner;
public class Ex27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe seu turno (M - Matutino, V - Vespertino ou N - Noturno): ");
		char str = scan.nextLine().charAt(0);
		if (str == 'M' || str == 'm') {
			System.out.println("Bom Dia!");
		}else if (str == 'V' || str == 'v'){
			System.out.println("Boa Tarde!");
		}else if (str == 'N' || str == 'N'){
			System.out.println("Boa Tarde!");
		}else {
			System.out.println("Informe um turno válido");
		}
		scan.close();
	}
}
