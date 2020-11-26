package br.com.vitoria.sistema.backingbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import br.com.vitoria.sistema.bean.Aluno;
import br.com.vitoria.sistema.controller.AlunoController;
import br.com.vitoria.sistema.util.JSFUtil;
import br.com.vitoria.sistema.util.Valida;

public class AlunoBacking {
	private int idaluno;
	private String nome;
	private String endereco;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private String telefone;
	private String cpf;
	private String rg;
	private String sexo;
	private String dataNascimento;
	private String celular;
	private String complemento;
	private String email;
	private String matricula;
	
	

	private Aluno aluno = new Aluno();
	private Aluno alunoSelecionado = new Aluno();
	private List<SelectItem> itensAlunos;
	static List<Aluno> listaAluno;
	private int scrollerPage;

	
	

	public int getScrollerPage() {
		return scrollerPage;
	}
	

	public void setScrollerPage(int scrollerPage) {
		this.scrollerPage = scrollerPage;
	}


	
	public static void setListaAluno(List<Aluno> listaAluno) {
		AlunoBacking.listaAluno = listaAluno;
	}
	public List<SelectItem> getItensAlunos() {
		return itensAlunos;
	}

	public void setItensAlunos(List<SelectItem> itensAlunos) {
		this.itensAlunos = itensAlunos;
	}

	

	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public int getIdaluno() {
		return idaluno;
	}


	public void setIdaluno(int idaluno) {
		this.idaluno = idaluno;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public String cadastraAluno() {
		return "";
	}

	public String consultaAluno() {
		listarAluno();
		return "";
	}

	public String cancelar() {
		return "cancelar";
	}

	public List<Aluno> getListaAluno() {
		return listaAluno;
	}

	public Aluno getAlunoSelecionado() {
		return alunoSelecionado;
	}

	public void setAlunoSelecionado(Aluno alunoSelecionado) {
		this.alunoSelecionado = alunoSelecionado;
	}

	public String salvar() {
		if (validarDados()) {
			Aluno aluno = new Aluno();
			aluno.setNome(nome);
			aluno.setEndereco(endereco);
			aluno.setNumero(numero);
			aluno.setBairro(bairro);
			aluno.setCidade(cidade);
			aluno.setEstado(estado);
			aluno.setCep(cep);
			aluno.setTelefone(telefone);
			aluno.setCpf(cpf);
			aluno.setRg(rg);
			aluno.setSexo((sexo).charAt(0));
			aluno.setDataNascimento(dataNascimento);
			aluno.setCelular(celular);
			aluno.setComplemento(complemento);
			aluno.setMatricula(matricula);
			aluno.setEmail(email);
			

			AlunoController alunoController = new AlunoController();
			try {
				alunoController.salvar(aluno);
				limparDados();
				JSFUtil.addInfoMessage("Aluno salvo com sucesso!");
			} catch (Exception e) {
				JSFUtil.addInfoMessage("Erro ao salvar o aluno.");
			}
		}
		return "";
	}

	public void limparDados() {
		nome = null;
		endereco = null;
		numero = 0;
		bairro = null;
		cidade = null;
		estado = null;
		cep = null;
		telefone = null;
		cpf = null;
		rg = null;
		sexo = null;
		dataNascimento = null;
		celular = null;
		complemento =null;
		email = null;
		matricula = null;
	}

	public boolean validarDados() {
		if (matricula.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o matricula, campo obrigatório!");
			return false;
		}
		if (nome.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o nome, campo obrigatório!");
			return false;
		}
		if (Valida.validaNome(nome)) {
			JSFUtil.addInfoMessage("O nome informado contém caracteres inválidos.");
			return false;
		}
		if (rg.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o rg, campo obrigatório!");
			return false;
		}
		if (Valida.validarRg(rg)) {
			JSFUtil.addInfoMessage("O RG informado é inválido.");
			return false;
		}
		if (cpf.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o cpf, campo obrigatório!");
			return false;
		}
		if (!Valida.validaCpf(cpf)) {
			JSFUtil.addInfoMessage("O CPF inserido é inválido.");
			return false;
		}
		if (sexo.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o sexo, campo obrigatório!");
			return false;
		}

		if (dataNascimento.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe a data de nascimento, campo obrigatório!");
			return false;
		}
		if (!Valida.validarData(dataNascimento)) {
			JSFUtil.addInfoMessage("A data de nascimento informada é inválida.");
			return false;
		}
		if (endereco.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o logradouro, campo obrigatório!");
			return false;
		}
		if (numero == 0) {
			JSFUtil.addInfoMessage("Informe o número, campo obrigatório!");
			return false;
		}
		if (bairro.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o bairro, campo obrigatório!");
			return false;
		}
		if (cep.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o CEP, campo obrigatório!");
			return false;
		}
		if (cidade.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe a cidade, campo obrigatório!");
			return false;
		}
		if (estado.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o estado, campo obrigatório!");
			return false;
		}
		
		if (telefone.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o telefone, campo obrigatório!");
			return false;
		}
		if (celular.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o celular, campo obrigatório!");
			return false;
		}
		if (email.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o email, campo obrigatório!");
			return false;
		}
		
		
		
		
		
		return true;
	}

	public String pesquisar() {
		this.scrollerPage = 1;

		try {
			this.listaAluno = new AlunoController().buscarNome(nome);

		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao listar os alunos.");
		}
		return "";
	}

	public void tratarAlunos() {
		itensAlunos = new ArrayList<SelectItem>();
		List<Aluno> listaAlunos = new AlunoController().buscarTodos();
		itensAlunos.add(new SelectItem("0", "Selecione um aluno..."));
		for (Aluno aluno : listaAlunos) {
			itensAlunos.add(new SelectItem(aluno.getNome(), aluno.getNome()));
		}
	}

	public List<SelectItem> carregarAlunosCombo() {
		tratarAlunos();
		return itensAlunos;
	}

	public String excluir() {
		AlunoController alunoController = new AlunoController();
		alunoController.excluir(alunoSelecionado);
		pesquisar();
		JSFUtil.addInfoMessage("Aluno excluído com sucesso!");
		return "";
	}

	public String alterarAluno() {
		idaluno = alunoSelecionado.getIdaluno();
		nome = alunoSelecionado.getNome();
		endereco = alunoSelecionado.getEndereco();
		numero = alunoSelecionado.getNumero();
		bairro = alunoSelecionado.getBairro();
		cidade = alunoSelecionado.getCidade();
		estado = alunoSelecionado.getEstado();
		cep = alunoSelecionado.getCep();
		telefone = alunoSelecionado.getTelefone();
		cpf = alunoSelecionado.getCpf();
		rg = alunoSelecionado.getRg();
		sexo = alunoSelecionado.getSexo() + "";
		dataNascimento = alunoSelecionado.getDataNascimento();
		celular = alunoSelecionado.getCelular();
		complemento = alunoSelecionado.getComplemento();
		email = alunoSelecionado.getEmail();
		matricula = alunoSelecionado.getMatricula();
		
		return "alterar";
	}

	public String alterar() {
		if (validarDados()) {
			alunoSelecionado.setIdaluno(idaluno);
			alunoSelecionado.setNome(nome);
			alunoSelecionado.setEndereco(endereco);
			alunoSelecionado.setNumero(numero);
			alunoSelecionado.setBairro(bairro);
			alunoSelecionado.setCidade(cidade);
			alunoSelecionado.setEstado(estado);
			alunoSelecionado.setCep(cep);
			alunoSelecionado.setTelefone(telefone);
			alunoSelecionado.setCpf(cpf);
			alunoSelecionado.setRg(rg);
			alunoSelecionado.setSexo((sexo).charAt(0));
			alunoSelecionado.setDataNascimento(dataNascimento);
			alunoSelecionado.setCelular(celular);
			alunoSelecionado.setComplemento(complemento);
			alunoSelecionado.setEmail(email);
			alunoSelecionado.setMatricula(matricula);
			
			AlunoController alunoController = new AlunoController();
			alunoController.salvar(alunoSelecionado);
			limparDados();
			JSFUtil.addInfoMessage("Aluno alterado com sucesso!");
		}
		return "";
	}

	public String listarAluno() {
		this.scrollerPage = 1;

		try {
			this.listaAluno = new AlunoController().buscarTodos();

		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao listar os alunos.");
		}
		return "";
	}
	public String popularAluno(ValueChangeEvent e) {
		nome = e.getNewValue().toString();
		return "";
	}
}
