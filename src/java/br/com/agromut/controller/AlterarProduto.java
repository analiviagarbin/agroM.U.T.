/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agromut.controller;

import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.ProdutoDAOImpl;
import br.com.agromut.model.Produto;
import br.com.agromut.model.UsuarioAdm;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlterarProduto", urlPatterns = {"/AlterarProduto"})
public class AlterarProduto extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Integer idProduto = Integer.parseInt(request.getParameter("idProduto"));
            Integer idUsuarioAdm = Integer.parseInt(request.getParameter("idusuarioAdm"));
            String especieProduto = request.getParameter("especieProduto");
            Integer tempocultivoProduto = Integer.parseInt(request.getParameter("tempocultivoProduto"));
            String umidadeProduto = request.getParameter("umidadeProduto");
            String temperaturaProduto = request.getParameter("temperaturaProduto");
            String descricaoProduto = request.getParameter("descricaoProduto");
            Integer unidadeProduto = Integer.parseInt(request.getParameter("unidadeProduto"));
            String statusProduto = request.getParameter("statusProduto");

            String mensagem = null;

            Produto produto = new Produto();
            produto.setIdProduto(idProduto);
            produto.setIdUsuarioAdm(new UsuarioAdm(idUsuarioAdm));
            produto.setEspecieProduto(especieProduto);
            produto.setTempocultivoProduto(tempocultivoProduto);
            produto.setUmidadeProduto(umidadeProduto);
            produto.setTemperaturaProduto(temperaturaProduto);
            produto.setDescricaoProduto(descricaoProduto);
            produto.setUnidadeProduto(unidadeProduto);
            produto.setStatusProduto(statusProduto);

            try {
                GenericDAO dao = new ProdutoDAOImpl();
                if (dao.alterar(produto)) {
                    mensagem = "Produto alterado com sucesso.";

                } else {
                    mensagem = "Problemas ao alterar produto.";

                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("ListarProduto").forward(request, response);

            } catch (Exception e) {
                System.out.println("problemas no Servlet ao alterar produto! Erro: " + e.getMessage());
                e.printStackTrace();
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
