<%-- 
    Document   : CrearProducto
    Created on : Jun 29, 2022, 5:44:59 PM
    Author     : Armando
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Producto" scope="session" class="Model.Producto" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link href="./css/estilo.css" rel="stylesheet" type="text/css">
        
    </head>
    
    <body>

        
        <h1>Registro Producto</h1>
        
            <form class="form-horizontal" id="frmCategoria" name="frmCategoria" method="post" action="Producto.do">
                <div class="mb-3">
                    <label for="Nombre" class="form-label">Nombre del producto</label>
                    <input  type="text" name="txtNom_producto" value=""  class="form-contro" id="txtNom_producto">
                    
                </div>
                <div class="mb-3">
                    <label for="Stock" class="form-label">Stock</label>
                    <input value="" type="text" class="form-control" id="exampleInputPassword1" name="txtStock">
                </div>
                <div class="mb-3">
                    <label for="Stock" class="form-label">Precio</label>
                    <input type="text" value="" class="form-control" id="txtPrecio" name="txtPrecio">
                </div>
                <div class="mb-3">
                    <label for="UnidadMedida" class="form-label">Unidad de Medida</label>
                    <input type="text" class="form-control" value="" id="txtUnidadMedida" name="txtUnidadMedida">
                </div>
                 <div class="mb-3">
                    <label for="UnidadMedida" class="form-label">Estado</label>
                    <input type="text" class="form-control" value="" id="txtEstado" name="txtEstado">
                </div>
                 <div class="mb-3">
                    <label for="" class="form-label">Categoria</label>
                    <input type="text"  class="form-control" value="" id="categoria" name="txtCategoria">
                </div>

                <button type="submit" class="btn btn-primary">Guardar</button>
            </form>

          
        </div>

    </body>
</html>
