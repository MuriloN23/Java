package Aula5;

import java.util.Scanner;


public class SomaInts {	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("Digite o primeiro número: ");
	        double num1 = scanner.nextDouble();

	     System.out.print("Digite o segundo número: ");
	        double num2 = scanner.nextDouble();
		
	        scanner.close();
		double resultado = num1 + num2;
		System.out.println("A soma de " + num1 + " e " + num2 + " é: " + resultado);
	}
}