package org.apache.jsp.usuarioFunc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cadastrarusuarioadm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>AGROMUT</title>\n");
      out.write("        <meta name=\"description\" content=\"AGROMUT\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"apple-touch-icon\" href=\"images/logoreduzida.png\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"https://i.imgur.com/QRAUqs9.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/cs-skin-elastic.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/style.css\">\n");
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
      out.write("    </head>>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "navbar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"breadcrumbs\">\n");
      out.write("            <div class=\"breadcrumbs-inner\">\n");
      out.write("                <div class=\"row m-0\">\n");
      out.write("                    <div class=\"col-sm-4\">\n");
      out.write("                        <div class=\"page-header float-left\">\n");
      out.write("                            <div class=\"page-title\">\n");
      out.write("                                <h1>Cadastrar</h1>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-sm-8\">\n");
      out.write("                        <div class=\"page-header float-right\">\n");
      out.write("                            <div class=\"page-title\">\n");
      out.write("                                <ol class=\"breadcrumb text-right\">\n");
      out.write("                                    <li><a href=\"#\">Funcionários</a></li>\n");
      out.write("                                    <li class=\"active\">Cadastrar</li>\n");
      out.write("                                </ol>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"animated fadeIn\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <div class=\"card\">\n");
      out.write("                            <div class=\"card-header\">\n");
      out.write("                                <strong>Cadastrar Funcionário</strong>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"card-body card-block\">\n");
      out.write("                                <form action=\"#\" method=\"post\" enctype=\"multipart/form-data\" class=\"form-horizontal\">\n");
      out.write("\n");
      out.write("                                    <h6 class=\"mb-3\">Dados Pessoais</h6>\n");
      out.write("                                    <div class=\"row form-group\">\n");
      out.write("                                        <div class=\"col-6\"><input type=\"text\" placeholder=\"Nome\" class=\"form-control\" name=\"nomeUsuario\"></div>\n");
      out.write("                                        <div class=\"col-3 input-group\">\n");
      out.write("                                            <div class=\"input-group-addon\"><i class=\"fa fa-calendar\"></i></div>\n");
      out.write("                                            <input type=\"date\" class=\"form-control\" name=\"datanascUsuario\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-3\"><input type=\"text\" placeholder=\"CPF\" class=\"form-control\" name=\"cpfUsuario\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                                    <h6 class=\"mb-3\">Endereço</h6>\n");
      out.write("                                    <div class=\"row form-group\">\n");
      out.write("                                        <div class=\"col-1\"><input type=\"text\" id=\"text-input\" name=\"ufUsuario\" placeholder=\"UF\" class=\"form-control\"></div>\n");
      out.write("                                        <div class=\"col-2\"><input type=\"text\" id=\"text-input\" name=\"cepUsuario\" placeholder=\"CEP\" class=\"form-control\"></div>\n");
      out.write("                                        <div class=\"col-3\"><input type=\"text\" id=\"text-input\" name=\"cidadeUsuario\" placeholder=\"Cidade\" class=\"form-control\"></div>\n");
      out.write("                                        <div class=\"col-2\"><input type=\"text\" id=\"text-input\" name=\"bairroUsuario\" placeholder=\"Bairro\" class=\"form-control\"></div>\n");
      out.write("                                        <div class=\"col-3\"><input type=\"text\" id=\"text-input\" name=\"ruaUsuario\" placeholder=\"Rua\" class=\"form-control\"></div>\n");
      out.write("                                        <div class=\"col-1\"><input type=\"text\" id=\"text-input\" name=\"numUsuario\" placeholder=\"Nº\" class=\"form-control\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                                    <h6 class=\"mb-3\">Contato</h6>\n");
      out.write("                                    <div class=\"row form-group\">\n");
      out.write("                                        <div class=\"col-8\"><input type=\"email\" id=\"email-input\" name=\"emailUsuario\" placeholder=\"E-mail\" class=\"form-control\"></div>\n");
      out.write("                                        <div class=\"col-4\"><input type=\"text\" id=\"email-input\" name=\"celularUsuario\" placeholder=\"Celular\" class=\"form-control\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <hr>\n");
      out.write("                                    <div class=\"row form-group\">\n");
      out.write("                                        <div class=\"col-8\"><input type=\"text\" id=\"text-input\" name=\"loginUsuario\" placeholder=\"Login\" class=\"form-control\"></div>\n");
      out.write("                                        <div class=\"col-4\"><input type=\"password\" id=\"password-input\" name=\"senhaUsuario\" placeholder=\"Senha\" class=\"form-control\"><small class=\"help-block form-text\">Mínimo de 8 dígitos</small></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-primary btn-sm\">Cadastrar</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div><!-- .animated -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/main.js\"></script>\n");
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
