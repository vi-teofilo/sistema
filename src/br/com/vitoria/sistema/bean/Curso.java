/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vitoria.sistema.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vfurtado
 */
@Entity
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c"),
    @NamedQuery(name = "Curso.findByIdcurso", query = "SELECT c FROM Curso c WHERE c.idcurso = :idcurso"),
    @NamedQuery(name = "Curso.findByNome", query = "SELECT c FROM Curso c WHERE c.nome = :nome"),
    @NamedQuery(name = "Curso.findByCursocol", query = "SELECT c FROM Curso c WHERE c.cursocol = :cursocol")})
public class Curso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcurso")
    private Integer idcurso;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Column(name = "cursocol")
    private String cursocol;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cursoIdcurso")
    private List<CursoTurma> cursoTurmaList;

    public Curso() {
    }

    public Curso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public Curso(Integer idcurso, String nome) {
        this.idcurso = idcurso;
        this.nome = nome;
    }

    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCursocol() {
        return cursocol;
    }

    public void setCursocol(String cursocol) {
        this.cursocol = cursocol;
    }

    @XmlTransient
    public List<CursoTurma> getCursoTurmaList() {
        return cursoTurmaList;
    }

    public void setCursoTurmaList(List<CursoTurma> cursoTurmaList) {
        this.cursoTurmaList = cursoTurmaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcurso != null ? idcurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.idcurso == null && other.idcurso != null) || (this.idcurso != null && !this.idcurso.equals(other.idcurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.foursys.banco.model.Curso[ idcurso=" + idcurso + " ]";
    }
    
}
