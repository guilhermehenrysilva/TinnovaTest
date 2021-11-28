package com.veiculo.veiculoapi.controller;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veiculo.veiculoapi.dto.IVeiculoFabricanteDTO;
import com.veiculo.veiculoapi.model.Veiculo;
import com.veiculo.veiculoapi.repository.VeiculoRepository;
import com.veiculo.veiculoapi.service.FuncionalidadesService;
import com.veiculo.veiculoapi.service.VeiculoService;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

	@Autowired
	private VeiculoService veiculoService;

	@Autowired
	private FuncionalidadesService funcionalidadesService;

	@Autowired
	private VeiculoRepository veiculoRepository;

	// GET - Retornar todos os veiculos
	@GetMapping
	public List<Veiculo> listar() {
		return veiculoRepository.findAll();
	}

	// GET - Buscar Veiculo especifico
	@GetMapping("/{veiculoId}")
	public Veiculo buscar(@PathVariable Long veiculoId) throws Exception {
		return veiculoService.buscar(veiculoId);
	}

	// POST - Adicionar Veiculo
	@PostMapping
	public Veiculo adicionar(@RequestBody Veiculo veiculo) {
		return veiculoService.salvar(veiculo);
	}

	// PUT - Atualizar Veiculo
	@PutMapping("/{veiculoId}")
	public ResponseEntity<Veiculo> atualizar(@PathVariable Long veiculoId, @RequestBody Veiculo veiculo)
			throws Exception {
		if (!veiculoRepository.existsById(veiculoId)) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(veiculoService.atualizarVeiculo(veiculoId, veiculo));
	}

	// PATCH - Atualizar campo especifico Veiculo
	@PatchMapping("/{veiculoId}")
	public Veiculo patchVeiculo(@PathVariable Long veiculoId, @RequestBody Map<Object, Object> fields)
			throws Exception {
		return veiculoService.atualizarCampoEspecifico(veiculoId, fields);
	}

	// DELETE - Remover Veiculo
	@DeleteMapping("/{veiculoId}")
	public ResponseEntity<Void> remover(@PathVariable Long veiculoId) {
		if (!veiculoRepository.existsById(veiculoId)) {
			return ResponseEntity.notFound().build();
		}
		veiculoService.excluir(veiculoId);

		return ResponseEntity.noContent().build();
	}

	// FIND - Funcionalidades

	// Exibir Veiculos Nao Vendidos
	@GetMapping("/find/naoVendidos")
	public int veiculosNaoVendidos() {
		return funcionalidadesService.findQtdNaoVendidos();
	}

	// Exibir Veiculos Por Decada

	// Exibir Veiculos por Fabricante
	@GetMapping("/find/fabricante")
	public List<IVeiculoFabricanteDTO> distribuicaoPorFabricante() {
		return funcionalidadesService.findQtdPorFabricante();
	}

	// Exibir Veiculos Registrados na ultima semana (Ultimos 7 dias)
	@GetMapping("/find/registroSemanal")
	public List<Veiculo> registroSemanal() {
		return funcionalidadesService.findVeiculosRegistradosUltimaSemana();
	}

}
