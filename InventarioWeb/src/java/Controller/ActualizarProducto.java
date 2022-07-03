/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.ProductoDAOImplementar;
import DAO.ProductosDAO;
import Model.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zc102
 */
public class ActualizarProducto extends HttpServlet {

    
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

        String id_pro = request.getParameter("id");
        String nombre_pro = request.getParameter("nombre");
        String stock_pro = request.getParameter("stock");
        String precio_pro = request.getParameter("precio");
        String unidad_pro = request.getParameter("unidad");
        String estado_pro = request.getParameter("estado");

        ProductosDAO producto = new ProductoDAOImplementar();
        Producto pro = new Producto();
        pro.setId_producto(Integer.parseInt(id_pro));
        pro.setNom_producto(nombre_pro);
        pro.setStock(Double.valueOf(stock_pro));
        pro.setPrecio(Double.valueOf(precio_pro));
        pro.setUnidadMedida(unidad_pro);
        pro.setEstado(Integer.parseInt(estado_pro));
        if (producto.guardarPro(pro)) {
            System.out.println("Registro Actualizado.");
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Vista-Productos/EditarPro.jsp?aviso=ok");
            dispatcher.forward(request, response);
        } else {
            System.out.println("Error. El registro no se pudo actualizar.");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
