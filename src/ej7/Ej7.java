package ej7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("Letra1: ");
		char letra_1 = entrada.nextLine().toLowerCase().charAt(0);
		
		System.out.print("Letra2: ");
		char letra_2 = entrada.nextLine().toLowerCase().charAt(0);

		System.out.println(letra_1 + " " + letra_2);
		System.out.println(
			Character.compare(letra_1, letra_2) <= 0 ? 
				"Alfabético" : 
				"No alfabético"				
		);
		
		entrada.close();
	}

}
