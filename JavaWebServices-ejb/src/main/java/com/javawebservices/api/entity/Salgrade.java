/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.api.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SamitKumar
 */
@Entity
@Table(name = "SALGRADE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salgrade.findAll", query = "SELECT s FROM Salgrade s"),
    @NamedQuery(name = "Salgrade.findByGrade", query = "SELECT s FROM Salgrade s WHERE s.grade = :grade"),
    @NamedQuery(name = "Salgrade.findByLosal", query = "SELECT s FROM Salgrade s WHERE s.losal = :losal"),
    @NamedQuery(name = "Salgrade.findByHisal", query = "SELECT s FROM Salgrade s WHERE s.hisal = :hisal")})
public class Salgrade implements Serializable {
    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "GRADE")
    private BigDecimal grade;
    @Column(name = "LOSAL")
    private BigInteger losal;
    @Column(name = "HISAL")
    private BigInteger hisal;

    public Salgrade() {
    }

    public Salgrade(BigDecimal grade) {
        this.grade = grade;
    }

    public BigDecimal getGrade() {
        return grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public BigInteger getLosal() {
        return losal;
    }

    public void setLosal(BigInteger losal) {
        this.losal = losal;
    }

    public BigInteger getHisal() {
        return hisal;
    }

    public void setHisal(BigInteger hisal) {
        this.hisal = hisal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grade != null ? grade.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salgrade)) {
            return false;
        }
        Salgrade other = (Salgrade) object;
        if ((this.grade == null && other.grade != null) || (this.grade != null && !this.grade.equals(other.grade))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.javawebservices.entity.Salgrade[ grade=" + grade + " ]";
    }
    
}
