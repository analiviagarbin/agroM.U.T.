/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.agromut.controller;

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

/**
 *
 * @author anali
 */
@WebServlet(name = "AtivarProduto", urlPatterns = {"/AtivarProduto"})
public class AtivarProduto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
        Integer idproduto = Integer.parseInt(request.getParameter("idproduto"));
        Produto produto = new Produto();
        produto.setIdProduto(idproduto);
       
        String mensagem = "";
       
        try {

            ProdutoDAOImpl dao = new ProdutoDAOImpl();
            if (dao.ativarproduto(produto)) {
                mensagem = "Produto ativado!";
            } else {
                mensagem = "Problemas ao ativar usuário";
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("ListarProdutoT").forward(request, response);

        } catch (Exception ex) {
            System.out.println("Problemas no Servlet AtivarProduto ao enviar formulário! Erro: " + ex.getMessage());
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
