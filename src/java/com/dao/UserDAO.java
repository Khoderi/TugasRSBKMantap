/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import javax.ejb.Stateless;
import com.model.user; 
import java.util.List;  
import javax.persistence.EntityManager; 
import javax.persistence.PersistenceContext; 

/**
 *
 * @author Khoderisasi
 */
@Stateless
public class UserDAO implements UserDAOLocal {
@PersistenceContext 
    private EntityManager em; 
    public boolean credential(String nama, String password) { 
    List<user> s = (List<user>)em.createQuery("select e from user e where e.nama='"+nama+"' and e.password='"+password+"'").getResultList(); 
    System.out.println("is list empty ?"+s.isEmpty()+" for the"+nama+" and "+password);
    if(!s.isEmpty()) 
    return true; 
    else 
    return false; 
    } 
    public boolean checkUser(String nama) { 
    List<user> s = (List<user>)em.createQuery("select e from user e where e.nama='"+nama+"'").getResultList();
    if(s.isEmpty()) 
    return true; 
    else 
    return false; 
    }
    public void addUser(user user){
        em.merge(user); 
        em.flush();
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
