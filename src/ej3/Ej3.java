package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		final int numero_de_comparacion = 0;

		System.out.print("a: ");
		double a = entrada.nextDouble();

		System.out.println(a);
		System.out.println(
				a >= numero_de_comparacion ? 
						a == numero_de_comparacion ? 
								"Igual a " + numero_de_comparacion :
								"Mayor que " + numero_de_comparacion 
						: "Menor que " + numero_de_comparacion);

		entrada.close();
	}

}
