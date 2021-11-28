package com.veiculo.veiculoapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.veiculo.veiculoapi.enums.VeiculoMarcasEnum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String nome;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private VeiculoMarcasEnum marca;

	@Column(nullable = false)
	private int ano;

	@Column(nullable = true)
	private String descricao;

	@Column(nullable = false)
	private boolean vendido;

	@Column(nullable = true)
	private Date criado;

	@Column(nullable = true)
	private Date atualizado;

}
