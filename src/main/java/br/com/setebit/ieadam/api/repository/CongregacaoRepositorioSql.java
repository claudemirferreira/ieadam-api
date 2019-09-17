package br.com.setebit.ieadam.api.repository;

import java.util.List;

import br.com.setebit.ieadam.api.security.entity.Congregacao;
import br.com.setebit.ieadam.api.security.entity.Zona;

public interface CongregacaoRepositorioSql {

	public List<Congregacao> listaCongregacaoToZona(Zona zona);

}