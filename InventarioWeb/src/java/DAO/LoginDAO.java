/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Factory.ConexionDB;
import Factory.conexion;
import Model.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ITCA
 */
public class LoginDAO {
    int respt = 0;
    String sql = "";
    conexion cn = new conexion() ;
    ResultSet rs=null;
    public int validarLogin(Usuario usu) throws SQLException{
        
        sql = "SELECT COUNT(id)AS cantidad FROM `tb_usuario` WHERE correo='" + usu.getCorreo() + "' AND clave='" + usu.getClave()+"'";
        rs=cn.ejecutarConsultar(sql);
        while(rs.next()){
            respt=rs.getInt("cantidad");
        }
        return respt;
    }
}
