package br.com.setebit.ieadam.api.dto;

import java.io.Serializable;
import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Area;
import br.com.setebit.ieadam.api.security.entity.Mes;
import br.com.setebit.ieadam.api.security.entity.Nucleo;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import br.com.setebit.ieadam.api.security.entity.Zona;
import br.com.setebit.ieadam.api.util.DataUtil;

public class FiltroRelatorioDTO implements Serializable {

	private static final long serialVersionUID = 3229078578713401437L;

	private String tipoRelatorio;

	private String dataInicial;

	private String dataFinal;

	private Usuario usuarioLogado;

	private Usuario membro;

	private Zona zona;

	private Nucleo nucleo;

	private Area area;

	private List<Zona> zonas;

	private List<Area> areas;

	private List<Nucleo> nucleos;

	private List<Integer> anos;

	private int anoInicio;

	private int anoFim;

	private Mes mesInicio = Mes.JANEIRO;

	private Mes mesFim = Mes.JANEIRO;

	private Mes[] meses;

	public FiltroRelatorioDTO() {
		this.anos = DataUtil.pegarAnos();
		this.anoInicio = DataUtil.pegarAnocorrente();
		this.anoFim = DataUtil.pegarAnocorrente();
	}

	public String getTipoRelatorio() {
		return tipoRelatorio;
	}

	public void setTipoRelatorio(String tipoRelatorio) {
		this.tipoRelatorio = tipoRelatorio;
	}

	public String getDataInicial() {
		return dataInicial;
	}

	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}

	public String getDataFinal() {
		return dataFinal;
	}

	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}

	public Usuario getUsuarioLogado() {
		return usuarioLogado;
	}

	public void setUsuarioLogado(Usuario usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public Usuario getMembro() {
		return membro;
	}

	public void setMembro(Usuario membro) {
		this.membro = membro;
	}

	public Zona getZona() {
		return zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public Nucleo getNucleo() {
		return nucleo;
	}

	public void setNucleo(Nucleo nucleo) {
		this.nucleo = nucleo;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public List<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	public List<Nucleo> getNucleos() {
		return nucleos;
	}

	public void setNucleos(List<Nucleo> nucleos) {
		this.nucleos = nucleos;
	}

	public List<Integer> getAnos() {
		return anos;
	}

	public void setAnos(List<Integer> anos) {
		this.anos = anos;
	}

	public int getAnoInicio() {
		return anoInicio;
	}

	public void setAnoInicio(int anoInicio) {
		this.anoInicio = anoInicio;
	}

	public int getAnoFim() {
		return anoFim;
	}

	public void setAnoFim(int anoFim) {
		this.anoFim = anoFim;
	}

	public Mes[] getMeses() {
		return Mes.values();
	}

	public Mes getMesInicio() {
		return mesInicio;
	}

	public void setMesInicio(Mes mesInicio) {
		this.mesInicio = mesInicio;
	}

	public Mes getMesFim() {
		return mesFim;
	}

	public void setMesFim(Mes mesFim) {
		this.mesFim = mesFim;
	}
}