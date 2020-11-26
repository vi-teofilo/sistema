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

import br.com.vitoria.sistema.bean.Professor;
import br.com.vitoria.sistema.dao.ProfessorDAO;


public class GerarExcelProfessor {

	
	private static final String fileName = "C:/Teste/professor.xls";
	
	public static void main(String[] args) throws Exception {
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheetProfessores = workbook.createSheet("Professores");
			
		
		ProfessorDAO dao = new ProfessorDAO();
		List<Professor> lista = dao.buscarTodos();

		int rownum = 0;
		
		int i = 0;
		HSSFRow rowa = sheetProfessores.createRow(i);
		
	        final Cell cellNomelbl = rowa.createCell(0);
	        cellNomelbl.setCellValue("Nome: ");
	        
	        final Cell cellMaterialbl = rowa.createCell(1);
	        cellMaterialbl.setCellValue("Matéria: ");
	        
	        final Cell cellTelefonelbl = rowa.createCell(2);
	        cellTelefonelbl.setCellValue("Salario: ");
		
		for (Professor professor : lista) {
			
			Row row = sheetProfessores.createRow(rownum++);
			int cellnum = 1;
			
			Cell cellMatricula = row.createCell(cellnum++);
			cellMatricula.setCellValue(professor.getNome());
			
			
			Cell cellNome = row.createCell(cellnum++);
			cellNome.setCellValue(professor.getMateria());

			Cell cellTelefone = row.createCell(cellnum++);
			cellTelefone.setCellValue(professor.getSalario());

		}
		try {
			FileOutputStream out = new FileOutputStream(new File(GerarExcelProfessor.fileName));
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
