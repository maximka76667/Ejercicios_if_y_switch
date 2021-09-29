package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final int numero_de_comparacion_1 = 10;
		final int numero_de_comparacion_2 = 100;

		System.out.print("a: ");
		double a = entrada.nextDouble();

		System.out.println(a);
		System.out.println(
				a >= numero_de_comparacion_1 && a <= numero_de_comparacion_2 ? 
						"Esta entre " + numero_de_comparacion_1 + " y " + numero_de_comparacion_2 : 
						"No esta entre " + numero_de_comparacion_1 + " y " + numero_de_comparacion_2
				);

		entrada.close();
	}

}
