package br.com.setebit.ieadam.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Zona;

public class ZonaDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;

	private String nome;

	public ZonaDTO() {
	}

	public ZonaDTO(int id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public int getIdZona() {
		return id;
	}

	public void setIdZona(int idZona) {
		this.id = idZona;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static ZonaDTO toDTO(Zona entity) {
		return new ZonaDTO(entity.getIdZona(), entity.getNome());
	}

	public static List<ZonaDTO> toDTO(List<Zona> list) {
		List<ZonaDTO> dtos = new ArrayList<ZonaDTO>();
		list.forEach(item -> dtos.add(toDTO(item)));
		return dtos;
	}

}