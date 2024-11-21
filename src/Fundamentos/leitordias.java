package Fundamentos;

import java.util.Scanner;

public class leitordias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int resp = entrada.nextInt();

		if (resp == 1) {
			System.out.println("Domingo");
		} else if (resp == 2) {
			System.out.println("Segunda");
		} else if (resp == 3) {
			System.out.println("Terça");
		} else if (resp == 4) {
			System.out.println("Quarta");
		} else if (resp == 5) {
			System.out.println("Quinta");
		} else if (resp == 6) {
			System.out.println("Sexta");
		} else if (resp == 7) {
			System.out.println("Sabado");
		} else {
			System.out.println("é de 1 a 7 Dias !!");
		}
	}
}