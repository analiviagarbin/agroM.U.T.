package br.com.agromut.controller;

import br.com.agromut.dao.EstufaDAOImpl;
import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.ProdutoDAOImpl;
import br.com.agromut.model.Estufa;
import br.com.agromut.model.UsuarioAdm;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AlterarEstufa", urlPatterns = {"/AlterarEstufa"})
public class AlterarEstufa extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Integer idEstufa = Integer.parseInt(request.getParameter("idEstufa"));
            Integer idUsuarioAdm = Integer.parseInt(request.getParameter("idusuarioAdm"));
            String descricaoEstufa = request.getParameter("descricaoEstufa");
            String capacidadeEstufa = request.getParameter("capacidadeEstufa");
            String statusEstufa = request.getParameter("statusEstufa");

            String mensagem = null;

            Estufa estufa = new Estufa();
            estufa.setIdEstufa(idEstufa);
            estufa.setIdUsuarioAdm(new UsuarioAdm(idUsuarioAdm));
            estufa.setCapacidadeEstufa(capacidadeEstufa);
            estufa.setStatusEstufa(statusEstufa);

            try {
                GenericDAO dao = new EstufaDAOImpl();
                if (dao.alterar(estufa)) {
                    mensagem = "Estufa alterado com sucesso.";

                } else {
                    mensagem = "Problemas ao alterar estufa.";

                }
                request.setAttribute("mensagem", mensagem);
                request.getRequestDispatcher("ListarEstufaT").forward(request, response);

            } catch (Exception e) {
                System.out.println("problemas no Servlet ao alterar estufa! Erro: " + e.getMessage());
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
