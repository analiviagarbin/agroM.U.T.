package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"shortcut icon\" href=\"images/logoreduzida.png\">\n");
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div id=\"right-panel\" class=\"right-panel\">\n");
      out.write("            <!-- Header-->\n");
      out.write("            <header id=\"header\" class=\"header\">\n");
      out.write("                <div class=\"top-left\">\n");
      out.write("                    <div class=\"navbar-header\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"./\"><img src=\"images/agromut.png\" alt=\"Logo\"\n");
      out.write("                                                               style=\"width: 120px;\"></a>\n");
      out.write("                        <a class=\"navbar-brand hidden\" href=\"./\"><img src=\"images/agromut.png\" alt=\"Logo\"></a>\n");
      out.write("                        <a id=\"menuToggle\" class=\"menutoggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"top-right\">\n");
      out.write("                    <div class=\"header-menu\">\n");
      out.write("\n");
      out.write("                        <div class=\"user-area dropdown float-right\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle active\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                               aria-expanded=\"false\">\n");
      out.write("                                <img class=\"user-avatar rounded-circle\" src=\"images/admin.jpg\" alt=\"User Avatar\">\n");
      out.write("                            </a>\n");
      out.write("\n");
      out.write("                            <div class=\"user-menu dropdown-menu\">\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fa fa- user\"></i>Perfil</a>\n");
      out.write("\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fa fa -cog\"></i>Configurações</a>\n");
      out.write("\n");
      out.write("                                <a class=\"nav-link\" href=\"#\"><i class=\"fa fa-power -off\"></i>Sair</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("        \n");
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
