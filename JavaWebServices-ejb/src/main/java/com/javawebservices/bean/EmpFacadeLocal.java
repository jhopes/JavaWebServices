/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.bean;

import com.javawebservices.api.entity.Emp;
import com.javawebservices.api.entitystructure.EmpStructure;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SamitKumar
 */
@Local
public interface EmpFacadeLocal {

    void create(Emp emp);

    void edit(Emp emp);

    void remove(Emp emp);

    Emp find(Object id);

    List<Emp> findAll();

    List<Emp> findRange(int[] range);

    int count();
    
}
