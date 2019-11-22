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
@Table 
@NamedQueries({@NamedQuery(name="buku.getAll",query="SELECT e FROM buku e order by e.id_buku")}) 
public class buku implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_buku; 
    @Column 
    private String judul; 
    @Column 
    private String penerbit;
    @Column 
    private int halaman; 
    @Column 
    private int stok;
    public buku(int id_buku, String judul, String penerbit, int halaman, int stok) { 
    this.id_buku = id_buku; 
    this.judul = judul; 
    this.penerbit = penerbit;
    this.halaman = halaman; 
    this.stok = stok; 
    } 
    public buku() { 
    } 
  
    public int getIdBuku() { 
    return id_buku; 
    } 
    public void setIdBuku(int id_buku) { 
    this.id_buku = id_buku; 
    } 
    public String getJudul() { 
    return judul; 
    } 
    public void setJudul(String judul) { 
    this.judul = judul; 
    } 
    public String getPenerbit() { 
    return penerbit; 
    } 
    public void setPenerbit(String penerbit) { 
    this.penerbit = penerbit; 
    } 
    public int getHalaman() { 
    return halaman; 
    } 
    public void setHalaman(int halaman) { 
    this.halaman = halaman; 
    }
    public int getStok() { 
    return stok; 
    } 
    public void setStok(int stok) { 
    this.stok = stok; 
    }
}

