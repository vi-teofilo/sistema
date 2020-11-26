package br.com.vitoria.sistema.controller;

import java.util.ArrayList;

import br.com.vitoria.sistema.bean.Aluno;
import br.com.vitoria.sistema.dao.AlunoDAO;
import br.com.vitoria.sistema.vo.AlunoVO;

public class AlunoController {

	public void salvar(Aluno aluno) {
		AlunoDAO dao = new AlunoDAO();
		try {
			dao.salvar(aluno);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void excluir(Aluno aluno) {
		AlunoDAO dao = new AlunoDAO();
		try {
			dao.excluir(aluno);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<Aluno> buscarTodos(){
		ArrayList<Aluno> listaRetorno = new ArrayList<Aluno>();
		AlunoDAO dao = new AlunoDAO();
		try {
			listaRetorno = dao.buscarTodos();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaRetorno;
	}
	
	public ArrayList<Aluno> buscarNome(String nome){
		ArrayList<Aluno> listaRetorno = new ArrayList<Aluno>();
		AlunoDAO dao = new AlunoDAO();
		try {
			listaRetorno = dao.buscarNome(nome);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaRetorno;
	}
	public ArrayList<AlunoVO> retornaAlunos(){
		ArrayList<AlunoVO> listaRetorno = new ArrayList<AlunoVO>();
		try {
			ArrayList<Aluno> listaAlunos = new AlunoDAO().buscarTodos();
			for (Aluno aluno : listaAlunos) {
				AlunoVO vo = new AlunoVO();
				vo.setNome(aluno.getNome());
				vo.setTelefone(aluno.getTelefone());
				vo.setDataNascimento(aluno.getDataNascimento());
				vo.setCidade(aluno.getCidade());
				listaRetorno.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		return listaRetorno;
		
	}
	
}
