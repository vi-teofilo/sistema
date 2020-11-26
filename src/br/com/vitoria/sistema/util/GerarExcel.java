package br.com.vitoria.sistema.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import br.com.vitoria.sistema.bean.Aluno;
import br.com.vitoria.sistema.dao.AlunoDAO;


public class GerarExcel {

	
	private static final String fileName = "C:/Teste/aluno.xls";
	
	public static void main(String[] args) throws Exception {
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheetAlunos = workbook.createSheet("Alunos");
			
		
		AlunoDAO dao = new AlunoDAO();
		List<Aluno> lista = dao.buscarTodos();

		int rownum = 0;
		
		int i = 0;
		HSSFRow rowa = sheetAlunos.createRow(i);
		
	        final Cell cellMatriculalbl = rowa.createCell(0);
	        cellMatriculalbl.setCellValue("Matricula: ");
	        
	        final Cell cellNomelbl = rowa.createCell(1);
	        cellNomelbl.setCellValue("Nome: ");
	        
	        final Cell cellTelefonelbl = rowa.createCell(2);
	        cellTelefonelbl.setCellValue("Telefone: ");
		
		for (Aluno aluno : lista) {
			
			Row row = sheetAlunos.createRow(rownum++);
			int cellnum = 0;
			
			Cell cellMatricula = row.createCell(cellnum++);
			cellMatricula.setCellValue(aluno.getMatricula());
			
			Cell cellNome = row.createCell(cellnum++);
			cellNome.setCellValue(aluno.getNome());

			Cell cellTelefone = row.createCell(cellnum++);
			cellTelefone.setCellValue(aluno.getTelefone());

		}
		try {
			FileOutputStream out = new FileOutputStream(new File(GerarExcel.fileName));
			workbook.write(out);
			out.close();
			System.out.println("Arquivo gerado com sucesso!!");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Arquivo não encontrado!");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro na criação do Arquivo!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
