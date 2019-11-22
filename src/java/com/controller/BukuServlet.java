/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.BukuDAOLocal;
import com.model.buku;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author Khoderisasi
 */
@WebServlet(name = "BukuServlet")
public class BukuServlet extends HttpServlet {
@EJB
    private BukuDAOLocal bukuDao;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    String action = request.getParameter("action");
    String id_bukuStr = request.getParameter("id_buku");
    int id_buku=0;
    if(id_bukuStr!=null && !id_bukuStr.equals("")){
        id_buku=Integer.parseInt(id_bukuStr);
    }
    String judul = request.getParameter("judul");
    String penerbit = request.getParameter("penerbit");
    
    String halamanStr = request.getParameter("halaman");
    int halaman = 0;
    if(halamanStr!=null && !halamanStr.equals("")){
        halaman=Integer.parseInt(halamanStr);
    }
    String stokStr = request.getParameter("stok");
    int stok = 0;
    if(stokStr!=null && !stokStr.equals("")){
        stok=Integer.parseInt(stokStr);
    }
    buku buku = new buku(id_buku, judul, penerbit, halaman, stok);
    if("Add".equalsIgnoreCase(action)){
        bukuDao.addBuku(buku);
    }else if("Edit".equalsIgnoreCase(action)){
        bukuDao.editBuku(buku);
    }else if("Delete".equalsIgnoreCase(action)){
        bukuDao.deleteBuku(id_buku);
    }else if("Search".equalsIgnoreCase(action)){
        buku = bukuDao.getBuku(id_buku);
    }
    request.setAttribute("buku", buku);
    request.setAttribute("allBuku", bukuDao.getAllbuku());
    request.getRequestDispatcher("homeAdmin.jsp").forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    processRequest(request, response);
    }
    @Override
    public String getServletInfo() {
    return "Short description";
    }// </editor-fold>
}
