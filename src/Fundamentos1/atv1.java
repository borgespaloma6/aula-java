package Fundamentos1;

import java.util.Scanner;

public class atv1 {
	public static void main(String[] args) {
		int qAlunos =0,x=0;	
		double notas=0,media=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantos alunos tem na sala ");
		qAlunos = entrada.nextInt(); 
		
		while(x<qAlunos) {
			System.out.println("Digite a nota " + x +": ");
			notas+=entrada.nextDouble();
			x++;
			
			
		}
		media=notas/qAlunos;
		System.out.println(media);

		
	}
}
