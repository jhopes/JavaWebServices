/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.bean;

import com.javawebservices.api.entity.Emp;
import com.javawebservices.api.entitystructure.EmpStructure;
import com.javawebservices.api.interfaceclient.EmployeRemote;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SamitKumar
 */
@Stateless(mappedName = "EmployeBean")
public class EmpFacade extends AbstractFacade<Emp> implements EmpFacadeLocal,EmployeRemote {
    
    @PersistenceContext(unitName = "com.samit_JavaWebServices-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpFacade() {
        super(Emp.class);
    }

    @Override
    public EmpStructure getEmpById(short id) {
        EmpStructure empStructure=new EmpStructure();
        Emp emp=find(id);
        empMapping(emp,empStructure);
        System.out.println("empStructure is :"+empStructure);
        return empStructure;
    }

    @Override
    public List<EmpStructure> getAllEmploye() {
        List<Emp> employees =findAll();
        List<EmpStructure> empStructurs=new ArrayList<EmpStructure>();
        if(employees!=null && employees.size()>0){
            EmpStructure empStructure;
            for(Emp emp :employees){
                empStructure=new EmpStructure();
                empMapping(emp,empStructure);
                empStructurs.add(empStructure);
            }
        }else{
            
        }
        return empStructurs;
    }

    private void empMapping(Emp emp, EmpStructure empStructure) {
        if(emp!=null){
            empStructure.setEmpno(emp.getEmpno());
            empStructure.setComm(emp.getComm());
            //seems we don't want emp details here
            //empStructure.setDeptno(emp.getDeptno());
            empStructure.setEname(emp.getEname());
            empStructure.setHiredate(emp.getHiredate());
            empStructure.setJob(emp.getJob());
            empStructure.setMgr(emp.getMgr());
            empStructure.setSal(emp.getSal());
        }else{
            
        }
        
    }
    
}
