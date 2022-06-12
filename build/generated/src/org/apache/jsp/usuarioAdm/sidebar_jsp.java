package org.apache.jsp.usuarioAdm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>AGROMUT</title>\n");
      out.write("    <meta name=\"description\" content=\"AGROMUT\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/assets/images/logoreduzida.png\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/normalize.css@8.0.0/normalize.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/font-awesome@4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/1544a7a0d3.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/gh/lykmapipo/themify-icons@0.1.2/css/themify-icons.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/pixeden-stroke-7-icon@1.2.3/pe-icon-7-stroke/dist/pe-icon-7-stroke.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/flag-icon-css/3.2.0/css/flag-icon.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/css/cs-skin-elastic.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/assets/css/style.css\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/chartist@0.11.0/dist/chartist.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/jqvmap@1.5.1/dist/jqvmap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/weathericons@2.1.0/css/weather-icons.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/fullcalendar@3.9.0/dist/fullcalendar.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    .verde {\n");
      out.write("        color: rgb(23, 143, 43);\n");
      out.write("    }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <!-- Left Panel -->\n");
      out.write("    <aside id=\"left-panel\" class=\"left-panel\">\n");
      out.write("        <nav class=\"navbar navbar-expand-sm navbar-default\">\n");
      out.write("            <div id=\"main-menu\" class=\"main-menu collapse navbar-collapse\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\">\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/index.jsp\"><i class=\"menu-icon\"></i>Painel Usuário</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                           aria-expanded=\"false\"><i class=\"menu-icon fa fa-people-group\"></i><b>FUNCIONÁRIOS</b></a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"menu-icon fa fa-plus-square-o\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/cadastrarfuncionario.jsp\"> Cadastrar </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"menu-icon fa fa-list-check\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/gerenciarusuariofunc.jsp\"> Gerenciar </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                           aria-expanded=\"false\"><i class=\"menu-icon fa fa-warehouse\"></i><b>ESTUFAS</b></a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"menu-icon fa fa-plus-square-o\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/cadastrarestufa.jsp\"> Cadastrar </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"menu-icon fa fa-edit\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/gerenciarestufa.jsp\"> Gerenciar </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                    <li class=\"menu-item-has-children dropdown\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                           aria-expanded=\"false\"><i class=\"menu-icon fa fa-leaf\"></i><b>PRODUTOS</b></a>\n");
      out.write("                        <ul class=\"sub-menu children dropdown-menu\">\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"menu-icon fa fa-plus-square-o\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/cadastrarproduto.jsp\"> Cadastrar </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <i class=\"menu-icon fa fa-edit\"></i><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/gerenciarproduto.jsp\"> Gerenciar </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div><!-- /.navbar-collapse -->\n");
      out.write("        </nav>\n");
      out.write("    </aside>\n");
      out.write("    <!-- /#left-panel -->\n");
      out.write("\n");
      out.write("    <!-- Right Panel -->\n");
      out.write("    <div id=\"right-panel\" class=\"right-panel\">\n");
      out.write("        <!-- Header-->\n");
      out.write("        <header id=\"header\" class=\"header\">\n");
      out.write("            <div class=\"top-left\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a class=\"navbar-brand\" href=\"./\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/assets/images/agromut.png\" alt=\"Logo\"\n");
      out.write("                                                           style=\"width: 120px;\"></a>\n");
      out.write("                    <a class=\"navbar-brand hidden\" href=\"./\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/assets/images/agromut.png\" alt=\"Logo\"></a>\n");
      out.write("                    <a id=\"menuToggle\" class=\"menutoggle\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"top-right\">\n");
      out.write("                <div class=\"header-menu\">\n");
      out.write("\n");
      out.write("                    <div class=\"user-area dropdown float-right\">\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle active\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                           aria-expanded=\"false\">\n");
      out.write("                            <img class=\"user-avatar rounded-circle\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/assets/images/user.png\" alt=\"User Avatar\">\n");
      out.write("                        </a>\n");
      out.write("\n");
      out.write("                        <div class=\"user-menu dropdown-menu\">\n");
      out.write("                            <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/perfil.jsp\"><i class=\"fa fa- user\"></i>Alterar Perfil</a>\n");
      out.write("\n");
      out.write("                            <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/EncerrarSessao\"><i class=\"fa fa-power -off\"></i>Sair</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- /#header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Scripts -->\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery@2.2.4/dist/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            $(\".menu-item-has-children.dropdown\").each(function () {\n");
      out.write("                $(this).on('click', function () {\n");
      out.write("                    var $temp_text = $(this).children('.dropdown-toggle').html();\n");
      out.write("                    $(this).children('.sub-menu').prepend('<li class=\"subtitle\">' + $temp_text + '</li>');\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("</body>\n");
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
