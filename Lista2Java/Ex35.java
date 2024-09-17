package Lista2Java;
import java.util.Scanner;
import java.lang.Math;
public class Ex35 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe a variavel A: ");
		float a = scan.nextFloat();
		System.out.print("Informe a variavel B: ");
		float b = scan.nextFloat();
		System.out.print("Informe a variavel C: ");
		float c = scan.nextFloat();
		if (a != 0) {
			float delta = (b * b) - (4 * a * c);
			if (delta < 0) {
				System.out.println("A equação não possui raizes rais");
			}else if (delta == 0) {
				float x = (-b + (float)Math.sqrt(delta)) / 2 * a;
				System.out.println("A raiz da equação é: x = " + x);
			}else {
				System.out.println(delta);
				float x1 = (-b + (float)Math.sqrt(delta)) / 2 * a;
				float x2 = (-b - (float)Math.sqrt(delta)) / 2 * a;
				System.out.println("As raizes da equação são: x' = " + x1 + " e x'' = " + x2);
			}
		}else {
			System.out.println("A equação não é de segundo grau0");
		}
		scan.close();
	}
}
