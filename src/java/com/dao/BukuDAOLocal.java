/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.buku; 
import java.util.List; 
import javax.ejb.Local; 


/**
 *
 * @author Khoderisasi
 */
@Local
public interface BukuDAOLocal {
    void addBuku(buku buku);
    void editBuku(buku buku); 
    void deleteBuku(int id_buku); 
    buku getBuku(int id_buku); 
    List<buku> getAllbuku(); 
}
