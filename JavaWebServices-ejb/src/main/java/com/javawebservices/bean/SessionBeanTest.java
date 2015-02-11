/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.bean;

import com.javawebservices.api.interfaceclient.SessionBeanLocal;
import javax.ejb.Stateless;

/**
 *
 * @author SamitKumar
 */
@Stateless(mappedName = "SessionBeanTest")
public class SessionBeanTest implements SessionBeanLocal {

    @Override
    public String getTheMessage() {
        return "Hello Message from ejb Beans !";
    }

    @Override
    public String getMyPassedMessage(String message) {
        return "Hello ! your message is :"+message+" from ejb Beans";
    }

   
}
