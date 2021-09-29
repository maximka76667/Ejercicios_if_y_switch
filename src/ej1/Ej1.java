package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Año: ");
		int ano = entrada.nextInt();
		
		System.out.println(ano % 4 == 0 ? "Es bisiesto": "No es bisiesto");
		
		entrada.close();
	}

}
