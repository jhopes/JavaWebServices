/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samit.soapservices;

import com.javawebservices.api.entitystructure.EmpStructure;
import com.javawebservices.api.interfaceclient.EmployeRemote;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 *
 * @author SamitKumar
 */
@Stateless
@WebService(serviceName = "EmployeServices", portName = "EmployeServicesPort")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class EmployeServices {
    @EJB
    EmployeRemote empRemote;
     
    /**
     * 
     * @return List<EmpStructure> 
     * If a service is returning list of entity, not to use "parameterStyle = ParameterStyle.BARE" in the @SOAPBinding,
     * It will through JAXB - illigalParamaer exception
     */
    @WebMethod(operationName = "getAllEmploye")
    @WebResult(name = "EmpStructure", partName = "EmpStructure")
    public List<EmpStructure> getAllEmploye(){
        return empRemote.getAllEmploye();
    }
}
