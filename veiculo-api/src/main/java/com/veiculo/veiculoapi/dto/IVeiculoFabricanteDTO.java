package com.veiculo.veiculoapi.dto;

import com.veiculo.veiculoapi.enums.VeiculoMarcasEnum;

public interface IVeiculoFabricanteDTO {
	VeiculoMarcasEnum getMarca();    
    int getQuantidade();
}
