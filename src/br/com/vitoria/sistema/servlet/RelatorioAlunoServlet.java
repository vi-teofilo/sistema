package br.com.vitoria.sistema.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.vitoria.sistema.controller.AlunoController;
import br.com.vitoria.sistema.vo.AlunoVO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioAlunoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public RelatorioAlunoServlet() {
		super();
	}

	public void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ArrayList<AlunoVO> alunos = new AlunoController().retornaAlunos();

		try {

			String acao = request.getParameter("acao") == null ? "" : request.getParameter("acao");

			// caminho do jasper 
			String caminhoJasper = getServletContext()
					.getRealPath("/WEB-INF/classes/br/com/vitoria/sistema/relatorio/") + "/";
			String caminho = getServletContext().getRealPath("/");

			JRBeanCollectionDataSource jrDT = new JRBeanCollectionDataSource(alunos);
			Map parametros = new HashMap();
			parametros.put("titulo", "Relatorios de Alunos");
			parametros.put(alunos, jrDT);
			parametros.put("total", "Total de Alunos: " + alunos.size());
			JasperPrint jasperPrint = JasperFillManager.fillReport(caminhoJasper + "aluno.jasper", parametros, jrDT);

			if ("visualizar".equals(acao)) {
				JasperViewer.viewReport(jasperPrint, false);
			} else if ("pdf".equals(acao)) {
				JasperExportManager.exportReportToPdfFile(jasperPrint, caminho + "/RelatorioAluno.pdf");
				response.sendRedirect("RelatorioAluno.pdf");
			} else {
				response.sendRedirect("index.jsp");
			}

		} catch (JRException e) {
			e.printStackTrace();
		}
	}

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		processRequest(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		processRequest(request, response);
	}

}
