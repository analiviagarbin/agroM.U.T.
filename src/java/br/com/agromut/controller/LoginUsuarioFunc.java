package br.com.agromut.controller;

import br.com.agromut.dao.UsuarioFuncDAOImpl;
import br.com.agromut.model.Usuario;
import br.com.agromut.model.UsuarioFunc;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginUsuarioFunc", urlPatterns = {"/LoginUsuarioFunc"})
public class LoginUsuarioFunc extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        
        String nomeUsuario = request.getParameter("nomeUsuario");
        String loginUsuario = request.getParameter("loginUsuario");
        String senhaUsuario = request.getParameter("senhaUsuario");

        String menssage = null;

         if (!loginUsuario.equals("") && !senhaUsuario.equals("")) {

                UsuarioFuncDAOImpl dao = new UsuarioFuncDAOImpl();
                UsuarioFunc usuariofunc = (UsuarioFunc) dao.logarUsuarioFunc(loginUsuario, senhaUsuario);

                if (usuariofunc != null) {
                    HttpSession sessao = request.getSession(true);
                    sessao.setAttribute("usuariofunc", usuariofunc);
                    if (usuariofunc.getStatusUsuarioFunc().equals("T")) {
                        
                        menssage = "Seja bem-vindo(a), " + usuariofunc.getNomeUsuario() + ".";
                        sessao.setAttribute("menssage", menssage);
                        request.getRequestDispatcher("usuarioFunc/index.jsp").forward(request, response);
                        
                    } else {
                        menssage = "Seu perfil está inativo";
                        sessao.setAttribute("menssage", menssage);
                        request.getRequestDispatcher("index.jsp").forward(request, response);
                    }
                } else {
                    menssage = "Login ou senha inválidos";
                    request.setAttribute("menssage", menssage);
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            }
        } catch (Exception e) {
            System.out.println("Problemas ao logar! Erro: " + e.getMessage());
            e.printStackTrace();
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
