/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author INFORMATICA CRIS
 */
@WebServlet(name = "Servlet", urlPatterns = {"/ServletHeaders"})
public class Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String metododHttp = request.getMethod();
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Headers HTTP</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Headers HTTP</h1>");
            out.print("Metodo Http:" + metododHttp);
            
            String uri = request.getRequestURI();
            out.print("<br>");
            out.print("URI solicitada:" + uri);
            out.print("<br>");
            
            //Imprimir todos los cabeceros disponibles
            Enumeration cabeceros = request.getHeaderNames();
            while(cabeceros.hasMoreElements()){
                String nombreCabecero = (String) cabeceros.nextElement();
                out.print("<b> " + nombreCabecero + "</b>");
                out.print(request.getHeader(nombreCabecero));
                out.println("<br>");
            }
            
            out.print("</body>");
            out.print("</html>");
            out.close();
            
    }

}
