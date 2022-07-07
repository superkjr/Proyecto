package org.apache.jsp.Vista_002dProductos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditarPro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/Vista-Productos/../WEB-INF/Vistas-Parciales/css-js.jspf");
    _jspx_dependants.add("/Vista-Productos/../WEB-INF/Vistas-Parciales/encabezado.jspf");
    _jspx_dependants.add("/Vista-Productos/../WEB-INF/Vistas-Parciales/pie.jspf");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");


    String id_pro = request.getParameter("id");
    String nombre_pro = request.getParameter("nombre");
    String stock_pro = request.getParameter("stock");
    String precio_pro = request.getParameter("precio");
    String unidad_pro = request.getParameter("unidad");
    String estado_pro = request.getParameter("estado");
    /*out.print("El ID de la categoria es: " + id_cat);
    out.print("El nombre de la categoria es: " + nombre_cat);
    out.print("El estado de la categoria es: " + estado_cat);*/

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"//cdn.jsdelivr.net/npm/sweetalert2@11\"></script>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/estilo-base.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap-theme.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap-theme.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"bootstrap-3.3.7-dist/css/bootstrap.min.css\" type=\"text/css\" rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"bootstrap/js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"css/estilo-base.css\" rel=\"stylesheet\" type=\"text/css\"> \r\n");
      out.write("<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>");
      out.write("\n");
      out.write("        <link href=\"swetalert/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    body{\r\n");
      out.write("        font-size: 17px;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <!--<a class=\"navbar-brand\" href=\"#\">Navbar</a>-->\r\n");
      out.write("        <img src=\"./image/pngwing.com.png\" alt=\"\" width=\"50\" height=\"60\"><strong style=\"color: blue;\">&nbsp;Inventario 2022</strong> \r\n");
      out.write("\r\n");
      out.write("    <div  class=\"collapse navbar-collapse d-grid gap-5 d-md-flex justify-content-md-end\" id=\"navbarNav\">\r\n");
      out.write("            <ul class=\"navbar-nav\">\r\n");
      out.write("                \r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link active\" aria-current=\"page\" href=\"PrincipalL.jsp\">Inicio</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a  class=\"nav-link\" href=\"Categorias?opcion=listar\">Categorias</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"Producto.do?opcion=listar\">Productos</a>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item dropdown\">\r\n");
      out.write("                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                        Usuarios\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                        <li class=\"nav-item dropdown\"><a class=\"dropdown-item\" href=\"#\">Perfil</a></li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\"><a class=\"dropdown-item\" href=\"#\">Seguridad</a></li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\"><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("                        <li class=\"nav-item dropdown\"><a class=\"dropdown-item\" href=\"Salir.do\" id=\"closesesion\" name=\"closesesion\" onclick=\"salir();\">Cerrar</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li class=\"nav-item\">\r\n");
      out.write("                    <a class=\"nav-link\" href=\"#\">Reportes</a>\r\n");
      out.write("                </li>\r\n");
      out.write("               \r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"contenido\">");
      out.write("\n");
      out.write("        <div class=\"col-auto bg-gray p-5 text-center\">\n");
      out.write("            <h1 class='text-center'>Información de Producto</h1>\n");
      out.write("            <form action=\"ActualizarProducto.do\" method=\"post\">\n");
      out.write("                <div class=\"mb-3 row\">\n");
      out.write("                    <label for=\"staticEmail\" class=\"col-sm-2 col-form-label\">ID Producto:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" value='");
      out.print( id_pro);
      out.write("' name=\"id1\" id=\"id1\" readonly class=\"form-control-plaintext\" id=\"staticEmail\" placeholder=\"ID Categoria\">\n");
      out.write("                        <input type=\"hidden\" value='");
      out.print( id_pro);
      out.write("' name=\"id\" id=\"id\" readonly class=\"form-control-plaintext\" id=\"staticEmail\" >\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mb-3 row\">\n");
      out.write("                    <label for=\"\" class=\"col-sm-2 col-form-label\">Nombre Producto:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" value='");
      out.print( nombre_pro);
      out.write("' name=\"nombre\" id=\"nombre\" class=\"form-control\" placeholder=\"Nombre Producto\" required=\"true\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"mb-3 row\">\n");
      out.write("                    <label for=\"\" class=\"col-sm-2 col-form-label\">Stock Produto:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" value='");
      out.print( stock_pro);
      out.write("' name=\"stock\" id=\"stock\" class=\"form-control\" placeholder=\"Stock de producto\" required=\"true\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3 row\">\n");
      out.write("                    <label for=\"\" class=\"col-sm-2 col-form-label\">Precio Producto:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" value='");
      out.print( precio_pro);
      out.write("' name=\"precio\" id=\"precio\" class=\"form-control\" placeholder=\"Precio de producto\" required=\"true\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"mb-3 row\">\n");
      out.write("                    <label for=\"\" class=\"col-sm-2 col-form-label\">Unidad de medida:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" value='");
      out.print( unidad_pro);
      out.write("' name=\"Unidad\" id=\"Unidad\" class=\"form-control\" placeholder=\"Unidad\" required=\"true\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                     <div class=\"mb-3 row\">\n");
      out.write("                    <label for=\"\" class=\"col-sm-2 col-form-label\">Estado de producto:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" value='");
      out.print( estado_pro);
      out.write("' name=\"estado\" id=\"estado\" class=\"form-control\" placeholder=\"Estado\" required=\"true\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3 row\">\n");
      out.write("                    <button onclick=\"EventoAlert()\" type=\"submit\" name=\"send\" class=\"btn btn-success\">Actualizar Producto</button>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("    footer{\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        bottom: 0;\r\n");
      out.write("        position:fixed;\r\n");
      out.write("    }\r\n");
      out.write("</style>\r\n");
      out.write("<footer class=\"text-center p-3\" style=\"background-color: black;\">\r\n");
      out.write("    <p></p>\r\n");
      out.write("    <p class=\"text-white\">© 2022 Copyright: Armando Minero, Kevin Ricardo, Melvin Antonio</p>\r\n");
      out.write("</footer>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
