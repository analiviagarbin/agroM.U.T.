package br.com.agromut.controller;

import br.com.agromut.dao.EstufaDAOImpl;
import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.ProdutoDAOImpl;
import br.com.agromut.model.Estufa;
import br.com.agromut.model.Produto;
import br.com.agromut.model.UsuarioAdm;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CadastrarEstufa", urlPatterns = {"/CadastrarEstufa"})
public class CadastrarEstufa extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String capacidadeestufa = request.getParameter("capacidadeEstufa");
            String temperaturaEstufa = request.getParameter("temperaturaEstufa");
            String umidadeEstufa = request.getParameter("umidadeEstufa");
            String statusEstufa = request.getParameter("statusEstufa");
            Integer idUsuarioAdm = Integer.parseInt(request.getParameter("idUsuarioAdm"));

            String mensagem = null;

            Estufa estufa = new Estufa();
            estufa.setCapacidadeEstufa(capacidadeestufa);
            estufa.setTemperaturaEstufa(temperaturaEstufa);
            estufa.setUmidadeEstufa(umidadeEstufa);
            estufa.setStatusEstufa(statusEstufa);
            estufa.setIdUsuarioAdm(new UsuarioAdm(idUsuarioAdm));
           
            try {

                GenericDAO dao = new EstufaDAOImpl();
                if (dao.cadastrar(estufa)) {
                    mensagem = "Estufa cadastrado com sucesso!";
                } else {
                    mensagem = "Problemas ao cadastrar o estufa. Verifique os dados informados e tente novamente.";
                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("cadastrarestufa.jsp").forward(request, response);

            } catch (Exception ex) {
                System.out.println("Problemas no Servlet ao cadastrar estufa! Erro: " + ex.getMessage());
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
