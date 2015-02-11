/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.bean;

import com.javawebservices.api.entity.Salgrade;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SamitKumar
 */
@Local
public interface SalgradeFacadeLocal {

    void create(Salgrade salgrade);

    void edit(Salgrade salgrade);

    void remove(Salgrade salgrade);

    Salgrade find(Object id);

    List<Salgrade> findAll();

    List<Salgrade> findRange(int[] range);

    int count();
    
}
