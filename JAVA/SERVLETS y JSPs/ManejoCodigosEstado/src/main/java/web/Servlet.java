package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //simular los valores correctos
        String usuarioOK = "Juan";
        String passwordOK = "123";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        if(usuarioOK.equals(usuario) && passwordOK.equals(password)){
            out.print("<h1>");
            out.print("Datos correctos");
            out.print("<br>Usuario: "+usuario);
            out.print("<br>Password: "+password);
            out.print("</h1>");
        } else {
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
}
