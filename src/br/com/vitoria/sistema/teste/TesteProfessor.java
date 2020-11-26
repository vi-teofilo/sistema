package br.com.vitoria.sistema.teste;

import br.com.vitoria.sistema.bean.Professor;
import br.com.vitoria.sistema.dao.ProfessorDAO;


public class TesteProfessor {

	public void salvar() {
		Professor professor= new Professor();
		
		professor.setNome("Doidinho");
		professor.setEndereco("Rua joao");
		professor.setNumero(10);
		professor.setBairro("Jd são luiz");
		professor.setCidade("Santana");
		professor.setEstado("SP");
		professor.setCep("11.116-165");
		professor.setTelefone("(11)4151-5654");
		professor.setCpf("421.365.145-23");
		professor.setRg("45.165.123");
		
		professor.setDataNascimento("02/02/2000");
		professor.setCelular("1199565");
		professor.setComplemento("A");
		professor.setEmail("doidinho@");
		professor.setSalario(2.000);
		professor.setMateria("TI");
		professor.setCurso("gestao ti");
		
		
		ProfessorDAO dao = new ProfessorDAO();
		dao.salvar(professor);
		System.out.println("Professor salvo com sucesso!");
	}	
	
	public static void main(String[] args) {
		new TesteProfessor().salvar();
	}
}
