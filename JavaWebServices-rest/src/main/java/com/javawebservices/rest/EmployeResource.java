/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.rest;

import com.javawebservices.api.entitystructure.EmpStructure;
import com.javawebservices.api.interfaceclient.EmployeRemote;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author SamitKumar
 */
@Path("/emp")
@Stateless
public class EmployeResource {

    @EJB(mappedName = "EmployeBean")
    EmployeRemote empRemote;
    
    public EmployeResource(){    
    }
    
    @Path("{id}")
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public EmpStructure getEmpById(@PathParam(value = "id") short id){
        return empRemote.getEmpById(id);
    }
    
    @Path("getAll")
    @GET
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public List<EmpStructure> getAllEmploye(){
        return empRemote.getAllEmploye();
    }  
}
