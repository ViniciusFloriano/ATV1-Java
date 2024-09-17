package Lista2Java;
import java.util.Scanner;
public class Ex25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe seu sexo (F ou M): ");
		char sexo = scan.nextLine().charAt(0);
		if (sexo == 'F' || sexo == 'f') {
			System.out.print("Informe sua altura em metros: ");
			float altura = scan.nextFloat();
			System.out.print("Informe seu peso em quilos: ");
			float peso = scan.nextFloat();
			System.out.println("Altura: " + altura);
			System.out.println("Peso: " + peso);
			System.out.println("Sexo: " + sexo + " - Feminino");
			float pesoIdeal = (62.1f * altura) - 44.7f;
			System.out.println("Peso ideal: " + pesoIdeal);
			if (peso == pesoIdeal) {
				System.out.println("Você está no seu peso ideal");
			}else if (peso > pesoIdeal) {
				System.out.println("Você está acima do seu peso ideal");
			}else {
				System.out.println("Você está abaixo do seu peso ideal");
			}
		}else if (sexo == 'M' || sexo == 'm'){
			System.out.print("Informe sua altura em metros: ");
			float altura = scan.nextFloat();
			System.out.print("Informe seu peso em quilos: ");
			float peso = scan.nextFloat();
			System.out.println("Altura: " + altura);
			System.out.println("Peso: " + peso);
			System.out.println("Sexo: " + sexo + " - Masculino");
			float pesoIdeal = (72.7f * altura) - 58;
			System.out.println("Peso ideal: " + pesoIdeal);
			if (peso == pesoIdeal) {
				System.out.println("Você está no seu peso ideal");
			}else if (peso > pesoIdeal) {
				System.out.println("Você está acima do seu peso ideal");
			}else {
				System.out.println("Você está abaixo do seu peso ideal");
			}
		}else {
			System.out.println("Sexo inválido por favor insira F ou M");
		}
		scan.close();
	}
}
