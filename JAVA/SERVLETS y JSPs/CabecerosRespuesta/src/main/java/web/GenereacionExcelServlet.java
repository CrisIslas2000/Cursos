/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author INFORMATICA CRIS
 */
@WebServlet(name = "GenereacionExcelServlet", urlPatterns = {"/GeneracionExcelServlet"})
public class GenereacionExcelServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //indica el tipo de respuesta al navegador
        response.setContentType("application/vnd.mx-excel");
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        //Para un uso mas profesional de excel poi.apache.org
        
        //indicar al navegador que no guarde cache
        response.setHeader("Pragma","no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        
        //desplegamos la informacion al cliente
        PrintWriter out = response.getWriter();
        out.println("\tValores");
        out.println("\t1");
        out.println("\t2");
        out.println("Total\t=SUMA(b2:b3)");
        out.close();
        
    }

}
