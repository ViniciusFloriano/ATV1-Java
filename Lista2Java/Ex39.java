package Lista2Java;
import java.util.Scanner;
public class Ex39 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a primeira idade: ");
		int idade1 = scan.nextInt();
		System.out.print("Informe a segunda idade: ");
		int idade2 = scan.nextInt();
		System.out.print("Informe a terceira idade: ");
		int idade3 = scan.nextInt();
		if (idade1 > 0 && idade2 > 0 && idade3 > 0) {
			int media = (idade1 + idade2 + idade3) / 3;
			if (media > 0 && media < 25) {
				System.out.println("Turma Jovem");
			}else if (media >= 25 && media <= 40) {
				System.out.println("Turma Adulta");
			}else {
				System.out.println("Turma Idosa");
			}
		}else {
			System.out.println("Alguma idade inválida");
		}
		scan.close();
	}
}
