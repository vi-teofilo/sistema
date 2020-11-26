package br.com.vitoria.sistema.vo;
// classe responsavel por visualizar o que vamos ter no relatorio 
public class AlunoVO {
	
	private String nome;
	private String telefone;
	private String dataNascimento;
	private String cidade;
	
	public AlunoVO() {
		
	}
	
	public AlunoVO(String nome, String telefone, String dataNascimento, String cidade) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.cidade = cidade;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
