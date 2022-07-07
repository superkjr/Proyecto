<%-- 
    Document   : listarProductos
    Created on : Jun 23, 2022, 9:52:49 PM
    Author     : Armando
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import = "Model.Producto" %>
<!DOCTYPE html>
<jsp:useBean id = "lista" scope="session" class="java.util.List" />
<html>
    <head>
        <link href="./css/estilo.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>

    </head>
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>



        <style>
            .table-center{
                margin: auto;
                color: white;


            }
            h3{
                text-align: center;
                padding: 20px;
                padding-top: 100px;
                color: white;
                font-family: cursive;
            }
            body{
                background-image: url(./image/fondo7.png);
            }
            table tr{

                text-align: center;

            }
            table{
                border-spacing: 0; 
                width: 500px;
            }
            tr{
                font-family: cursive;
                font-size: 20px;
                color: white;
            }
            footer{
                width: 100%;
                bottom: 0;
                position:fixed;
            }

        </style>
        <div class="banner">
            <div>

            </div>
        </div>
        <h3>Listado de Productos Registrados</h3>
        <div class="table-center" style="width: 80%; size: 20px;">
            <a href="<%= request.getContextPath()%>/Producto.do?opcion=crear" class="btn btn-success btn-sm glyphicon glyphicom-pencil" role="button"> Nuevo Producto</a>
            <a class="btn btn-success btn-sm glyphicon glyphicom-pencil" href="./ReportePDF/ReporteProducto.jsp">Generar reporte Producto</a>

            <table class="table  table-striped">
                <tr>
                    <th>Id</th>
                    <th>Nombre producto</th>
                    <th>Stock</th>
                    <th>Precio</th>
                    <th>Unidad de medida</th>
                    <th>Estado producto</th>
                    <th>Categoria</th>
                    <th>Operaciones</th>
                </tr>
                <%
                    for (int i = 0; i < lista.size(); i++) {
                        Producto pro = new Producto();
                        pro = (Producto) lista.get(i);
                %>
                <tr>
                    <td><%= pro.getId_producto()%></td>
                    <td><%= pro.getNom_producto()%></td>
                    <td><%= pro.getStock()%></td>
                    <td><%= pro.getPrecio()%></td>
                    <td><%= pro.getUnidadMedida()%></td>
                    <td><%= pro.getEstado()%></td>
                    <td><%= pro.getCategoria_id()%></td>
                    <td>
                        <a href="Producto.do?opcion=editar&&id=<%= pro.getId_producto()%>&&nombre=<%= pro.getNom_producto()%>&&stock=<%= pro.getStock()%>&&precio=<%= pro.getPrecio()%>&&unidad=<%= pro.getUnidadMedida()%> &&estado=<%= pro.getEstado()%>" class="btn btn-info btn-sm glyphicon glyphicon-edit" role="button">Editar</a>
                        <a  href="Producto.do?opcion=eliminar&&id=<%= pro.getId_producto()%>&&nombre=<%= pro.getNom_producto()%>" class="btn btn-danger btn-sm glyphicon glyphicon-remove"  role="button">Eliminar</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
        <a href="../WEB-INF/Vistas-Parciales/pie.jspf"></a>

    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>
