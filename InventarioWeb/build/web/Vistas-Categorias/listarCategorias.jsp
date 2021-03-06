<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import = "Model.Categoria" %>

<jsp:useBean id = "lista" scope="session" class="java.util.List" />
<html>
    <head>
        
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Control de inventario</title>
        <link href="./css/estilo.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
    </head>
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <style>
            body{
                background-image: url(./image/fondo7.png);
            }
            tr{
                color: white;
               font-size: 20px;
               font-family: cursive;
            }
            h3{
                font-family: cursive;
                text-align: center;
            }
            
            .table-center{
                padding-top: 90px;
            }
        </style>
      
        <div class="table-center" style="width: 800px; margin: auto; color: white;">
            <a href="<%= request.getContextPath()%>/Categorias?opcion=crear" class="btn btn-success btn-sm glyphicon glyphicom-pencil" role="button"> Nueva Categoria</a>
            <a class="btn btn-success btn-sm glyphicon glyphicom-pencil" href="./ReportePDF/ReporteCat.jsp">Reporte Categoria</a>
            <h3>Listado de Categorias Registradas</h3>
            <table  class="table table-striped">
                <tr>
                    <th>ID</th><th>NOMBRE</th><th>ESTADO</th><th>ACCION</th>
                </tr>
                <%
                    for(int i =0 ; i < lista.size(); i++){
                        Categoria categoria = new Categoria();
                        categoria = (Categoria)lista.get(i);
                %>
                <tr>
                    <td><%= categoria.getId_categoria()%></td>
                    <td><%= categoria.getNom_categoria()%></td>
                    <td><%= categoria.getEstado_categoria()%></td>
                    <td>
                        <a href="Categorias?opcion=editar&&id=<%= categoria.getId_categoria() %>&&nombre=<%= categoria.getNom_categoria() %>&&estado=<%= categoria.getEstado_categoria() %>" class="btn btn-info btn-sm glyphicon glyphicon-edit" role="button">Editar</a>
                        <a  href="Categorias?opcion=eliminar&&id=<%= categoria.getId_categoria()%>&&nombre=<%= categoria.getNom_categoria()%>" class="btn btn-danger btn-sm glyphicon glyphicon-remove"  role="button">Eliminar</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
                <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>