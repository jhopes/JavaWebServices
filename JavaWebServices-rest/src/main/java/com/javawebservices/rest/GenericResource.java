/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.rest;

import com.javawebservices.api.interfaceclient.SessionBeanLocal;
import javax.ejb.EJB;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 * REST Web Service
 *
 * @author SamitKumar
 */
@Path("/generic")
public class GenericResource {
    
    /**
     * one way to get the ejb inside the RESTful services
     * we can get the beanLocal without @EJB annotation, i.e. through JNDI lookup
     */
    @EJB
    private SessionBeanLocal beanLocal;
    
    @Context
    private UriInfo context;

    public GenericResource() {
        try{
            javax.naming.Context ctx=new InitialContext();
            beanLocal=(SessionBeanLocal)ctx.lookup("SessionBeanTest#com.javawebservices.api.interfaceclient.SessionBeanLocal");
        }catch(NamingException n){
            n.printStackTrace();
        }
    }

    /**
     * Retrieves representation of an instance of com.javawebservices.rest.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("text/plain")
    public String getText() {
        return "Hello = "+beanLocal.getTheMessage()+" the context info is :"+context.getPath();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("text/plain")
    public void putText(String content) {
    }
}
