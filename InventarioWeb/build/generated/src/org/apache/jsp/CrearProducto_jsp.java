package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CrearProducto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("\n");
      Model.Producto Producto = null;
      synchronized (session) {
        Producto = (Model.Producto) _jspx_page_context.getAttribute("Producto", PageContext.SESSION_SCOPE);
        if (Producto == null){
          Producto = new Model.Producto();
          _jspx_page_context.setAttribute("Producto", Producto, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\n");
      out.write("        <link href=\"./css/estilo.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <h1>Registro Producto</h1>\n");
      out.write("        \n");
      out.write("            <form class=\"form-horizontal\" id=\"frmCategoria\" name=\"frmCategoria\" method=\"post\" action=\"Producto.do\">\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"Nombre\" class=\"form-label\">Nombre del producto</label>\n");
      out.write("                    <input  type=\"text\" name=\"txtNom_producto\" value=\"\"  class=\"form-contro\" id=\"txtNom_producto\">\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"Stock\" class=\"form-label\">Stock</label>\n");
      out.write("                    <input value=\"\" type=\"text\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"txtStock\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"Stock\" class=\"form-label\">Precio</label>\n");
      out.write("                    <input type=\"text\" value=\"\" class=\"form-control\" id=\"txtPrecio\" name=\"txtPrecio\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mb-3\">\n");
      out.write("                    <label for=\"UnidadMedida\" class=\"form-label\">Unidad de Medida</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"\" id=\"txtUnidadMedida\" name=\"txtUnidadMedida\">\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"mb-3\">\n");
      out.write("                    <label for=\"UnidadMedida\" class=\"form-label\">Estado</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"\" id=\"txtEstado\" name=\"txtEstado\">\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"mb-3\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Categoria</label>\n");
      out.write("                    <input type=\"text\"  class=\"form-control\" value=\"\" id=\"categoria\" name=\"txtCategoria\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Guardar</button>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
