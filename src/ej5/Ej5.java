package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("a: ");
		double a = entrada.nextDouble();

		System.out.println(a);
		System.out.println(
			a % 2 == 0 ? 
				"Número par" : 
				"Número impar"				
		);

		entrada.close();
	}

}
