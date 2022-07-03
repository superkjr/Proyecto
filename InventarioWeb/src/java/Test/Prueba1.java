/*package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import DAO.ProductoDAOImplementar;
import DAO.ProductosDAO;
import DAO.UsuarioDAO;
import DAO.UsuarioImplementar;
import Model.Categoria;
import Model.Producto;
import Model.Usuario;
import java.util.List;

public class Prueba1 {
    public static void main(String[] args) {
        Prueba1 evaluar = new Prueba1();
        evaluar.guardaCategoria();
        //evaluar.listarCategoria();
        //evaluar.eliminarCategoria();
       //evaluar.listarCategoria();
        //evaluar.editarCategoria();
    }
   
    public void listarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        List<Categoria> listar = categoria.Listar();
        System.out.println("LISTADO DE CATEGORIA");
        for(Categoria categoriaListar : listar){
            System.out.println("ID: " + categoriaListar.getId_categoria() +
                    "NOMBRE: " + categoriaListar.getNom_categoria() +
                    "ESTADO: " + categoriaListar.getEstado_categoria());
        }
    }
    
     public void editarCategoria(){
        ProductosDAO categoria = new ProductoDAOImplementar();
        Categoria cat_edit = categoria.editar(1);
        System.out.println("CATEGORIA A MODIFICAR");
        System.out.println("ID: " + cat_edit.getId_categoria() +
                    "NOMBRE: " + cat_edit.getNom_categoria() +
                    "ESTADO: " + cat_edit.getEstado_categoria());
    }
     
     public void guardaCategoria(){
         ProductosDAO categoria = new ProductoDAOImplementar();
         Producto guarda_usu= new Producto();
         guarda_usu.setNom_producto("has");
         guarda_usu.setStock(2);
         guarda_usu.setUnidadMedida("pop");
         guarda_usu.setEstado(1);
         guarda_usu.setCategoria("sdvd");
         
         System.out.println( categoria.guardarPro(guarda_usu));
        
     }
     
     public void eliminarCategoria(){
         CategoriaDAO categoria = new CategoriaDAOImplementar();
        categoria.borrarCat(20);
     }
}
*/