/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vitoria.sistema.bean;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vfurtado
 */
@Entity
@Table(name = "professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Professor.findAll", query = "SELECT p FROM Professor p"),
    @NamedQuery(name = "Professor.findByIdprofessor", query = "SELECT p FROM Professor p WHERE p.idprofessor = :idprofessor"),
    @NamedQuery(name = "Professor.findByNome", query = "SELECT p FROM Professor p WHERE p.nome = :nome"),
    @NamedQuery(name = "Professor.findByDataNascimento", query = "SELECT p FROM Professor p WHERE p.dataNascimento = :dataNascimento"),
    @NamedQuery(name = "Professor.findByRg", query = "SELECT p FROM Professor p WHERE p.rg = :rg"),
    @NamedQuery(name = "Professor.findByCpf", query = "SELECT p FROM Professor p WHERE p.cpf = :cpf"),
    @NamedQuery(name = "Professor.findBySalario", query = "SELECT p FROM Professor p WHERE p.salario = :salario"),
    @NamedQuery(name = "Professor.findByCurso", query = "SELECT p FROM Professor p WHERE p.curso = :curso"),
    @NamedQuery(name = "Professor.findByMateria", query = "SELECT p FROM Professor p WHERE p.materia = :materia"),
    @NamedQuery(name = "Professor.findByEndereco", query = "SELECT p FROM Professor p WHERE p.endereco = :endereco"),
    @NamedQuery(name = "Professor.findByNumero", query = "SELECT p FROM Professor p WHERE p.numero = :numero"),
    @NamedQuery(name = "Professor.findByComplemento", query = "SELECT p FROM Professor p WHERE p.complemento = :complemento"),
    @NamedQuery(name = "Professor.findByBairro", query = "SELECT p FROM Professor p WHERE p.bairro = :bairro"),
    @NamedQuery(name = "Professor.findByCidade", query = "SELECT p FROM Professor p WHERE p.cidade = :cidade"),
    @NamedQuery(name = "Professor.findByEstado", query = "SELECT p FROM Professor p WHERE p.estado = :estado"),
    @NamedQuery(name = "Professor.findByTelefone", query = "SELECT p FROM Professor p WHERE p.telefone = :telefone"),
    @NamedQuery(name = "Professor.findByCelular", query = "SELECT p FROM Professor p WHERE p.celular = :celular"),
    @NamedQuery(name = "Professor.findByEmail", query = "SELECT p FROM Professor p WHERE p.email = :email"),
    @NamedQuery(name = "Professor.findByCep", query = "SELECT p FROM Professor p WHERE p.cep = :cep")})
public class Professor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprofessor")
    private Integer idprofessor;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "data_nascimento")
    private String dataNascimento;
    @Basic(optional = false)
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @Column(name = "cpf")
    private String cpf;
    @Basic(optional = false)
    @Column(name = "salario")
    private Double salario;
    @Basic(optional = false)
    @Column(name = "curso")
    private String curso;
    @Basic(optional = false)
    @Column(name = "materia")
    private String materia;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "numero")
    private int numero;
    @Basic(optional = false)
    @Column(name = "complemento")
    private String complemento;
    @Basic(optional = false)
    @Column(name = "bairro")
    private String bairro;
    @Basic(optional = false)
    @Column(name = "cidade")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "estado")
    private String estado;
    @Basic(optional = false)
    @Column(name = "telefone")
    private String telefone;
    @Basic(optional = false)
    @Column(name = "celular")
    private String celular;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "cep")
    private String cep;
   

    public Professor() {
    }

    public Professor(Integer idprofessor) {
        this.idprofessor = idprofessor;
    }

    public Professor(Integer idprofessor, String nome, String dataNascimento, String rg, String cpf, Double salario, String curso, String materia, String endereco, int numero, String complemento, String bairro, String cidade, String estado, String telefone, String celular, String email, String cep) {
        this.idprofessor = idprofessor;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.salario = salario;
        this.curso = curso;
        this.materia = materia;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.cep = cep;
    }

    public Integer getIdprofessor() {
        return idprofessor;
    }

    public void setIdprofessor(Integer idprofessor) {
        this.idprofessor = idprofessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
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

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprofessor != null ? idprofessor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Professor)) {
            return false;
        }
        Professor other = (Professor) object;
        if ((this.idprofessor == null && other.idprofessor != null) || (this.idprofessor != null && !this.idprofessor.equals(other.idprofessor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.vitoria.sistema.bean.Professor[ idprofessor=" + idprofessor + " ]";
    }


    
}
