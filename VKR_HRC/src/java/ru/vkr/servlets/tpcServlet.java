/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.vkr.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author UstinovSA <ustinov.serg.al@gmail.com>
 */
@WebServlet("/calculations/tpc")
public class tpcServlet extends HttpServlet{
    public static final String URL = "/WEB-INF/pages/calculations/tpc.jsp";

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher(URL);
       rd.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) 
            throws ServletException, IOException {
        doGet(request, response);
    }
 
    
}
