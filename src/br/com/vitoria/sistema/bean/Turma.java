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
@Table(name = "turma")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turma.findAll", query = "SELECT t FROM Turma t"),
    @NamedQuery(name = "Turma.findByIdturma", query = "SELECT t FROM Turma t WHERE t.idturma = :idturma")})
public class Turma implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idturma")
    private Integer idturma;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "turmaIdturma")
    private List<TurmaMateria> turmaMateriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "turmaIdturma")
    private List<CursoTurma> cursoTurmaList;

    public Turma() {
    }

    public Turma(Integer idturma) {
        this.idturma = idturma;
    }

    public Integer getIdturma() {
        return idturma;
    }

    public void setIdturma(Integer idturma) {
        this.idturma = idturma;
    }

    @XmlTransient
    public List<TurmaMateria> getTurmaMateriaList() {
        return turmaMateriaList;
    }

    public void setTurmaMateriaList(List<TurmaMateria> turmaMateriaList) {
        this.turmaMateriaList = turmaMateriaList;
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
        hash += (idturma != null ? idturma.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turma)) {
            return false;
        }
        Turma other = (Turma) object;
        if ((this.idturma == null && other.idturma != null) || (this.idturma != null && !this.idturma.equals(other.idturma))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.foursys.banco.model.Turma[ idturma=" + idturma + " ]";
    }
    
}
