package br.com.setebit.ieadam.api.service;

import java.util.Date;
import java.util.List;

import br.com.setebit.ieadam.api.security.entity.LogApp;

public interface LogAppServico {

	public LogApp salvar(LogApp logApp);

	public List<LogApp> listarTodos();

	public List<LogApp> listarPorUsuario(int idUsuario);

	public List<LogApp> listarPorFiltros(String nomeUsuario, Date dataInicio, Date dataFim);
}
