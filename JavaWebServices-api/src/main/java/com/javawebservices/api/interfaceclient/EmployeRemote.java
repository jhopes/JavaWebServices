/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javawebservices.api.interfaceclient;

import com.javawebservices.api.entitystructure.EmpStructure;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author SamitKumar
 */
@Remote
public interface EmployeRemote {
    public EmpStructure getEmpById(short id);
    public List<EmpStructure> getAllEmploye();
}
