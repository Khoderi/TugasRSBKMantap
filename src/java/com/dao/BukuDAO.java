/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.buku; 
import java.util.List; 
import javax.ejb.Stateless; 
import javax.persistence.EntityManager; 
import javax.persistence.PersistenceContext;


/**
 *
 * @author Khoderisasi
 */
@Stateless
public class BukuDAO implements BukuDAOLocal {
@PersistenceContext 
    private EntityManager em; 
    public void addBuku(buku Buku) { 
    em.merge(Buku); 
    em.flush(); 
    } 
    public void editBuku(buku Buku) { 
    em.merge(Buku); 
    em.flush(); 
    } 
    public void deleteBuku(int id_buku) { 
    em.remove(getBuku(id_buku)); 
    em.flush(); 
    } 
    public buku getBuku(int id_buku) { 
    em.flush(); 
    return em.find(buku.class, id_buku); 
    } 
    public List<buku> getAllbuku() { 
    em.flush(); 
    return em.createNamedQuery("buku.getAll").getResultList(); 
    } 
}

