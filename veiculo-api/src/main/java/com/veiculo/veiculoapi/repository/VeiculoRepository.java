package com.veiculo.veiculoapi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.veiculo.veiculoapi.dto.IVeiculoFabricanteDTO;
import com.veiculo.veiculoapi.model.Veiculo;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

	@Query(value = "SELECT COUNT(*) FROM veiculo WHERE vendido = false", nativeQuery = true)
	int findQtdVeiculosNaoVendidos();

	@Query(value = "SELECT marca AS marca, COUNT(*) AS quantidade FROM veiculo GROUP BY marca", nativeQuery = true)
	List<IVeiculoFabricanteDTO> findQtdVeiculosPorFabricante();

	@Query(value = "SELECT * FROM veiculo WHERE criado > CURRENT_DATE - INTERVAL '7 days'", nativeQuery = true)
	List<Veiculo> findVeiculosRegistradosUltimaSemana();
}
