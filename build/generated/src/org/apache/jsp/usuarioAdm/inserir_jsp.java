package org.apache.jsp.usuarioAdm;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inserir_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("                        <div class=\"content\">\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\n");
      out.write("                        <div class=\"row flex-lg-row-reverse align-items-center g-5 py-5\">\n");
      out.write("                            <div class=\"col-lg-12 py-1\">\n");
      out.write("                                <h1 class=\"display-6 fw-bold lh-1 mb-3 texto\">\n");
      out.write("                                    Inserir Produto\n");
      out.write("                                </h1>\n");
      out.write("                                <hr class=\"verde\">\n");
      out.write("                                <p class=\"lead\">\n");
      out.write("                                <form method=\"POST\" action=\"CadastrarProducao\" autocomplete=\"off\">\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <div class=\"mb-2 w-100\">\n");
      out.write("                                            <label class=\"text-muted\" for=\"produto\">Produto:</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <select name=\"idProduto\">\n");
      out.write("                                            <c:forEach var=\"produto\" items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nomeprodutos}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.idProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${produto.descricaoProduto}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                                </option>\n");
      out.write("                                            </c:forEach>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <div class=\"mb-2 w-100\">\n");
      out.write("                                            <label class=\"text-muted\" for=\"senha\">Data plantio:</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <input type=\"date\" class=\"form-control\" name=\"dataPlantioProducao\" required>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <input name=\"idEstufa\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estufa.idEstufa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("\n");
      out.write("                                    <div class=\"d-flex align-items-center\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-dark ms-auto verde-fundo\">\n");
      out.write("                                            Inserir\n");
      out.write("                                        </button> \n");
      out.write("                                     <!-- <input type=\"button\" value=\"teste\" onClick=\"redireciona('Servlet','idObject=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${estufa.idEstufa}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\">-->\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
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
