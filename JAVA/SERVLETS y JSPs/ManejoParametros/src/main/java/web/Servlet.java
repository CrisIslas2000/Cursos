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
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Leer parametros del formulario html
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        System.out.println("usuario = " + usuario);
        System.out.println("pasword = " + password);
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: " +usuario);
        out.print("<br/>");
        out.print("El parametro pasword es: " +password);
        out.print("</body");
        out.print("</html");
        out.close();
        
    }
}
