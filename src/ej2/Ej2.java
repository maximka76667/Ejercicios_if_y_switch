package ej2;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final int numero_de_comparacion = 10;

		System.out.print("a: ");
		double a = entrada.nextDouble();

		System.out.print("b: ");
		double b = entrada.nextDouble();

		double suma = a + b;

		System.out.println(suma);
		System.out.println(
				suma >= numero_de_comparacion ? 
						suma == numero_de_comparacion ? 
								"Igual a " + numero_de_comparacion :
								"Mayor que " + numero_de_comparacion 
						: "Menor que " + numero_de_comparacion);

		entrada.close();
	}
}
