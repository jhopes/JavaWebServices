/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.bean;

import com.javawebservices.api.entity.Dept;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SamitKumar
 */
@Local
public interface DeptFacadeLocal {

    void create(Dept dept);

    void edit(Dept dept);

    void remove(Dept dept);

    Dept find(Object id);

    List<Dept> findAll();

    List<Dept> findRange(int[] range);

    int count();
    
}
