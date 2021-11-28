package com.veiculo.veiculoapi.dto;

import com.veiculo.veiculoapi.enums.VeiculoMarcasEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VeiculoFabricanteDTO implements IVeiculoFabricanteDTO {

	private VeiculoMarcasEnum marca;
	private int quantidade;

}
