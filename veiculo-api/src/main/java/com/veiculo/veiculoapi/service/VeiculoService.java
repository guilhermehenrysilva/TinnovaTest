package com.veiculo.veiculoapi.service;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils;

import com.veiculo.veiculoapi.model.Veiculo;
import com.veiculo.veiculoapi.repository.VeiculoRepository;

@Service
public class VeiculoService {

	@Autowired
	private VeiculoRepository veiculoRepository;

	@Transactional
	public Veiculo salvar(Veiculo veiculo) {
		veiculo.setCriado(new Date());
		return veiculoRepository.save(veiculo);
	}

	@Transactional
	public Veiculo atualizarVeiculo(Long veiculoId, Veiculo veiculo) throws Exception {
		Veiculo veiculoAtual = veiculoRepository.findById(veiculoId).orElseThrow(() -> new Exception());
		veiculo.setId(veiculoId);
		veiculo.setAtualizado(new Date());
		veiculo.setCriado(veiculoAtual.getCriado());

		return veiculoRepository.save(veiculo);
	}
	
	@Transactional
    public Veiculo atualizarCampoEspecifico(Long veiculoId, Map<Object, Object> fields) throws Exception {
        Veiculo veiculoExistente = veiculoRepository.findById(veiculoId).orElseThrow(() -> new Exception("Não existe veículo."));

        fields.forEach((k, v) -> {
            Field field = ReflectionUtils.findField(Veiculo.class, (String) k);
            field.setAccessible(true);
            ReflectionUtils.setField(field, veiculoExistente, v);
        });

        return this.salvar(veiculoExistente);
    }

	@Transactional
	public void excluir(Long veiculoId) {
		veiculoRepository.deleteById(veiculoId);
	}

	public Veiculo buscar(Long veiculoId) throws Exception {
		return veiculoRepository.findById(veiculoId).orElseThrow(() -> new Exception("Veiculo não encontrado."));
	}

}
