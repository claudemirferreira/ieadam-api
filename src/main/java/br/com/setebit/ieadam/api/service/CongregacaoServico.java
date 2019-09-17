package br.com.setebit.ieadam.api.service;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Area;
import br.com.setebit.ieadam.api.security.entity.Congregacao;
import br.com.setebit.ieadam.api.security.entity.Zona;

public interface CongregacaoServico {

	public List<Congregacao> listarTodos();

	public Congregacao salvar(Congregacao congregacao);

	public void remover(Congregacao congregacao);

	public List<Congregacao> findByArea(Area area);

	public List<Congregacao> listaCongregacaoToZona(Zona zona);

}