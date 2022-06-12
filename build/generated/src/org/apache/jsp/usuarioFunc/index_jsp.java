package org.apache.jsp.usuarioFunc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

 /*
  HttpServletRequest httpServletRequest = (HttpServletRequest) request;

  HttpSession sessao = httpServletRequest.getSession();
  
  if (sessao.getAttribute("usuarioadm") != null){*/

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>AGROMUT</title>\n");
      out.write("        <meta name=\"description\" content=\"AGROMUT\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioAdm/assets/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("\n");
      out.write("            .botao-verde {\n");
      out.write("                color: rgb(23, 143, 43);\n");
      out.write("                border-color: rgb(23, 143, 43);\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .botao-verde:hover {\n");
      out.write("                background-color: rgb(23, 143, 43);\n");
      out.write("                border-color: rgb(23, 143, 43);\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .verde-fundo {\n");
      out.write("                background-color: rgb(23, 143, 43);\n");
      out.write("                border-color: rgb(23, 143, 43);\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .verde-fundo:hover{\n");
      out.write("                color: rgb(23, 143, 43);\n");
      out.write("                border-color: rgb(23, 143, 43);\n");
      out.write("                background-color: white;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!-- Content -->\n");
      out.write("        <div class=\"content\">\n");
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h4 class=\"box-title\">\n");
      out.write("                                ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${menssage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                            </h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            O que faremos hoje?\n");
      out.write("                            <hr>\n");
      out.write("                            <div class=\"row justify-content-around\">\n");
      out.write("\n");
      out.write("                                <div class=\"card text-center border-success\" style=\"width: 18rem;\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"card-header\">Produtos</div>\n");
      out.write("                                        <div class='card-body'>\n");
      out.write("                                            <p class=\"card-text\">Controle total dos produtos a um click'.</p>\n");
      out.write("                                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioFunc/cadastrarproduto.jsp\" class=\"btn verde-fundo\">Cadastrar</a>\n");
      out.write("                                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioFunc/gerenciarproduto.jsp\" class=\"btn verde-fundo\">Gerenciar</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"card text-center border-success\" style=\"width: 18rem;\">\n");
      out.write("                                    <div class=\"card-body\">\n");
      out.write("                                        <div class=\"card-header\">Estufa</div>\n");
      out.write("                                        <div class=\"card-body\">\n");
      out.write("                                            <p class=\"card-text\">Gerencie e monitore as estufas de modo eficiente e rápido.</p>\n");
      out.write("                                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/usuarioFunc/gerenciarestufa.jsp\" class=\"btn verde-fundo\">Gerenciar</a>\n");
      out.write("                                        </div></div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> <!-- /.card -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("            <!-- Scripts -->\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.14.4/dist/umd/popper.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/jquery-match-height@0.7.2/dist/jquery.matchHeight.min.js\"></script>\n");
      out.write("            <script src=\"assets/js/main.js\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/moment@2.22.2/moment.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
 /*
    } else {
        ((HttpServletResponse) response).sendRedirect("${pageContext.request.contextPath}/index.jsp");
    } */

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
