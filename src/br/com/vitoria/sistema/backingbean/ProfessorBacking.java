package br.com.vitoria.sistema.backingbean;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

import br.com.vitoria.sistema.bean.Professor;
import br.com.vitoria.sistema.controller.ProfessorController;
import br.com.vitoria.sistema.util.JSFUtil;
import br.com.vitoria.sistema.util.Valida;

public class ProfessorBacking {
	private int idprofessor;
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
	private String dataNascimento;
	private String celular;
	private String complemento;
	private String email;
	private String curso;
	private String materia;
	private String salario;
	
	

	private Professor professor = new Professor();
	private Professor professorSelecionado = new Professor();
	private List<SelectItem> itensProfessors;
	static List<Professor> listaProfessor;
	private int scrollerPage;

	
	

	public int getScrollerPage() {
		return scrollerPage;
	}
	

	public void setScrollerPage(int scrollerPage) {
		this.scrollerPage = scrollerPage;
	}


	
	public static void setListaProfessor(List<Professor> listaProfessor) {
		ProfessorBacking.listaProfessor = listaProfessor;
	}
	public List<SelectItem> getItensProfessors() {
		return itensProfessors;
	}

	public void setItensProfessors(List<SelectItem> itensProfessors) {
		this.itensProfessors = itensProfessors;
	}

	

	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
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

	public int getIdprofessor() {
		return idprofessor;
	}


	public void setIdprofessor(int idprofessor) {
		this.idprofessor = idprofessor;
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


	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public String cadastraProfessor() {
		return "";
	}

	public String consultaProfessor() {
		listarProfessor();
		return "";
	}
	
	public String consultaCurso() {
		listarProfessor();
		return"";
	}

	public String cancelar() {
		return "cancelar";
	}

	public List<Professor> getListaProfessor() {
		return listaProfessor;
	}

	public Professor getProfessorSelecionado() {
		return professorSelecionado;
	}

	public void setProfessorSelecionado(Professor professorSelecionado) {
		this.professorSelecionado = professorSelecionado;
	}

	public String salvar() {
		if (validarDados()) {
			Professor professor = new Professor();
			professor.setNome(nome);
			professor.setEndereco(endereco);
			professor.setNumero(numero);
			professor.setBairro(bairro);
			professor.setCidade(cidade);
			professor.setEstado(estado);
			professor.setCep(cep);
			professor.setTelefone(telefone);
			professor.setCpf(cpf);
			professor.setRg(rg);
			professor.setCurso(curso);
			professor.setSalario(Double.parseDouble(salario.replace(".", "").replace(",", ".")));
			professor.setMateria(materia);
			professor.setDataNascimento(dataNascimento);
			professor.setCelular(celular);
			professor.setComplemento(complemento);
			professor.setEmail(email);
			

			ProfessorController professorController = new ProfessorController();
			try {
				professorController.salvar(professor);
				limparDados();
				JSFUtil.addInfoMessage("Professor salvo com sucesso!");
			} catch (Exception e) {
				JSFUtil.addInfoMessage("Erro ao salvar o professor.");
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
		dataNascimento = null;
		celular = null;
		complemento =null;
		email = null;
		curso= null;
		materia=null;
		salario = null;
	
	}

	public boolean validarDados() {
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
			JSFUtil.addInfoMessage("Informe o Email, campo obrigatório!");
			return false;
		}
		if (curso.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o curso, campo obrigatório!");
			return false;
		}
		if (materia.trim().equals("")) {
			JSFUtil.addInfoMessage("Informe o Materia, campo obrigatório!");
			return false;
		}
		
		
		return true;
	}

	public String pesquisar() {
		this.scrollerPage = 1;

		try {
			this.listaProfessor = new ProfessorController().buscarNome(nome);

		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao listar os professores.");
		}
		return "";
	}

	public void tratarProfessors() {
		itensProfessors = new ArrayList<SelectItem>();
		List<Professor> listaProfessors = new ProfessorController().buscarTodos();
		itensProfessors.add(new SelectItem("0", "Selecione um professor..."));
		for (Professor professor : listaProfessors) {
			itensProfessors.add(new SelectItem(professor.getNome(), professor.getNome()));
		}
	}

	public List<SelectItem> carregarProfessorsCombo() {
		tratarProfessors();
		return itensProfessors;
	}

	public String excluir() {
		ProfessorController professorController = new ProfessorController();
		professorController.excluir(professorSelecionado);
		pesquisar();
		JSFUtil.addInfoMessage("Professor excluído com sucesso!");
		return "";
	}

	public String alterarProfessor() {
		idprofessor = professorSelecionado.getIdprofessor();
		nome = professorSelecionado.getNome();
		endereco = professorSelecionado.getEndereco();
		numero = professorSelecionado.getNumero();
		bairro = professorSelecionado.getBairro();
		cidade = professorSelecionado.getCidade();
		estado = professorSelecionado.getEstado();
		cep = professorSelecionado.getCep();
		telefone = professorSelecionado.getTelefone();
		cpf = professorSelecionado.getCpf();
		rg = professorSelecionado.getRg();
		materia = professorSelecionado.getMateria();
		dataNascimento = professorSelecionado.getDataNascimento();
		celular = professorSelecionado.getCelular();
		curso = professorSelecionado.getCurso();
		salario = professorSelecionado.getSalario() + "".replace(".", ",");
		complemento = professorSelecionado.getComplemento();
		email = professorSelecionado.getEmail();
		
		
		return "alterar";
	}

	public String alterar() {
		if (validarDados()) {
			professorSelecionado.setIdprofessor(idprofessor);
			professorSelecionado.setNome(nome);
			professorSelecionado.setEndereco(endereco);
			professorSelecionado.setNumero(numero);
			professorSelecionado.setBairro(bairro);
			professorSelecionado.setCidade(cidade);
			professorSelecionado.setEstado(estado);
			professorSelecionado.setCep(cep);
			professorSelecionado.setTelefone(telefone);
			professorSelecionado.setCpf(cpf);
			professorSelecionado.setRg(rg);
			professorSelecionado.setCurso(curso);
			professorSelecionado.setMateria(materia);
			professorSelecionado.setSalario(Double.parseDouble(salario.replace(".", "").replace(",", ".")));
			professorSelecionado.setDataNascimento(dataNascimento);
			professorSelecionado.setCelular(celular);
			professorSelecionado.setComplemento(complemento);
			professorSelecionado.setEmail(email);
			
			
			ProfessorController professorController = new ProfessorController();
			professorController.salvar(professorSelecionado);
			limparDados();
			JSFUtil.addInfoMessage("Professor alterado com sucesso!");
		}
		return "";
	}

	public String listarProfessor() {
		this.scrollerPage = 1;

		try {
			this.listaProfessor = new ProfessorController().buscarTodos();

		} catch (Exception e) {
			JSFUtil.addInfoMessage("Erro ao listar os professors.");
		}
		return "";
	}
	public String formataMoeda(Double valor) {
		NumberFormat formatoMoeda = NumberFormat.getCurrencyInstance();
		return formatoMoeda.format(valor);
	}
	
	public String popularProfessor(ValueChangeEvent e) {
		nome = e.getNewValue().toString();
		return "";
	}

}
