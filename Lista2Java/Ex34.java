package Lista2Java;
import java.util.Scanner;
public class Ex34 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Informe o primeiro lado: ");
		float lado1 = scan.nextFloat();
		System.out.print("Informe o segundo lado: ");
		float lado2 = scan.nextFloat();
		System.out.print("Informe o terceiro lado: ");
		float lado3 = scan.nextFloat();
		if (lado1 + lado2 > lado3) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Os lados formam um triângulo: Equilátero");
			}else if (lado1 == lado2) {
				System.out.println("Os lados formam um triângulo: Isósceles");
			}else if (lado1 == lado3) {
				System.out.println("Os lados formam um triângulo: Isósceles");
			}else if (lado2 == lado3) {
				System.out.println("Os lados formam um triângulo: Isósceles");
			}else {
				System.out.println("Os lados formam um triângulo: Escaleno");
			}
		}else if (lado1 + lado3 > lado2) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Os lados formam um triângulo: Equilátero");
			}else if (lado1 == lado2) {
				System.out.println("Os lados formam um triângulo: Isósceles");
			}else if (lado1 == lado3) {
				System.out.println("Os lados formam um triângulo: Isósceles");
			}else if (lado2 == lado3) {
				System.out.println("Os lados formam um triângulo: Isósceles");
			}else {
				System.out.println("Os lados formam um triângulo: Escaleno");
			}
		}else if (lado2 + lado3 > lado1) {
			if (lado1 == lado2 && lado1 == lado3) {
				System.out.println("Os lados formam um triângulo: Equilátero");
			}else if (lado1 == lado2) {
				System.out.println("Os lados formam um triângulo: Isósceles");
			}else if (lado1 == lado3) {
				System.out.println("Os lados formam um triângulo: Isósceles");
			}else if (lado2 == lado3) {
				System.out.println("Os lados formam um triângulo: Isósceles");
			}else {
				System.out.println("Os lados formam um triângulo: Escaleno");
			}
		}else {
			System.out.println("Os lados não formam um triângulo");
		}
		scan.close();
	}
}
