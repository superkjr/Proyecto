<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
   try{
        HttpSession var_Session = request.getSession(false);
        String nombres = (String) var_Session.getAttribute("sessionNombres");
        String user = (String) var_Session.getAttribute("sessionUsuario");
        String tipo = (String) var_Session.getAttribute("sessionTipo");
        String correo = (String) var_Session.getAttribute("sessionEmail");
 
        if(user == null){
            out.print("<center><h2><font color='blue'>Debe de haber iniciado Sesion para poder ingresar a esta pagina.</font><br><hr><font color='blue'>Intentelo de Nuevo</font><hr><h2></center><br>");
            out.print("<center><h2><font color='blue'> Por Favor Epere...</font><hr><h2></center>");
            //out.print("<meta http-equiv='refresh' content='4; url=http:sesion'/ >");
            //out.print("<meta http-equiv='refresh' content='4; url=http:./'/ >");
            response.sendRedirect("./InicioSesion.jsp");
        }else if(user!=null){
%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@include file = "WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    </head>
    <body>
        
        <%@include file = "WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        
        <style>
            body{
                background-image: url(./image/fondo7.png);
            }
            .p1{
                color: white;
                font-size: 80px;
                padding-top: 140px;
            }
            .p2{
                color: white;
                font-size: 50px;
            }
        </style>
        <p class="p1" style="text-align: center; width: 100%;">BIENVENID@:</p>
        <p class="p2" style="text-align: center; width: 100%;"><%= nombres %></p>
        <%@include file = "WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>
<%
            }
               //Aca puede ir un mensaje para informar que no se ha iniciado sesión.
            }catch(Exception e){
            }
%>