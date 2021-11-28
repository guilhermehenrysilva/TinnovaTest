package com.questao.fatorial;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FatorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FatorialApplication.class, args);

		Scanner s = new Scanner(System.in);
        System.out.print("\nDigite um valor: ");
		int num = s.nextInt();
		
		int proximoNum = 2;
		int fatorial = 1;

		for (int i = 1; i < num; i++) { //Realiza o loop ate a quantidade informada
			fatorial = fatorial * proximoNum; // 1*2=2 ... 2*3=6...

			System.out.println(i + "*" + proximoNum + "=" + fatorial);
			proximoNum++;
		}
		System.out.println("\n");
		System.out.println("Fatorial de "+num+" é: "+fatorial);

	}

}
