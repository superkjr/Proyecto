/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import DAO.UsuarioDAO;
import DAO.UsuarioImplementar;
import Model.Categoria;
import Model.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ITCA
 */
public class RegistroUsuario extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
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
        
        
        
        
        //String Id =  request.getParameter("id");
        String Nombre = request.getParameter("txtNombreU");
        String apellido = request.getParameter("txtApellidoU");
        String correo = request.getParameter("txtCorreoU");
        String tipo = request.getParameter("txtTipoU");
        String usuari = request.getParameter("txtUsuario");
        String clave = request.getParameter("txtContra");
        String pregu = request.getParameter("txtPreguntaU");
        String Resp = request.getParameter("txtRespuestaU");
        String estad = request.getParameter("txtEstadoU");
        
        
        
        
         //System.out.println(Id);
         System.out.println("A"+Nombre);
         System.out.println("B"+apellido);
         System.out.println("C" +correo);
         System.out.println("l"+ estad);
         System.out.println("D" +usuari);
         System.out.println("F"+clave);
         System.out.println("G" +pregu);
         System.out.println("H" +Resp);
         System.out.println("I"+tipo);
         
         
         
         Usuario usuario = new Usuario();
     
        
        usuario.setNombre(request.getParameter("txtNombreU"));
        
        usuario.setApellido(request.getParameter("txtApellidoU"));
        
        usuario.setCorreo(request.getParameter("txtCorreoU"));
        
        usuario.setUsuario(request.getParameter("txtUsuario"));
        
        usuario.setClave(request.getParameter("txtContra"));
        
        usuario.setTipo(Integer.parseInt(request.getParameter("txtTipoU")));
        
        usuario.setEstado(Integer.parseInt(request.getParameter("txtEstadoU")));
        
        usuario.setPregunta(request.getParameter("txtPreguntaU"));
        
        usuario.setRespuesta(request.getParameter("txtRespuestaU"));
        
        
         
         
      
        UsuarioDAO guardarUsu = new  UsuarioImplementar();
        guardarUsu.guardarUsu(usuario);
        
        if(guardarUsu.guardarUsu(usuario)==true){
            request.getRequestDispatcher("InicioSesion.jsp").forward(request, response);
        }else{
          request.getRequestDispatcher("RegistroUsuario.jsp").forward(request, response);   
        }
       
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
