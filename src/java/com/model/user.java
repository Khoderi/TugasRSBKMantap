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
public class user implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_user;
    @Column
    private String nama;
    @Column
    private String password;
    @Column
    private String alamat;
    @Column
    private String no_hp;
    
    public user() {
    }
    public user(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }
    public user(int id_user, String nama, String password, String alamat, String no_hp) {
        this.id_user = id_user;
        this.nama = nama;
        this.password = password;
        this.alamat = alamat;
        this.no_hp=no_hp;
    }
    public int getIdUser() {
    return id_user;
    }
    public void setIdUser(int id_user) {
    this.id_user = id_user;
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
    public String getAlamat() {
    return alamat;
    }
    public void setAlamat(String alamat) {
    this.alamat = alamat;
    }
    public String getNoHp() {
    return no_hp;
    }
    public void setNoHp(String no_hp) {
    this.no_hp = no_hp;
    }
}
