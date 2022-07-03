<%-- 
    Document   : crearProducto
    Created on : 06-23-2022, 08:46:24 AM
    Author     : zc102
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Producto" scope="session" class="Model.Producto" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <%@include file = "../WEB-INF/Vistas-Parciales/css-js.jspf" %>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    
    <link href="./css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <body>

        
        
        
       
        <form style=""  method="post" action="<%= request.getContextPath()%>/Producto.do">
            <h1>Registro Producto</h1>
                <div class="mb-3">
                    <label for="Nombre" class="form-label">Nombre del producto</label>
                    <input  type="text" name="txtNom_producto" value="<%= Producto.getNom_producto()%>"  class="form-contro" id="txtNom_producto">
                    
                </div>
                <div class="mb-3">
                    <label for="Stock" class="form-label">Stock</label>
                    <input value="<%= Producto.getStock()%>" type="text" class="form-contro" id="exampleInputPassword1" name="txtStock">
                </div>
                <div class="mb-3">
                    <label for="Stock" class="form-label">Precio</label>
                    <input type="text" value="<%= Producto.getPrecio()%>" class="form-contro" id="txtPrecio" name="txtPrecio">
                </div>
                <div class="mb-3">
                    <label for="UnidadMedida" class="form-label">Unidad de Medida</label>
                    <input type="text" class="form-contro" value="<%= Producto.getUnidadMedida()%>" id="txtUnidadMedida" name="txtUnidadMedida">
                </div>
                 <div class="mb-3">
                    <label for="UnidadMedida" class="form-label">Estado</label>
                    <input type="text" class="form-contro" value="<%= Producto.getEstado()%>" id="txtEstado" name="txtEstado">
                </div>
                 

                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>
                <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

            <%@include file = "../WEB-INF/Vistas-Parciales/pie.jspf" %>
        </div>

    </body>
</html>
