package com.questao.multiplos;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MultiplosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiplosApplication.class, args);
		
		Scanner s = new Scanner(System.in);
        System.out.print("\nDigite um valor: ");
        int num = s.nextInt();
  
		int soma = 0;
		
		for(int i=1; i < num; i++) {
			if (i % 3 == 0 || i % 5 == 0 ) {
				soma += i;
			}
		}
		System.out.println("\n");
		System.out.println("Soma dos multiplos de 3 e 5: "+soma);
	}

}
