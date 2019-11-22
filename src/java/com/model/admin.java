/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Column;


/**
 *
 * @author Khoderisasi
 */
@Entity
public class admin implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_admin;
    @Column
    private String nama;
    @Column
    private String password;

    public admin() {
    }

    public admin(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }
    public int getIdAdmin() {
    return id_admin;
    }
    public void setIdAdmin(int id_admin) {
    this.id_admin = id_admin;
    }
    public String getNama() {
    return nama;
    }
    public void setNama(String nama) {
    this.nama = nama;
    }
    public String getPassword() {
    return password;
    }
    public void setPassword(String password) {
    this.password = password;
    }
}

