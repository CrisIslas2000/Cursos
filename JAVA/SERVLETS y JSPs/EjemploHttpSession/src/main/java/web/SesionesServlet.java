package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        //PEdir el atributo contadorVisistas a la sesion
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        //si es nulo es la primera vez que accedemos a la aplicacion
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo = "Bienvenido por primera vez";
        } else {
            contadorVisitas++;
            titulo = "Bienvenido nuevamente";
        }
        //agregamos el nuevo valor a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //mandamos la respuesta al cliente
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("<br>");
        out.print("no. accesos al recurso: "+ contadorVisitas);
        out.print("<br>");
        out.println("ID de la sesion: "+ sesion.getId());
        out.close();
        
    }


}
