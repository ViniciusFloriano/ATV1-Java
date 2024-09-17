package Lista2Java;
import java.util.Scanner;
public class Ex21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe uma letra: ");
		char str = scan.nextLine().charAt(0);
		if (str == 'A' || str == 'a') {
			System.out.println("A letra " + str + " é vogal");
		}else if (str == 'E' || str == 'e'){
			System.out.println("A letra " + str + " é vogal");
		}else if (str == 'I' || str == 'i'){
			System.out.println("A letra " + str + " é vogal");
		}else if (str == 'O' || str == 'o'){
			System.out.println("A letra " + str + " é vogal");
		}else if (str == 'U' || str == 'u'){
			System.out.println("A letra " + str + " é vogal");
		}else if (str == 'Y' || str == 'y'){
			System.out.println("A letra " + str + " é vogal, sim y é uma vogal ou pode ser dependendo da forma como aparece na sílaba e da análise fonética da palavra");
		}else {
			System.out.println("A letra " + str + " não é vogal");
		}
		scan.close();
	}
}
