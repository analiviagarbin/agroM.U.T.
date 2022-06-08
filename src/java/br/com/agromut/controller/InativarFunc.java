package br.com.agromut.controller;

import br.com.agromut.dao.GenericDAO;
import br.com.agromut.dao.UsuarioAdmDAOImpl;
import br.com.agromut.dao.UsuarioFuncDAOImpl;
import br.com.agromut.model.UsuarioAdm;
import br.com.agromut.model.UsuarioFunc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "InativarFunc", urlPatterns = {"/InativarFunc"})
public class InativarFunc extends HttpServlet {

      protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Integer idusuariofunc = Integer.parseInt(request.getParameter("idusuariofunc"));
        UsuarioFunc usuariofunc = new UsuarioFunc();
        usuariofunc.setIdUsuarioFunc(idusuariofunc);
       
        String mensagem = "";
       
        try {

            UsuarioFuncDAOImpl dao = new UsuarioFuncDAOImpl();
            if (dao.inativarfunc(usuariofunc)) {
                mensagem = "Usuário inativado!";
            } else {
                mensagem = "Problemas ao inativar usuário";
            }
            request.setAttribute("mensagem", mensagem);
            request.getRequestDispatcher("ListarUsuarioFuncF").forward(request, response);

        } catch (Exception ex) {
            System.out.println("Problemas no Servlet InativarFunc ao enviar formulário! Erro: " + ex.getMessage());
            ex.printStackTrace();
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
