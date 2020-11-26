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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "materia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Materia.findAll", query = "SELECT m FROM Materia m"),
    @NamedQuery(name = "Materia.findByIdmateria", query = "SELECT m FROM Materia m WHERE m.idmateria = :idmateria")})
public class Materia implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmateria")
    private Integer idmateria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materiaIdmateria")
    private List<TurmaMateria> turmaMateriaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materiaIdmateria")
    private List<ItemProfessor> itemProfessorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "materiaIdmateria")
    private List<ItemAluno> itemAlunoList;
    @JoinColumn(name = "professor_idprofessor", referencedColumnName = "idprofessor")
    @ManyToOne(optional = false)
    private Professor professorIdprofessor;

    public Materia() {
    }

    public Materia(Integer idmateria) {
        this.idmateria = idmateria;
    }

    public Integer getIdmateria() {
        return idmateria;
    }

    public void setIdmateria(Integer idmateria) {
        this.idmateria = idmateria;
    }

    @XmlTransient
    public List<TurmaMateria> getTurmaMateriaList() {
        return turmaMateriaList;
    }

    public void setTurmaMateriaList(List<TurmaMateria> turmaMateriaList) {
        this.turmaMateriaList = turmaMateriaList;
    }

    @XmlTransient
    public List<ItemProfessor> getItemProfessorList() {
        return itemProfessorList;
    }

    public void setItemProfessorList(List<ItemProfessor> itemProfessorList) {
        this.itemProfessorList = itemProfessorList;
    }

    @XmlTransient
    public List<ItemAluno> getItemAlunoList() {
        return itemAlunoList;
    }

    public void setItemAlunoList(List<ItemAluno> itemAlunoList) {
        this.itemAlunoList = itemAlunoList;
    }

    public Professor getProfessorIdprofessor() {
        return professorIdprofessor;
    }

    public void setProfessorIdprofessor(Professor professorIdprofessor) {
        this.professorIdprofessor = professorIdprofessor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmateria != null ? idmateria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materia)) {
            return false;
        }
        Materia other = (Materia) object;
        if ((this.idmateria == null && other.idmateria != null) || (this.idmateria != null && !this.idmateria.equals(other.idmateria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.foursys.banco.model.Materia[ idmateria=" + idmateria + " ]";
    }
    
}
