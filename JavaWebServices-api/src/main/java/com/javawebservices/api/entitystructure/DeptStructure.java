/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.api.entitystructure;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author SamitKumar
 */
@XmlRootElement
public class DeptStructure {

    private Short deptno;
    private String dname;
    private String loc;
    private List<EmpStructure> empList;

    public Short getDeptno() {
        return deptno;
    }

    public void setDeptno(Short deptno) {
        this.deptno = deptno;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<EmpStructure> getEmpList() {
        return empList;
    }

    public void setEmpList(List<EmpStructure> empList) {
        this.empList = empList;
    }

    @Override
    public String toString() {
        return "DeptStructure{" + "deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + ", empList=" + empList + '}';
    }
    
}
