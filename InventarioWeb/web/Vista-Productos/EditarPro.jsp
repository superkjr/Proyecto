<%-- 
    Document   : EditCat
    Created on : Jun 21, 2022, 10:20:49 AM
    Author     : Armando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

    String estado = request.getParameter("opcion");
    String id_pro = request.getParameter("id");
    String nombre_pro = request.getParameter("nombre");
    String stock_pro = request.getParameter("stock");
    String precio_pro = request.getParameter("precio");
    String unidadM = request.getParameter("unidad");
    String estado_pro = request.getParameter("estado");
    /*out.print("El ID de la categoria es: " + id_cat);
    out.print("El nombre de la categoria es: " + nombre_cat);
    out.print("El estado de la categoria es: " + estado_cat);*/
%>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="//cdn.jsdelivr.net/npm/sweetalert2@11"></script>
        <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <link href="swetalert/sweetalert.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file = "../WEB-INF/Vistas-Parciales/encabezado.jspf" %>
        <div class="col-auto bg-gray p-5 text-center">
            <h1 class='text-center'>Información de Producto</h1>
            <form action="ActualizarProducto.do" method="post">
                <div class="mb-3 row">
                    <label for="staticEmail" class="col-sm-2 col-form-label">ID Categoria:</label>
                    <div class="col-sm-10">
                        <input type="text" value='<%= id_pro%>' name="id1" id="id1" readonly class="form-control-plaintext" id="staticEmail" placeholder="ID Categoria">
                        <input type="hidden" value='<%= id_pro%>' name="id" id="id" readonly class="form-control-plaintext" id="staticEmail" >
                    </div>
                </div>

                <div class="mb-3 row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">Nombre Producto:</label>
                    <div class="col-sm-10">
                        <input type="text" value='<%= nombre_pro%>' name="nombre" id="nombre" class="form-control" placeholder="Nombre Producto" required="true">
                    </div>
                </div>
                    <div class="mb-3 row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">Stock Produto:</label>
                    <div class="col-sm-10">
                        <input type="number" value='<%= stock_pro%>' name="stock" id="stock" class="form-control" placeholder="Stock de producto" required="true">
                    </div>
                </div>
                <div class="mb-3 row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">Precio Producto:</label>
                    <div class="col-sm-10">
                        <input type="number" value='<%= precio_pro%>' name="precio" id="precio" class="form-control" placeholder="Precio de producto" required="true">
                    </div>
                </div>
                    <div class="mb-3 row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">Unidad de medida:</label>
                    <div class="col-sm-10">
                        <input type="text" value='<%= unidadM%>' name="Unidad" id="Unidad" class="form-control" placeholder="Unidad" required="true">
                    </div>
                </div>
                     <div class="mb-3 row">
                    <label for="inputPassword" class="col-sm-2 col-form-label">Estado de producto:</label>
                    <div class="col-sm-10">
                        <input type="text" value='<%= estado_pro%>' name="estado" id="estado" class="form-control" placeholder="Estado" required="true">
                    </div>
                </div>
                </div>
                <div class="mb-3 row">
                    <button onclick="EventoAlert()" type="submit" name="send" class="btn btn-success">Actualizar Categoria</button>
                </div>
            </form>

            <script>
                function EventoAlert() {
                    Swal.fire({
                        position: 'top-end',
                        icon: 'success',
                        title: 'Your work has been saved',
                        showConfirmButton: false,
                        timer: 1500
                    })
                }
            </script>

        </div>
        <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
    </body>
</html>

