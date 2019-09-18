package br.com.setebit.ieadam.api.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.setebit.ieadam.api.repository.LogAppRepositorio;
import br.com.setebit.ieadam.api.repository.LogAppRepositorioSql;
import br.com.setebit.ieadam.api.security.entity.LogApp;
import br.com.setebit.ieadam.api.service.LogAppServico;

@Service
public class LogAppServicoImpl implements LogAppServico {

	@Autowired
	private LogAppRepositorio repositorio;

	@Autowired
	private LogAppRepositorioSql repositorioSql;

	public LogApp salvar(LogApp logApp) {
		return this.repositorio.save(logApp);
	}

	@Override
	public List<LogApp> listarTodos() {
		return this.repositorio.findAll();
	}

	@Override
	public List<LogApp> listarPorUsuario(int idUsuario) {
		return this.repositorio.findByUsuario(idUsuario);
	}

	public List<LogApp> listarPorFiltros(String nomeUsuario, Date dataInicio, Date dataFim) {
//		return this.repositorio.findByFiltros(nomeUsuario, dataInicio, dataFim);
		return this.repositorioSql.listarLogByFiltros(nomeUsuario, dataInicio, dataFim);
	}
}