
package br.com.agromut.controller;

import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.ProdutoDAOImpl;
import br.com.agromut.dao.UsuarioFuncDAOImpl;
import br.com.agromut.model.UsuarioFunc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "CarregarUsuarioFunc", urlPatterns = {"/CarregarUsuarioFunc"})
public class CarregarUsuarioFunc extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){

            Integer UsuarioFunc = Integer.parseInt(request.getParameter("idUsuarioFunc"));
            
            try{
                GenericDAO dao = new UsuarioFuncDAOImpl();
                request.setAttribute("usuariofunc", dao.carregar(UsuarioFunc));
                request.getRequestDispatcher("usuarioAdm/perfilfunc.jsp").forward(request, response);
            } catch(Exception e) {
                System.err.println("Problemas ao carregar funcionario! Erro: " + e.getMessage());
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
