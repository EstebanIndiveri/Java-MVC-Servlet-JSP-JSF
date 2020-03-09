/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import model.Rectangulo;
/**
 *
 * @author estel
 */
@WebServlet(name="ServletControlador",urlPatterns={"/ServletControlador"})
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,
            IOException{
        //1. en este caso no hay necesidad de procesar parametros:
        
        //2. Creamos los JavaBeans
        Rectangulo rec=new Rectangulo(3,6);
        //3.Agregamos las variables en cierto alcance
        request.setAttribute("mensaje", "Saludos desde el Servlet");
        
        HttpSession session=request.getSession();
        //30minutos sin actividad:
        session.setAttribute("rectangulo", rec);
        //4.Redireccionamos
        RequestDispatcher rd=request.getRequestDispatcher("vista/desplegarVariables.jsp");
        //se propagan los objetos request y response
        //reenvío hacia el JSP, el flujo continua en ese archivo:
        rd.forward(request, response);
    }
}


