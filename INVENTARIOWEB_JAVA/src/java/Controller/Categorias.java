/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import Model.Categoria;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Categorias extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
protected void listaCategorias(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        HttpSession sesion = request.getSession(true);
        sesion.setAttribute("lista", categoria.Listar());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/listarCategorias.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //this.listaCategorias(request, response);
         
         String estado = request.getParameter("opcion");
         String id_cat = request.getParameter("id");
         String nombre_cat = request.getParameter("nombre");
         String estado_cat = request.getParameter("estado");
         /*
         System.out.println("La opcion es: " + estado);
         System.out.println("El ID es: " + id_cat);
         System.out.println("El nombre es: " + nombre_cat);
         System.out.println("El estado es. " + estado_cat);
         */
    
         if(estado.equals("listar")){
             this.listaCategorias(request, response);
         }else if(estado.equals("editar")){
             System.out.println("Editando categorias....");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/EditCat.jsp?id="+id_cat+"&&nombre="+nombre_cat+"&&estado="+estado_cat);
             dispatcher.forward(request, response);
         }else if(estado.equals("eliminar")){
             System.out.println("Baja de categorias...");
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vistas-Categorias/eliminarCategoria.jsp?id="+id_cat+"&&nombre="+nombre_cat);
             dispatcher.forward(request, response);
         }else if(estado.equals("crear")){
             System.out.println("Crear categorias...");
             String pagina = "/Vistas-Categorias/crearCategoria.jsp";
             RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(pagina);
             dispatcher.forward(request, response);
         }else{
             
         }
         
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Categoria categoria = new Categoria();

        categoria.setId_categoria(Integer.parseInt(request.getParameter("id_categoria")));
        categoria.setNom_categoria(request.getParameter("txtNomCategoria"));
        categoria.setEstado_categoria(Integer.parseInt(request.getParameter("txtEstadoCategoria")));

        CategoriaDAO guardarCategoria = new CategoriaDAOImplementar();
        guardarCategoria.guardarCat(categoria);
        this.listaCategorias(request, response);
        
        
         
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
