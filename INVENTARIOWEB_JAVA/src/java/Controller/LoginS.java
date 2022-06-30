/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.UsuarioDAO;
import DAO.UsuarioImplementar;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Armando
 */
public class LoginS extends HttpServlet {

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
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
        //response.sendRedirect("/index.jsp");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String dato_user_form = request.getParameter("txtCorreoU");
        String dato_pass_form = request.getParameter("txtContra");
        UsuarioDAO usuario = new UsuarioImplementar();
        ArrayList<Usuario> users = new ArrayList();
        HttpSession var_Session= request.getSession(true);
        users = usuario.startSesion(dato_user_form, dato_pass_form);
        if(users.size()>0){
            
            String name_full = users.get(0).getNombre() + " " + users.get(0).getApellido();
            
            int tipo_user = users.get(0).getTipo();
            String name_user = users.get(0).getUsuario();
            String email_user = users.get(0).getCorreo();
            
            var_Session.setAttribute("sessionNombres", name_full);
            var_Session.setAttribute("sessionTipo", String.valueOf(tipo_user));
            var_Session.setAttribute("sessionUsuario", name_user);
            var_Session.setAttribute("sessionEmail", email_user);
            
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/VistaPrincipal.jsp");
            dispatcher.forward(request, response);
            //response.sendRedirect("principal.jsp");
        }else{
            //System.out.println("No se encontrarón resultados para la busqueda especificada.");
            response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
            //Apunto al servlet que le llame Login pero lo llamo por el parametro url-pattern.
            //Eso se puede verificar en: WEB-INF/web.xml.
            String url = "sesion";   
                        out.println("<script>valor=confirm(\"Error. Usuario o Clave Incorrecto. " +"\\nNombre de Usuario: "  + dato_user_form + " \\n\\nClic en aceptar para volver a intentarlo. \");valor;"
                        + "if (valor==true){"
                        + "location.href='"+ url + "';"
                        + "}else{"
                        + "location.href='"+ url + "';"
                        + "}"
                        + "</script>");
                }
            }
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
