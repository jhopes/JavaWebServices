/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.bean;

import com.javawebservices.api.entity.Bonus;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author SamitKumar
 */
@Stateless
public class BonusFacade extends AbstractFacade<Bonus> implements BonusFacadeLocal {
    @PersistenceContext(unitName = "com.samit_JavaWebServices-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BonusFacade() {
        super(Bonus.class);
    }
    
}
