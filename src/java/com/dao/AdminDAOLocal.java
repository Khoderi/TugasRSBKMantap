/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.model.admin;
import javax.ejb.Local;


/**
 *
 * @author Khoderisasi
 */
@Local
public interface AdminDAOLocal {
    public boolean credential(String nama, String password);
    public boolean checkAdmin (String nama);
    void addAdmin (admin admin);

}
