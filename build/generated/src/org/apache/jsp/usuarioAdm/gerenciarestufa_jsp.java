package org.apache.jsp.usuarioAdm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class gerenciarestufa_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>AGROMUT</title>\n");
      out.write("        <meta name=\"description\" content=\"AGROMUT\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/assets/images/logoreduzida.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/assets/css/cs-skin-elastic.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/assets/css/style.css\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/chartist@0.11.0/dist/chartist.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/jqvmap@1.5.1/dist/jqvmap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/weathericons@2.1.0/css/weather-icons.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            #weatherWidget .currentDesc {\n");
      out.write("                color: #ffffff !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .traffic-chart {\n");
      out.write("                min-height: 335px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #flotPie1 {\n");
      out.write("                height: 150px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #flotPie1 td {\n");
      out.write("                padding: 3px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #flotPie1 table {\n");
      out.write("                top: 20px !important;\n");
      out.write("                right: -10px !important;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .chart-container {\n");
      out.write("                display: table;\n");
      out.write("                min-width: 270px;\n");
      out.write("                text-align: left;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                padding-bottom: 10px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #flotLine5 {\n");
      out.write("                height: 105px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #flotBarChart {\n");
      out.write("                height: 150px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #cellPaiChart {\n");
      out.write("                height: 160px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Content -->\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <!-- Orders -->\n");
      out.write("            <div class=\"orders\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <h4 class=\"box-title\">Estufas </h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body--\">\n");
      out.write("                                <div class=\"table-stats order-table ov-h\">\n");
      out.write("                                    <table class=\"table \">\n");
      out.write("                                        <thead>\n");
      out.write("                                            <tr>\n");
      out.write("                                                <th class=\"serial\">#</th>\n");
      out.write("                                                <th>Capacidade </th>\n");
      out.write("                                                <th>Produto </th>\n");
      out.write("                                                <th>Temperatura Atual </th>\n");
      out.write("                                                <th>Umidade Atual </th>\n");
      out.write("                                                <th>Status </th>\n");
      out.write("                                                <th>Alterar </th>\n");
      out.write("                                            </tr>\n");
      out.write("                                        </thead>\n");
      out.write("                                        <tbody>                                                \n");
      out.write("                                            ");
 /*
                                            List<Estufa> estufas = (List<Estufa>) request.getAttribute("estufas");
                                            for (Estufa estufa : estufas) { */
                                            
      out.write("   \n");
      out.write("\n");
      out.write("                                            <tr>\n");
      out.write("                                                <td class=\"serial\">");
/*=estufa.getIdEstufa()*/
      out.write("</td>\n");
      out.write("                                                <td align=\"center\">");
/*=estufa.getCapacidadeEstufa()*/
      out.write("</td>\n");
      out.write("                                                <td align=\"center\">");
/*=estufa.getTemperaturaEstufa()*/
      out.write("</td>\n");
      out.write("                                                <td align=\"center\">");
/*=estufa.getUmidadeEstufa()*/
      out.write("</td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <button class=\"button badge badge-complete\" data-bs-toggle=\"modal\" data-bs-target=\"#monitorar\" type=\"button\">Monitorar</button>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td>\n");
      out.write("                                                    <a href=\"AlterarStatus?idestufa=");
/*=estufa.getIdEstufa()*/
      out.write("\" class=\"button badge badge-danger\">Inativar</a>\n");
      out.write("                                                </td>\n");
      out.write("                                                <td align=\"center\">\n");
      out.write("                                                    <a href=\"CarregarEstufa?idEstufa=");
/*=estufa.getIdEstufa()*/
      out.write("\" class=\"button badge badge-primary\">Alterar</a>\n");
      out.write("                                                </td>\n");
      out.write("                                            </tr>\n");
      out.write("\n");
      out.write("                                            ");
 /*
                                                }*/
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                            <!-- Modal Func -->\n");
      out.write("                                        <div class=\"modal fade\" id=\"monitorar\">\n");
      out.write("                                            <div class=\"modal-dialog modal-dialog-centered modal-xl\">\n");
      out.write("                                                <div class=\"modal-content\">\n");
      out.write("                                                    <div class=\"modal-body\">\n");
      out.write("                                                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\n");
      out.write("                                                        <div class=\"row flex-lg-row-reverse align-items-center g-5 py-5\">\n");
      out.write("                                                            <div class=\"col-lg-6 me-md-3\">\n");
      out.write("                                                                <h1 class=\"display-6 fw-bold lh-1 mb-3 texto\">\n");
      out.write("                                                                    Entrar\n");
      out.write("                                                                </h1>\n");
      out.write("                                                                <hr class=\"verde\">\n");
      out.write("                                                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messag}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                                                <p class=\"lead\">\n");
      out.write("                                                                <form method=\"POST\" action=\"LoginUsuarioFunc\" autocomplete=\"off\">\n");
      out.write("                                                                    <div class=\"mb-3\">\n");
      out.write("                                                                        <label class=\"mb-2 text-muted\" for=\"text\">Login:</label>\n");
      out.write("                                                                        <input id=\"text\" type=\"text\" class=\"form-control\" name=\"loginUsuario\" value=\"\" required\n");
      out.write("                                                                               autofocus MAXLENGTH=20>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                    <div class=\"mb-3\">\n");
      out.write("                                                                        <div class=\"mb-2 w-100\">\n");
      out.write("                                                                            <label class=\"text-muted\" for=\"senha\">Senha:</label>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                        <input id=\"senha\" type=\"password\" class=\"form-control\" name=\"senhaUsuario\" required MINLENGTH=8 MAXLENGTH=20>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                    <div class=\"d-flex align-items-center\">\n");
      out.write("                                                                        <button type=\"submit\" class=\"btn btn-dark ms-auto verde-fundo\">\n");
      out.write("                                                                            Entrar\n");
      out.write("                                                                        </button>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </form>\n");
      out.write("                                                                <br />\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"col-lg-5 me-md-3\">\n");
      out.write("                                                                <img src=\"assets/images/agromut.png\" width=\"150\">\n");
      out.write("                                                                <br />\n");
      out.write("                                                                <br />\n");
      out.write("                                                                <br />\n");
      out.write("                                                                <h1 class=\"display-5 fw-bold lh-1 mb-3 texto\">\n");
      out.write("                                                                    Olá! O que \n");
      out.write("                                                                    <br />\n");
      out.write("                                                                    faremos hoje?\n");
      out.write("                                                                </h1>\n");
      out.write("                                                                <br />\n");
      out.write("                                                                <br />\n");
      out.write("                                                                <br />\n");
      out.write("                                                                <br />\n");
      out.write("                                                                <br />\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        </tbody>\n");
      out.write("                                    </table>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Scripts -->\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js\"></script>\n");
      out.write("            <script src=\"usuarioAdm/assets/js/main.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js\"></script>\n");
      out.write("    </body>\n");
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
