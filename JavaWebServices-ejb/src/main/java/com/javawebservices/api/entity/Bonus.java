/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.api.entity;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SamitKumar
 */
@Entity
@Table(name = "BONUS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bonus.findAll", query = "SELECT b FROM Bonus b"),
    @NamedQuery(name = "Bonus.findById", query = "SELECT b FROM Bonus b WHERE b.id = :id"),
    @NamedQuery(name = "Bonus.findByEname", query = "SELECT b FROM Bonus b WHERE b.ename = :ename"),
    @NamedQuery(name = "Bonus.findByJob", query = "SELECT b FROM Bonus b WHERE b.job = :job"),
    @NamedQuery(name = "Bonus.findBySal", query = "SELECT b FROM Bonus b WHERE b.sal = :sal"),
    @NamedQuery(name = "Bonus.findByComm", query = "SELECT b FROM Bonus b WHERE b.comm = :comm")})
public class Bonus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID")
    private String id;
    @Size(max = 10)
    @Column(name = "ENAME")
    private String ename;
    @Size(max = 9)
    @Column(name = "JOB")
    private String job;
    @Column(name = "SAL")
    private BigInteger sal;
    @Column(name = "COMM")
    private BigInteger comm;

    public Bonus() {
    }

    public Bonus(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public BigInteger getSal() {
        return sal;
    }

    public void setSal(BigInteger sal) {
        this.sal = sal;
    }

    public BigInteger getComm() {
        return comm;
    }

    public void setComm(BigInteger comm) {
        this.comm = comm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bonus)) {
            return false;
        }
        Bonus other = (Bonus) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.javawebservices.entity.Bonus[ id=" + id + " ]";
    }
    
}
