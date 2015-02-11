/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.bean;

import com.javawebservices.api.entity.Bonus;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author SamitKumar
 */
@Local
public interface BonusFacadeLocal {

    void create(Bonus bonus);

    void edit(Bonus bonus);

    void remove(Bonus bonus);

    Bonus find(Object id);

    List<Bonus> findAll();

    List<Bonus> findRange(int[] range);

    int count();
    
}
