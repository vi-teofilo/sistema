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
@Table(name = "turma_materia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TurmaMateria.findAll", query = "SELECT t FROM TurmaMateria t"),
    @NamedQuery(name = "TurmaMateria.findByIdturmaMateria", query = "SELECT t FROM TurmaMateria t WHERE t.idturmaMateria = :idturmaMateria")})
public class TurmaMateria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idturma_materia")
    private Integer idturmaMateria;
    @JoinColumn(name = "materia_idmateria", referencedColumnName = "idmateria")
    @ManyToOne(optional = false)
    private Materia materiaIdmateria;
    @JoinColumn(name = "turma_idturma", referencedColumnName = "idturma")
    @ManyToOne(optional = false)
    private Turma turmaIdturma;

    public TurmaMateria() {
    }

    public TurmaMateria(Integer idturmaMateria) {
        this.idturmaMateria = idturmaMateria;
    }

    public Integer getIdturmaMateria() {
        return idturmaMateria;
    }

    public void setIdturmaMateria(Integer idturmaMateria) {
        this.idturmaMateria = idturmaMateria;
    }

    public Materia getMateriaIdmateria() {
        return materiaIdmateria;
    }

    public void setMateriaIdmateria(Materia materiaIdmateria) {
        this.materiaIdmateria = materiaIdmateria;
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
        hash += (idturmaMateria != null ? idturmaMateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TurmaMateria)) {
            return false;
        }
        TurmaMateria other = (TurmaMateria) object;
        if ((this.idturmaMateria == null && other.idturmaMateria != null) || (this.idturmaMateria != null && !this.idturmaMateria.equals(other.idturmaMateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.foursys.banco.model.TurmaMateria[ idturmaMateria=" + idturmaMateria + " ]";
    }
    
}
