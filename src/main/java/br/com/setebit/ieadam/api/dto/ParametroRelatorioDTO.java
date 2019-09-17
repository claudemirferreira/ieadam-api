package br.com.setebit.ieadam.api.dto;

public class ParametroRelatorioDTO {

	private String ano;

	private int idZona;

	private int idNucleo;

	private int idArea;
	
	private String nomeRelatorio;

	public ParametroRelatorioDTO(String nomeRelatorio, String ano, int idZona, int idNucleo, int idArea) {
		this.nomeRelatorio = nomeRelatorio;
		this.ano = ano;
		this.idZona = idZona;
		this.idNucleo = idNucleo;
		this.idArea = idArea;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public int getIdZona() {
		return idZona;
	}

	public void setIdZona(int idZona) {
		this.idZona = idZona;
	}

	public int getIdNucleo() {
		return idNucleo;
	}

	public void setIdNucleo(int idNucleo) {
		this.idNucleo = idNucleo;
	}

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public String getNomeRelatorio() {
		return nomeRelatorio;
	}

	public void setNomeRelatorio(String nomeRelatorio) {
		this.nomeRelatorio = nomeRelatorio;
	}

}