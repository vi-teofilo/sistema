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
@Table(name = "item_professor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemProfessor.findAll", query = "SELECT i FROM ItemProfessor i"),
    @NamedQuery(name = "ItemProfessor.findByIditemprofessor", query = "SELECT i FROM ItemProfessor i WHERE i.iditemprofessor = :iditemprofessor")})
public class ItemProfessor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iditemprofessor")
    private Integer iditemprofessor;
    @JoinColumn(name = "materia_idmateria", referencedColumnName = "idmateria")
    @ManyToOne(optional = false)
    private Materia materiaIdmateria;
    @JoinColumn(name = "professor_idprofessor", referencedColumnName = "idprofessor")
    @ManyToOne(optional = false)
    private Professor professorIdprofessor;

    public ItemProfessor() {
    }

    public ItemProfessor(Integer iditemprofessor) {
        this.iditemprofessor = iditemprofessor;
    }

    public Integer getIditemprofessor() {
        return iditemprofessor;
    }

    public void setIditemprofessor(Integer iditemprofessor) {
        this.iditemprofessor = iditemprofessor;
    }

    public Materia getMateriaIdmateria() {
        return materiaIdmateria;
    }

    public void setMateriaIdmateria(Materia materiaIdmateria) {
        this.materiaIdmateria = materiaIdmateria;
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
        hash += (iditemprofessor != null ? iditemprofessor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemProfessor)) {
            return false;
        }
        ItemProfessor other = (ItemProfessor) object;
        if ((this.iditemprofessor == null && other.iditemprofessor != null) || (this.iditemprofessor != null && !this.iditemprofessor.equals(other.iditemprofessor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.foursys.banco.model.ItemProfessor[ iditemprofessor=" + iditemprofessor + " ]";
    }
    
}
