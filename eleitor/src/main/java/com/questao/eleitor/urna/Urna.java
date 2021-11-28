package com.questao.eleitor.urna;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Urna {
	private double totalEleitores;
	private double votosValidos;
	private double votosBrancos;
	private double votosNulos;
	
	public double calcularVotosValidos() {
		return (this.getVotosValidos()/this.getTotalEleitores()) * 100;
	}
	
	public double calcularVotosBrancos() {
		return (this.votosBrancos/this.totalEleitores) * 100;
	}
	
	public double calcularVotosNulos() {
		return (this.votosNulos/this.totalEleitores) * 100;
	}
	
	
}
