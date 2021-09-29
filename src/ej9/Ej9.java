package ej9;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Tu medio de transporte: bicicleta, moto, coche, camion (b, m, a, c): ");
		char transporte = entrada.nextLine().charAt(0);

		double impuesto = 1;
		double kilometres = 1;
		double toneladas = 0;
		final double impuesto_de_peso = 0.15;

		switch (transporte) {
		case 'm':
		case 'h':
			impuesto = 0.25;
			System.out.print("Kilometres: ");
			kilometres = entrada.nextDouble();
			break;


		case 'c':
			impuesto = 0.25;
			System.out.print("Kilometres: ");
			kilometres = entrada.nextDouble();
			System.out.println("Peso en toneladas: ");
			toneladas = entrada.nextDouble();
			break;

		default:
			break;
		}

		System.out.println(transporte);
		System.out.println(impuesto * kilometres + toneladas * impuesto_de_peso);

		entrada.close();
	}

}
