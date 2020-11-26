package br.com.vitoria.sistema.teste;

import br.com.vitoria.sistema.bean.Aluno;
import br.com.vitoria.sistema.dao.AlunoDAO;

public class TesteAluno {

	public void salvar() {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Doidinho");
		aluno.setEndereco("Rua joao");
		aluno.setNumero(10);
		aluno.setBairro("Jd são luiz");
		aluno.setCidade("Santana");
		aluno.setEstado("SP");
		aluno.setCep("11.116-165");
		aluno.setTelefone("(11)4151-5654");
		aluno.setCpf("421.365.145-23");
		aluno.setRg("45.165.123");
		aluno.setSexo(("M").charAt(0));
		aluno.setDataNascimento("02/02/2000");
		aluno.setCelular("1199565");
		aluno.setComplemento("A");
		aluno.setEmail("doidinho@");
		aluno.setMatricula("5656a");
		
		
		AlunoDAO dao = new AlunoDAO();
		dao.salvar(aluno);
		System.out.println("Aluno salvo com sucesso!");
	}	
	
	public static void main(String[] args) {
		new TesteAluno().salvar();
	}
}
