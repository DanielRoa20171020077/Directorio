/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Logica.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Estudiantes
 */
@WebServlet(name = "ServletRecibir", urlPatterns = {"/ServletRecibir"})
public class ServletCliente extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            
            
            throws ServletException, IOException {
        
        Cliente c=new Cliente();
        c.setNombre(request.getParameter("Nombre"));
        c.setApellido(request.getParameter("Apellido"));
        c.setTipo_c(request.getParameter("Tipo_c"));
        c.setComentario(request.getParameter("area"));
        c.setProducto("Producto");
        c.setCalle(Integer.parseInt(request.getParameter("Cll")));
        c.setCarrera(Integer.parseInt(request.getParameter("Kr")));
        c.setTelefono(Integer.parseInt(request.getParameter("Telefono")));
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Directoro_Recibido</title>"); 
            out.println("<link type=\"text/css\" rel=\"stylesheet\" href=\"EstiloServlets.css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form  method=\"get\">");
            out.println("<h1>Directorio</h1>");
            out.println("<table id=\"t1\" border=3>"); 
            out.println("<tr>");
            out.println("<td><h1>Nombre</h1></td>");
            out.println("<td><h4>     "+c.getNombre()+"   </h4></td>");
            out.println("<td rowspan=\"4\" id=\"img\">");
            out.println("<img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT2MdeRuc6u9LB4rL1cewvV-Tug12O7UZ3WpCBNYFXiHpNFqXj4Wg\"></img>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><h1>Apellido</h1></td>");
            out.println("<td><h4>"+c.getApellido()+"</h4></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><h1>Direccion</h1></td>");
            out.println("<td><h4>Cll: "+c.getCalle()+" Kr: "+c.getCarrera()+"</h4></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><h1>Telefono</h1></td>");
            out.println("<td><h4>"+c.getTelefono()+"</h4></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><h1>Tipo_contacto</h1></td>");
            out.println("<td><h4>"+c.getTipo_c()+"</h4></td>");
            out.println("<td><h6>Pruducto: "+c.getProducto()+"</h6></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td><h1>Comentario</h1></td>");        
            out.println("<td colspan =\"2\"><h4>"+c.getComentario()+"<h4></td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td colspan=\"3\"><a href=\"index.jsp\">Regresar</a></td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
