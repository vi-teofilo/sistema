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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vfurtado
 */
@Entity
@Table(name = "curso_turma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CursoTurma.findAll", query = "SELECT c FROM CursoTurma c"),
    @NamedQuery(name = "CursoTurma.findByIdcursoTurma", query = "SELECT c FROM CursoTurma c WHERE c.idcursoTurma = :idcursoTurma")})
public class CursoTurma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcurso_turma")
    private Integer idcursoTurma;
    @JoinColumn(name = "curso_idcurso", referencedColumnName = "idcurso")
    @ManyToOne(optional = false)
    private Curso cursoIdcurso;
    @JoinColumn(name = "turma_idturma", referencedColumnName = "idturma")
    @ManyToOne(optional = false)
    private Turma turmaIdturma;

    public CursoTurma() {
    }

    public CursoTurma(Integer idcursoTurma) {
        this.idcursoTurma = idcursoTurma;
    }

    public Integer getIdcursoTurma() {
        return idcursoTurma;
    }

    public void setIdcursoTurma(Integer idcursoTurma) {
        this.idcursoTurma = idcursoTurma;
    }

    public Curso getCursoIdcurso() {
        return cursoIdcurso;
    }

    public void setCursoIdcurso(Curso cursoIdcurso) {
        this.cursoIdcurso = cursoIdcurso;
    }

    public Turma getTurmaIdturma() {
        return turmaIdturma;
    }

    public void setTurmaIdturma(Turma turmaIdturma) {
        this.turmaIdturma = turmaIdturma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcursoTurma != null ? idcursoTurma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursoTurma)) {
            return false;
        }
        CursoTurma other = (CursoTurma) object;
        if ((this.idcursoTurma == null && other.idcursoTurma != null) || (this.idcursoTurma != null && !this.idcursoTurma.equals(other.idcursoTurma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.foursys.banco.model.CursoTurma[ idcursoTurma=" + idcursoTurma + " ]";
    }
    
}
