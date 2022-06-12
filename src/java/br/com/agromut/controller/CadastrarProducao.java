package br.com.agromut.controller;

import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.ProducaoDAOImpl;
import br.com.agromut.dao.ProdutoDAOImpl;
import br.com.agromut.model.Estufa;
import br.com.agromut.model.Producao;
import br.com.agromut.model.Produto;
import br.com.agromut.model.UsuarioAdm;
import br.com.agromut.util.Conversoes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarProducao", urlPatterns = {"/CadastrarProducao"})
public class CadastrarProducao extends HttpServlet {

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {

            Integer idProduto = Integer.parseInt(request.getParameter("idProduto"));
            Integer idEstufa = Integer.parseInt(request.getParameter("idEstufa"));
            Date dataPlantioProducao = Conversoes.converterData(request.getParameter("dataplantioProducao"));
            

            String mensagem = null;

            Producao producao = new Producao();
            producao.setProdutoProducao(new Produto(idProduto));
            producao.setIdEstufa(new Estufa (idEstufa));
            producao.setDataPlantioProducao((java.sql.Date) dataPlantioProducao);

            try {

                GenericDAO dao = new ProducaoDAOImpl();
                if (dao.cadastrar(producao)) {
                    mensagem = "Produção cadastrada com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar produção. Verifique os dados informados e tente novamente.";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("CarregarProdutoEstufa").forward(request, response);

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
