package br.com.setebit.ieadam.api.repository;

import java.util.Date;
import java.util.List;

import br.com.setebit.ieadam.api.security.entity.LogApp;

public interface LogAppRepositorioSql {

	public List<LogApp> listarLogByFiltros(String nomeUsuario, Date dataInicio, Date dataFim);

}