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
@Table(name = "item_aluno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemAluno.findAll", query = "SELECT i FROM ItemAluno i"),
    @NamedQuery(name = "ItemAluno.findByIditemAluno", query = "SELECT i FROM ItemAluno i WHERE i.iditemAluno = :iditemAluno")})
public class ItemAluno implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditem_aluno")
    private Integer iditemAluno;
    @JoinColumn(name = "aluno_idaluno", referencedColumnName = "idaluno")
    @ManyToOne(optional = false)
    private Aluno alunoIdaluno;
    @JoinColumn(name = "materia_idmateria", referencedColumnName = "idmateria")
    @ManyToOne(optional = false)
    private Materia materiaIdmateria;

    public ItemAluno() {
    }

    public ItemAluno(Integer iditemAluno) {
        this.iditemAluno = iditemAluno;
    }

    public Integer getIditemAluno() {
        return iditemAluno;
    }

    public void setIditemAluno(Integer iditemAluno) {
        this.iditemAluno = iditemAluno;
    }

    public Aluno getAlunoIdaluno() {
        return alunoIdaluno;
    }

    public void setAlunoIdaluno(Aluno alunoIdaluno) {
        this.alunoIdaluno = alunoIdaluno;
    }

    public Materia getMateriaIdmateria() {
        return materiaIdmateria;
    }

    public void setMateriaIdmateria(Materia materiaIdmateria) {
        this.materiaIdmateria = materiaIdmateria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iditemAluno != null ? iditemAluno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemAluno)) {
            return false;
        }
        ItemAluno other = (ItemAluno) object;
        if ((this.iditemAluno == null && other.iditemAluno != null) || (this.iditemAluno != null && !this.iditemAluno.equals(other.iditemAluno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.foursys.banco.model.ItemAluno[ iditemAluno=" + iditemAluno + " ]";
    }
    
}
