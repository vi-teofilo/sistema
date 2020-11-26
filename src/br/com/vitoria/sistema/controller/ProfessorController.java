package br.com.vitoria.sistema.controller;

import java.util.ArrayList;

import br.com.vitoria.sistema.bean.Professor;
import br.com.vitoria.sistema.dao.ProfessorDAO;
import br.com.vitoria.sistema.vo.ProfessorVO;

public class ProfessorController {

	public void salvar(Professor professor) {
		ProfessorDAO dao = new ProfessorDAO();
		try {
			dao.salvar(professor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void excluir(Professor professor) {
		ProfessorDAO dao = new ProfessorDAO();
		try {
			dao.excluir(professor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Professor> buscarTodos(){
		ArrayList<Professor> listaRetorno = new ArrayList<Professor>();
		ProfessorDAO dao = new ProfessorDAO();
		try {
			listaRetorno = dao.buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaRetorno;
	}
	
	public ArrayList<Professor> buscarNome(String nome){
		ArrayList<Professor> listaRetorno = new ArrayList<Professor>();
		ProfessorDAO dao = new ProfessorDAO();
		try {
			listaRetorno = dao.buscarNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaRetorno;
	}
	public ArrayList<ProfessorVO> retornaProfessores(){
		ArrayList<ProfessorVO> listaRetorno = new ArrayList<ProfessorVO>();
		try {
			ArrayList<Professor> listaProfessores = new ProfessorDAO().buscarTodos();
			for (Professor professor : listaProfessores) {
				ProfessorVO vo = new ProfessorVO();
				vo.setNome(professor.getNome());
				vo.setMateria(professor.getMateria());
				vo.setSalario(professor.getSalario()+"");
			
				listaRetorno.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return listaRetorno;
		
	}

}
