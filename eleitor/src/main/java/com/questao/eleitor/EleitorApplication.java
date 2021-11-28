package com.questao.eleitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.questao.eleitor.urna.Urna;

@SpringBootApplication
public class EleitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(EleitorApplication.class, args);
		
		Urna urna = new Urna(1000, 800, 150, 50);
		
		System.out.println("\n");
		System.out.println("------- INFO URNA -------");
		System.out.println("TOTAL DE ELEITORES: "+urna.getTotalEleitores());
		System.out.println("TOTAL DE VOTOS VALIDOS: "+urna.getVotosValidos());
		System.out.println("TOTAL DE VOTOS BRANCOS: "+urna.getVotosBrancos());
		System.out.println("TOTAL DE VOTOS NULOS: "+urna.getVotosNulos());
		System.out.println("------- PERCENTUAL -------");
		
		System.out.println(urna.calcularVotosValidos()+"% de votos VALIDOS em relação ao total de eleitores.");
		System.out.println(urna.calcularVotosBrancos()+"% de votos BRANCOS em relação ao total de eleitores.");
		System.out.println(urna.calcularVotosNulos()+"% de votos NULOS em relação ao total de eleitores.");
		
	}
	
}
