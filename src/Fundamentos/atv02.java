package Fundamentos;

import java.util.Scanner;

public class atv02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite F ou M");
		
		char resp = entrada.next().charAt(0);
		if (resp== 'M'|| resp=='m') {
			System.out.println("MASCULINO");
		}else {
			if(resp== 'F' || resp== 'f'){
				System.out.println("FEMININO");
				
			}
		}
				
			
		
		
		
		
	}

}
