package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class RegistrarUsuario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>  \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, shrink-to-fit=no\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n");
      out.write("        <!-- jQuery library -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("        <!-- Popper JS -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("        <!-- Latest compiled JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <link href=\"./css/estilo.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("         <link href=\"swetalert/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"RegistroUsuario.do\" method=\"POST\">\n");
      out.write("\n");
      out.write("            <section class=\"vh-100\" background=\"\">\n");
      out.write("                <div class=\"container py-5 h-100\" >\n");
      out.write("\n");
      out.write("                    <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                        <div class=\"col-12 col-md-8 col-lg-6 col-xl-5\">\n");
      out.write("\n");
      out.write("                            <div id=\"registro\" class=\"card shadow-2-strong\" style=\"border-radius: 1rem; background: rgba(0,0,0,0.3);\">\n");
      out.write("                                <div class=\"card-body p-5 text-center\">\n");
      out.write("                                    <h3 class=\"register-heading\">\n");
      out.write("                                        <img class=\"imgusuario\" src=\"./image/registro.png\"><br>\n");
      out.write("                                        Ingrese sus datos\n");
      out.write("                                        <hr class=\"hrh\">\n");
      out.write("                                    </h3>\n");
      out.write("                                    <div class=\"row register-form\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input name=\"txtNombreU\" type=\"text\" class=\"form-control\" placeholder=\"Ingrese sus Nombre\" value=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input name=\"txtApellidoU\" type=\"text\" class=\"form-control\" placeholder=\"Ingrese su Apellido *\" value=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input name=\"txtCorreoU\" type=\"text\" class=\"form-control\" placeholder=\"Correo\" value=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" name=\"txtUsuario\" class=\"form-control\"  placeholder=\"Usuario\" value=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"password\" name=\"txtContra\" class=\"form-control\"  placeholder=\"Password *\" value=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" name=\"txtTipoU\" class=\"form-control\"  placeholder=\"Tipo\" value=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input name=\"txtEstadoU\" type=\"text\" class=\"form-control\"  placeholder=\"Estado\" value=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" name=\"txtPreguntaU\" class=\"form-control\"  placeholder=\"Pregunta\" value=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input name=\"txtRespuestaU\" type=\"text\" class=\"form-control\"  placeholder=\"Respuesta\" value=\"\" />\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <button style=\"text-align: center;\" type=\"submit\" class=\"btn btn-primary\"> Registrar </button>\n");
      out.write("                                    <a style=\"text-decoration: none;\" href=\"InicioSesion.jsp\"> Ya tengo una cuenta</a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <script>\n");
      out.write("                function EventoAlert() {\n");
      out.write("                    Swal.fire({\n");
      out.write("                        position: 'top-end',\n");
      out.write("                        icon: 'success',\n");
      out.write("                        title: 'Ha sido registrado con exito',\n");
      out.write("                        showConfirmButton: false,\n");
      out.write("                        timer: 1500\n");
      out.write("                    })\n");
      out.write("                }\n");
      out.write("            </script>\n");
      out.write("    </center>\n");
      out.write("</body>\n");
      out.write("</html>");
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
