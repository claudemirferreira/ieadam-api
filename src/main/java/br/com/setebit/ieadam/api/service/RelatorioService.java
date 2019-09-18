package br.com.setebit.ieadam.api.service;

import java.sql.SQLException;

import br.com.setebit.ieadam.api.dto.ParametroRelatorioDTO;
import br.com.setebit.ieadam.api.dto.ParametroRelatorioDTO2;
import br.com.setebit.ieadam.api.security.entity.Usuario;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

public interface RelatorioService {

	public JasperPrint gerarPdf(ParametroRelatorioDTO dto) throws JRException, SQLException;
	
	public ParametroRelatorioDTO2 garregarDadosTela(Usuario usuario);

}