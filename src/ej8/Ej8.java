package ej8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.print("a: ");
		double a = entrada.nextDouble();
		
		System.out.print("b: ");
		double b = entrada.nextDouble();
		
		double mayor = a;
		double menor = b;
	
		if(a < b) {
			mayor = b;
			menor = a;
		}
			
		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
		System.out.println(
				mayor % menor == 0 ?
						menor + " es divisor de " + mayor:
						menor + " no es divisor de " + mayor
		);
		
		entrada.close();
	}

}
