/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.api.interfaceclient;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 *
 * @author SamitKumar
 */
//@Local
@Remote
public interface SessionBeanLocal {
    public String getTheMessage();
    public String getMyPassedMessage(String message);
}
