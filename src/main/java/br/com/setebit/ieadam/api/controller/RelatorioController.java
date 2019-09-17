package br.com.setebit.ieadam.api.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.setebit.ieadam.api.dto.ParametroRelatorioDTO;
import br.com.setebit.ieadam.api.util.RelatorioUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;

@RestController
@RequestMapping("/api/relatorio")
@CrossOrigin(origins = "*")
public class RelatorioController {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private RelatorioUtil relatorioUtil;

	@PostMapping(path = "/pdf")
	@PreAuthorize("hasAnyRole('ADMIN')")
	public void imprimir(@RequestBody ParametroRelatorioDTO dto, HttpServletResponse response)
			throws JRException, SQLException, IOException {
		// CALL proc_rel_fin_debito_financeiro ($P{DATA_ANO}, $P{ZONA} , $P{NUCLEO} ,
		// $P{AREA}, 0);
		// CALL proc_rel_fin_debito_financeiro ('2019', 1 , 17 , 13, 0);
		
		JasperPrint jasperPrint = relatorioUtil.gerarPdf(dto);
		
		 //= JasperFillManager.fillReport(jasperReport, parametros, dataSource.getConnection());

		// Configura a respota para o tipo PDF
		response.setContentType("application/pdf");
		// Define que o arquivo pode ser visualizado no navegador e também nome final do
		// arquivo
		// para fazer download do relatório troque 'inline' por 'attachment'
		response.setHeader("Content-Disposition", "inline; filename=RelatorioDebitoFinanceiro.pdf");

		// Faz a exportação do relatório para o HttpServletResponse
		final OutputStream outStream = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, outStream);
	}

}