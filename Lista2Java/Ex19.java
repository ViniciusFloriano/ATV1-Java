package Lista2Java;
import java.util.Scanner;
public class Ex19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe seu sexo (F ou M): ");
		char str = scan.nextLine().charAt(0);
		if (str == 'F' || str == 'f') {
			System.out.println("F - Feminino");
		}else if (str == 'M' || str == 'm'){
			System.out.println("M - Masculino");
		}else {
			System.out.println("Caractere inválido por favor insira F ou M");
		}
		scan.close();
	}
}
