package com.veiculo.veiculoapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veiculo.veiculoapi.dto.IVeiculoFabricanteDTO;
import com.veiculo.veiculoapi.model.Veiculo;
import com.veiculo.veiculoapi.repository.VeiculoRepository;

@Service
public class FuncionalidadesService {

	@Autowired
	private VeiculoRepository veiculoRepository;

	public int findQtdNaoVendidos() {
		return veiculoRepository.findQtdVeiculosNaoVendidos();
	}

	public List<IVeiculoFabricanteDTO> findQtdPorFabricante() {
		return veiculoRepository.findQtdVeiculosPorFabricante();
	}

	public List<Veiculo> findVeiculosRegistradosUltimaSemana() {
		return veiculoRepository.findVeiculosRegistradosUltimaSemana();
	}

}
