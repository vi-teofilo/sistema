package br.com.vitoria.sistema.vo;

public class ProfessorVO {

	private String nome;
	private String materia;
	private String salario;
	
	public ProfessorVO() {
		
	}
	
	public ProfessorVO(String nome, String materia, String salario) {
		
		this.nome = nome;
		this.materia = materia;
		this.salario = salario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getSalario() {
		return salario;
	}
	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	
}
