package br.com.agromut.controller;

import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.ProdutoDAOImpl;
import br.com.agromut.dao.UsuarioAdmDAOImpl;
import br.com.agromut.model.Produto;
import br.com.agromut.model.UsuarioAdm;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarProduto", urlPatterns = {"/CadastrarProduto"})
public class CadastrarProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            String descricaoProduto = request.getParameter("descricaoProduto");
            String especieProduto = request.getParameter("especieProduto");
            Integer unidadeProduto = Integer.parseInt(request.getParameter("unidadeProduto"));
            Integer tempocultivoProduto = Integer.parseInt(request.getParameter("tempocultivoProduto"));
            String temperaturaProduto = request.getParameter("temperaturaProduto");
            String umidadeProduto = request.getParameter("umidadeProduto");
            String statusProduto = request.getParameter("statusProduto");
            Integer idUsuarioAdm = Integer.parseInt(request.getParameter("idUsuarioAdm"));

            String mensagem = null;

            Produto produto = new Produto();
            produto.setDescricaoProduto(descricaoProduto);
            produto.setEspecieProduto(especieProduto);
            produto.setUnidadeProduto(unidadeProduto);
            produto.setTempocultivoProduto(tempocultivoProduto);
            produto.setTemperaturaProduto(temperaturaProduto);
            produto.setUmidadeProduto(umidadeProduto);
            produto.setStatusProduto(statusProduto);
            produto.setIdUsuarioAdm(new UsuarioAdm(idUsuarioAdm));

            try {

                GenericDAO dao = new ProdutoDAOImpl();
                if (dao.cadastrar(produto)) {
                    mensagem = "Produto cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar o produto. Verifique os dados informados e tente novamente.";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("usuarioAdm/cadastrarproduto.jsp").forward(request, response);

            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao cadastrar produto! Erro: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
